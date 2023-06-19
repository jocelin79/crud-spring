package com.jocelinnunes.crudspring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jocelinnunes.crudspring.model.Course;
import com.jocelinnunes.crudspring.repository.CourseRepository;

@RestController
@RequestMapping("/api/courses")
public class CoursesController {
    
    private final CourseRepository courseRepository;
    

    public CoursesController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping
    public List<Course> list() {
        return courseRepository.findAll();
    }
}
