package com.spring.boot.fourServiceLayer;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicsService {
    private List<Topic> topicsList = Arrays.asList(
            new Topic(1,"One", "Ondy"),
            new Topic(2,"Two", "Twdy"),
            new Topic(3,"Three", "Thdy"));

    public List<Topic> getAllTopics(){
        return topicsList;
    }

    public Topic getAllTopicsById(final int id) {
        return topicsList.stream().filter(t -> t.getId() == id).findFirst().get();
    }
}
