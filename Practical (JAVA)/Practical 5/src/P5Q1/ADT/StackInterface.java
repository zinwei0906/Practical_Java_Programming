/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P5Q1.ADT;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public interface StackInterface<T> {

    void push(T PushElement);

    T peek();

    T pop();

    void clear();

    boolean isEmpty();
}
