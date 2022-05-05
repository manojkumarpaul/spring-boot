package com.spring.boot.fourServiceLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicsController {
    @Autowired
    private TopicsService topicsService;
    @RequestMapping ("/")
    public String homePage(){
        return "Welcome to HomePage";
    }

    @RequestMapping("/gat")
    public List<Topic> getAllTopics(){
        return topicsService.getAllTopics();
    }

    @RequestMapping("/gat/{param}")
    public Topic getAllTopicsById(@PathVariable ("param") int id){
        return topicsService.getAllTopicsById(id);
    }

}
