package dev.patika.gittigidiyorbootcampsecondhomework.repository;

import dev.patika.gittigidiyorbootcampsecondhomework.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository<Student>{

    private EntityManager entityManager;

    @Autowired
    public StudentRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findAll() {
        return entityManager.createQuery("FROM Student s", Student.class).getResultList();
    }

    @Override
    public Student findById(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    @Transactional
    public Student save(Student student) {
        return entityManager.merge(student);
    }

    @Override
    public Student update(Student student) {
        return entityManager.merge(student);
    }

    @Override
    public void deleteByObject(Student student) {
        entityManager.remove(student);
    }

    @Override
    public void deleteById(int id) {
        entityManager.remove(id);
    }
}
