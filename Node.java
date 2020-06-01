package com.company;

import java.util.ArrayList;
import java.util.List;

public class Workspace<T> {

    private class Node {

        public transient T value;
        public transient Node next;

        public Node(T value, Node next) {
            this.next = next;
            this.value = value;
        }

        public Node() {
            this(null, null);
        }
    }

    // Первый элемент очереди
    private Node head = null;
    // Последний элемент очереди
    private Node tail = null;
    // Длина очереди
    private int size = 0;

    public void add(T t) {
        if (head == null) {
            head = tail = new Node(t, null);
        } else {
            tail.next = new Node(t, null);
            tail = tail.next;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public void remove() throws Exception {
        if (head == null) {
            throw new Exception("EMPTY!");
        }
        T result = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void removeSmth(T t) throws Exception {
        if (head.value == t) {
            remove();
        } else {
            Node x = head;
            Node prev = null;
            while (!(x.value == t)) {
                prev = x;
                x = x.next;
            }
            prev.next = x.next;
        }
    }

    public void clear() {
        head.value = null;
        head.next = null;
        tail.value = null;
        size = 0;
    }

    public T check() {
        return (T) head.value;
    }

    public void allChecks(Workspace<Integer> list ) throws Exception {
        for (int i = 0; i < list.size; i++){
            int t = list.check();
            System.out.println(t);
            list.remove();
        }
        int t = list.check();
        System.out.println(t);
    }

    public boolean isEmpty() {
        if (size==0) {
            return true;
        } else {
            return false;
        }
    }

    public void addList(ArrayList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
    }
}
