public class ex10 {
    public static void main(String[] args) {
        
        String[] alunos = {"Ana Luisa", "Itallo", "Paulo", "Pedro", "Matheus"};
        double[] nota = {10, 7.9, 6.9, 2.5, 4.6};

        for(int i = 0; i < alunos.length; i++){

            if(nota[i] > 7){
                System.out.printf(" Nome: %s média de nota: %.2f \n", alunos[i], nota[i]);
            }

        }

    }
}
