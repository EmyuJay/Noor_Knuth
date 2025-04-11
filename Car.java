public class Car {
    
    private String brand;
    private String model;

    
    public Car() {
        this.brand = "Default Brand"; 
        this.model = "Default Model";  
    }

    
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    
    public Car(Car other) {
        this.brand = other.brand;
        this.model = other.model;
    }

    
    public void displayCar() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
    }

    
    public static void main(String[] args) {
        
        Car defaultCar = new Car(); 
        Car parameterizedCar = new Car("Toyota", "Corolla"); 
        Car copyCar = new Car(parameterizedCar); 

        
        System.out.println("Default Car:");
        defaultCar.displayCar();
        
        System.out.println("\nParameterized Car:");
        parameterizedCar.displayCar();
        
        System.out.println("\nCopy Car:");
        copyCar.displayCar();
    }
}
