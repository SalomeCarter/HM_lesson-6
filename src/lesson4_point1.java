public class lesson4_point1 {
    void point1() {

        int[] arr = {-45, 78, 67, 90, 876};

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
        System.out.println(max);
        System.out.println(min);
    }
}

