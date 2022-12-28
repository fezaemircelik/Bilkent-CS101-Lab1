package lab7_r;

public class Player_Rev3 {
    
    private static int count;
    private static int allCount;

    private int id;
    private String name;
    private String position;
    private String team;
    private int rosterNumber;
    private boolean isActive = true;

    private int gamesPlayed;
    private double pointsPerGame;
    private double assistsPerGame;
    private double reboundsPerGame;
    private double turnoversPerGame;

    private College college;


    public Player_Rev3(String name, String position, String team, int rosterNumber, College college){
        setName(name);
        setPosition(position);
        setTeam(team);
        setRosterNumber(rosterNumber);
        register();
        setId(getAllCount() + 1);
        setGamesPlayed(0);
        setPointsPerGame(0);
        setAssistsPerGame(0);
        setReboundsPerGame(0);
        setTurnoversPerGame(0);

        this.college = college;
        this.college.addAlumni();
    }

    public void transfer(String x){
        if (getTeam().equals(x)){
            System.out.println("Error Message");
        }
        else{
            setTeam(x);
        }
    }

    public void retire(){
        setActive(false);
        setCount(getCount() - 1);
    }

    public void setActive(boolean x){
        if (x == false){
            isActive = false;
        }
    }

    public boolean getActive(){
        return isActive;
    }

    public static int getCount(){
        return count;
    }

    public static void setCount(int a){
        Player_Rev3.count = a;
    }

    public static int getAllCount(){
        return allCount;
    }

    public static void setAllCount(int a){
        Player_Rev3.allCount = a;
    }

    public void register(){
        setCount(getCount() + 1);
        setAllCount(getAllCount() + 1);
    }

    public String getName(){
        return name;
    }

    public void setName(String a){
        name = a;
    }

    public String getPosition(){
        return position;
    }

    public void setPosition(String a){
        if (a.equals("SF") || a.equals("PG") || a.equals("SG") || a.equals("PF") || a.equals("C")){
            position = a;
        }
    }

    public String getTeam(){
        return team;
    }

    public void setTeam(String a){
        team = a;
    }

    public int getRosterNumber(){
        return rosterNumber;
    }

    public void setRosterNumber(int a){
        rosterNumber = a;
    }

    public int getId(){
        return id;
    }

    public void setId(int a){
        id = a;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int a) {
        gamesPlayed = a;
    }

    public double getPointsPerGame() {
        return pointsPerGame;
    }

    public void setPointsPerGame(double a) {
        pointsPerGame = a;
    }

    public double getAssistsPerGame() {
        return assistsPerGame;
    }

    public void setAssistsPerGame(double a) {
        assistsPerGame = a;
    }

    public double getReboundsPerGame() {
        return reboundsPerGame;
    }

    public void setReboundsPerGame(double a) {
        reboundsPerGame = a;
    }

    public double getTurnoversPerGame() {
        return turnoversPerGame;
    }

    public void setTurnoversPerGame(double a) {
        turnoversPerGame = a;
    }

    public double getEfficiency(){
        return (1.0 * pointsPerGame) + (0.7 * assistsPerGame) + (0.7 * reboundsPerGame) - (0.9 * turnoversPerGame);
    }

    public boolean isMoreEfficient(Player_Rev3 a){
        if (getEfficiency() < a.getEfficiency()){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean isBeforeThan(Player_Rev3 comparisonPlayer){
        if (getName().compareTo(comparisonPlayer.getName()) < 0){
            return true;
        }
        else {
            return false;
        }
    }

    public void recordGame(double points, double assists, double rebounds, double turnovers){
        double currentPoints = getGamesPlayed() * getPointsPerGame() + points;
        double currentAssists = getGamesPlayed() * getAssistsPerGame() + assists;
        double currentRebounds = getGamesPlayed() * getReboundsPerGame() + rebounds;
        double currentTurnovers = getGamesPlayed() * getTurnoversPerGame() + turnovers;
        setGamesPlayed(getGamesPlayed() + 1);
        setPointsPerGame(currentPoints / getGamesPlayed());
        setAssistsPerGame(currentAssists / getGamesPlayed());
        setReboundsPerGame(currentRebounds / getGamesPlayed());
        setTurnoversPerGame(currentTurnovers / getGamesPlayed());
    }

    public String ifActive(boolean x){
        if (x == true){
            return "Active";
        }
        else{
            return "Is not active";
        }
    }

    public String getCollege(){
        return college.toString();
    }

    public void setCollege(College college){
        this.college = college;
    }
}
