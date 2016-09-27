/**
 * Created by 3299779 on 27/09/2016.
 */
public interface myStackInterface<E>  {

    void myStack();

    void myStack(int s);

    Object myPop();

    Object myPeek();

    void myPush(E e);

    int mySize();

    boolean myIsEmpty();

    boolean myIsFull();
}
