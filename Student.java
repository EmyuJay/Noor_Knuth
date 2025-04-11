public class Student {
    
    String name;
    int age;
    double grade;

    
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

   
    void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    
    void setGrade(int newGrade) {
        this.grade = newGrade;
        System.out.println("Updating grade (int)... New Grade: " + grade);
    }

    void setGrade(double newGrade) {
        this.grade = newGrade;
        System.out.println("Updating grade (double)... New Grade: " + grade);
    }
}


class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student("Lorenzo Saral", 18, 90.0);
        Student student2 = new Student("Sam Smith", 19, 85.0);

        
        System.out.println("Initial Details:");
        student1.displayStudent();
        student2.displayStudent();

        
        student1.setGrade(95);
        student1.setGrade(95.5);
        
        student2.setGrade(88);
        student2.setGrade(88.5);

        
        System.out.println("\nUpdated Details:");
        student1.displayStudent();
        student2.displayStudent();
    }
}
