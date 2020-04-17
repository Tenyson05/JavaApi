package io.spingbootquickstart.topics;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<topics> topics = new ArrayList<>(Arrays.asList(
            new topics("1", "Test1", "Yes this is indeed the first test"),
            new topics("2", "Test2", "Yes this is indeed the second test"),
            new topics("3", "Test3", "Yes this is indeed the third test"),
            new topics("4", "Test4", "Yes this is indeed the fourth test"),
            new topics("5", "Test5", "Yes this is indeed the fifth test")
    ));

    public List<topics> getAllTopics() {
        return topics;
    }

    public topics getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(topics topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, topics topic) {
        for (int i = 0; i < topics.size(); i++) {
            topics t = topics.get(i);
            if(t.getId().equals(id))
                topics.set(i, topic);{
                return;
            }

        }
    }


    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
