package com.example.springwebservice.controller;

import com.example.springwebservice.controller.dto.request.CreateUserRequest;
import com.example.springwebservice.controller.dto.request.UpdateUserRequest;
import com.example.springwebservice.controller.dto.response.StatusResponse;
import com.example.springwebservice.model.entity.User;
import com.example.springwebservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;



    @GetMapping()
    public List<User> getUserList() {
        List<User> response = userService.getUserList();
        return response;
    }


    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        User response = userService.getUserById(id);
        return response;
    }

    @PostMapping()
    public StatusResponse createUser(@RequestBody CreateUserRequest request) {
        String response = userService.createUser(request);
        return new StatusResponse(response);
    }

    @PutMapping("/{id}")
    public StatusResponse updateUser(@PathVariable int id, @RequestBody UpdateUserRequest request) {
        String response = userService.updateUser(id,request);
        return new StatusResponse(response);
    }

    @DeleteMapping("/{id}")
    public StatusResponse deleteUserById(@PathVariable int id) {
        String response = userService.deleteUserById(id);
        return new StatusResponse(response);
    }
} // Class end
