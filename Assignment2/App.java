//  Jack Teller, Data Science Major, Applied AI Minor*//
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


// question number 1
System.out.println("Would you like to play a geography game?"); //self explanitory (se)
String input = sc.nextLine(); //se
if (input.equalsIgnoreCase("yes")){ // I was stuck here trying to use == and || to accept both yes and Yes,
    //so i found .equalsIgnoreCase online. I hope that is okay. if not i can try something else
}else{
    System.out.println("Game over"); //se
    sc.close(); //se
    return; //correctly assumed this would work the same as python
}
int score = 0; //got stuck with the scoring system, took a lot of trial and error + google to figure this out.

    System.out.println("Okay, What is the capital of Uzbekistan?"); //se
    String capital = sc.nextLine(); //se
    if (capital.equalsIgnoreCase("tashkent")){ //se
        System.out.println("You are very smart, here is 1 point."); //se
        score++;//same as earlier. thank you google
    } else {//se
        System.out.println("Wrong! Next Question! ");//se
    }
    System.out.println("What country in Western Africa is just a river?");//se
    String country = sc.nextLine(); //se
    if (country.equalsIgnoreCase("The Gambia")){ //still struggling to use ||.
        // wanted to also includ "Gambia" as am answer but couldnt figure it out.
     System.out.println("Correct! Great Job!"); //se
        score++; //se
     }else{  //se
        System.out.println("So close! Better luck on the next one!"); //se
     }
    System.out.println("What country in Asia contains Mount Everest?"); //se
    String mount = sc.nextLine(); //se
    if (mount.equalsIgnoreCase("nepal")){ //se
        System.out.println("WOW! You are too smart!"); //se
        score++; //se
    }else{ //se
        System.out.println("Dang It! You tried your best!"); //se
    }
    System.out.println("Your score is:  " + score ); //goes back to what i said before. scoring system took me a minute to figure out.
    }
    }

// what i learned: I learned that ++ can add numbers to an integer. I also learned .equalsIgnoreCase, which is very useful.




