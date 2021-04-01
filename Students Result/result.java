public class result{

    private String score;
    private String grade;

public result(String score, String grade){ 
    {this.score= score;
       this.grade=grade;  }
};
   

public void addGrade(String adder)
{this.grade=adder;}

public void setScore(String mainscore)

{this.score=mainscore;}

public String getScore(){return score;
    
}
public String getGrade(){return grade;}

}