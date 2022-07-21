/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XCPC
 */
public class DoubleCircular<T> {

    private Node<T> root;
    private Node<T> end;
    private int size;

    public DoubleCircular(T value) {

        root = new Node(value);
        end = root;
        root.setNext(root);
        root.setBack(root);
        size++;
    }

    public void removeMiddle(int index) {

        if (index > size || index < 0) {
            System.out.println("Error indice fuera del rango de lista");
            return;
        }
        if (size == 0) {
            System.out.println("No hay elementos en la lista");
            return;
        }

        if (size % 2 == 0) {
            Node current = root;
            for (int i = 0; i < ((index + 1) / 2); i++) {

                current = current.getNext();
                Node temp = current.getNext();
                temp.setBack(current.getBack());
                current.setBack(null);
                current.getBack().setNext(temp);
                current.setNext(null);
                size--;
            }
            {

                end.getBack().setNext(root);
                end.setNext(null);
                root.setBack(end.getBack());
                end.setBack(null);
                end = root.getBack();
                size--;

            }

        }
    }

}
