package Day12;

class Student extends Person{
    private int[] testScores;

    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.testScores = scores;
    }
    int sumOfScores = 0;
    public char calculate() {
        for (int i = 0; i <= testScores.length; i++) {
            sumOfScores += testScores[i];
        }
        char grade;
        int average = sumOfScores / testScores.length;
        if (average >= 90 && average <= 100) grade = 'O';
        else if (average >= 80 && average < 90) grade = 'E';
        else if (average >= 70 && average < 80) grade = 'A';
        else if (average >= 55 && average < 70) grade = 'P';
        else if (average >= 55 && average < 70) grade = 'P';
        else if (average >= 40 && average < 55) grade = 'D';
        else grade = 'T';
        return grade;
    }
}