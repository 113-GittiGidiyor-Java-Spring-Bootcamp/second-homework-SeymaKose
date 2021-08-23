package dev.patika.gittigidiyorbootcampsecondhomework.repository;

import dev.patika.gittigidiyorbootcampsecondhomework.model.Course;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepository<Course>{

    private EntityManager entityManager;

    @Autowired
    public CourseRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

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
    public Course update(Course course) {
        return entityManager.merge(course);
    }

    @Override
    public void deleteByObject(Course object) {

    }

    @Override
    public void deleteById(int id) {

    }
}
