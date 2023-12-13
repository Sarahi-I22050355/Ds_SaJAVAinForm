
package Clases.Lists;
import Clases.Nodes.Node;
import javax.swing.JTextArea;

public class SimpleList {
    private Node head;

    public SimpleList() {
        head = null;
        }

    public void add(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            return;
        }

        if (exist(newNode.getData())) {
            return;
        }

        if (newNode.getData() < head.getData()) {
            newNode.setNext(head);
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.getNext() != null && currentNode.getNext().getData() < newNode.getData()) {
            currentNode = currentNode.getNext();
        }

        newNode.setNext(currentNode.getNext());
        currentNode.setNext(newNode);
    }

    public void delete(int data, JTextArea textArea) {
        textArea.setText("");

        if (isEmpty()) {
            return;
        }

        if (head.getData() == data) {
            head = head.getNext();
            textArea.setText("- Data[" + data + "] Removed of the list");
            return;
        }

        Node currentNode = head;
        while (currentNode.getNext() != null && currentNode.getNext().getData() < data) {
            currentNode = currentNode.getNext();
        }

        if (currentNode.getNext() != null && currentNode.getNext().getData() == data) {
            currentNode.setNext(currentNode.getNext().getNext());
            textArea.setText("- Data[" + data + "] removed of the list");
            return;
        }

        textArea.setText("- Data[" + data + "] Not found/removed of the list");
    }

    public void search(int data, JTextArea textArea) {
        textArea.setText("");

        if (isEmpty()) {
            return;
        }

        if (head.getData() == data) {
            textArea.setText("- Data[" + data + "] Exist in the list");
            return;
        }

        Node currentNode = head;
        while (currentNode.getNext() != null && currentNode.getNext().getData() <= data) {
            currentNode = currentNode.getNext();
        }

        if (currentNode.getData() == data) {
            textArea.setText("- Data[" + data + "] Exist in the list");
            return;
        }

        textArea.setText("- Data[" + data + "] Does not exist in the list");
    }

    public void show(JTextArea textArea) {
        textArea.setText("");

        if (isEmpty()) {
            textArea.setText("Empty list");
            return;
        }

        int i = 0;
        Node currentNode = head;
        while (currentNode != null) {
            textArea.append("- Node[" + i + "] and data: " + currentNode.getData() + "\n");
            currentNode = currentNode.getNext();
            i++;
        }
    }

    public boolean exist(int data) {
        if (isEmpty()) {
            return false;
        }

        if (head.getData() == data) {
            return true;
        }

        Node currentNode = head;
        while (currentNode.getNext() != null && currentNode.getNext().getData() <= data) {
            currentNode = currentNode.getNext();
        }

        if (currentNode.getData() == data) {
            return true;
        }

        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = null;
    }
}
