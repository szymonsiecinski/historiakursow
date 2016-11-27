package com.github.szymonsiecinski.historiakursow.domain;

/**
 * Created by uzytkownik on 19.10.16.
 */
public interface Repository<T> {
    void add(T object);
    T get(int id);
    T search(Criteria criteria);
    void modify(T object);
    void delete(T object);
}
