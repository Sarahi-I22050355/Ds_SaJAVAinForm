
package Clases.Nodes;

public class DoubleNode {
    private DoubleNode back;
    private DoubleNode next;
    private int data;

    public DoubleNode(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }

    public DoubleNode getBack() {
        return back;
    }

    public void setBack(DoubleNode back) {
        this.back = back;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
