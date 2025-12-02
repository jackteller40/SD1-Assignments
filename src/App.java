public class App {
    public static void main(String[] args) throws Exception {
        student student1 = new student("Jack Teller", "Senior", 4.0, 1);
        student student2 = new student("Levi Diamond", "Sophmore", 3.8, 2);
        student student3 = new student("Max Poysky", "Freshman", 1.3, 3);
        student student4 = new student("Todd Woodring", "Sophmore", 2.6,4);
        student student5 = new student("Brody Eaton", "Junior", 3.4, 5);

        student1.isHonorRoll();
        student2.isHonorRoll();
        student3.isHonorRoll();
        student4.isHonorRoll();
        student5.isHonorRoll();

        student1.freeLunch();
        student2.freeLunch();
        student3.freeLunch();
        student4.freeLunch();
        student5.freeLunch(); 
    }
}
