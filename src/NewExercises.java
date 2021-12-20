import util.Utils;

import java.util.Scanner;


public class NewExercises {
    static Utils ajuda = new Utils();
    static double[] doubles = new double[10];

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuaMenu = true;
        do {
            System.out.println("Informe o Número do Exercício: ");
            int opcao = entrada.nextInt();
            switch (opcao) {
                case 1 -> ExercicioUm();
                case 2 -> ExercicioDois();
                case 3 -> ExercicioTres();
                case 4 -> ExercicioQuatro();
                case 5 -> ExercicioCinco();
                case 6 -> ExercicioSeis();
                case 7 -> ExercicioSete();
                case 8 -> ExercicioOito();
                case 9 -> ExercicioNove();
                case 10 -> ExercicioDez();
                case 11 -> ExercicioOnze();
                case 12 -> ExercicioDoze();
                case 13 -> ExercicioTreze();
                case 14 -> ExercicioQuatorze();
                case 15 -> ExercicioQuinze();
                case 16 -> ExercicioDezesseis();
                case 17 -> ExercicioDezessete();
                case 18 -> ExercicioDezoito();
                case 19 -> ExercicioDezenove();
                case 20 -> ExercicioVinte();
                case 21 -> ExercicioVinteUm();
                case 22 -> ExercicioVinteDois();
                case 23 -> ExercicioVinteTres();
                case 24 -> ExercicioVinteQuatro();
                case 25 -> ExercicioVinteCinco();
                case 26 -> ExercicioVinteSeis();
                case 27 -> ExercicioVinteSete();
                case 28 -> ExercicioVinteOito();
                case 29 -> ExercicioVinteNove();
                default -> continuaMenu = false;
            }
            System.out.println("\n");
        } while (continuaMenu);
    }
    /*Escreva um programa que, com base em uma temperatura em graus celsius,
    a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F),
    seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67*/
    private static void ExercicioUm(){
        doubles[0] = LerDouble("Insira a temperatura em Celsius: ");
        System.out.printf("F = %.2f°", (doubles[0] * 1.8) + 32);
        System.out.printf("\nK = %.2f°", (doubles[0] + 273.15));
        System.out.printf("\nRe = %.2f°", (doubles[0] * 0.8));
        System.out.printf("\nRa = %.2f°", (doubles[0] * 1.8) + 32 + 459.67);
    }

    /*Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
    Fazer um algoritmo que calcule e escreva:
    a. a maior e a menor altura do grupo;
    b. média de altura dos homens;
    c. o número de mulheres.*/
    private static void ExercicioDois(){
        int i, numeroMulheres = 0, numeroHomens = 0;
        double somaAlturaHomens = 0;
        String[] sexos = new String[10];
        double[] alturas = new double[10];
        for(i=0; i<10;i++){
            sexos[i] = LerString("Insira o Sexo: ");
            alturas[i] = LerDouble("Insira Altura: ");
            if(sexos[i].equals("F") || sexos[i].equals("f"))
                numeroMulheres++;
            if(sexos[i].equals("M") || sexos[i].equals("m")){
                somaAlturaHomens += alturas[i];
                numeroHomens++;
            }
        }
        OrdenaCrescenteDouble(alturas);
        System.out.printf("Maior Altura: %.2f m\nMenor Altura: %.2f m\n", alturas[9], alturas[0]);
        System.out.printf("""
                Media de altura dos Homens: %.2f m
                Número de Mulheres: %d
                """, somaAlturaHomens/numeroHomens, numeroMulheres);

    }

    /*Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário
    a grade de funcionários e os salários, e devolvendo a média salarial.*/
    private static void ExercicioTres(){
        int numeroFuncionarios = LerInt("Informe o número de Funcionários: ");
        double salarios = 0;
        for (int i = 0;i<numeroFuncionarios;i++){
            salarios += LerDouble("Informe o sálario: ");
        }
        System.out.printf("Média de Salários: %.2f", salarios/numeroFuncionarios);
    }

    /* Uma parede em formato retangular, cuja altura é hp (altura da parede) e a
    largura lp (largura da parede) precisa ser coberta por azulejos também retangulares.
    O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo).
    Escreva um programa que leia as quatro medidas hp, lp, ha e la, calcule e imprima
    quanto azulejos com as medidas dadas são necessários para cobrir a parede dada. */
    private static void ExercicioQuatro(){
        double altura = LerDouble("Informe a altura da parede: ");
        double largura = LerDouble("Informe a largura da parede: ");

        double alturaAzulejo = LerDouble("Informe a altura do Azulejo: ");
        double larguraAzulejo = LerDouble("Informe a largura do Azulejo: ");

        System.out.printf("Quantidade de Azulejos necessários: %d Azulejos",
                (int) ((altura * largura)/(alturaAzulejo * larguraAzulejo)));
    }

    /*Calcular e apresentar o valor do volume de uma lata de óleo,
    utilizando fórmula: V = 3.14159 * R * R * A, em que as variáveis: V, R e A
    representam respectivamente o volume, o raio e a altura.
    Vamos declarar as variáveis V, R e A como double e definir um valor qualquer
    para as variáveis de altura e de raio. Agora vamos escrever a fórmula,
    conforme dita no enunciado e, em seguida, exibir na tela uma mensagem contendo o
    resultado do volume encontrado.*/
    private static void ExercicioCinco(){
        double raio = LerDouble("Informe o raio: ");
        double area = LerDouble("Informe a area: ");

        System.out.printf("Volume: %.2f m³", 3.1415*raio*raio*area);
    }

    /*Escreva um programa para determinar a quantidade de cavalos necessários
    para se levantar uma massa de m quilogramas a uma altura de h metros em t segundos.
    Considere cavalos = (m * h / t) / 745,6999*/
    private static void ExercicioSeis(){
        double massa = LerDouble("Informe a massa: ");
        double altura = LerDouble("Informe a altura: ");
        double tempo = LerDouble("Informe o tempo: ");

        System.out.printf("Cavalos Necessários: %.2f", ((massa*altura)/tempo)/745.6999);
    }

    private static void ExercicioSete(){
        double massa = LerDouble("Informe a massa: ");
        double altura = LerDouble("Informe a altura: ");
        double tempo = LerDouble("Informe o tempo: ");

        System.out.printf("Cavalos Necessários: %.2f", ((massa*altura)/tempo)/745.6999);
    }

    /*. Escreva um programa para ler 2 valores (considere que não
     serão informados valores iguais) e escrever o maior deles. */
    private static void ExercicioOito(){
        Utils utilitario = new Utils();
        int[] valores = new int[2];
        valores[0] = LerInt("Valor Um: ");
        valores[1] = LerInt("Valor Dois: ");
        utilitario.OrdenaDecrescenteInt(valores);
        System.out.printf("Maior: %d", valores[0]);
    }

    /*Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma
    mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).
     */
    private static void ExercicioNove(){
        int anoNascimento = LerInt("Ano de Nascimento: ");
        if (2021-anoNascimento >= 16){
            System.out.println("Pode votar!");
        }else {
            System.out.println("Não pode votar...");
        }
    }

    /*Escreva um programa que verifique a validade de uma senha fornecida pelo usuário.
    A senha válida é o número 1234. Devem ser impressas as seguintes mensagens:
    ACESSO PERMITIDO caso a senha seja válida. ACESSO NEGADO caso a senha seja inválida.*/
    private static void ExercicioDez(){
        String senhaCadastrada = "1234";
        String senhaLida = LerString("Informe sua senha: ");
        if (senhaLida.equals(senhaCadastrada)){
            System.out.println("Acesso Permitido");
        }else {
            System.out.println("Acesso Negado");
        }
    }


    /*As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia,
    e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas,
    calcule e escreva o valor total da compra. */
    private static void ExercicioOnze(){
        int quantidadeMacas = LerInt("Informe a Quantidade de Maçãs: ");
        if (quantidadeMacas>=12){
            System.out.printf("Preço Maçãs: %.2f", quantidadeMacas*0.25);
        }else {
            System.out.printf("Preço Maçãs: %.2f", quantidadeMacas*0.30);
        }
    }


    /*Escreva um programa para ler 3 valores inteiros
    (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente. */
    private static void ExercicioDoze(){
        Utils utilitario = new Utils();
        int[] vetor = new int[3];
        for(int i=0; i<3; i++){
            vetor[i] = LerInt("Informe um valor: ");
        }
        utilitario.OrdenaCrescenteInt(vetor);
        utilitario.printaVetor(vetor);
    }


    /*Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1 :feminino, 2: masculino,
    construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas:
    - para homens: (72.7 * Altura) – 58 - para mulheres: (62.1 * Altura) – 44.7*/
    private static void ExercicioTreze(){
        String sexo = LerString("Informe seu sexo (M ou F): ");
        double altura = LerDouble("Informe sua altura: ");

        if(sexo.equals("M")){
            System.out.printf("Peso Ideal: %.2f", (72.7 * altura) - 58);
        }else if(sexo.equals("F")){
            System.out.printf("Peso Ideal: %.2f", (62.1 * altura) - 44.7);
        }

    }


    /*Escreva um programa para ler o número de lados de um polígono regular e a
    medida do lado (em cm). Calcular e imprimir o seguinte:
    − Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área
    − Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
    − Se o número de lados for igual a 5 escrever PENTÁGONO.*/
    private static void ExercicioQuatorze(){
        int numeroDeLados = LerInt("Número de lados do Polígono: ");
        double lado = LerDouble("Tamanho do lado: ");

        switch (numeroDeLados){
            case 3 -> System.out.printf("Triângulo com Area de: %.2f cm", (lado*lado)*(Math.sqrt(3)/4));
            case 4 -> System.out.printf("Quadrado com Area de: %.2f cm", lado*lado);
            case 5 -> System.out.println("Pentágono");
            default -> System.out.println("Yo no conozco, señor...");
        }

    }


    /*Acrescente as seguintes mensagens à solução do exercício anterior conforme o caso.
− Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
− Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.
*/
    private static void ExercicioQuinze(){
        int numeroDeLados = LerInt("Número de lados do Polígono: ");
        double lado = LerDouble("Tamanho do lado: ");

        switch (numeroDeLados){
            case 2,1,0 -> System.out.println("Não é polígono...");
            case 3 -> System.out.printf("Triângulo com Area de: %.2f cm", (lado*lado)*(Math.sqrt(3)/4));
            case 4 -> System.out.printf("Quadrado com Area de: %.2f cm", lado*lado);
            case 5 -> System.out.println("Pentágono");
            default -> System.out.println("Yo no conozco, señor...");
        }

    }

    /*Escreva um programa para ler 3 valores inteiros e escrever o maior deles.
    Considere que o usuário não informará valores iguais.*/
    private static void ExercicioDezesseis(){
        Utils utilitario = new Utils();
        int[] vetor = new int[3];
        for(int i=0;i<3;i++){
            vetor[i] = LerInt("Informe um número: ");
        }
        utilitario.OrdenaDecrescenteInt(vetor);
        System.out.printf("Maior Valor: %d",vetor[0]);
    }

    /*Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero,
    Isósceles ou Escaleno. Sendo que:
    − Triângulo Equilátero: possui os 3 lados iguais.
    − Triângulo Isóscele: possui 2 lados iguais.
    − Triângulo Escaleno: possui 3 lados diferentes. */
    private static void ExercicioDezessete(){
       double ladoA = LerDouble("Informe o valor do lado: ");
        double ladoB = LerDouble("Informe o valor do lado: ");
        double ladoC = LerDouble("Informe o valor do lado: ");

        if(ladoA == ladoB && ladoA == ladoC){
            System.out.println("Triângulo Equilátero!");
        }else if((ladoA == ladoB || ladoA == ladoC) || (ladoB == ladoC)){
            System.out.println("Triângulo Isóscele!");
        }else{
            System.out.println("Triângulo Escaleno!");
        }
    }

    /* Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo,
     Retângulo ou Obtusângulo. Sendo que:
    − Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
    − Triângulo Obtusângulo: possui um ângulo obtuso. (maior que 90º)
    − Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º) */
    private static void ExercicioDezoito(){
        double anguloA = LerDouble("Informe um angulo: ");
        double anguloB = LerDouble("Informe um angulo: ");
        double anguloC = LerDouble("Informe um angulo: ");

        if(anguloA == 90 || anguloB == 90 || anguloC == 90){
            System.out.println("Triângulo Retângulo!");
        }else if(anguloA > 90 || anguloB > 90 || anguloC > 90){
            System.out.println("Triângulo Obtusângulo!");
        }else{
            System.out.println("Triângulo Acutângulo!");
        }
    }

    private static void ExercicioDezenove(){
        for(int numero=1; numero<=10;numero++){
            System.out.println("\nTabuada do "+numero);
            for (int multiplicador=1;multiplicador<=10;multiplicador++){
                System.out.printf("(%d x %d = %d)  ",numero,multiplicador,multiplicador*numero);
            }
        }
    }

    /*Escreva um programa para exibir os números de 1 até 50 na tela.
    Faça com que os números estejam sequenciados ne mesma linha e tenham espaçamento entre si.*/
    private static void ExercicioVinte(){
        for(int numero=1; numero<=50;numero++){
            System.out.print(numero+" ");

        }
    }

    /*Escreva um programa para encontrar todos os números pares entre 1 e 100.
    Para saber se um número é par, é necessário consultar se o resto da divisão
    deste número por 2 é igual à 0 (Operador Java para resto de divisão: %).*/
    private static void ExercicioVinteUm(){
        for(int numero=1; numero<=100;numero++){
            if(numero%2==0){
                System.out.println("Numero: "+numero);
            }
        }
    }

    /*Faça um programa que leia um valor inteiro inserido pelo usuário e resulte na tabuada de
    1 a 10 do valor lido. Aceitar somente valores entre 1 e 10.*/
    private static void ExercicioVinteDois(){
        boolean verificador = false;
        int valor;
        do{
            valor = ajuda.LerInt("Insira o número: ");
            if (valor >= 1 && valor <= 10){
                verificador = true;
            }
        }while(!verificador);
        for(int contador = 1 ; contador <= 10; contador++){
            System.out.printf("%d x %d : %d\n", valor, contador, valor*contador);
        }
    }

    /*Crie um programa que leia várias idades e calcule a média entre elas.
    Caso a maioria seja maior de 18 anos, o console deve mostrar “Aqui tem mais adultos”,
    se contrário, mostrar outra mensagem.
     */
    private static void ExercicioVinteTres(){
        int quantidadePessoas = ajuda.LerInt("Informe o total de pessoas: ");
        int somatorioAdultos = 0;
        int[] listaIdades = new int[quantidadePessoas];
        for (int i = 0; i<quantidadePessoas; i++){
            listaIdades[i] = ajuda.LerInt("Informe a idade: ");
            if(listaIdades[i] >= 18){
                somatorioAdultos += 1;
            }
        }
        if(somatorioAdultos >= (double)quantidadePessoas/2){
            System.out.println("Aqui tem mais adultos... Hehe");
        }else {
            System.out.println("Aqui tem mais di menó...");
        }
    }

    /*Faça um programa que leia 10 números inseridos pelo usuário
     e imprimir quantos deles são pares e quantos são ímpares.*/
    private static void ExercicioVinteQuatro(){
        int[] listaIdades = new int[10];
        int totalPares = 0;
        int totalImpares = 0;
        for (int i = 0; i<10; i++){
            listaIdades[i] = ajuda.LerInt("Informe a idade: ");

            if(listaIdades[i] % 2 == 0){
                totalPares += 1;
            }
            else{
                totalImpares += 1;
            }
        }
        System.out.printf("O total de Pares são: %d\n", totalPares);
        System.out.printf("O total de Impares são: %d\n", totalImpares);
    }

    /*Utilizando a estrutura de repetição for, faça um programa que receba 10 números
     e conte quantos deles estão no intervalo [10, 20] e quantos deles estão fora do intervalo,
     escrevendo estas informações.*/
    private static void ExercicioVinteCinco(){
        int[] listaValores = new int[10];
        int fora = 0;
        int dentro = 0;
        for (int i = 0; i<10; i++){
            listaValores[i] = ajuda.LerInt("Informe um número: ");

            if(listaValores[i] < 10 || listaValores[i] > 20){
                fora += 1;
            }
            else{
                dentro += 1;
            }
        }
        System.out.printf("Números fora: %d\n", fora);
        System.out.printf("Números dentro: %d\n", dentro);
    }


    /*Crie um programa que imprima 11 vezes a frase " Hello World!"
    utilizando uma estrutura sequencial e uma estrutura de repetição while.*/
    private static void ExercicioVinteSeis(){
        for (int i = 0; i<=10; i++){
            System.out.println("Hello World!");
        }
        System.out.println("\n");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }

    /* Crie um programa para ler 3 notas inseridas por um aluno e mostrar a média delas.
    Caso a média seja menor que 6.0, o console deverá constar sua média + a mensagem de reprovado.
    Se maior ou igual, conste sua média + mensagem de aprovação.*/
    private static void ExercicioVinteSete(){
        int numeroPessoas = 3;
        double[] notas = new double[numeroPessoas];
        double somatorio = 0, media;
        for (int i = 0; i<numeroPessoas; i++){
            notas[i] = ajuda.LerDouble("Informe a nota: ");
            somatorio += notas[i];
        }
        media = somatorio/numeroPessoas;
        if(media >= 6){
            System.out.printf("Nota: %.2f\nAprovado!", media);
        } else{
            System.out.printf("Nota: %.2f\nReprovado...", media);
        }

    }

    /* Faça um programa que mostre a tabuada de um número que seja inserido pelo usuário.*/
    private static void ExercicioVinteOito(){
        int valor = ajuda.LerInt("Insira o número: ");
        for(int contador = 1 ; contador <= 10; contador++){
            System.out.printf("%d x %d : %d\n", valor, contador, valor*contador);
        }
    }

    /* Faça um programa que peça ao usuário um número entre 12 e 20.
    Se a pessoa digitar um número diferente, mostrar a mensagem "entrada inválida" e
    solicitar o número novamente. Se digitar correto mostrar o número digitado.*/
    private static void ExercicioVinteNove(){
        boolean verificador = false;
        int valor;
        do{
            valor = ajuda.LerInt("Insira um número dentre 12 e 20: ");
            if (valor >= 12 && valor <= 20){
                verificador = true;
            }else {
                System.out.println("Número Inválido...");
            }
        }while(!verificador);
        System.out.printf("Número: %d", valor);
    }















    private static int LerInt(String pergunta){
        Scanner entrada = new Scanner(System.in);
        System.out.println(pergunta);
        return entrada.nextInt();
    }

    private static double LerDouble(String pergunta){
        Scanner entrada = new Scanner(System.in);
        System.out.println(pergunta);
        return entrada.nextDouble();
    }

    private static String LerString(String pergunta){
        Scanner entrada = new Scanner(System.in);
        System.out.println(pergunta);
        return entrada.nextLine();
    }

    private static void OrdenaCrescenteDouble(double[] vetor){
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
}
