package dev.patika.gittigidiyorbootcampsecondhomework.service;

import java.util.List;

public interface BaseService<T> {

    List<T> findAll();
    T findById(int id);
    T save(T object);
    T update(T object);
    void deleteByObject(T object);
    void deleteById(int id);

}
