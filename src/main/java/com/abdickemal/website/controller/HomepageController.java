package com.abdickemal.website.controller;

import com.abdickemal.website.model.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {

    @GetMapping("/")
    public String index() {
        return "redirect:homepage";
    }

    @GetMapping("/homepage")
    public String homepage(Model model) {

        Project[] projects = new Project[2];

        projects[0] = new Project();
        projects[0].setName("Personal Website");
        projects[0].setSummary("Java, Spring Boot, Thymeleaf, Bootstrap");
        projects[0].setImageSource("images/website.png");
        projects[0].setUrl("");

        projects[1] = new Project();
        projects[1].setName("Historical Social Ego-network Analysis");
        projects[1].setSummary("Gephi, GraphML, CSV, OmicsNet");
        projects[1].setImageSource("/images/historical_social_network_analysis.png");
        projects[1].setUrl("https://www.omicsnet.ca/OmicsNet/faces/Share?ID=_5v481rm7f");

        model.addAttribute("projects", projects);
        return "homepage";
    }
}
