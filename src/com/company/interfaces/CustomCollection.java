package com.company.interfaces;

import com.company.interfaces.impl.LinkList;

public interface CustomCollection {


        boolean add(String str);

        boolean delete (int index);

        LinkList.LinkNode getByIndex(int index);

        boolean contains(String str);

        void clear();

        boolean isEmpty();

        int getSize();


    }

