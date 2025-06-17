package com.saas.subscription_api.controllers;

import com.saas.subscription_api.dto.UserDto;
import com.saas.subscription_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public UserDto createUser(@RequestBody UserDto userDto) {
        System.out.println("STATUT REÇU => " + userDto.getStatus());
        return userService.createUser(userDto); 
    }
    
    public UserDto getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    /*
     *     @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id)
                .orElseThrow(() -> new RuntimeException("Utilisateur introuvable avec l'id : " + id));
    }
     */


    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

}
