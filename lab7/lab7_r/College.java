package lab7_r;

public class College {
    private String collegeName;
    private String teamName;
    private String state;
    private static int alumniCount;

    public College(String collegeName, String teamName, String state){
        setCollegeName(collegeName);
        changeTeamName(teamName);
        setState(state);
        setAlumni(0);
    }

    public void changeTeamName(String x){
        teamName = x;
    }

    public String getTeamName(){
        return teamName;
    }

    public void addAlumni(){
        alumniCount++;
    }

    public void setCollegeName(String x){
        collegeName = x;
    }

    public String getCollegeName(){
        return collegeName;
    }

    public void setState(String x){
        state = x;
    }

    public String getState(){
        return state;
    }

    public void setAlumni(int x){
        alumniCount = x;
    }

    public int getAlumni(){
        return alumniCount;
    }

    public String toString(){
        String output = "";
        output += "************************************************************" + "\n";
        output += "College Name: " + getCollegeName() + "\n";
        output += "College Team Name: " + getTeamName() + "\n";
        output += "State: " + getState() + "\n";
        output += "Number of graduates (alumni): " + getAlumni() + "\n";
        output += "************************************************************" + "\n";

        return output;
    }
}
