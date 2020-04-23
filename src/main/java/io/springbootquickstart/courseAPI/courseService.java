package io.springbootquickstart.courseAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class courseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourse(String topicId) {
        List<Course> course = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(course::add);
        return course;
    }

    public Course getCourse(String id) {
        return courseRepository.findById(id).orElse(null);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        System.out.println(id);
        courseRepository.deleteById(id);

    }
}
