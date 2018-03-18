package ru.bogdanium.hitting_database.kevin.data.repositories;

public interface Repo<T> {

    public void insert(T entity);

    public void update(T entity);

    public void delete(T entity);

    public T findById(Integer id);
}
