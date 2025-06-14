package com.saas.subscription_api.repositories;

import com.saas.subscription_api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    
    // Méthode personnalisée pour chercher un utilisateur par email
    Optional<User> findByEmail(String email);
}
