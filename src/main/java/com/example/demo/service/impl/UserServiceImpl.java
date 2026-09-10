package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        // Implementation here

//        User u1 = new User();
//        u1.setId(1L);
//        u1.setName("John Doe");
//        u1.setEmail("u1@mail.com");
//        return List.of(u1);

        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        // Implementation
        LOGGER.info("Fetching user with id: {}", id);
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    @Override
    public User createUser(User user) {
        // Implementation
        LOGGER.info("Creating user: {}", user);
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        // Implementation
        LOGGER.info("Updating user: {}", user);
        return  userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        // Implementation
        LOGGER.info("Deleting user with id: {}", id);
        userRepository.deleteById(id);
    }
}
