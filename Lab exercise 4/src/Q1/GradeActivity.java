package Q1;
//This is given to the students.
//They need to write comments to get 2 Marks
public class GradeActivity//indicates class
{
    private double[] grade;//creates empty array field
    private double score;//creates empty double field
    private int outOf;//creates empty int field
    private double percentScore;//creates empty double field
    public GradeActivity(){}//creates empty body constructor
    public GradeActivity(double score, int outOf){//constructor with argument
        this.outOf = outOf;//sets value to field
        this.score = score;//sets value to field
    }
    public GradeActivity(double[] grade, int outOf){//constructor with argument
        this.outOf = outOf;//sets value to field
        this.grade = grade;//sets value to field
        double sum = 0;//sets sum to 0
        for(int i = 0; i< grade.length; i++){//loop which adds together all elements of array
            sum+= grade[i];//adds grade value at specific position to previous sum
        }
        if(outOf == 100)//checks if sum is out of 100
            score = sum;//if condition is met, score will be assigned to sum
        else//executes if condition is not met
            score = sum/ grade.length;//sets the score by making it into a percentage
    }
    public double getScore() {
        return score;
    }//method which returns score
    public String getLetterGrade(){//method which determines which grade will be assigned
        percentScore = score/outOf*100;//checks score as a percentage
        if(Math.round(percentScore) >=90) return "A+";//returns string if condition is met
        else if(Math.round(percentScore) >=80) return "A";//returns string if condition is met
        else if(Math.round(percentScore) >=70) return "B";//returns string if condition is met
        else if(Math.round(percentScore) >=60) return "C";//returns string if condition is met
        else if(Math.round(percentScore) >=50) return "D";//returns string if condition is met
        else return "F";//returns F if not condition is met
    }
    @Override//indicates overridden method
    public String toString() {//toSting method, will execute when using reference variable in driver
        //The arguments of String.format() is written in the same way as the arguments of printf()
        return String.format("%.2f (out of %d), Letter Grade: %s [%d%%]", score,outOf, getLetterGrade(),Math.round(percentScore));//returns the scores
    }
}

