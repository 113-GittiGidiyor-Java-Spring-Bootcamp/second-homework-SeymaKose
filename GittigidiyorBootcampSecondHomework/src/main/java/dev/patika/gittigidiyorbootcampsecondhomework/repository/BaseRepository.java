package dev.patika.gittigidiyorbootcampsecondhomework.repository;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BaseRepository<T> {
    List<T> findAll();
    T findById(int id);
    T save(T object);
    T update(T object);
    void deleteByObject(T object);
    void deleteById(int id);
}
