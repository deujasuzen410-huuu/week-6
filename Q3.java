import java.util.Scanner;

/**
 * Write a description of class Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q3
{
    public static void main(){
        String[] name = {"Saroj", "Sushant",
"Ujjwal", "Rabina", "Sandesh"};
for(int i=0;i<name.length;i++){
System.out.println(name[i]);
}
System.out.println(name[2]);//index 2 print
name[4]= "Sujen";
System.out.println("New name in index 4 is "+name[4]);
Scanner input = new Scanner(System.in);
System.out.println("Enter a index");
int index = input.nextInt();
System.out.println("Enter a name to replace at the index: "+index);
String newName =  input.next();
name[index] = newName;
    System.out.println(name[index]);

    }
}