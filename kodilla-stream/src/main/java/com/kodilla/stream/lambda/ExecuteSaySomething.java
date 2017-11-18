package com.kodilla.stream.lambda;

import javax.xml.transform.sax.SAXSource;

public class ExecuteSaySomething implements Executor {

    @Override
    public void process() {
        System.out.println("This is an example text.");
    }
}
