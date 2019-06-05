package com.mikolo.algs.Main;

import com.mikolo.algs.Interfaces.IMyList;
import com.mikolo.algs.Interfaces.IMyList;

import java.util.concurrent.atomic.AtomicBoolean;

public class MyList implements IMyList {

    private ListElement head;
    private ListElement last;

    private int size = 0;


    public MyList() {

    }


    public int getSize() {
        return size;
    }

    public void incSize() {
        size++;
    }

    public void decSize() {
        size--;
    }

    public ListElement getLast() {
        return last;
    }

    public void setLast(ListElement last) {
        this.last = last;
    }

    public ListElement getHead() {
        return head;
    }

    public void setHead(ListElement head) {
        this.head = head;
    }

    @Override
    public void add(ListElement listElement) {

        if (getSize() == 0) {
            this.setHead(listElement);

        } else {
            this.getLast().next = listElement;
            listElement.previos = this.getLast();
            listElement.next = this.getHead();
        }
        this.setLast(listElement);
        this.incSize();
    }

    @Override
    public void addOrdered(ListElement listElement) {
        if (this.getSize() == 0) {
            this.setHead(listElement);
            listElement.next = listElement;
            listElement.previos = listElement;
        } else {

            ListElement iterator = this.getHead();
            if (listElement.getValue() <= iterator.getValue()) {
                this.setHead(listElement);
            } else {
                AtomicBoolean isLast = new AtomicBoolean(false);

                while (listElement.getValue() > iterator.getValue() && !isLast.get()) {
                    iterator = iterator.next;
                    if (iterator.equals(this.getHead())) {
                        this.setLast(listElement);
                        isLast.set(true);
                    }
                }
            }
            listElement.previos = iterator.previos;
            listElement.next = iterator;
            listElement.previos.next = listElement;
            iterator.previos = listElement;

        }
        this.incSize();
    }

    @Override
    public void remove(ListElement listElement) {

        if (this.getSize() == 0) {
            System.out.println("no nie..");
        } else {
            listElement.previos.next = listElement.next;
            listElement.next.previos = listElement.previos;
            listElement.previos = null;
            listElement.next = null;
        }
        this.decSize();
    }

    @Override
    public ListElement find(int value) {
        return null;
    }

    @Override
    public ListElement findIndexForValue(int value) {

        ListElement le = this.getHead();
        ListElement reverseLe = this.getLast();
        return null;
    }
}
