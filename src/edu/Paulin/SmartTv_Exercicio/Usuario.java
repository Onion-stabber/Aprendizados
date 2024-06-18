package edu.Paulin.SmartTv_Exercicio;

public class Usuario {

    public static void main (String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("agora a Tv está ligada? " + smartTv.ligada);

        smartTv.mudarCanal(14);
        smartTv.diminuirVolume();
    }
}