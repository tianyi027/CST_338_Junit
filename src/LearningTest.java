/**
 * Name: Tianyi Luo
 * Date: Sep.4th 2022
 * Explanation: This class is the test class of Learning class, which has a purpose of
 *              testing if there is anything wrong with the existed code by using junit
 */


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LearningTest {

    Learning learningTest = null;

    @BeforeEach
    void setUp() {
        System.out.println("Before each");
        learningTest = new Learning();
        /*
        Default values
        name = "Tianyi";
        count = 1;
        friends = new ArrayList<>();
         */
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each");
    }

    @Test
    void getCount() {
        System.out.println("Get Count test");
        assertEquals(1,learningTest.getCount());
        assertNotEquals(2, learningTest.getCount());
    }

    @Test
    void setCount() {
        System.out.println("Set Count test");
        assertEquals(1,learningTest.getCount());
        learningTest.setCount(100);
        assertNotEquals(1,learningTest.getCount());
        assertEquals(100,learningTest.getCount());
    }

    @Test
    void getName(){
        System.out.println("Get name Test");
        assertEquals("Tianyi",learningTest.getName());
    }
}