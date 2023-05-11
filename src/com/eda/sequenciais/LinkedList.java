package com.eda.sequenciais;

import java.util.NoSuchElementException;

public class LinkedList<T> {

    private Node<T> head;
    private int size;

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addFirst(T data){
        head = new Node<>(data, head);
        size++;
    }

    public void addLast(T data){
        if (isEmpty()){
            addFirst(data);
        } else {
            addLast(head, data);
        }
    }

    private void addLast(Node<T> current, T data) {
        if(current.next == null){
            current.next = new Node<>(data, null);
            size++;
        } else {
            addLast(current.next, data);
        }
    }

    public T getFirst(){
        if(isEmpty()) {
            throw new NoSuchElementException("LinkedList is empty");
        } else {
            return head.data;
        }
    }

    public T getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("LinkedList is empty");
        } else if (head.next == null) {
            return head.data;
        } else {
            return getLast(head);
        }
    }

    private T getLast(Node<T> current){
        if (current.next == null){
            return current.data;
        }
        return  getLast(current.next);
    }

    public T removeFirst() {
        if (isEmpty()){
            throw new NoSuchElementException("LinkedList is empty");
        }
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public T removeLast(){
        if (isEmpty()){
            throw new NoSuchElementException("LinkedList is empty");
        } else if (head.next == null) {
            return removeFirst();
        } else {
            return removeLast(head);
        }
    }

    private T removeLast(Node<T> current){
        if (current.next.next == null){
            T data = current.next.data;
            current.next = null;
            size--;
            return data;
        }
        return removeLast(current.next);
    }

    public boolean contains(T data) {
        return contains(head, data);
    }

    private boolean contains(Node<T> current, T data){
        if (current == null){
            return false;
        } else if (current.data.equals(data)){
            return true;
        } else {
            return contains(current.next, data);
        }
    }

    public int indexOf(T data) {
        return indexOf(data, (Node<T>) getFirst(), 0);
    }

    private int indexOf( T data, Node<T> node, int index){
        if (node == null){
            return -1; // elemento não encontrado
        } else if (node.data.equals(data)) {
            return index; // elemento encontrado
        } else {
            return indexOf(data, node.next, index+1);
        }
    }

    public int sum(Node<T> node){
        if (head == null)
            return 0;
        return (Integer) head.data +  sum(node.next);
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
