package P4Q1ADT;

import P4Q1.*;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public interface QueueInterface<T> {

    int getLastIndex();

    boolean enqueue(T EnqueueElement);

    T getFirstElement();

    T dequeue();

    void clear();

    boolean isEmpty();

}
