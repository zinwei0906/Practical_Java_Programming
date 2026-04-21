package P5Q1.ADT;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public interface QueueInterface<T> {

    public boolean enqueue(T EnqueueElement);

    public T getFront();

    public T dequeue();

    public boolean isEmpty();
}
