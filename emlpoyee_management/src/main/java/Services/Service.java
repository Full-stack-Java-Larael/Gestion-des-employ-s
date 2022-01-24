package Services;

import java.util.ArrayList;

public interface Service<T> {
    boolean add(T object);
    ArrayList<T> getAll();
    T findById(long id);
    boolean update(T object);
    boolean delete(long id);
}
