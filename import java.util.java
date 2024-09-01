import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the list: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Sorted numbers:");

        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}