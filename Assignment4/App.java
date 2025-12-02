public class App {
    public static void main(String[] args) throws Exception {
        int [] myArray = {10, 3, 295, 38, 20, 3, 4, 267, 2445, 10, 5566, 87, 93, 17, 10, 2, 87, 267, 3176, 3, 82};
        boolean[] newBoo = new boolean[myArray.length]; //set boolean
        for (int i = 0; i < myArray.length; i++) { //scans array
            if (newBoo[i]) {
                continue;
            }
            int value = myArray[i];
            int times = 1; 
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] == value) { //checks for multiple values
                    times++; //adds value to time if appears more than once
                    newBoo[j] = true; 
                }
            }
            if (times > 1) {
                System.out.println(value + " appears " + times + " times");
    }
}}}
// In this assignment, I learned how to sort through data to check for multiple occurses of values. This was tricky. 
//Had to reference notes and use google a lot