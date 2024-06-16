package edu.Paulin.aprendizados1;
public class EstudosJava {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!"); //primeiro codigo mandado no git ebaa

        //variáveis de tipo primitivo:

        //inteiros

        byte numInteiro1 = 127; 
        short numInteiro2 = -32600;
        int numInteiro3 = 123456;
        long numInteiro4 = 1234567;

        //reais

        float numReal1 = 13.98f;
        double numReal2 = 1340985.20356750;

        //caracteres

        char letra = 'A';
        String palavra = "nao e apostrofo";

        //booleano

        boolean simOuNao = true;

        //constantes e variáveis

        final String NOME = "Paulo";
        byte idade = 20;
        
        System.out.println(NOME);
        System.out.println(idade);

        idade = 21;

        System.out.println(idade);
    }
}
