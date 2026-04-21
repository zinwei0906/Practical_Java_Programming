package P4Q1ADT;

import P4Q1.*;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public interface StackInterface<T> {

    int getSizeArrayStack();

    boolean push(T PushElement);

    T peek();

    T pop();

    void clear();

    boolean isEmpty();

}
