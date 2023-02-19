import java.util.*;
public class Quiz {
    ArrayList<Question> quiz;
    Scanner sc;
    int score;

    public Quiz(ArrayList<Question> quiz){
      this.quiz = quiz;
      this.sc = new Scanner(System.in);
      this.score = 0;
    }

    public ArrayList<Question> addToQuiz(Question newQuestion){
        quiz.add(newQuestion);
        return quiz;
    }

    public void runQuiz(){
        for(int i = 0; i < quiz.size(); i++){
            System.out.println(quiz.get(i).getName());
            System.out.println(quiz.get(i).getDescription());
            System.out.println("Please write your answer below");
            String curAnswer = sc.next();
            if(curAnswer.equals(quiz.get(i).getAnswer())){
                System.out.println("Correct!");
                System.out.println();
                score ++;
            }
            else{
                System.out.println("Wrong, sorry!");
            }
        }

        System.out.println("Your score was " + score + " out of " + quiz.size());
        System.out.println("Well Done!");
    }
    public void setQuiz(ArrayList<Question> quiz) {this.quiz = quiz;}
    public void setScore(int score) {this.score = score;}

    public ArrayList<Question> getQuiz() {return quiz;}
    public int getScore(){return score;}
}
