public class ex09 {
    public static void main(String[] args) {
        
        int[] va = {8, 5, 9, 3, 20};

        int[] vb = new int[va.length];

        for(int i = 0; i < va.length; i++){
            vb[i] = va[i] * va[i];
            
            System.out.printf(" va[%d] valor = %d / vb[%d] valor = %d \n", i, va[i], i, vb[i]);
            
        }

    }
}
