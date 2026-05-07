//atividade 6

public class ex06 {
    public static void main(String[] args){

        int[] v1 = {9, 8, 5 , 45, 10};
        int[] v2 = {36, 48, 20, 15, 97};

        int[] v3 = new int[v1.length];

        for(int i = 0; i < v1.length; i++){
            v3[i] = v1[i] + v2[i];
        }

        for(int i = 0; i < v3.length; i++){

            
            System.out.printf("v[%d] números = %d \n", i, v3[i]);
            

        }

    }
}
