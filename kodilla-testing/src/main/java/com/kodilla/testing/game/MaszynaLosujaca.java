package com.kodilla.testing.game;

import java.util.List;

public class MaszynaLosujaca {
 private Database database;


    public int miniLotto(List<Integer> inputValues){
        List<Integer> result = database.wylosuj(5);
        int counter = 0 ;
        for (Integer temp: inputValues) {
            if (result.contains(temp)) {
                counter++;
            }

        }
        return counter;
    }

    public MaszynaLosujaca(Database database) {
        this.database = database;
    }
}
