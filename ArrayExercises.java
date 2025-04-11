public class ArrayExercises {
    public static void main(String[] args) {
        
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Ethan"};
        System.out.println("Names in the array:");
        for (String name : names) {
            System.out.println(name);
        }

        
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("\nOriginal numbers array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        
        
        numbers[1] = 99; // Change 20 to 99
        System.out.println("\nUpdated numbers array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        
        int[] values = {5, 8, 12, 1, 7};
        int max = values[0]; // Assume the first element is the max
        for (int value : values) {
            if (value > max) {
                max = value; // Update max if current value is greater
            }
        }
        System.out.println("\n\nThe maximum value in the array is: " + max);
    }
}
