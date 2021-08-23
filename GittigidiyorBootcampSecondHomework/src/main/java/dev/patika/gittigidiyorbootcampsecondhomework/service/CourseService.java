package dev.patika.gittigidiyorbootcampsecondhomework.service;

import dev.patika.gittigidiyorbootcampsecondhomework.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements BaseService<Course>{
    @Override
    public List<Course> findAll() {
        return null;
    }

    @Override
    public Course findById(int id) {
        return null;
    }

    @Override
    public Course save(Course object) {
        return null;
    }

    @Override
    public Course update(Course object) {
        return null;
    }

    @Override
    public void deleteByObject(Course object) {

    }

    @Override
    public void deleteById(int id) {

    }
}
