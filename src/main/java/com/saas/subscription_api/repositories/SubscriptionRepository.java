package com.saas.subscription_api.repositories;

import com.saas.subscription_api.entities.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
    
    // Trouver toutes les subscriptions d’un utilisateur donné (via son ID)
    List<Subscription> findByUserId(Long userId);
}
