package io.springbootquickstart.courseAPI;

import io.spingbootquickstart.topics.Topics;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class courseController {

    private courseService courseService;
//    get all course for a topic
    @RequestMapping("/topics/{topicId}/course")
    public List<Course> getAllCourse(@PathVariable String id) {
        return courseService.getAllCourse(id);
    }

    @RequestMapping("/topics/{topicId}/course/{courseId}")
    public Course getCourse(@PathVariable String id) {
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/topics/{topicId}/course")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
        course.setTopic(new Topics(topicId, "", ""));
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/topics/{topicId}/course/{courseId}")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String courseId) {
        course.setTopic(new Topics(topicId, "", ""));
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/topics/{topicId}/course/{courseId}")
    public void deleteCourse(@PathVariable String id) {
        courseService.deleteCourse(id);
    }

}
