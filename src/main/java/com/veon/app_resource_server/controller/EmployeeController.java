package com.veon.app_resource_server.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employee")
    @PreAuthorize("hasRole('ROLE_user')")
    public String getEmployeeName(){
        return "I am a SE!";
    }
}

