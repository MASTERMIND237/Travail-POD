package com.saas.subscription_api.services;

import com.saas.subscription_api.dto.SubscriptionDto;
import com.saas.subscription_api.entities.Subscription;
import com.saas.subscription_api.repositories.SubscriptionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SubscriptionService {

    private final SubscriptionRepository subscriptionRepository;

    // Injection via constructeur
    public SubscriptionService(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    // Retourne tous les abonnements
    public List<SubscriptionDto> getAllSubscriptions() {
        return subscriptionRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    // Retourne un abonnement par son id
    public SubscriptionDto getSubscriptionById(Long id) {
        Optional<Subscription> subscriptionOptional = subscriptionRepository.findById(id);
        return subscriptionOptional.map(this::convertToDto).orElse(null);
    }
    // Crée ou met à jour un abonnement
    public Subscription saveSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    // Supprime un abonnement par son id
    public void deleteSubscription(Long id) {
        subscriptionRepository.deleteById(id);
    }

    private SubscriptionDto convertToDto(Subscription subscription) {
        return new SubscriptionDto(
                subscription.getId(),
                subscription.getPlanName(),
                subscription.getStartDate(),
                subscription.getEndDate(),
                subscription.getUser().getId()
        );
    }

}
