package P4Q1ADT;

import P4Q1.*;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public interface ListInterface<T> {
    
    //1)Get the Size or Length of Current ArrayList
    int getSizeArrayList();

    //2)Add New Element into the Current ArrayList
    boolean add(T Element);

    //3)Add New Element into the Current Array List at the position number
    boolean add(int AddPosition, T AddElement);

    //4)Remove One Element from the Current ArrayList using the position number
    T remove(int RemovePosition);

    //5)Clear all Element in the ArrayList
    void clear();

    //6)Replace One Element in the Current ArrayList
    boolean replace(int ReplacePosition, T ReplaceElement);

    //7)Get One Element From Current ArrayList by the position number
    T getElement(int GetPosition);

    //8)Check the ContainElement got same with Current ArrayList,if same will return true else return false
    boolean contain(T containElement);

    //9)Check the Current ArrayList is Empty or not,is empty will return true else return false
    boolean isEmpty();
}
