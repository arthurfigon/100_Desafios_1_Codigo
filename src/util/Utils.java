package util;

import java.util.Scanner;

public class Utils {

    public int LerInt(String pergunta){
        Scanner entrada = new Scanner(System.in);
        System.out.println(pergunta);
        return entrada.nextInt();
    }

    public double LerDouble(String pergunta){
        Scanner entrada = new Scanner(System.in);
        System.out.println(pergunta);
        return entrada.nextDouble();
    }

    public String LerString(String pergunta){
        Scanner entrada = new Scanner(System.in);
        System.out.println(pergunta);
        return entrada.nextLine();
    }

    public char LerChar(String pergunta){
        Scanner entrada = new Scanner(System.in);
        System.out.println(pergunta);
        return entrada.next().charAt(0);
    }

    public double somaValoresVetorDouble(double[] vetor){
        double somatorio = 0;
        for(double valor: vetor){
            somatorio += valor;
        }
        return somatorio;
    }

    public void OrdenaCrescenteDouble(double[] vetor){
        double variavelTroca;
        for(int a=0;a<vetor.length-1;a++) {
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i+1]) {
                    variavelTroca = vetor[i + 1];
                    vetor[i + 1] = vetor[i];
                    vetor[i] = variavelTroca;
                }
            }
            if(verificaOrdenaCrescenteDouble(vetor))
                a = vetor.length;
        }
    }

    private static boolean verificaOrdenaCrescenteDouble(double[] vetor){
        for (int i = 0; i < vetor.length-1; i++) {
            if (vetor[i] > vetor[i+1]){
                return false;
            }
        }
        return true;
    }

    public boolean ComparaDados(String cadastrado, String userInfo) {
        return userInfo.equals(cadastrado);
    }

    public void OrdenaDecrescenteInt(int[] vetor){
        int variavelTroca;
        for(int a=0;a<vetor.length-1;a++) {
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i + 1] > vetor[i]) {
                    variavelTroca = vetor[i + 1];
                    vetor[i + 1] = vetor[i];
                    vetor[i] = variavelTroca;
                }
            }
            if(verificaOrdenaDecrescenteInt(vetor))
                a = vetor.length;
        }
    }

    private static boolean verificaOrdenaDecrescenteInt(int[] vetor){
        for (int i = 0; i < vetor.length-1; i++) {
            if (vetor[i] < vetor[i+1]){
                return false;
            }
        }
        return true;
    }

    public void OrdenaCrescenteInt(int[] vetor){
        int variavelTroca;
        for(int a=0;a<vetor.length-1;a++) {
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i+1]) {
                    variavelTroca = vetor[i + 1];
                    vetor[i + 1] = vetor[i];
                    vetor[i] = variavelTroca;
                }
            }
            if(verificaOrdenaCrescenteInt(vetor))
                a = vetor.length;
        }
    }

    private static boolean verificaOrdenaCrescenteInt(int[] vetor){
        for (int i = 0; i < vetor.length-1; i++) {
            if (vetor[i] > vetor[i+1]){
                return false;
            }
        }
        return true;
    }

    public void printaVetor(int[] vetor){
        for (int i : vetor) {
            System.out.println(i);
        }
    }

    public void printaVetorDouble(double[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    public void printaVetorDoubleInverso(double[] vetor){
        for (int i = vetor.length-1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }

    public int[] criaVetorInt(int tamanho){
        int[] vetor = new int[tamanho];
        Utils util = new Utils();
        for (int i = 0; i < tamanho ; i++){
            vetor[i] = util.LerInt("Informe um valor: ");
        }
        return vetor;
    }

    public int[] criaVetorInt(int tamanho, String texto){
        int[] vetor = new int[tamanho];
        Utils util = new Utils();
        for (int i = 0; i < tamanho ; i++){
            vetor[i] = util.LerInt(texto);
        }
        return vetor;
    }

    public double[] criaVetorDouble(int tamanho){
        double[] vetor = new double[tamanho];
        Utils util = new Utils();
        for (int i = 0; i < tamanho ; i++){
            vetor[i] = util.LerDouble("Informe um valor: ");
        }
        return vetor;
    }

    public double[] criaVetorDouble(int tamanho, String texto){
        double[] vetor = new double[tamanho];
        Utils util = new Utils();
        for (int i = 0; i < tamanho ; i++){
            vetor[i] = util.LerDouble(texto);
        }
        return vetor;
    }

    public String[] criaVetorString(int tamanho){
        String[] vetor = new String[tamanho];
        Utils util = new Utils();
        for (int i = 0; i < tamanho ; i++){
            vetor[i] = util.LerString("Informe um valor: ");
        }
        return vetor;
    }

    public String[] criaVetorString(int tamanho, String texto){
        String[] vetor = new String[tamanho];
        Utils util = new Utils();
        for (int i = 0; i < tamanho ; i++){
            vetor[i] = util.LerString(texto);
        }
        return vetor;
    }

}
