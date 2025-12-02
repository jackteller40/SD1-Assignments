import java.util.Scanner;
//public class Main {
    //public static void main(String[] args) {

/* 
        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        Scanner sc = new Scanner(System.in);
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        int input = sc.nextInt();
        int factorial = 1;
        //here's a hint
        for (int i = 1; i <= input; i++){
            factorial *= i;
        }
        System.out.println(factorial);*/

   /*     //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        Scanner sc = new Scanner(System.in);
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        int input = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<= input; i+=2){
            sum = sum + i;
        }
        System.out.println(sum);
        //No hint! what do you need to complete this task?*/


      /*//P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
        }//it never stops running because run is always equal to true, it must be equal to false at some point to break out.*/

      /*  //P5: Take a string from the user and print them the reverse!
       Scanner sc = new Scanner(System.in);
        System.out.println("Problem 5");
        System.out.println("Give me a string and i will give it to you backwards: ");
        String input = sc.nextLine();
        //hint
        String reverse = "";
        for(int i = input.length()-1; i>=0; i-=1){
            reverse = reverse +input.charAt(i); // i found charAt on w3 schools. to my understanding it returns the character at the desired index,
            // so in this case i, and then it follows the rules on the previous line.
        }
System.out.println(reverse);*/


/*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms? 
you need to explain why you picked your for loop conditional and what's doing the work with the string
if you're confused reach out!
 */

 /*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Problem 6");
        System.out.println("Give me a random word: ");
        String input = sc.nextLine();
        for(int i =0; i < input.length(); i++){ // to be honest i am still a little confused on the benifits of for/ while. on this question i just got lucky with the for loop working
            System.out.println(input.charAt(i)); // similar to how i used it on the previous question, i found .charAt on w3 schools when i googled for help. 
        }



    }
}*/
    