package model;

public class Student {

    // EFFECTS: Returns the number of registered credit for the student
    public Integer getNumRegisteredCredits() {
        return 0;
    }

    //MODIFIES: this
    //EFFECTS: Returns true if student has all prerequisites and adds the course to registered courses
    public boolean registerForCourse(Course c) {
        return false;
    }

    //REQUIRES: String c is an element of registered courses
    //MODIFIES: this
    //EFFECTS: Removes the course if it is in registered courses
    public void dropCourse(Course c) {

    }

}
