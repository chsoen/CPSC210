import java.util.ArrayList;
import java.util.Arrays;

public class Student implements Gradeable {
    private ArrayList<Boolean> answers;

    //the below is an example of initializing an ArrayList with specific values
    private ArrayList<Boolean> correct;
    private int grade;

    public Student(){
        answers = new ArrayList<>();
        correct = new ArrayList<>();
    }

    //MODIFIES: this
    //EFFECTS:  sets the student's quiz answers
    @Override
    public void setAnswers(Boolean... args){
        answers.addAll(new ArrayList<>(Arrays.asList(args)));
        correct.addAll(new ArrayList<>(Arrays.asList(args)));
    }

    //EFFECTS:  prints out a grade report for the student including each question
    //          individually graded, and a final score for the quiz
    @Override
    public void printReport(){
        for (int i = 0; i < answers.size(); i++) {
            System.out.print("Your answer for question "+i+" was: "+answers.get(i)+".  This was.... ");
            if (correct.get(i)) {
                System.out.println("correct");
            }
            else {
                System.out.println("incorrect");
            }
        }
        System.out.println("Your overall grade was: "+grade);
    }
    @Override
    public Boolean getAnswer(int i) { return answers.get(i); }
    @Override
    public void setCorrect(int i) { this.correct.set(i,true);}
    @Override
    public void setIncorrect(int i) { this.correct.set(i,false); }
    @Override
    public void setGrade(int grade) { this.grade = grade; }
    @Override
    public boolean isCorrect(int question) { return correct.get(question); }
}
