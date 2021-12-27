public interface Gradeable {

    void setAnswers(Boolean... args);

    void printReport();

    Boolean getAnswer(int i);

    void setCorrect(int i);

    void setIncorrect(int i);

    void setGrade(int grade);

    boolean isCorrect(int question);

}
