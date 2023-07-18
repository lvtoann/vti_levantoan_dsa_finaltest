public class bai3_3 {
    public static void main(String[] args) {
        int array[] = {1,23,4,5,6,78,8,2,32,2,32,432,32,234,432,1,432,324};
        for(int i=0;i< array.length;i++){
            if (checkSNT2(array[i])){
                System.out.println(i);
            }
        }

    }
    static boolean checkSNT2(int x){  // cach2
        if(x<2)return false;
        if (x==2)return true;

        for(int i=2;i<x;i++){
            if (x%i==0)return false;
        }
        return true;




    }
    }

