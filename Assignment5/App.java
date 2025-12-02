import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //printFactorial();
    //printOtherNum();
    //printReverse();
    //printCapital();

    }
    

    // My own Function
    public static void printCapital (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give me a country in mainland North or Central America and I'll give you the capital city: ");
        String capitalCity = sc.nextLine();
        if (capitalCity.equalsIgnoreCase("canada")){
            System.out.println("Ottawa");
        } else if (capitalCity.equalsIgnoreCase("United States")){
            System.out.println("Washington D.C.");
        } else if (capitalCity.equalsIgnoreCase("Mexico")){
            System.out.println("Mexico City");
        } else if (capitalCity.equalsIgnoreCase("Guatemala")){
            System.out.println("Guatemala City");
        } else if (capitalCity.equalsIgnoreCase("Belize")){
            System.out.println("Belmopan");
        } else if (capitalCity.equalsIgnoreCase("Honduras")){
            System.out.println("Tegucigalpa");
        } else if (capitalCity.equalsIgnoreCase("El Salvador")){
            System.out.println("San Salvador");
        } else if (capitalCity.equalsIgnoreCase("Nicaragua")){
            System.out.println("Managua");
        } else if (capitalCity.equalsIgnoreCase("Costa Rica")){
            System.out.println("San Jose");
        } else if (capitalCity.equalsIgnoreCase("Panama")){
            System.out.println("Panama City");
    }

       /*
Referencing your homework from https://github.com/melissachodziutko/CMPT-220/blob/main/Assignment%203/Debug.java
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?
Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!! 
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/
  //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
    /* public static void printFactorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        int input = sc.nextInt();
        int factorial = 1;
        //here's a hint
        for (int i = 1; i <= input; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
      //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
   public static void printOtherNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        int input = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<= input; i+=2){
            sum = sum + i;
        }
        System.out.println(sum);
}
        //No hint! what do you need to complete this task?

            //P5: Take a string from the user and print them the reverse!
    public static void printReverse(){
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
System.out.println(reverse); 
}
  /*   Scanner sc = new Scanner(System.in);


    System.out.println("Enter your first number to be added");
    int firstInput = sc.nextInt();
    System.out.println("Enter your second number to be added");
    int secondInput = sc.nextInt();
    //remember this method is returning, so we need to print it out
    System.out.println(add(firstInput,secondInput));

    System.out.println("im going to print out the word Dog now.");
    printDog();
}
    

  
    public static int add(int zyx, int tuv){


        return(zyx + tuv);


    }

  
    public static void printDog(){
        System.out.println("Dog");
    }*/

  
}}
   
