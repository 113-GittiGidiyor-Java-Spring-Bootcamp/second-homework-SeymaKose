package dev.patika.gittigidiyorbootcampsecondhomework.repository;

import dev.patika.gittigidiyorbootcampsecondhomework.model.Instructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class InstructorRepositoryImpl implements InstructorRepository<Instructor>{

    private EntityManager entityManager;

    @Autowired
    public InstructorRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Instructor> findAll() {
        return null;
    }

    @Override
    public Instructor findById(int id) {
        return null;
    }

    @Override
    public Instructor save(Instructor object) {
        return null;
    }

    @Override
    public Instructor update(Instructor instructor) {
        return entityManager.merge(instructor);
    }

    @Override
    public void deleteByObject(Instructor object) {

    }

    @Override
    public void deleteById(int id) {

    }
}
