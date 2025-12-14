import java.util.Scanner;

/**
 * Write a description of class Q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q5
{
    public static void main(String[] args){
    String[] district = {"Morang", "Kathmandu",
"Kaski", "Sindhuli"};
System.out.println("Numbered List of Static Districts:");
        for (int i = 0; i < district.length; i++) {
            System.out.println((i + 1) + ". " + district[i]);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("How many Districts do you want to enter ?");
    int len = input.nextInt();
    
    String [] dis = new String[len];
    
    for(int i=0; i < dis.length ; i++){
    System.out.println("Enter district name:");
    dis[i] = input.next();
    }
    for(int i = 0; i < dis.length ; i++){
    System.out.println(dis[i]);
    }
    }
    }
