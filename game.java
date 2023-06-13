import java.util.Scanner;       
import java.util.Random;
public class game
{
  public static void main(String args[]) 
  {
    Random rand=new Random();
    Scanner sc=new Scanner(System.in);
    int com_guess=rand.nextInt(100)+1;
    int attempts=0;
    int score=100;
    boolean b=true;
    System.out.println("Welcome to the Number Guessing Game!");
    System.out.println("I have choosen a number between 1 and 100,Try to guess it!");
    System.out.println("Remember you have only 10 attempts!");
    while(b){
        attempts++;
        
        if(attempts>10){
            System.out.println("you have reached max attempts");
            System.out.println("The secret number is "+com_guess);
            System.out.println("better luck next time!");
            System.out.println("Your Score:"+score);;
            b=false;
        }
        
        if(attempts<=10){
            System.out.println("Enter Your Guess:");
            int user=sc.nextInt();
            if(user<com_guess){
                System.out.println("Too low,try again!");
            }
            else if(user>com_guess){
                 System.out.println("Too high,try again!");
            }
            else{
                System.out.println("Congratulations,You won!");
                System.out.println("It took u "+attempts+" attempts");
                System.out.println("your score:"+score);
            b=false;
            }
            score-=10;
        
        }
    }

 }
}
