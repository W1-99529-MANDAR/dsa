
import java.util.Scanner;

class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter key: ");
        int key = sc.nextInt();

        int low = 0, high = n - 1;
        int count = 0, found = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            count++;

            if (a[mid] == key) {
                found = mid;
                break;
            } else if (key < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Index = " + found);
        System.out.println("Number of comparisons = " + count);
    }
}

