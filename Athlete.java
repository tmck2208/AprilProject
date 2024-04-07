import java.util.*;

public class Athlete
{
  private String name;
  private double heightMeters;
  
  public Athlete(){
    name = "";
    heightMeters = 0.0;
  }
  public Athlete(String n, double h){
    name = n;
    height = h;
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
  public SoccerPlayer(String n, double h, number n){
    super(n,h);
    number = n;
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
  public String toString(){
    return super.toString() + "\nNumber: " + number;
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
  public String toString(){
    return super.toString() + "\n" + balonDors + " Balon D'Ors";
  }
}
class Tester
{
  public static void main(String[] args){
  }
}
