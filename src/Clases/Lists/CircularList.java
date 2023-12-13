/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.Lists;
import Clases.Nodes.Node;
import javax.swing.JTextArea;
/**
 *
 * @author andre
 */
public class CircularList {
    private Node head;
    private Node lastNode;

    public CircularList() {
        head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            head.setNext(head);
            lastNode = newNode;
            return;
        }

        if (exist(newNode.getData())) {
            return;
        }

        if (newNode.getData() < head.getData()) {
            newNode.setNext(head);
            head = newNode;
            lastNode.setNext(head);
            return;
        }

        Node currentNode = head;
        while (currentNode.getNext() != head && currentNode.getNext().getData() <= newNode.getData()) {
            currentNode = currentNode.getNext();
        }

        if (newNode.getData() < currentNode.getNext().getData()) {
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
            return;
        }

        newNode.setNext(currentNode.getNext());
        currentNode.setNext(newNode);
        lastNode = newNode;
    }

    public void delete(int data, JTextArea textBox) {
        if (isEmpty()) {
            return;
        }

        if (head.getData() == data) {
            head = head.getNext();
            lastNode.setNext(head);
            textBox.setText("- Data[" + data + "] Removed of the list");
            return;
        }

        Node currentNode = head;
        while (currentNode.getNext() != head && currentNode.getNext().getData() < data) {
            currentNode = currentNode.getNext();
        }

        if (currentNode.getNext() == lastNode && currentNode.getNext().getData() == data) {
            currentNode.setNext(currentNode.getNext().getNext());
            lastNode = currentNode;
            lastNode.setNext(head);
            textBox.setText("- Data[" + data + "] Removed of the list");
            return;
        }

        if (currentNode.getNext().getData() == data) {
            currentNode.setNext(currentNode.getNext().getNext());
            textBox.setText("- Dats[" + data + "] Removed of the list");
            return;
        }

        textBox.setText("- Data[" + data + "] Not found/removed of the list");
    }

    public void search(int data, JTextArea textBox) {
        if (isEmpty()) {
            return;
        }

        if (head.getData() == data) {
            textBox.setText("- Data[" + data + "] Exist in the list");
            return;
        }

        Node currentNode = head;
        while (currentNode.getNext() != head && currentNode.getNext().getData() <= data) {
            currentNode = currentNode.getNext();
        }

        if (currentNode.getData() == data) {
            textBox.setText("- Data[" + data + "] Exist in the list");
            return;
        }

        textBox.setText("- Data[" + data + "] Does not exist in the list");
    }

    public void show(JTextArea textBox) {
        if (isEmpty()) {
            textBox.setText("Empty list");
            return;
        }

        Node currentNode = head;
        int i = 0;
        do {
            textBox.append("- Node[" + i + "] and data: " + currentNode.getData() + "\n");
            currentNode = currentNode.getNext();
            i++;
        } while (currentNode != head);
    }

    public boolean exist(int data) {
        if (isEmpty()) {
            return false;
        }

        if (head.getData() == data) {
            return true;
        }

        Node currentNode = head;
        while (currentNode.getNext() != head && currentNode.getNext().getData() <= data) {
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
