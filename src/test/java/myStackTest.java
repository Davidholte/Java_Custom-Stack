package test.java;

import main.java.myStack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class myStackTest {

    myStack<Integer> stack = new myStack<Integer>(5);
    myStack<Integer> emptyStack = new myStack<Integer>(5);

    @Before
    public void setUp() throws Exception {
        stack.myPush(5);
        stack.myPush(4);
        stack.myPush(3);
        stack.myPush(2);
        stack.myPush(1);
    }

    @Test
    public void myPop() throws Exception {
        assertEquals(1, stack.myPop());
    }
   /* @Test
    public void myPopFail() throws Exception {
        assertEquals(null, emptyStack.myPop());
    }*/

    @Test
    public void myPeek() throws Exception {
        assertEquals(1, stack.myPeek());
    }

    @Test
    public void myPush() throws Exception {
        assertEquals(1, emptyStack.myPush(1));
    }

    @Test
    public void mySize() throws Exception {
        assertEquals(5, stack.mySize());
    }

    @Test
    public void myIsEmpty() throws Exception {
        assertEquals(true, emptyStack.myIsEmpty());
    }

    @Test
    public void myIsFull() throws Exception {
        assertEquals(true, stack.myIsFull());
    }

}