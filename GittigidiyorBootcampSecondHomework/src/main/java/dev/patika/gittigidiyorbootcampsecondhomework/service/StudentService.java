package dev.patika.gittigidiyorbootcampsecondhomework.service;

import dev.patika.gittigidiyorbootcampsecondhomework.model.Student;
import dev.patika.gittigidiyorbootcampsecondhomework.repository.StudentRepository;
import dev.patika.gittigidiyorbootcampsecondhomework.repository.StudentRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements BaseService<Student>{
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int id) {
        return (Student) studentRepository.findById(id);
    }

    @Override
    public Student save(Student student) {
        return (Student) studentRepository.save(student);
    }

    @Override
    public Student update(Student student) {
        return (Student) studentRepository.update(student);
    }

    @Override
    public void deleteByObject(Student student) {
        studentRepository.deleteByObject(student);
    }

    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }
}
