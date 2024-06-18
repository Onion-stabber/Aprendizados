package edu.Paulin.aprendizados1;
public class EstudosJava {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!"); //primeiro codigo mandado no git ebaa

        //variáveis de tipo primitivo:

        //inteiros

        byte numInteiro1 = 127; //variávél byte contém 4 bits 
        short numInteiro2 = -32600; //variável short contém 8 bits
        int numInteiro3 = 123456; // variável int contém 16 bits
        long numInteiro4 = 1234567; // variável long contém 32 bits

        //reais

        float numReal1 = 13.98f; //variável Flo at contém 32 bits
        double numReal2 = 1340985.20356750; //variável double contém 64 bits

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

        //teste condicionado

        int notaAluno = 6;

        if (notaAluno > 6) {
            System.out.println("Parabéns, você passou!!");
        } else if (notaAluno == 6) {
            System.out.println("Refaça a Prova!");
        } else {
            System.out.println("Reprovado!");
        }

        //operadores relacionais
        byte numero1 = 1;
        byte numero2 = 2;
        boolean sOuN = numero1 == numero2;

        System.out.println(sOuN);

        sOuN = numero1 != numero2;

        System.out.println(sOuN);

        sOuN = numero1 > numero2;

        System.out.println(sOuN);

        //operadores lógicos
        
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("as duas condições são verdadeiras");
        } else {
            System.out.println("as condições não são verdadeiras");
        } 

        if (condicao1 || condicao2) {
            System.out.println("uma das condições são verdadeiras");
        }
    }
}
