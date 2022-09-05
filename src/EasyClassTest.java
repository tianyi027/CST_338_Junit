/**
 * Name: Tianyi Luo
 * Date: Sep.4th 2022
 * Explanation: This class is the test class of EasyClass class, which has a purpose of
 *              testing if there is anything wrong with the existed code by using junit
 *              Unlike the LearningTest class, this class contains more test cases.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;


import static org.junit.jupiter.api.Assertions.*;

class EasyClassTest {


    String name;
    Integer count;
    Double score;
    Random random;
    EasyClass easyClass;


    @BeforeEach
    void setUp() {
        System.out.println("Processing Setup");
        random = new Random();
        name = "Tianyi"; // Coldamoto
        count = random.nextInt(70) + random.nextInt(30) + 1; // from 0 to the number
        score = 99.9;
        System.out.println("count == " + count);
        easyClass = new EasyClass(name, count, score);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Processing Teardown");
        random = null;
        name = null;
        count = null;
        score = null;
        easyClass = null;
    }

    @Test
    void getName() {
        assertEquals(name, easyClass.getName());
    }

    @Test
    void setName() {
        assertEquals(name, easyClass.getName());
        easyClass.setName("Luo");
        assertNotEquals(name, easyClass.getName());
        //easyClass.setName(99); integer can not be allowed to run
        //assertThrow, asserTrue...
    }

    @Test
    void getCount() {
        assertEquals(count, easyClass.getCount());
    }

    @Test
    void setCount() {
        assertEquals(count, easyClass.getCount());
        easyClass.setCount(200);
        assertNotEquals(count, easyClass.getCount());
    }

    @Test
    void getScore() {
        assertEquals(score, easyClass.getScore());
    }

    @Test
    void setScore() {
        assertEquals(score, easyClass.getScore());
        easyClass.setScore(100.1);
        assertNotEquals(score, easyClass.getScore());
    }

//    @Test
//    void nameTest() {
//        assertNotNull(easyClass.nameTest());
//        assertEquals(count*score, easyClass.nameTest());
//    }
}