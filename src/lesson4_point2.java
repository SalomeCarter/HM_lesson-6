public class lesson4_point2 {
    void point2() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++)

            if (array[i] % 2 == 0) {
                System.out.println("Even number: " + array[i]);
            } else if (array[i] % 2 == 1) {
                System.out.println("Odd number: " + array[i]);
            }
    }
}