package io.spingbootquickstart.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

//    private List<topics> topics = new ArrayList<>(Arrays.asList(
//            new topics("1", "Test1", "Yes this is indeed the first test"),
//            new topics("2", "Test2", "Yes this is indeed the second test"),
//            new topics("3", "Test3", "Yes this is indeed the third test"),
//            new topics("4", "Test4", "Yes this is indeed the fourth test"),
//            new topics("5", "Test5", "Yes this is indeed the fifth test")
//    ));

    public List<Topics> getAllTopics() {
//        return topics;
        List<Topics> topicItem = new ArrayList<>();
        topicRepository.findAll().forEach(topicItem::add);
        return topicItem;
    }

    public Topics getTopic(String id) {
//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).orElse(null);
    }

    public void addTopic(Topics topic) {
        topicRepository.save(topic);
    }

//    use the same method as the add topic(save) to update. Save
    public void updateTopic(Topics topic) {
//        for (int i = 0; i < topics.size(); i++) {
//            topics t = topics.get(i);
//            if(t.getId().equals(id))
//                topics.set(i, topic);{
//                return;
//            }
//        }
        topicRepository.save(topic);
    }


    public void deleteTopic(String id) {
//        topics.removeIf(t -> t.getId().equals(id));
        topicRepository.deleteById(id);
    }
}
