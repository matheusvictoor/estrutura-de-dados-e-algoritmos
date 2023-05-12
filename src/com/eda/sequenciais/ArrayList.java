package com.eda.sequenciais;

public class ArrayList<T> {
    public static final int CAPACITY_DEFAULT = 20;
    private T[] elements;
    private int size;

    public ArrayList(){
        this(CAPACITY_DEFAULT);
    }

    public ArrayList(int capacity){
        this.elements = (T[]) new Object[capacity];
        this.size = 0;
    }

    public boolean isEmpity(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public boolean add(T element) {
        ensuresCapacity(size + 1);
        elements[size++] = element;
        return true;
    }

    public void add(int index, T element){
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        ensuresCapacity(size + 1);
        shiftRigth(index);
        elements[index] = element;
        size++;
    }

    public void set(int index, T element){
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        elements[index] = element;
    }

    public void clean(){
        this.size = 0;
    }

    public T get(int index){
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        return elements[index];
    }

    public int indexOf(T element){
        for (int i = 0; i < size; i++){
            if (this.elements[i].equals(element))
                return i;
        }
        return -1;
    }

    public boolean contains(T element){
        return indexOf(element) != -1;
    }

    public T remove(int index){
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        T element = get(index);
        shiftLeft(index);
        size--;
        return element;
    }

    public boolean remove(T element){
        if (element == null)
            return false;
        for (int i = 0; i < size; i++){
            if (this.elements[i].equals(element))
                this.remove(i);
            return true;
        }
        return false;
    }

    private void shiftRigth(int index) {
        if(index == this.elements.length - 1)
            throw new IndexOutOfBoundsException();
        for(int i = size; i > index; i--){
            this.elements[i] = this.elements[i-1];
        }
    }

    private void shiftLeft(int index) {
        for(int i = index; i < size - 1; i++){
            this.elements[i] = this.elements[i+1];
        }
    }

    private void ensuresCapacity(int capacity) {
        if (capacity > this.elements.length){
            int resize = Math.max(capacity, this.elements.length * 2);
            T[] newList = (T[]) new Object[resize];
            for (int i = 0; i < size; i++){
                newList[i] = this.elements[i];
            }
            this.elements = newList;
        }
    }

    public String toString(){
        if (isEmpity()) return "[]";

        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i = 0; i < size - 1; i++){
            s.append(elements[i]);
            s.append(", ");
        }

        s.append(elements[size-1]);
        s.append("]");
        return s.toString();
    }
}
