
class FirstNonRepeating {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};

        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            int count = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(
                        "First non-repeating element = " + a[i]
                );
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating element found");
        }
    }
}
