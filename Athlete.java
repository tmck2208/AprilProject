import java.util.*;

class Athlete
{
  private String name;
  private double heightMeters;
  
  public Athlete(){
    name = "";
    heightMeters = 0.0;
  }
  public Athlete(String n, double h){
    name = n;
    heightMeters = h;
  }
  
  public String getName(){
    return name;
  }
  public double getHeight(){
    return heightMeters;
  }
  
  public void setName(String n){
    name = n;
  }
  public void setHeight(Double h){
    heightMeters = h;
  }

  public String playGame(){
    if((int)(Math.random()*2)==0){
        return "You won";
    }
    return "You Lost";
  }
  
  public String toString(){
    return name + ", " + heightMeters + " m";
  }
  public boolean equals(Object other){
    if(this == other){
      return true;
    }
    else if(other instanceof Athlete){
      return false;
    }
    Athlete a = (Athlete)other;
    if((name.equals(a.getName()))&&(heightMeters==a.getHeight())){
      return true;
    }
    return false;
  }
}
class SoccerPlayer extends Athlete
{
  private int number;
  public SoccerPlayer(){
    super();
    number = 0;
  }
  public SoccerPlayer(String n, double h, int a){
    super(n,h);
    number = a;
  }
  
  public int getNumber(){
    return number;
  }
  
  public void setNumber(int n){
    number = n;
  }

  public String whatFoot(){
    int i = (int)(Math.random()*10)+1;
    if(i==1){
      return "left";
    }
    return "right";
  }
  public String position(){
    int i = (int)(Math.random()*11)+1;
    if(i==1){
      return "Goalkeeper";
    }
    else if(i<=5){
      return "Defender";
    }
    else if(i%2==0){
      return "Midfielder";
    }
    else if(i<=11){
      return "Forward";
    }
    return "Bench";
  }
  public String playGame(){
      String s = super.playGame();
      int i = (int)(Math.random()*4);
      return s + "and " + i + " goals";
  }

  public String toString(){
    return super.toString() + "\nNumber: " + number;
  }
  public boolean equals(Object other){
    if(this == other){
      return true;
    }
    else if(other instanceof SoccerPlayer){
      return false;
    }
    SoccerPlayer a = (SoccerPlayer)other;
    if((super.equals(a))&&(number==a.getNumber())){
      return true;
    }
    return false;
  }
}
class Messi extends SoccerPlayer
{
  private int balonDors;
  public Messi(){
    super("Messi", 1.7, 10);
    balonDors = 0;
  }
  public Messi(int b){
    super("Messi", 1.7, 10);
    balonDors = b;
  }
  
  public int getBalonDors(){
    return balonDors;
  }
  
  public void setBalonDors(int b){
    balonDors = b;
  }

  public String whatFoot(){
    return "left";
  }
  public String position(){
    return "Forward";
  }
  public boolean hasWorldCup(){
    if(balonDors>=8){
      return true;
    }
    return false;
  }
  public String whatClub(){
    if(balonDors<=6){
      return "Barcelona";
    }
    else if(balonDors==7){
      return "PSG";
    }
    else{
      return "Inter Miami";
    }
  }
  public String playGame(){
      return super.playGame() + "\nAnkara Messi";
  }

  public String toString(){
    return super.toString() + "\n" + balonDors + " Balon D'Ors";
  }
  public boolean equals(Object other){
    if(this == other){
      return true;
    }
    else if(other instanceof Messi){
      return false;
    }
    Messi a = (Messi)other;
    if((super.equals(a))&&(balonDors==a.getBalonDors())){
      return true;
    }
    return false;
  }
}
public class Tester
{
  public static void main(String[] args){
      ArrayList<Athlete> athleteList = new ArrayList<Athlete>();
      Athlete mJ = new Athlete("Michael Jordan", 1.98);
      Athlete mJ2 = mJ;
      Athlete kawhi = new Athlete("Kawhi Leonard", 2.01);
      Athlete mP = new Athlete("Michael Phelps", 1.98);
      Athlete athlete = new Athlete();
      Athlete soccerPlayer = new SoccerPlayer();
      Athlete haaland = new SoccerPlayer("Erling Haaland", 1.94, 9);
      Athlete ronaldo = new SoccerPlayer("Ronaldo", 1.87, 7);
      Athlete messi1 = new Messi();
      Athlete messi2 = new Messi(8);
      athleteList.add(mJ);
      athleteList.add(mJ2);
      athleteList.add(kawhi);
      athleteList.add(mP);
      athleteList.add(athlete);
      athleteList.add(soccerPlayer);
      athleteList.add(haaland);
      athleteList.add(ronaldo);
      athleteList.add(messi1);
      athleteList.add(messi2);
      for(int i = 0; i<athleteList.size(); i++){
          System.out.println(athleteList.get(i));
      }
  }
}
