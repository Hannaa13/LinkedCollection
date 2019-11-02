package com.company.interfaces.impl;

import com.company.interfaces.CustomCollection;

public class LinkList implements CustomCollection {
    private LinkNode first;
    private LinkNode last;
    private int size = 0;

    public static class LinkNode {
        String data;
        LinkNode next;
        LinkNode previous;

        public LinkNode(String data) {
            this.data = data;
        }
    }


@Override
public boolean add(String str) {
        LinkNode newNode = new LinkNode(str);
       if (first == null) {
           newNode.next = null;
           newNode.previous = null;
           first = newNode;
           last = newNode;
        } else {
           last.next = newNode;
           newNode.previous = last;
           last = newNode;
       }
        size++;
        return true;
}

    @Override
    public boolean delete(int index) {
        if (!(index >=0 && index<size)) return false;

        LinkNode elemNode = getByIndex(index);
        final String element = elemNode.data;
            final LinkList.LinkNode next = elemNode.next;
            final LinkList.LinkNode prev = elemNode.previous;

            if (prev == null) {
                first = next;
            } else {
                prev.next = next;
                elemNode.previous = null;
            }

            if (next == null) {
                last = prev;
            } else {
                next.previous = prev;
                elemNode.next = null;
            }

            elemNode.data = null;
            size--;

            return true;
        }

    @Override
    public LinkNode getByIndex(int index) {
        if (!(index >=0 && index<size)) return null;
        if (index < (size >> 1)) {
            LinkNode node = first;
            for (int i = 0; i < index; i++)
                node = node.next;
            return node;
        } else {
            LinkNode node = last;
            for (int i = size - 1; i > index; i--)
                node = node.previous;
            return node;
        }
        }



    @Override
    public boolean contains(String str) {
        if (str == null) {
            for (LinkNode node = first; node != null; node = node.next) {
                if (node.data == null) {
                    return true;
                }
            }
        } else {
            for (LinkNode node = first; node != null; node = node.next) {
                if (str == node.data) {
                    return true;
                }
            }

        }
            return false;
        }


    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;

    }
     @Override
     public int getSize() {
        return size;
}



}