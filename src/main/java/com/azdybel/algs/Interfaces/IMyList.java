package com.azdybel.algs.Interfaces;

import com.azdybel.algs.Main.ListElement;

public interface IMyList {
    void add (ListElement listElement);
    void addOrdered (ListElement listElement);
    void remove (ListElement listElement);
    ListElement find (int value);
    ListElement findIndexForValue (int value);

}
