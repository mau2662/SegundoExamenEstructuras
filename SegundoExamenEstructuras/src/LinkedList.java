/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XCPC
 */
public class LinkedList<T> {

    private Node<T> root;
    private int size;

    public int getSize() {
        return size;
    }

    public void insertFirst(T value, int index) {
        Node<T> temp = new Node(value);

        if (index > size || index < 0) {
            System.out.println("Error indice fuera del rango de lista");
            return;
        }
        if (index == 0) {
            temp.setNext(root);
            root = temp;
            size++;

        }

    }

    public void insertAfter(T value) {
        if (size <= 0) {
            System.out.println("Error indice fuera del rango de lista");
            return;
        }
        Node<T> temp = new Node(value);
        Node current = root;
        for (int i = 0; i < size; i++) {
            current = current.getNext();
        }
        temp.setNext(current.getNext());
        current.setNext(temp);
        size++;
    }

    public T get(int index) {

        if (index >= size || index < 0) {

            System.out.println("Error fuera del rango");
            return null;
        }
        Node<T> current = root;
        for (int i = 0; i < index; i++) {

            current = current.getNext();
        }

        return current.getValue();
    }
}
