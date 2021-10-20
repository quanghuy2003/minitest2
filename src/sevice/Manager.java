package sevice;

public interface Manager<T>{
    void print();

    void add(T t);

    int findIndexById(int id);

    void delete(int id);

    void update(int id, T t);

    void sort();
}
