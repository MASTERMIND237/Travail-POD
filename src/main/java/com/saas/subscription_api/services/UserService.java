package com.saas.subscription_api.services;

import com.saas.subscription_api.dto.UserDto;
import com.saas.subscription_api.entities.User;
import com.saas.subscription_api.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service  // Cette annotation indique que c'est un service Spring
public class UserService {

    private final UserRepository userRepository;

    // Injection du repository via constructeur (injection de dépendances)
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Retourne tous les utilisateurs
    public List<UserDto> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    // Retourne un utilisateur par son id
    public UserDto getUserById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.map(this::convertToDto).orElse(null);
    }

    public UserDto createUser(UserDto userDto) {
        User user = new User();
        user.setFullName(userDto.getFullName());
        user.setEmail(userDto.getEmail());
        user.setStatus(userDto.getStatus());
        user = userRepository.save(user);
        return new UserDto(user.getId(), user.getFullName(), user.getEmail(), user.getStatus());
    }
    
    /*
     *     // Crée ou met à jour un utilisateur
    public User saveUser(User user) {
        return userRepository.save(user);
    }
     */

    // Supprime un utilisateur par son id
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    // Recherche un utilisateur par email (méthode personnalisée)
    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

      private UserDto convertToDto(User user) {
        return new UserDto(user.getId(), user.getFullName(), user.getEmail(), user.getStatus());
    }
}
