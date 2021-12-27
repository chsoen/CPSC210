package model;

public class Transcript {

    public Transcript(String studentName, int studentID) {

    }

    // getters
    public String getStudentName() {
        return "";
    }

    //TODO: Design specification for this method
    //REQUIRES: Grade is a positive real number between 0 and 4, and course must no be null
    //MODIFIES: this
    //EFFECTS: Adds a course with a grade in the transcript
    public void addGrade(String course, double grade){ }

    //TODO: Design specification for this method
    // This method should return course name and grade in some consistent String format
    //EFFECTS:Returns the grade associated with the given course in format Course: Grade
    public String getCourseAndGrade(String course){ return null; }

    //TODO: Design specification for this method
    //EFFECTS: Prints all courses and grades
    public void printTranscript(){ }

    //TODO: Design specification for this method
    //EFFECTS: Returns GPA calculated from grades.
    public double getGPA(){ return 0.0; }
}
