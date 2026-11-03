
import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter key: ");
        int key = sc.nextInt();

        int count = 0;
        int found = -1;

        for (int i = 0; i < n; i++) {
            count++;

            if (a[i] == key) {
                found = i;
                break;
            }
        }

        System.out.println("Index = " + found);
        System.out.println("Number of comparisons = " + count);
    }
}
