import classes.Numeros;
import util.Utils;

import java.io.IOException;
import java.util.ArrayList;

public class Basico {
    public static void main(String[] args) {
        exercicioNove();
    }

    public static void exercicioUm() {
        int[] vetor = new int[5];
        Utils help = new Utils();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = help.LerInt("Informe um número: ");
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Posição %d : %d\n", i + 1, vetor[i]);
        }
    }

    public static void exercicioDois() {
        String[] vetor = new String[10];
        Utils ajuda = new Utils();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = ajuda.LerString("Informe um nome: ");
        }
        for (int i = vetor.length-1; i >= 0; i--) {
            System.out.printf("Nome : %s\n", vetor[i]);
        }
    }

    public static void exercicioTres(){
        int[] vetor = new int[10];
        int[] vetor2 = new int[10];
        Utils help = new Utils();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = help.LerInt("Informe um número: ");
            vetor2[i] = vetor[i] * 5;
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d %d\n", vetor[i], vetor2[i]);
        }
    }

    public static void exercicioQuatro() throws IOException, InterruptedException{

        // Contador Impares, Pares e o Leitor de ints
        int pares = 0, impares = 0, leitor = 0;

        // Vetores com valores inteiros, e Strings que dirão se será par ou impar, e um Utilitário para ler Ints
        int[] numero = new int[10];
        String[] tipo = new String[10];
        Utils help = new Utils();

        // Adesão de Valores aos dois vetores
        for (int i = 0; i < numero.length; i++) {
            numero[i] = help.LerInt("Informe um número: ");
            while(numero[i] == 0){
                numero[i] = help.LerInt("Informe outro número: ");
            }
            if(numero[i] % 2 == 0){
                tipo[i] = "Par";
                pares++;
            } else{
                tipo[i] = "Impar";
                impares++;
            }
        }

        // Criação de novos vetores para pares e ímpares
        int[] vetorPares = new int[pares];
        int[] vetorImpares = new int[impares];

        // Saída dos Impares e Pares, assim como aplicação deles aos seus respectivos vetores
        int contadorPares = 0;
        int contadorImpares = 0;
        System.out.println("\nPares:\n");
        for (int i = 0; i < numero.length; i++) {
            if (tipo[i].equals("Par")){
                System.out.println(numero[i]);
                vetorPares[contadorPares] = numero[i];
                contadorPares++;
            } else {
                vetorImpares[contadorImpares] = numero[i];
                contadorImpares++;
            }
        }
        System.out.println("\nImpares:\n");
        for(int i = 0; i < contadorImpares ; i++){
            System.out.println(numero[i]);
        }
    }

    public static void exercicioCinco(){

        // Quantidade de elementos a serem criados
        int quantidadeTotal = 10;

        // Utilitário para ajudar a ler valores
        Utils ajuda = new Utils();

        //Array da classe Numeros onde armazena se é par ou impar e o valor
        ArrayList<Numeros> vetor = new ArrayList<>();

        // For de adesão das informações ao vetor
        for (int i = 0 ; i < quantidadeTotal ; i++){
            int leitura = ajuda.LerInt("Informe um número: ");
            while(leitura == 0){
                leitura = ajuda.LerInt("Informe outro número: ");
            }
            vetor.add(new Numeros(leitura));
        }

        //Saida dos pares
        printPares(vetor);

        //Saida dos impares
        printImpares(vetor);

    }

    public static void exercicioSeis(){
        Utils utils = new Utils();
        double[] vetor = utils.criaVetorDouble(5);
        utils.printaVetorDoubleInverso(vetor);
    }

    public static void exercicioSete(){
        Utils utils = new Utils();
        double[] vetor = utils.criaVetorDouble(5);
        utils.printaVetorDoubleInverso(vetor);
    }

    public static void exercicioOito(){
        Utils utils = new Utils();
        double[] vetor = utils.criaVetorDouble(10);
        utils.printaVetorDoubleInverso(vetor);
    }

    public static void exercicioNove(){
        Utils utils = new Utils();
        double[] vetor = utils.criaVetorDouble(4);
        System.out.println(utils.somaValoresVetorDouble(vetor));
    }

    // Método para mostrar os Valores Pares
    public static void printPares(ArrayList<Numeros> vetor){
        System.out.println("\nPares: ");
        for(Numeros numero: vetor){
            if (numero.getParOuImpar().equals("Par")){
                System.out.println(numero.getValor());
            }
        }
    }

    // Método para mostrar os Valores Impares
    public static void printImpares(ArrayList<Numeros> vetor){
        System.out.println("\nImpares: ");
        for(Numeros numero : vetor){
            if (numero.getParOuImpar().equals("Impar")){
                System.out.println(numero.getValor());
            }
        }
    }
}

