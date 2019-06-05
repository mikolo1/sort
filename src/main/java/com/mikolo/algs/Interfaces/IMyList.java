package com.mikolo.algs.Interfaces;

import com.mikolo.algs.Main.ListElement;

public interface IMyList {
    void add (ListElement listElement);
    void addOrdered (ListElement listElement);
    void remove (ListElement listElement);
    ListElement find (int value);
    ListElement findIndexForValue (int value);

}
