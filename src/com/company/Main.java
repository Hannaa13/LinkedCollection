package com.company;

import com.company.interfaces.impl.LinkList;


public class Main {

    public static void main(String[] args) {

        LinkList linkList = new LinkList();

        System.out.println(linkList.add("a"));
        System.out.println(linkList.add("g"));
        System.out.println(linkList.add("b"));
        System.out.println(linkList.add("d"));
        System.out.println(linkList.getSize());

        System.out.println(linkList.delete(3));
        System.out.println(linkList.getSize());
        System.out.println(linkList.delete(5));

        System.out.println(linkList.contains("a"));
        System.out.println(linkList.contains(null));
        System.out.println(linkList.contains("k"));
        linkList.add(null);

        System.out.println(linkList.getByIndex(10));

        System.out.println(linkList.isEmpty());
        linkList.clear();
        System.out.println(linkList.getSize());
    }
}
