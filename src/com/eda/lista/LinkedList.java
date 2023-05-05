package com.eda.lista;

public class LinkedList<T> {

    private Node<T> head;
    private int size;

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void addFirst(T data){
        this.head = new Node<>(data, this.head);
        this.size++;
    }

    public void addLast(T data){
        if (this.isEmpty()){
            this.addFirst(data);
        } else {
            this.addLast(this.head, data);
        }
    }

    private void addLast(Node<T> head, T data) {

    }

    private static class Node<T>{

        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }
    }
}
