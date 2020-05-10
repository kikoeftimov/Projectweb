package com.example.wpproject.project.service_business;

import com.example.wpproject.project.model.Course;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface CourseService {

    List<Course> findAll();
    List<Course> findAllByName(String name);
    Course findById(Long id);
    Course save(Course course, MultipartFile image) throws IOException;
    Course update(Long id, Course course, MultipartFile image) throws IOException;
    void deleteById(Long id);

    List<Course> searchCourses(String term);
}
