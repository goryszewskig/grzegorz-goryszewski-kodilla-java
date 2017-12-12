package com.kodilla.patterns.singleton;

import com.kodila.patterns.singleton.Logger;
import org.junit.Assert;
import org.junit.Test;
import sun.rmi.runtime.Log;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog(){
        //Given
        Logger.getInstance().log("Logging");
        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Logging", lastLog);
    }
}
