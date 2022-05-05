package com.spring.boot.threeJsonObjects;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicsController {
    @RequestMapping ("/")
    public String homePage(){
        return "Welcome to HomePage";
    }

    @RequestMapping("/gat")
    public List<Topic> getAllTopics(){
        return Arrays.asList(new Topic(1,"One", "Ondy"),
                             new Topic(2,"Two", "Twdy"),
                             new Topic(3,"Three", "Thdy"));
    }



}
