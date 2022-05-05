package com.spring.boot.fiveRequestMethodType;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicsService {
    private List<Topic> topicsList = new ArrayList<>(Arrays.asList(
            new Topic(1,"One", "Ondy"),
            new Topic(2,"Two", "Twdy"),
            new Topic(3,"Three", "Thdy")));

    public List<Topic> getAllTopics(){
        return topicsList;
    }

    public Topic getAllTopicsById(final int id) {
        return topicsList.stream().filter(t -> t.getId() == id).findFirst().get();
    }

    public List<Topic> addTopic(Topic topic) {
        topicsList.add(topic);
        return topicsList;
    }

    public List<Topic> updateTopic(Topic topic, int id) {
        for(int i = 0; i<topicsList.size();i++){
            Topic t = topicsList.get(i);
            if (t.id == id) {
                topicsList.set(i, topic);
                return topicsList;
            }
        }
        return topicsList;
    }

    public List<Topic> deleteTopic(Topic topic, int id) {
        topicsList.removeIf(t -> t.getId()==id);
        return topicsList;
    }
}
