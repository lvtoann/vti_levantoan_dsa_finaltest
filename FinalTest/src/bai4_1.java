import java.util.Arrays;

public class bai4_1 {
    public static void main(String[] args) {
        int A[]={100,2130,123,3,54,6,1,2111,1,1,1,1,1,1,45,5,465,46,1234,54353};
        int[] B = new int[A.length];
        int index = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B[index] = A[i];
                index++;
            }
        }
        Arrays.sort(B, 0, index);
        System.out.println("Số chẵn tăng dần là:");
        for (int i = 0; i < index; i++) {
            System.out.print(B[i] + " ");
        }
    }
}


