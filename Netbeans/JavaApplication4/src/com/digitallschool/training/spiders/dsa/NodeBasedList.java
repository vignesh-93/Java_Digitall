/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.dsa;

import java.util.Objects;

/**
 *
 * @author HP
 */
public class NodeBasedList {

    private Node head;
    private int size;

    {
        head = null;
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        temp.append("[");

        Node handle = head;
        if (handle != null) {
            temp.append(handle.data);
            handle = handle.next;

            while (handle != null) {
                temp.append(", " + handle.data);
                handle = handle.next;
            }
        }
        temp.append("]");
        return temp.toString();
    }

    public boolean add(Object e) {
        Node temp = new Node(null, e, null);

        if (isEmpty()) {
            head = temp;
            size++;
        } else {
            Node handle;
            handle = head;
            while (handle.next != null) {
                handle = handle.next;
            }
            handle.next = temp;
            temp.previous = handle;
            size++;
        }
        return true;
    }

    public boolean addAll(NodeBasedList n) {
        Node temp = this.head;
        Node handle = n.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        handle.previous = temp;
        temp.next = handle;
        return true;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return size;
    }

    public Object remove(int index) {
        if (size <= 0) {
            throw new IndexOutOfBoundsException();
        }

        Node temp = head;
        Object value = null;

//        if (index == 0){
        if (Objects.equals(index, 0)) {
            head = head.next;
            temp.next = null;
//            if(head != null){
            if (Objects.nonNull(head)) {
                head.previous = null;
            }
            size--;
            value = temp.data;
        } else {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            if (temp.next != null) {
                temp.previous.next = temp.next;
                temp.next.previous = temp.previous;
                temp.next = null;
                temp.previous = null;
            } else {
                temp.previous.next = null;
                temp.previous = null;
            }
            size--;
            value = temp.data;
        }
        return value;
    }

    public boolean remove(Object value) {
        boolean change = false;
        Node temp = head;

        if (head.data == value) {
            head = head.next;
            temp.next = null;
            if (head != null) {
                temp.previous = null;
            }
            change = true;
            size--;
        } else {
            for (int i = 0; i < size; i++) {
                //if (temp.data == value) {
                if (Objects.equals(temp.data, value)) {
                    break;
                } else {
                    temp = temp.next;
                }
            }
            if (Objects.nonNull(temp.next)) {
                temp.previous.next = temp.next;
                temp.next.previous = temp.previous;
                temp.next = null;
                temp.previous = null;
            } else {
                temp.previous.next = null;
                temp.previous = null;
            }
            change = true;
        }

        return change;
    }

//    public void add(int index, Object value) {
//        Node temp = new Node(null, value, null);
//        Node handle;
//        if (Objects.equals(index, 1)) {
//            
//        } else {
//            for (int i = 0; i < size; i++) {
//                if (Objects.equals(i, index)) {
//                        
//                }
//            }
//        }
//    }
//    public boolean equals(Object o){
//        return false;
//     }
    
    public void add(int index, Object e) {
        if (Objects.equals(size, 0) || (index > size - 1) || (index < 0)) {
            throw new IndexOutOfBoundsException();
        }
        addNode(index, e);
    }

    public boolean contains(Object e) {
        Node temp = head;
        boolean changed = false;
        if (temp.data == e) {
            changed = true;
        }
        return changed;
    }

    public Object set(int index, Object e) {
        Node temp = head;
        if (index == 0) {
            temp.data = e;
        } else {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.data = e;
        }
        return temp.data;
    }

    public Object get(int index){
        Node temp = head;
        Node handle;
        if(Objects.equals(index, 0)){
            return temp.data; 
        }else if(Objects.equals(index,size-1)){
            handle = head;
            while(handle.next!=null){
                
            }
        }
        return null;
    }
    
    public boolean containsAll(NodeBasedList nb) {
		boolean changed = false;
		int count = 0;
		Node temp = nb.head;
		for (int i = 0; i < nb.size; i++) {
			if (this.contains(temp.data)) {
				count++;
				temp = temp.next;
			} else {
				temp = temp.next;
			}
		}
		if (count == nb.size) {
			changed = true;
		}
		return changed;
	}
    
    public boolean removeAll(NodeBasedList n) {
        boolean changed = false;
        Node temp = n.head;
        for (int i = 0; i < n.size; i++) {
            if (this.contains(temp.data)) {
                Node t = temp.next;
                this.remove(temp.data);
                temp = t;
                changed = true;
            }
        }
        return changed;
    }

//    private Object removeNode(Node now) {
//        return null;
//    }
//
//    private Object removeHead(Node now) {
//        return null;
//    }
//
//    private Object removeTail(Node now) {
//        return null;
//    }
    
    private void addNode(int index, Object e) {
        Node now = new Node(null, e, null);
        Node handle = head;
        if (index == 0) {
            addHead(now);
        } else {
            for (int i = 0; i < index; i++) {
                handle = handle.next;
            }
            handle.previous.next = now;
            now.previous = handle.previous;
            handle.previous = now;
            now.next = handle;
            size++;
        }
    }

    private void addHead(Node current) {
        current.previous = null;
        current.next = head;
        head = current;
    }

    private static class Node {

        private Node previous;
        private Object data;
        private Node next;

        public Node(Node previous, Object data, Node next) {
            this.previous = previous;
            this.data = data;
            this.next = next;
        }

    }

}
