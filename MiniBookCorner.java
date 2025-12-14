
/**
 * Write a description of class MiniBookCorner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MiniBookCorner
{

    public static void main(String[] args){
    String[] category = {"Nepali", "fiction"};
    String[][] titles = new String[2][1];
    titles[0][0] = "Asahamati";
    titles[1][0] = "The Martian";
    
    double[][] price = new double[2][1];
    price[0][0] = 750;
    price[1][0] = 800;
    for(int i = 0; i < category.length ; i++){
    System.out.print(category[i]+"  ");
        for(int j = 0 ; j < titles[i].length ; j++){
        if(titles[i][j] == null || titles[i][j] == ""){
        System.out.println("[empty]");
        }
        else{
        System.out.print(titles[i][j]+ " ");
        System.out.printf("%.2f",price[i][j]);
        }
        
        }
        System.out.println();
    }
    System.out.println();
    
    }
}
