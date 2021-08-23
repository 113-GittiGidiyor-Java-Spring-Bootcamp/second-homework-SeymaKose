package dev.patika.gittigidiyorbootcampsecondhomework.service;

import dev.patika.gittigidiyorbootcampsecondhomework.model.Instructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService implements BaseService<Instructor>{
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
    public Instructor update(Instructor object) {
        return null;
    }

    @Override
    public void deleteByObject(Instructor object) {

    }

    @Override
    public void deleteById(int id) {

    }
}
