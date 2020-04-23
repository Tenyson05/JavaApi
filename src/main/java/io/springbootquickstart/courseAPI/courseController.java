package io.springbootquickstart.courseAPI;

import io.spingbootquickstart.topics.Topics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class courseController {

    @Autowired
    private courseService courseService;

//    get all course for a topic
    @RequestMapping("/topics/{topicId}/course")
    public List<Course> getAllCourse(@PathVariable String topicId) {
        return courseService.getAllCourse(topicId);
    }

    @RequestMapping("/topics/{topicId}/course/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return courseService.getCourse(courseId);
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
    public void deleteCourse(@PathVariable String courseId) {
        courseService.deleteCourse(courseId);
    }

}
