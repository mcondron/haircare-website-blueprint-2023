public class Question {
    String name; //product name
    String description; //include actual question in description
    String answer;// correct answer to question stated above

    public Question(String name, String description, String answer){
        this.name = name;
        this.description = description;
        this.answer = answer;
    }

    public void setName(String name){this.name = name;}
    public void setDescription(String description) {this.description = description;}
    public void setAnswer(String answer){this.answer = answer;}

    public String getName(){return name;}
    public String getDescription() {return description;}
    public String getAnswer() {return answer;}

    public String toString(){return name + description + answer;}
}
