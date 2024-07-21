package com.amm.agile.productManagement.controller;

import com.amm.agile.productManagement.model.Project;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/projects")
public class ProjectController {

    @GetMapping("/all")
    public ResponseEntity<Project> getAllProjects() {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/create")
    public ResponseEntity<Project> createProject() {
        return ResponseEntity.ok().build();
    }
}
