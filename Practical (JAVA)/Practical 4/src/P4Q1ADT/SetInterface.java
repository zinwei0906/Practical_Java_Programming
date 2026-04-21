package P4Q1ADT;

import P4Q1.*;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public interface SetInterface<T> {

    //1)Get and Return the (Integer)Size of Current ArraySet
    int getSizeArraySet();

    //2)Add the NewElement into the ArraySet,if add successfully will return true else return false
    boolean add(T AddElement);

    //3)Replace the Element By the position
    boolean replace(int ReplacePosition, T ReplaceElement);

    //4)Remove the element by Same Element and return true and false
    boolean remove(T RemoveElement);

    //5)Give the position return the Element
    T getElement(int GetPosition);

    //6)Remove All the element contain in SecondArraySet in CurrentArraySet
    boolean removeAll(SetInterface SecondArraySet);

    //7)Find the SameElement Between the CurrentArraySet and SecondArraySet
    SetInterface retainAll(SetInterface SecondArraySet);

    //8)Find the Element if contain(same) with the Element in CurrentArraySet will return true or false
    boolean contain(T ContainElement);

    //9)Clear All the Element in CurrentArraySet and set the size is 0
    void clear();

    //10)Clear the element is null in CurrentArraySet
    void clearNullElement();

    //11)Check the Current ArraySet is empty or not and return true or false
    boolean isEmpty();

}
