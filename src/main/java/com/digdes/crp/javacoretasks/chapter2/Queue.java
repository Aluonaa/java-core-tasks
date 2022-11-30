package com.digdes.crp.javacoretasks.chapter2;


public class Queue {
    Node first;
    Node last;


    Queue add(String val) {
        Node l = last;
        last = new Node(l, null, val);
        if (l != null) {
            l.next = last;
        } else {
            first = last;
        }
        return this;
    }

    Queue remove() {
        first = first.next;
        return this;
    }


    static class Node {
        Node next;
        Node prev;
        String item;

        Node(Node prev, Node next, String item) {
            this.prev = prev;
            this.next = next;
            this.item = item;
        }

    }

    void printQueue(){
        for (Queue.Iterator iterator = new Iterator(); iterator.hasNext(); ) {
            System.out.print(iterator.next().item + " ");
        }
        System.out.println();
    }

    class Iterator {
        Queue.Node node;

        Iterator() {
            this.node = first;
        }

        Queue.Node next() {
            Queue.Node tmp = node;
            node = node.next;
            return tmp;
        }

        boolean hasNext() {
            return node != null;
        }
    }

}
