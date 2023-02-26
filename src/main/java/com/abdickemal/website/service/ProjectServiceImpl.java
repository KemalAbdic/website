package com.abdickemal.website.service;

import com.abdickemal.website.model.Project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Override
    public List<Project> getAllProjects() {
        List<Project> projects = new ArrayList<>();

        Project p1 = new Project();
        p1.setName("Personal Website");
        p1.setSummary("Java, Spring Boot, Thymeleaf, Bootstrap");
        p1.setImageSource("images/website.png");
        p1.setUrl("");

        Project p2 = new Project();
        p2.setName("Historical Social Ego-network Analysis");
        p2.setSummary("Gephi, GraphML, CSV, OmicsNet");
        p2.setImageSource("/images/historical_social_network_analysis.png");
        p2.setUrl("https://www.omicsnet.ca/OmicsNet/faces/Share?ID=_5v481rm7f");

        Project p3 = new Project();
        p3.setName("Auction app made for AtlantBH Full-Stack Webdev internship");
        p3.setSummary("Java, Spring Boot, React.js, Axios, Heroku, Cloudinary");
        p3.setUrl("images/demo_image.png");

        projects.add(p1);
        projects.add(p2);
        projects.add(p3);

        return projects;
    }
}
