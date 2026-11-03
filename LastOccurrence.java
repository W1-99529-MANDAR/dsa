import java.util.Scanner;

class LastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter key: ");
        int key = sc.nextInt();

        int last = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                last = i;
            }
        }

        System.out.println("Last occurrence index = " + last);
    }
}
