public class ex08 {
    public static void main(String[] args) {
        
        int[] v = {4, 60, 23, -9, 25, -7, -78, 8, 41, -12};

        for(int i = 0; i < v.length; i++){
            if(v[i] < 0){
                v[i] = 0;
            }

            System.out.printf("v[%d] número = %d \n", i, v[i]);
        }

    }
}
