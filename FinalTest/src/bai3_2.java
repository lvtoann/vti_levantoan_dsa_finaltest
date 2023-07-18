public class bai3_2 {
    public static void main(String[] args) {
        int array[] = {1,23,4,5,6,78,8,2,32,2,32,432,32,234,432,1,432,324};
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while ((left < right && array[left] % 2 != 0)) {
                left++;
            }
            while (left < right && array[right] % 2 != 0) {
                right--;
            }
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }

            }
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);

        }
    }

}








