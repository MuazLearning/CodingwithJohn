package d08_jUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GraderTest {

    @Test
    void testDetermineLetterGrade() {
        Grader grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(90));
        assertEquals('B', grader.determineLetterGrade(80));
        assertEquals('C', grader.determineLetterGrade(70));
        assertEquals('D', grader.determineLetterGrade(60));
        assertEquals('F', grader.determineLetterGrade(50));
        assertEquals('F', grader.determineLetterGrade(40));
        assertEquals('F', grader.determineLetterGrade(30));
        assertEquals('F', grader.determineLetterGrade(20));
        assertEquals('F', grader.determineLetterGrade(10));
        assertEquals('F', grader.determineLetterGrade(0));
        assertThrows(IllegalArgumentException.class, () -> grader.determineLetterGrade(-1));
    }

    @Test
    void zeroShouldReturnF() {
        Grader grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(0));
    }

    @Test
    void fiftyNineShouldReturnF() {
        Grader grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    void sixtyNineShouldReturnD() {
        Grader grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(69));
    }

    @Test
    void seventyNineShouldReturnC() {
        Grader grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(79));
    }

    @Test
    void eightyNineShouldReturnB() {
        Grader grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(89));
    }

    @Test
    void ninetyNineShouldReturnA() {
        Grader grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(99));
    }

    @Test
    void negativeOneShouldReturnA() {
        Grader grader = new Grader();
        assertThrows(IllegalArgumentException.class, () -> grader.determineLetterGrade(-1));
    }
}
