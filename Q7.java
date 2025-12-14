
/**
 * Write a description of class Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q7
{
    public static void main(){
        String[][] seats = new String[2][3];
    seats[0][0] = "Ram";
    seats[0][1] = "Sita";
    seats[0][2] = "Hari";
    for(int i = 0; i < seats.length ; i++){
        System.out.print("\nRow " + (i + 1) + ": ");
    
    for (int j = 0; j < seats[i].length; j++) {
        if(seats[i][j] == null || seats[i][j] ==""){
        System.out.print("[empty]\t");}
        else {
                    System.out.print(seats[i][j] + "\t");
                }
        
    }
}
 System.out.print("");
    }
}