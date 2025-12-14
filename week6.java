
/**
 * Write a description of class week6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week6
{
    public static void main(String[] args){
    
        int[] age; //declaring an array
        age = new int[5]; //constructing an array
        
        System.out.println(age.length);// finding length of an array
        
        //first index = 0 ,last index = age.lenght-1 =1-1 = 4;
        
        age[0]=10;
        age[1]=20;
        age[2]=30;
        age[3]=40;
        age[4]=50;
        
        int[] agr ={5,10,15,20,25}; //all in one
        System.out.println(agr.length); //5
        System.out.println(agr[0]); //5
        
        for(int i = 0;i< agr.length;i++){
            
            System.out.println(agr[i]);
        }
        for(int i = agr.length-1;i>= 0;i--){
            
            System.out.println(agr[i]);//reverse
        }
          int sum = 0;
        for(int i = 0;i< agr.length;i++){
        
            sum = sum + agr[i];
        
        }
        System.out.println(sum);
    }
    int[] num = {2,4,6,8};
    int[] rev = new int[num.length];
    
    
}