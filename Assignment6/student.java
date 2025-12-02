public class student {
    String name;
    String year;
    double gpa;
    int id;
    public student(String n, String y, double g, int i){
        name = n;
        year = y;
        gpa = g;
        id = i;
    }
    void isHonorRoll(){
        if (this.gpa > 3.6){
            System.out.println(this.name + " is an Honor Roll Student");
        } else {
            System.out.println(this.name + " is not an Honor Roll Student :(");
        }
    }
    void freeLunch(){
        int randomId = (int)(Math.random() * 5) + 1; //thanks w3
        if (this.id == randomId){
            System.out.println(this.name + " gets a free lunch today!");
        } else {
            System.out.println(this.name + " does not get a free lunch today :(");
        }
    }
}
// I confidently learned how to get a random integer. I also learned how to how a method was different from a function.