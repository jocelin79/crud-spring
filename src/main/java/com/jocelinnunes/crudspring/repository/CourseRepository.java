package com.jocelinnunes.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jocelinnunes.crudspring.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Long, Course>{
    
}
