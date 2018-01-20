package com.kodilla.testing.game;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameTestSuite {

    @Test
    public void TestMiniLotto(){
        Database database = mock(Database.class);
        MaszynaLosujaca maszynaLosujaca = new MaszynaLosujaca(database);
        List<Integer> daneWejsciowe = new ArrayList<>();
        List<Integer> daneWylosowane = new ArrayList<>();

        daneWejsciowe = Arrays.asList(1,2,3,4,5);
        daneWylosowane = Arrays.asList(2,4,5,6,7);

        when(database.wylosuj(5)).thenReturn(daneWylosowane);
        int result = maszynaLosujaca.miniLotto(daneWejsciowe);

        Assert.assertEquals(3, result );
    };


}
