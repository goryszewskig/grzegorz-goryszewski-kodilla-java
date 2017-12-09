package com.kodilla.spring.calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double valAdd = calculator.add(1,1);
        Double valSub = calculator.sub(11,2);
        Double valMul = calculator.mul(11,2);
        Double valDiv = calculator.div(11,2);
        //Then
        Assert.assertEquals(2, valAdd, 0.1);
        Assert.assertEquals(9, valSub, 0.1);
        Assert.assertEquals(22, valMul, 0.1);
        Assert.assertEquals(5.5, valDiv, 0.1);
    }
}
