public class Hackaton {
    public static int MAX_NO_OF_PROJECTS = 6;
    public static int INDICATOR_COUNT = 4;
    public static int[] INDICATOR_WEIGHTS = {10,25,30,35};

    private int projectCount = 0;
    private Project[] projects = new Project[MAX_NO_OF_PROJECTS];

    public Hackaton(int projectCount, Project[] projects){
        this.projectCount = projectCount;
        this.projects = projects;
    }

    public int getMaxNoOfProjects(){
        return MAX_NO_OF_PROJECTS;
    }
    public int getIndicatorCount(){
        return INDICATOR_COUNT;
    }
    public int[] getIndicatorWeights(){
        return INDICATOR_WEIGHTS;
    }

    public void addProject(Project project){
            projects[projectCount] = project;
            projectCount++;
            project.setHackaton(new Hackaton(projectCount, projects));
    }

    public String toString(int a){
        String output = "";
        if (a == 0){
            output += projects[0].toString(0) + "\n";
            output += projects[1].toString(0)+ "\n";
            output += projects[2].toString(0)+ "\n";
            output += projects[3].toString(0)+ "\n";
            output += projects[4].toString(0)+ "\n";
            output += projects[5].toString(0)+ "\n";
            output += "***********************************************************************";
            return output;
        }
        else if (a == 1){
            output += projects[0].toString(1) + "\n";
            output += projects[1].toString(1)+ "\n";
            output += projects[2].toString(1)+ "\n";
            output += projects[3].toString(1)+ "\n";
            output += projects[4].toString(1)+ "\n";
            output += projects[5].toString(1)+ "\n";
            output += "***********************************************************************";
            return output;
        }
        else if (a == 2){
            output += projects[0].toString(2) + "\n";
            output += projects[1].toString(2)+ "\n";
            output += projects[2].toString(2)+ "\n";
            output += projects[3].toString(2)+ "\n";
            output += projects[4].toString(2)+ "\n";
            output += projects[5].toString(2)+ "\n";
            output += "************************************************************************************************************************";
            return output;
        }
        return output;
    }

    public static void main(String[] args) {
        Project[] projects = new Project[MAX_NO_OF_PROJECTS];
        Hackaton hackaton = new Hackaton(0, projects);

        int[] a1RawScores = {100,240,15,26};
        Project a1 = new Project("A1", a1RawScores);
        hackaton.addProject(a1);
        a1.calcModifiedScores();
        a1.calcWeightAvg();
        a1.calcSegment();
        a1.calcCredibility();

        int[] a2RawScores = {20,407,13,11};
        Project a2 = new Project("A2", a2RawScores);
        hackaton.addProject(a2);
        a2.calcModifiedScores();
        a2.calcWeightAvg();
        a2.calcSegment();
        a2.calcCredibility();
        
        int[] a3RawScores = {100,281,13,39};
        Project a3 = new Project("A3", a3RawScores);
        hackaton.addProject(a3);
        a3.calcModifiedScores();
        a3.calcWeightAvg();
        a3.calcSegment();
        a3.calcCredibility();

        
        int[] a4RawScores = {80,1264,4,38};
        Project a4 = new Project("A4", a4RawScores);
        hackaton.addProject(a4);
        a4.calcModifiedScores();
        a4.calcWeightAvg();
        a4.calcSegment();
        a4.calcCredibility();
        
        int[] a5RawScores = {20,1020,12,11};
        Project a5 = new Project("A5", a5RawScores);
        hackaton.addProject(a5);
        a5.calcModifiedScores();
        a5.calcWeightAvg();
        a5.calcSegment();
        a5.calcCredibility();
        
        int[] a6RawScores = {100,1162,17,34};
        Project a6 = new Project("A6", a6RawScores);
        hackaton.addProject(a6);
        a6.calcModifiedScores();
        a6.calcWeightAvg();
        a6.calcSegment();
        a6.calcCredibility();

        System.out.println("Initial Table");
        System.out.println("***********************************************************************");
        System.out.println(String.format("%-15s", "Project ID") + String.format("%-15s", "Indicator 1") + String.format("%-15s", "Indicator 2") + String.format("%-15s", "Indicator 3") + String.format("%-15s", "Indicator 4"));
        System.out.println(hackaton.toString(0));
        System.out.println("Modified Table");
        System.out.println("***********************************************************************");
        System.out.println(String.format("%-15s", "Project ID") + String.format("%-15s", "Indicator 1") + String.format("%-15s", "Indicator 2") + String.format("%-15s", "Indicator 3") + String.format("%-15s", "Indicator 4"));
        System.out.println(hackaton.toString(1));
        System.out.println("Final Table");
        System.out.println("************************************************************************************************************************");
        System.out.println(String.format("%-15s", "Project ID") + String.format("%-15s", "Indicator 1") + String.format("%-15s", "Indicator 2") + String.format("%-15s", "Indicator 3") + String.format("%-15s", "Indicator 4") + String.format("%-15s", "Weighted Mean") + String.format("%-15s", "Segment") + String.format("%-15s", "Credibility"));
        System.out.println(hackaton.toString(2));
    }
}
