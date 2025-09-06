import java.util.*;
public class NumGessingproject {
    public static void guessingNumberGame()
    {
        Scanner sc=new Scanner(System.in);
        int random=1+(int)(Math.random()*100);
        int k=5;
        System.out.println("A Number is choose between 1 and 100");
        System.out.println("you have" + k + " attems to fing the number");
        for(int i=0;i<k;i++)
        {
           System.out.println("Enter your guess");
           int guess=sc.nextInt();
           if(guess==random)
           {
            System.out.println("congratulations! You guessed the correct number");
            sc.close();
            return;
           }
           else if(guess<random){
            System.out.println("THE number is less then "+ guess);
           }
           else
           {
            System.out.println("The  number is greater then "+ guess);
           }

        }
        System.out.println("you've exhausted all attempts. The correct answer is : " + random);
sc.close();
    }
    public static void main(String[] args) {
        guessingNumberGame();
        
    }
}
