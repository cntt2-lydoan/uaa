package vn.edu.leading.uaa.controllers;

import org.springframework.stereotype.Controller;
import vn.edu.leading.uaa.repository.RoleRepository;
import vn.edu.leading.uaa.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    private final RoleRepository roleRepository;


    public UserController(UserService userService, RoleRepository roleRepository) {
        this.userService = userService;
        this.roleRepository = roleRepository;
    }

}