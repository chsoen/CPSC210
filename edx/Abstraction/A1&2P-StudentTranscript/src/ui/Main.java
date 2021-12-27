package ui;

import model.Transcript;

public class Main {
    public static void main(String[] args){
        Transcript t1 = new Transcript("Jane Doe", 7830);
        Transcript t2 = new Transcript("Ada Lovelace", 8853);
        //TODO: create another Transcript object
        Transcript t3 = new Transcript("John Doe", 7853);

        t1.addGrade("CPSC-210", 3.5);
        t1.addGrade("ENGL-201", 4.0);
        t1.addGrade("CPSC-110", 3.1);

        //TODO: add grades to the other Transcript objects
        t2.addGrade("MATH-221", 3.2);
        t3.addGrade("PHYS200", 1.0);

        System.out.print(t1.getStudentName() + ": ");
        t1.printTranscript();

        System.out.println(t1.getGPA());


        //TODO: add more use cases here
        System.out.println(t2.getCourseAndGrade("MATH-221"));

        System.out.println(t3.getGPA());
    }
}
