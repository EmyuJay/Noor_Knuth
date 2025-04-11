class Person {
    // Attributes
    String name;
    int age;
    String city;

    // Constructor
    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println();
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        // Creating two Person objects
        Person person1 = new Person("Cartin", 18, "Davao");
        Person person2 = new Person("Noor", 19, "Davao");

        // Displaying details of each person
        person1.displayDetails();
        person2.displayDetails();
    }
}
