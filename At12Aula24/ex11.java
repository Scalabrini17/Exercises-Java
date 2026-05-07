public class ex11 {
    public static void main(String[] args){

        int[] v1 = {20, 60, 90, 45, 15};
        int[] v2 = {20, 60, 90, 45, 15};

        for(int i = 0; i < v1.length; i++){
            
            if(v1[i] == v2[i]){

                System.out.println("Os dois vetores são identicos");
                break;

            }else{

                System.out.println("Os dois vetores são diferente");
                break;

            }

        }

    }
}
