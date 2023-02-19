import java.util.ArrayList;
public class main {
    public static void main(String[] args){
        ArrayList<Question> newQuiz = new ArrayList<Question>();

        Question q1 = new Question("Pantene", "is this good?", "no");
        Question q2 = new Question("Head and Shoulders", "is this good?", "no");
        Question q3 = new Question("Tresemme", "is this good?", "no");
        Question q4 = new Question("Dove", "is this good?", "no");

        newQuiz.add(new Question("Pantene", "is this good?", "no"));
        newQuiz.add(new Question("Head and Shoulders", "is this good?", "no"));
        newQuiz.add(new Question("Tresemme", "is this good?", "no"));
        newQuiz.add(new Question("Dove", "is this good?", "no"));

        Quiz theQuiz = new Quiz(newQuiz);

        theQuiz.runQuiz();





 }
}
