
/**
 * Write a description of class Q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q6
{
    public static void main(String[] args){
        int[][] marks ={{80,75},{90,85}};
        String[] subName = {"Nepali", "English"};
        String[] studName = {"Student A", "Student B"};
        int sum = 0;
        System.out.println("Students\tEnglish\tNepali");
        for(int i = 0 ; i < marks.length ; i++){
            System.out.print("\nStudent" + (i + 1) + "\t");
        
        for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "\t");
                sum = sum + marks[i][j];
            }
        
        System.out.println("Total = " + sum);
    }
    }
}