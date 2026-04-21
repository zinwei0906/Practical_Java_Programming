package P5Q1.ADT;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public interface ListInterface<T> {

    int getSizeOfElement();

    boolean add(T AddElement);

    boolean add(int AddPosition, T AddElement);

    T remove(int RemovePosition);

    boolean replace(int ReplacePosition, T ReplaceElement);

    T getElement(int GetPosition);

    boolean contains(T ContainElement);

    void clear();

    boolean isEmpty();

}
