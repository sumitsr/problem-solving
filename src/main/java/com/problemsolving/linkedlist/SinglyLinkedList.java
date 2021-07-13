package com.problemsolving.linkedlist;

public class SinglyLinkedList<T> {
    public class Node {
        public T data;
        public Node nextNode;
    }
    public Node headNode;
    public int size;
    public SinglyLinkedList() {
        headNode = null;
        size = 0;
    }
    public Node getHeadNode() {
        return headNode;
    }
    public void setHeadNode(Node headNode) {
        this.headNode = headNode;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public boolean isEmpty() {
        if (headNode == null) return true;
        return false;
    }
    public void insertAtHead(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = headNode;
        headNode = newNode;
        size++;
    }
    public void insertAtEnd(T data) {
        if (isEmpty()) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;
        Node last = headNode;
        while (last.nextNode != null) {
            last = last.nextNode;
        }
        last.nextNode = newNode;
        size++;
    }
    public void insertAfter(T data, T previous) {
        Node newNode = new Node();
        newNode.data = data;
        Node currentNode = this.headNode;
        while (currentNode != null && currentNode.data != previous) {
            currentNode = currentNode.nextNode;
        }
        if (currentNode != null) {
            newNode.nextNode = currentNode.nextNode;
            currentNode.nextNode = newNode;
            size++;
        }
    }
    public void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }
        Node temp = headNode;
        System.out.print("List : ");
        while (temp.nextNode != null) {
            System.out.print(temp.data.toString() + " -> ");
            temp = temp.nextNode;
        }
        System.out.println(temp.data.toString() + " -> null");
    }
    public boolean searchNode(T data) {
        Node currentNode = this.headNode;
        while (currentNode != null) {
            if (currentNode.data.equals(data))
                return true; //value found
            currentNode = currentNode.nextNode;
        }
        return false; //value not found
    }
    public void deleteAtHead() {
        if (isEmpty())
            return;
        headNode = headNode.nextNode;
        size--;
    }
    public void deleteByValue(T data) {
        if (isEmpty())
            return;
        Node currentNode = this.headNode;
        Node prevNode = null; //previous node starts from null
        if(currentNode.data.equals(data)) {
            deleteAtHead();
            return;
        }
        while (currentNode != null) {
            if (data.equals(currentNode.data)){
                prevNode.nextNode = currentNode.nextNode;
            }
            prevNode = currentNode;
            currentNode = currentNode.nextNode;
        }
    }
    public void reverse() {
        Node prev = null; //To keep track of the previous element, will be used in swapping links
		Node current = this.headNode; //firstElement
		Node next = null;
		while (current != null) {
			next = current.nextNode;
			current.nextNode = prev;
			prev = current;
			current = next;
		}
		this.headNode = prev;
    }
    public void removeDuplicates() {
        Node current = headNode; // will be used for outer loop
        Node compare = null;     // will be used for inner loop
        while (current != null && current.nextNode != null) {
            compare = current;
            while (compare.nextNode != null) {
                if (current.data == compare.nextNode.data) {
                    compare.nextNode = compare.nextNode.nextNode;
                } else {
                    compare = compare.nextNode;
                }
            }
            current = current.nextNode;
        }
    }
}