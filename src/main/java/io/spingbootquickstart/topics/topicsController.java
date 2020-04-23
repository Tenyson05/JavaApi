package io.spingbootquickstart.topics;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class topicsController {

    @Autowired
    private TopicService topicservice;

    @RequestMapping("/topics")
    public List<Topics> getAllTopics() {
        return topicservice.getAllTopics();
    }

    @RequestMapping( "/topics/{id}")
    public Topics getTopic(@PathVariable String id) {
        return topicservice.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody Topics topic) {
        topicservice.addTopic(topic);

    }

    @RequestMapping(method = RequestMethod.PUT, value="/topics/{id}")
    public void updateTopic(@RequestBody Topics topic, @PathVariable String id) {
        topicservice.updateTopic(topic);

    }

    @RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicservice.deleteTopic(id);

    }


}
