public class MyFirstApp {

public static void main(String[] args) {
    Scanner input = new MyFirstApp(System.in);
    System.out.println("Enter Name:");
    String name = input.nextLine();

    System.out.println("Hello " + name + " Welcome! " + (8 + 8));
}