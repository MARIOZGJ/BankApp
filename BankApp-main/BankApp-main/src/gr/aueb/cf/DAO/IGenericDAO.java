package gr.aueb.cf.DAO;

import java.util.Map;

public interface IGenericDAO<T> {
    T insert(Long id, T t);
    T update(Long id, T t);
    void delete(Long id);
    T get(Long id);
    Map<Long, T> getAll();
}