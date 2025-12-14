import java.util.Scanner;

/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q4
{
    public static void main(){
        int[] score ={10,20,30,40,50};
        int sum = 0;
        for(int i=0;i<5;i++){
            sum = sum+score[i];
        }
        System.out.println("Sum ="+sum);
        double avg = sum/5;
        System.out.println("Average ="+avg);
        int max = score[0];
        int min = score[0];
        for(int j=0;j<5;j++){
        if(score[j] > max){
        max = score[j];}
        if (score[j] < min) {
                min = score[j];
            }
    }
    System.out.println("Highest Score = "+max);
    System.out.println("Lowest Score = "+min);
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length of array: ");
    int len = input.nextInt();
    
    int[] arr1 = new int[len];
    
    for(int k = 0; k < arr1.length; k++){
    System.out.println("Enter your score: ");
    arr1[k] = input.nextInt();
    
    System.out.println(arr1[k]);
    }
    System.out.println("Updated Values:");
    for(int i = 0; i < arr1.length ; i++){
    System.out.println(arr1[i]);
    }
    }
}