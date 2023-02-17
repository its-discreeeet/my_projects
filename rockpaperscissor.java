import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[] args){
        
        Random ran  = new Random();
        int x = ran.nextInt(1,4);
        
        String str_comp = "";
        switch(x){
            case 1 : str_comp = "Rock";
            break;
            case 2 : str_comp = "Scissors";
            break;
            case 3 : str_comp = "Paper";
            break;
            default : System.out.println("Error");
            break;
        }
        

        System.out.print("1=Rock\n2=Scissors\n3=Paper\nPick a number between 1-3 : ");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        sc.close();
         
        String str_player = "";
        switch(y){
            case 1 : str_player = "Rock";
            break;
            case 2 : str_player = "Scissors";
            break;
            case 3 : str_player = "Paper" ;
            break;
            default : System.out.println("Error");
            break;
        }
        System.out.println("Computer chose "+str_comp);
        System.out.println("You chose "+str_player);

        /* In Java, the "==" operator checks if two objects are the same object in memory,
         not if they have the same value. To compare strings based on their value, 
         you should use the .equals() method instead. */

        if(str_comp.equals(str_player)){
            System.out.println("Its a draw");
        }
        if(str_comp.equals("Rock") && str_player.equals("Scissors")){
            System.out.println("Computer wins");
        }
        if(str_comp.equals("Scissors") && str_player.equals("Paper")){
            System.out.println("Computer wins");
        }
        if(str_comp.equals("Paper") && str_player.equals("Rock")){
            System.out.println("Computer wins");
        }
        else{
            System.out.println("You win");
        }
    }
}
