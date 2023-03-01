package com.abdickemal.website.controller;

import com.abdickemal.website.model.Project;
import com.abdickemal.website.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomepageController {
    @Autowired
    private ProjectService projectService;

    @GetMapping("/")
    public String index() {
        return "redirect:homepage";
    }

    @GetMapping("/homepage")
    public String homepage(Model model) {
        List<Project> projects = projectService.getAllProjects();
        model.addAttribute("projects", projects);
        return "homepage";
    }
}
