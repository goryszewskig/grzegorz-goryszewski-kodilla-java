package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BootCampGroupTestSuite {

    @Test
    public void testAssignmentsQueue() {

        // Given
        BootCampGroup javaBootCampGroup = new JavaBootCampHomeWork();
        BootCampGroup cBootCampGroup = new CBootCampHomeWork();

        BootCampAdmin mentorJava = new BootCampAdmin("Mentor Jack", true);
        BootCampAdmin mentorC = new BootCampAdmin("Mentor Jan", true);
        BootCampAdmin bootCampCoordinator = new BootCampAdmin("Mentor Rob", false);

        javaBootCampGroup.registerObserver(mentorJava);
        cBootCampGroup.registerObserver(mentorC);
        javaBootCampGroup.registerObserver(bootCampCoordinator);
        cBootCampGroup.registerObserver(bootCampCoordinator);

        // When
        javaBootCampGroup.addAssignment(new Assignment("Exercise 20.2 - decorator pattern", "Takeshi Kovacs"));
        javaBootCampGroup.addAssignment(new Assignment("Exercise 20.3 - aspect oriented programming", "Takeshi Kovacs"));
        cBootCampGroup.addAssignment(new Assignment("Exercise pushups", "GG"));

        // Then
        assertEquals(2, mentorJava.getUpdateCount());
        assertEquals(1, mentorC.getUpdateCount());
        assertEquals(0, bootCampCoordinator.getUpdateCount());
    }
}
