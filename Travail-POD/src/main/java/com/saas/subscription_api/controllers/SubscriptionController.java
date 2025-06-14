package com.saas.subscription_api.controllers;

import com.saas.subscription_api.dto.SubscriptionDto;
import com.saas.subscription_api.entities.Subscription;
import com.saas.subscription_api.services.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subscriptions")
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;

    @GetMapping
    public List<SubscriptionDto> getAllSubscriptions() {
        return subscriptionService.getAllSubscriptions();
    }

    @PostMapping
    public Subscription createSubscription(@RequestBody Subscription subscription) {
        return subscriptionService.saveSubscription(subscription);
    }

    @GetMapping("/{id}")
    public SubscriptionDto getSubscriptionById(@PathVariable Long id) {
        return subscriptionService.getSubscriptionById(id);
    }
    
    /*
     *     @GetMapping("/{id}")
    public Subscription getSubscriptionById(@PathVariable Long id) {
        return subscriptionService.getSubscriptionById(id)
                .orElseThrow(() -> new RuntimeException("Utilisateur introuvable avec l'id : " + id));
    }
     */


    @DeleteMapping("/{id}")
    public void deleteSubscription(@PathVariable Long id) {
        subscriptionService.deleteSubscription(id);
    }
}
