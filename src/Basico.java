import classes.Aluno;
import classes.Numeros;
import util.Utils;

import java.io.IOException;
import java.util.ArrayList;

public class Basico {
    public static void main(String[] args) {
        exercicioDezesete();
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
        utils.printaVetorDouble(vetor);
    }

    public static void exercicioSete(){
        Utils utils = new Utils();
        double[] vetor = utils.criaVetorDouble(5);
        utils.printaVetorDoubleInverso(vetor);
    }

    public static void exercicioOito(){
        Utils utils = new Utils();
        double[] vetor = utils.criaVetorDouble(4);
        System.out.println("Notas:");
        utils.printaVetorDouble(vetor);
        System.out.println("\nMédia:");
        System.out.println(utils.somaValoresVetorDouble(vetor)/4);
    }

    public static void exercicioNove(){
        Utils utils = new Utils();
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        System.out.println("Lidos: "+ letras.length + " caracteres");
        System.out.println("\nConsoantes: ");
        for(int i = 0; i < letras.length; i++){
            if(checkConsoante(letras[i])){
                System.out.println(letras[i]);
            }
        }
    }

    public static void exercicioDez(){

        // Quantidade de elementos a serem criados
        int quantidadeTotal = 20;

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

        //Print do Vetor
        for(Numeros num : vetor){
            System.out.println(num.getValor());
        }

        //Saida dos pares
        ArrayList<Numeros> pares = returnPares(vetor);
        printPares(pares);

        //Saida dos impares
        ArrayList<Numeros> impares = returnImpares(vetor);
        printImpares(impares);
    }

    public static void exercicioOnze(){
        Utils utils = new Utils();
        ArrayList<Aluno> alunos = new ArrayList<>();
        int numeroAlunos = 10, quantidadeNotas = 4;
        double[] notas = new double[quantidadeNotas];
        for(int aluno = 0; aluno < numeroAlunos; aluno++){
            for(int nota = 0; nota < 4; nota++){
                notas[nota] = utils.LerDouble("Informe a nota "+(nota+1)+" do Aluno "+(aluno+1)+": ");
            }
            // Criação aluno aqui
            alunos.add(new Aluno(notas[0],notas[1],notas[2],notas[3]));
        }



        for(Aluno aluno : alunos){
            if(aluno.checkAprovado()) {
                System.out.println("O aluno " + (alunos.indexOf(aluno) + 1) + " foi: ");
                aluno.showResult();
            }
        }
    }

    public static void exercicioDoze(){
        Utils utils = new Utils();
        int numeroElementos = 5, somatorio = 0, multiplicatorio = 1;
        int[] vetor = new int[numeroElementos];

        for(int i = 0; i< numeroElementos; i++){
            vetor[i] = utils.LerInt("Informe o número: ");
        }
        System.out.println("\nResultados:\n");
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i+1; j < vetor.length; j++) {
                System.out.printf("%d x %d = %d\n",vetor[i], vetor[j], vetor[i]*vetor[j]);
                System.out.printf("%d + %d = %d\n\n",vetor[i], vetor[j], vetor[i]+vetor[j]);
            }
        }
        for (int j = 0; j < vetor.length; j++) {
            somatorio += vetor[j];
            multiplicatorio *= vetor[j];
        }
        System.out.printf("Soma de todos juntos: %d", somatorio);
        System.out.printf("\nMultiplicação de todos juntos: %d", multiplicatorio);

    }

    public static void exercicioTreze(){
        Utils util = new Utils();
        int quantidadePessoas = 5;
        int[] idade = new int[quantidadePessoas];
        double[] altura = new double[quantidadePessoas];
        for (int i = quantidadePessoas-1; i >= 0 ; i--){
            idade[i] = util.LerInt("Informe a idade: ");
            altura[i] = util.LerDouble("Informe a altura: ");
        }
        for (int i = 0; i < quantidadePessoas ; i++){
            System.out.printf("Idade: %d\n", idade[i]);
            System.out.printf("Altura: %.2f\n\n", altura[i]);
        }
    }

    public static void exercicioQuatorze(){
        Utils util = new Utils();
        int quantidadeNumeros = 10, somatoria = 0;
        int[] valores = new int[quantidadeNumeros];
        for (int i = 0; i < quantidadeNumeros ; i++){
            valores[i] = util.LerInt("Informe a idade: ");
            somatoria += Math.pow(valores[i],2);
        }
        System.out.printf("Quadrado dos valores: %d", somatoria);
    }

    public static void exercicioQuinze(){
        Utils util = new Utils();
        int quantidadeNumeros = 2, quantidadeVetores = 3;
        int[] vetorZero = new int[quantidadeNumeros];
        int[] vetorUm = new int[quantidadeNumeros];
        int[] vetorDois = new int[quantidadeNumeros];
        int[] vetorTres = new int[quantidadeNumeros*3];
        for (int i = 0; i < quantidadeNumeros ; i++){
            vetorZero[i] = util.LerInt("Informe um número: ");
        }
        for (int i = 0; i < quantidadeNumeros ; i++){
            vetorUm[i] = util.LerInt("Informe um número: ");
        }
        for (int i = 0; i < quantidadeNumeros ; i++){
            vetorDois[i] = util.LerInt("Informe um número: ");
        }
        int contador = 0;
        for (int i = 0; i < quantidadeNumeros*quantidadeVetores ; i = i+quantidadeVetores){
            vetorTres[i] = vetorZero[contador];
            vetorTres[i+1] = vetorUm[contador];
            vetorTres[i+2] = vetorDois[contador];
            contador++;
        }
        for(int elemento : vetorTres){
            System.out.println(elemento);
        }
    }

    public static void exercicioDezesseis(){
        Utils utils = new Utils();
        double[] temperatura = new double[12];
        String[] meses = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro",
                "Outubro","Novembro","Dezembro"};
        double mediaAnual = 0;

        for(int i = 0; i < 12; i++){
            temperatura[i] = utils.LerDouble("Informe a temperatura de "+meses[i]+": ");
            mediaAnual += temperatura[i];
        }
        mediaAnual /= 12;
        for(int i = 0; i < 12; i++){
            if(temperatura[i] >= mediaAnual){
                System.out.printf("Mês: %s \nTemperatura: %.2f\n\n", meses[i], temperatura[i]);
            }
        }
    }

    public static void exercicioDezesete(){
        Utils utils = new Utils();
        int[] idade = new int[30];
        double[] altura = new double[30];
        double alturaMedia = 0;

        for(int i = 0; i < 30; i++){
            idade[i] = utils.LerInt("Informe a idade: ");
            altura[i] = utils.LerDouble("Informe a altura: ");
            alturaMedia += altura[i];
        }
        alturaMedia /= 30;
        for(int i = 0; i < 30; i++){
            if(idade[i] > 13 && altura[i] < alturaMedia){
                System.out.printf("Aluno:\n" +
                        "Idade: %d\n" +
                        "Altura: %.2f\n\n", idade[i], altura[i]);
            }
        }
    }

    public static void exercicioDezoito(){
        Utils utils = new Utils();
        int[] idade = new int[30];
        double[] altura = new double[30];
        double alturaMedia = 0;

        for(int i = 0; i < 30; i++){
            idade[i] = utils.LerInt("Informe a idade: ");
            altura[i] = utils.LerDouble("Informe a altura: ");
            alturaMedia += altura[i];
        }
        alturaMedia /= 30;
        for(int i = 0; i < 30; i++){
            if(idade[i] > 13 && altura[i] < alturaMedia){
                System.out.printf("Aluno:\n" +
                        "Idade: %d\n" +
                        "Altura: %.2f\n\n", idade[i], altura[i]);
            }
        }
    }

    public static void exercicioDezenove(){

    }




    public static boolean checkConsoante(char letra){
        if((letra != 'a' && letra != 'A') && (letra != 'e' && letra != 'e') && (letra != 'i' && letra != 'I')
                && (letra != 'o' && letra != 'O') && (letra != 'u' && letra != 'U')){
            return true;
        } else{
            return false;
        }
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

    // Método para retornar os Valores Pares
    public static ArrayList<Numeros> returnPares(ArrayList<Numeros> vetor){
        ArrayList<Numeros> pares = new ArrayList<>();
        for(Numeros numero: vetor){
            if (numero.getParOuImpar().equals("Par")){
                pares.add(numero);
            }
        }
        return pares;
    }

    // Método para retornar os Valores Impares
    public static ArrayList<Numeros> returnImpares(ArrayList<Numeros> vetor){
        ArrayList<Numeros> impares = new ArrayList<>();
        for(Numeros numero: vetor){
            if (numero.getParOuImpar().equals("Impar")){
                impares.add(numero);
            }
        }
        return impares;
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

