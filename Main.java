import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrString = scanner.nextLine().split(",");
        int[] arr = new int[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
            arr[i] = Integer.parseInt(arrString[i]);
        }
        int index = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int result = contains11(arr, index);
        System.out.println(result);
    }

    private static int contains11(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }
        if (arr[index] == 11) {
            return 1 + contains11(arr, index + 1);
        }
        return contains11(arr, index + 1);
    }
}