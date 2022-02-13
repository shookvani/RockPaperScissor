//date 
//name
//author
//descirption
import java.util.*; 

public class RockPaperScissor {
    
    public static void main (String[] args) {
        boolean flag=true;
        while (flag) {
            int user=0;
            System.out.println("Please type your choice (rock, paper, or scissor):");
            Scanner scan=new Scanner(System.in);
            String choice= scan.next(); 
            //System.out.println(choice);
            switch (choice) {
                case "rock":
                    user=0;
                    break;
                case "paper":
                    user=1;
                    break;
                case "scissor":
                    user=2;
                    break;
                case "stop":
                    flag=false;
                    continue;
                default:
                    System.out.println("Not a valid response.");
                    continue;
            }
            //System.out.println(user);
            Random r= new Random();
            int computer=r.nextInt(3);
            //System.out.println(computer);
            int result= user-computer;
            switch (result) {
                case 1:
                case -2:
                    System.out.println("Game over, user won. Type stop to stop playing.");
                    break;
                case -1:
                case 2:
                    System.out.println("Game over, computer won. Type stop to stop playing.");
                    break;
                case 0:
                    System.out.println("Game over, draw. Type stop to stop playing.");
                    break;
                default:
                    System.out.println("Error: unexpected input.");
            }
            
        }
        
        
        

        
    }
}