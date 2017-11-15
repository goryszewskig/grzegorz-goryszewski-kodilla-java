package com.kodilla.testing.shape;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Shape;
import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    ShapeCollector testFigure;


    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Starting tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests have finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
        testFigure = new ShapeCollector();
    }

    @Test
    public void testAddFigureToList(){
        Shape circle1 = new Circle(2);
        testFigure.addFigure(circle1);
        Assert.assertEquals(1,  testFigure.getFigureListSize());
    }

    @Test
    public void testAddFigure(){
        Shape circle1 = new Circle(2);
        testFigure.addFigure(circle1);
        Assert.assertEquals(circle1 , testFigure.getFigure(0));
    }

    @Test
    public void testRemoveNotExistingFigure(){
        Shape circle1 = new Circle(2);
        boolean result = testFigure.removeFigure(circle1);
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigure(){
        Shape circle1 = new Circle(2);
        testFigure.removeFigure(circle1);
        Assert.assertEquals(0, testFigure.getFigureListSize());
    }
    @Test
    public void testFields(){
        Shape triangle1 = new Triangle(3.2,4.1);
        double result = triangle1.getField();
        Assert.assertEquals(13.12, result,0);
    }


}