public class bai3_1 {

    public static void main(String[] args) {
        int array[] = {1,23,4,5,6,78,8,2,32,2,32,432,32,234,432,1,432,324};

        int len = array.length;
        int j = len - 1;
        for (int i = 0; i < len/2; i++) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j--;
        }
        System.out.println("cac phan tu sau khi dao nguoc :");
        for (int i = 0; i < len; i++) {
            System.out.println(array[i]);
        }
    }
}
