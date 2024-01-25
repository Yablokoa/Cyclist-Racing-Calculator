//Ava Wiggins
//1/25/245000

//start
import java.util.*;
public class classPractice1 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //input - Cyclist going 30 mph, cyclist going 20 mph. distance after a 2 hour race
    System.out.println("\nThere are two cyclists racing.\nEnter the miles for Racer 1.\nEnter the miles for Racer 2.\nEnter a time for their race\n");
    System.out.println("Enter Racer 1 mph:\t");
    float rateOne, rateTwo, time, distanceOne, distanceTwo;
    rateOne = input.nextFloat();
    System.out.println("Enter Racer 2 mph:\t");
    rateTwo = input.nextFloat();
    System.out.println("Enter the time for the race (the time should be in hours):\t"); // the time will  be in hours
    time = input.nextFloat();
    

    //decision/condition - To solve this, we would need to use a distance formula. 
    System.out.println("In order to solve this problem,\nwe will have to find an equation that will work for it.\nthis equation will be distance = rate*time.\nnow that the equation is known, we will solve\n");
   
    //process - formula for mph: distance = rate*time
    distanceOne = rateOne * time;
    distanceTwo = rateTwo * time;

    //output - print the distance and winner after the two hour race.
    System.out.println("Racer 1 traveled " + distanceOne + " miles during the race\n");
    System.out.println("Racer 2 traveled " + distanceTwo + " miles during the race.\n");
    
    if(distanceOne > distanceTwo)
    {
        System.out.println("Winner is Racer 1\n");
    }
    else 
    {
        System.out.println("Winner is Racer 2\n");

    }

    }
}
