/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XCPC
 */
public class Circular<T> {

    private Node<T> root;
    private Node<T> end;
    private int size;

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

    public void add(T value) {
        Node temp = new Node(value);
        //Lista vacia
        if (root == null) {
            root = temp;
            end = temp;
            temp.setNext(root);
            size++;
            return;

        }

        temp.setNext(root);
        end.setNext(temp);
        end = temp;
        size++;

    }
    
       public int getSize(){
        
        return size;
    }

}
