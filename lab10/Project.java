import java.util.Arrays;

public class Project {
    public static int INITIAL = 0;
    public static int MODIFIED = 1;
    public static int FINAL = 2;

    private String ID;
    private double finalScore;
    private String segment = "?";
    private String credibility = "?";
    private int[] rawScores;
    private int[] modifiedScores;

    private Hackaton hackaton;

    private int count = 0;

    public Hackaton getHackaton(){
        return hackaton;
    }
    public void setHackaton(Hackaton x){
        this.hackaton = x;
    }

    public Project(String ID, int[] RawScores){
        this.ID = ID;
        rawScores = RawScores;
        count++;
        //setID();
    }

    public String getID(){
        return ID;
    }
    public void setID(){
        ID = "A" + count;
    }

    public void calcModifiedScores(){
        modifiedScores = Arrays.copyOf(rawScores, 6);
        if (0 < modifiedScores [1] && modifiedScores [1] <= 500){
            modifiedScores [1] = 20;
        }
        else if (500 < modifiedScores [1] && modifiedScores [1] <= 1000){
            modifiedScores [1] = 80;
        }
        else if (1000 < modifiedScores [1]){
            modifiedScores [1] = 100;
        }

        if (0 < modifiedScores [2] && modifiedScores [2] <= 6){
            modifiedScores [2] = 100;
        }
        else if (6 < modifiedScores [2] && modifiedScores [2] <= 12){
            modifiedScores [2] = 80;
        }
        else if (12 < modifiedScores [2]){
            modifiedScores [2] = 20;
        }

        if (0 <= modifiedScores[3] && modifiedScores[3] < 10){
            modifiedScores[3] = 20;
        }
        else if (10 <= modifiedScores[3] && modifiedScores[3] < 15){
            modifiedScores[3] = 80;
        }
        else if (15 <= modifiedScores[3]){
            modifiedScores[3] = 100;
        }
    }

    public void calcWeightAvg(){
        int upside = 0;
        int downside = 0;
        for (int i = 0; i < hackaton.getIndicatorCount(); i++){
            upside += modifiedScores[i]*hackaton.getIndicatorWeights()[i];
        }
        for (int i = 0; i < hackaton.getIndicatorCount(); i++){
            downside += hackaton.getIndicatorWeights()[i];
        }
        finalScore = upside / downside;
    }

    public void calcSegment(){
        if (finalScore == 100){
            segment = "A+";
        }
        else if (finalScore >= 90){
            segment = "A";
        }
        else if (finalScore >= 75){
            segment = "B";
        }
        else if (finalScore >= 60){
            segment = "C";
        }
        else if (finalScore >= 40){
            segment = "D";
        }
    }

    public void calcCredibility(){
        if (segment.equals("A+")){
            credibility = "Perfect";
        }
        else if (segment.equals("A")){
            credibility = "Very Good";
        }
        else if (segment.equals("B")){
            credibility = "Good";
        }
        else if (segment.equals("C")){
            credibility = "Considerable";
        }
        else if (segment.equals("D")){
            credibility = "Not appropriate";
        }
    }

    public String toString(int a){
        String output = "";
        if(a == INITIAL){
            output += String.format("%-15s", getID()) + String.format("%-15s", rawScores[0]) + String.format("%-15s", rawScores[1]) + String.format("%-15s", rawScores[2]) + String.format("%-15s", rawScores[3]);
            return output;
        }
        else if (a == MODIFIED){
            output += String.format("%-15s", getID()) + String.format("%-15s", modifiedScores[0]) + String.format("%-15s", modifiedScores[1]) + String.format("%-15s", modifiedScores[2]) + String.format("%-15s", modifiedScores[3]);
            return output;
        }
        else if (a == FINAL){
            output += String.format("%-15s", getID()) + String.format("%-15s", modifiedScores[0]) + String.format("%-15s", modifiedScores[1]) + String.format("%-15s", modifiedScores[2]) + String.format("%-15s", modifiedScores[3]) + String.format("%-15s", finalScore) + String.format("%-15s", segment) + String.format("%-15s", credibility);
            return output;
        }
        return output;
    }
    

}
