package d08_jUnit;

public class Grader {

    public char determineLetterGrade (int numberGrade){

        if (numberGrade >= 90) {
            return 'A';
        } else if (numberGrade >= 80) {
            return 'B';
        } else if (numberGrade >= 70) {
            return 'C';
        } else if (numberGrade >= 60) {
            return 'D';
        } else if (numberGrade < 0) {
            throw new IllegalArgumentException("Grade cannot be negative");
        } else {
            return 'F';
        }
    }
}
