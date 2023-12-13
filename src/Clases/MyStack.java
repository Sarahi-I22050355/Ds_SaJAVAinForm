
package Clases;
  import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
  

    private List<T> stackList;

    public MyStack() {
        stackList = new ArrayList<>();
    }

    public void push(T item) {
        stackList.add(item);
    }

    public T pop() {
        if (stackList.isEmpty()) {
            throw new IllegalStateException("tha stack is empty.");
        }

        int lastIndex = stackList.size() - 1;
        T poppedItem = stackList.remove(lastIndex);

        return poppedItem;
    }

    public T peek() {
        if (stackList.isEmpty()) {
            throw new IllegalStateException("the stack is empty");
        }

        return stackList.get(stackList.size() - 1);
    }

    public int count() {
        return stackList.size();
    }

    public T get(int index) {
        return stackList.get(index);
    }

}
