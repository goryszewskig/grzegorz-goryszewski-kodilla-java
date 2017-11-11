package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public OddNumbersExterminator() {
    }

    public static ArrayList<Integer> exterminate(ArrayList<Integer> list) {

        List<Integer> toRemove = new ArrayList<>();

        for (int si : list) {
            if (si % 2 != 0) { toRemove.add(si); }
        }

        list.removeAll(toRemove);
        return list;
    }

}
