package main.java;

public interface myStackInterface<E>  {

    Object myPop();

    Object myPeek();

    Object myPush(E e);

    int mySize();

    boolean myIsEmpty();

    boolean myIsFull();
}
