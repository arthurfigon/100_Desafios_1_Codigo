/*Crie um programa para que apresente seu nome, seu
celular e sua cidade;*/

import java.util.Scanner;

public class Exercicios {
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
                case 17 -> ExercicioDezesete();
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
                case 30 -> ExercicioTrinta();
                case 31 -> ExercicioTrintaUm();
                case 32 -> ExercicioTrintaDois();
                case 33 -> ExercicioTrintaTres();
                case 34 -> ExercicioTrintaQuatro();
                case 35 -> ExercicioTrintaCinco();
                case 36 -> ExercicioTrintaSeis();
                case 37 -> ExercicioTrintaSete();
                case 38 -> ExercicioTrintaOito();
                case 39 -> ExercicioTrintaNove();
                case 40 -> ExercicioQuarenta();
                case 41 -> ExercicioQuarentaUm();
                case 42 -> ExercicioQuarentaDois();
                case 43 -> ExercicioQuarentaTres();
                case 44 -> ExercicioQuarentaQuatro();
                case 45 -> ExercicioQuarentaCinco();
                case 46 -> ExercicioQuarentaSeis();
                case 47 -> ExercicioQuarentaSete();
                case 48 -> ExercicioQuarentaOito();
                case 49 -> ExercicioQuarentaNove();
                case 50 -> ExercicioCinquenta();
                case 51 -> ExercicioCinquentaUm();
                case 52 -> ExercicioCinquentaDois();
                case 53 -> ExercicioCinquentaTres();
                case 54 -> ExercicioCinquentaQuatro();
                case 55 -> ExercicioCinquentaCinco();
                default -> continuaMenu = false;
            }
            System.out.println("\n");
        } while (continuaMenu);
    }

    /*Crie um programa para que apresente seu nome, seu
    celular e sua cidade;*/
    private static void ExercicioUm() {
        System.out.println("Arthur\n(00)01234-5679\nTaubaté");
    }


    /*Crie um programa para que apresente sua idade, altura
    e peso;*/
    private static void ExercicioDois() {
        System.out.println("25 anos\n1,73 m\n60 kg");
    }


    /*Crie um programa para que apresente seu salário e
    vale-refeição;*/
    private static void ExercicioTres() {
        System.out.println("SA Fictício: R$ 1.500,00\n Vale Refeição: R$200");
    }


    /*Crie um programa declarando uma variável do tipo
    String chamada nome, outra chamada celular e outra chamada cidade, atribua um valor para todas as variáveis e
    exiba o resultado no console;*/
    private static void ExercicioQuatro() {
        String nome = "Pedro";
        String celular = "00 98765-4321";
        String cidade = "Taubaté";
        System.out.printf("\nNome: %s\nCelular: %s\nCidade: %s", nome, celular, cidade);
    }


    /*Crie um programa declarando uma variável do tipo int
    chamada idade, outra chamada altura e outra peso, ambas
    do tipo double, atribua um valor para todas as variáveis e
    exiba o resultado no console;*/
    private static void ExercicioCinco() {
        int idade = 20;
        double altura = 1.80, peso = 78;
        System.out.printf("\nIdade: %s\nAltura: %s\nPeso: %s", idade, altura, peso);
    }


    /*Crie um programa para que receba do usuário o nome,
    celular e cidade e exiba no console;*/
    private static void ExercicioSeis() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu Nome: ");
        String nome = entrada.nextLine();
        System.out.println("Informe seu Celular: ");
        String celular = entrada.nextLine();
        System.out.println("Informe seu Cidade: ");
        String cidade = entrada.nextLine();
        System.out.printf("Nome: %s\nCelular: %s\nCidade: %s", nome, celular, cidade);
    }


    /*Crie um programa para que receba do usuário o idade,
    altura e peso e exiba no console;*/
    private static void ExercicioSete() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu Idade: ");
        int idade = entrada.nextInt();
        System.out.println("Informe seu Altura: ");
        double altura = entrada.nextDouble();
        System.out.println("Informe seu Peso: ");
        double peso = entrada.nextDouble();
        System.out.printf("Idade: %s\nAltura: %s\nPeso: %s", idade, altura, peso);
    }


    /*Crie um programa para que receba do usuário o salário e vale-refeição e exiba no console;*/
    private static void ExercicioOito() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu Salário: ");
        double salario = entrada.nextDouble();
        System.out.println("Informe seu Vale-Refeição: ");
        double valeRefeicao = entrada.nextDouble();
        System.out.printf("Salário: %.2f\nVale-Refeição: %.2f", salario, valeRefeicao);
    }


    /*Crie um programa que receba dois valores do usuário
    e exiba a o resultado de sua soma;*/
    private static void ExercicioNove() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o Primeiro Valor: ");
        int valorUm = entrada.nextInt();
        System.out.println("Informe o Segundo Valor: ");
        int valorDois = entrada.nextInt();
        System.out.printf("Somatório: %d", valorUm + valorDois);
    }


    /*Crie um programa que receba dois valores do usuário
    e exiba a o resultado de sua subtração;*/
    private static void ExercicioDez() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o Primeiro Valor: ");
        int valorUm = entrada.nextInt();
        System.out.println("Informe o Segundo Valor: ");
        int valorDois = entrada.nextInt();
        System.out.printf("Subtração: %d", valorUm - valorDois);
    }


    /*Crie um programa que receba dois valores do usuário
    e exiba a o resultado de sua multiplicação;*/
    private static void ExercicioOnze() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o Primeiro Valor: ");
        int valorUm = entrada.nextInt();
        System.out.println("Informe o Segundo Valor: ");
        int valorDois = entrada.nextInt();
        System.out.printf("Resultado: %d", valorUm * valorDois);
    }


    /*Crie um programa que receba dois valores do usuário
    e exiba a o resultado de sua divisão;*/
    private static void ExercicioDoze() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o Primeiro Valor: ");
        int valorUm = entrada.nextInt();
        System.out.println("Informe o Segundo Valor: ");
        int valorDois = entrada.nextInt();
        System.out.printf("Total: %d", valorUm / valorDois);
    }


    /*Crie um programa com uma ou duas variáveis atribuindo valores iniciais e
    exiba a o resultado de sua exponenciação;*/
    private static void ExercicioTreze() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o Primeiro Valor: ");
        int valorUm = entrada.nextInt();
        System.out.println("Informe o Segundo Valor: ");
        int valorDois = entrada.nextInt();
        System.out.printf("Total: %.2f", Math.pow(valorUm, valorDois));
    }


    /*Crie um programa com uma ou duas variáveis atribuindo valores iniciais
    e exiba a o resultado do módulo entre eles;*/
    private static void ExercicioQuatorze() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o Primeiro Valor: ");
        int valorUm = entrada.nextInt();
        System.out.println("Informe o Segundo Valor: ");
        int valorDois = entrada.nextInt();
        System.out.printf("Total: %d", valorUm % valorDois);
    }


    /*Crie um programa para ler um valor (do teclado) e escrever (na tela) o seu antecessor;*/
    private static void ExercicioQuinze() {
        String[] alfabeto = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"
                , "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe uma Tecla: ");
        String tecla = entrada.nextLine();
        for (int i = 0; i < alfabeto.length; i++) {
            if (tecla.equals(alfabeto[i])) {
                if (i == 0)
                    System.out.printf("Tecla anterior: %s", alfabeto[alfabeto.length - 1]);
                else
                    System.out.printf("Tecla anterior: %s", alfabeto[i - 1]);
            }
        }
    }


    /*Crie um programa para ler as dimensões de um retângulo (base e altura),
    calcular e escrever a área do retângulo; */
    private static void ExercicioDezesseis() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a Base: ");
        double base = entrada.nextDouble();
        System.out.println("Informe a Altura: ");
        double altura = entrada.nextDouble();
        System.out.printf("Área do Retângulo: %.2f", base * altura);
    }


    /*Crie um programa para ler a idade de uma pessoa expressa em anos,
    meses e dias e escreva a idade dessa pessoa expressa apenas em dia. Considerar ano com 365 dias
    e mês com 30 dias*/
    private static void ExercicioDezesete() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe quantos Anos você tem: ");
        int ano = entrada.nextInt();
        System.out.println("Meses: ");
        int mes = entrada.nextInt();
        System.out.println("Dias: ");
        int dia = entrada.nextInt();
        System.out.printf("Você tem %d dias de vida", ((ano * 365) + (mes * 30) + dia));
    }


    /*Crie um programa para ler o número total de eleitores
    de um município, o número de votos brancos, nulos e válidos.
    Calcular e escrever o percentual que cada um representa em
    relação ao total de eleitores;*/
    private static void ExercicioDezoito() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o número total de Habitantes: ");
        double habitantes = entrada.nextDouble();
        System.out.println("Informe o total de votos válidos: ");
        double votoValido = entrada.nextDouble();
        double porcentagemValido = (votoValido * 100) / habitantes;
        System.out.println("Informe o total de votos nulos: ");
        int votoNulo = entrada.nextInt();
        double porcentagemNulo = (votoNulo * 100) / habitantes;
        System.out.println("Informe o total de votos em branco: ");
        int votoEmBranco = entrada.nextInt();
        double porcentagemBranco = (votoEmBranco * 100) / habitantes;
        System.out.printf("Votos Válidos: %.2f%%", porcentagemValido);
        System.out.printf("\nVotos Nulos: %.2f%%", porcentagemNulo);
        System.out.printf("\nVotos em Branco: %.2f%%", porcentagemBranco);
    }


    /*Crie um programa para ler o salário mensal atual de
    um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário;*/
    private static void ExercicioDezenove() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o salário: ");
        double salario = entrada.nextDouble();
        System.out.println("Informe o percentual do reajuste: ");
        double reajuste = entrada.nextDouble();
        System.out.printf("Novo Salário: %.2f", salario * ((reajuste + 100) / 100));
    }


    /*Crie um programa para converter uma quantidade de dólar para real;
    • O usuário deve informar o valor em dólar;
    • O programa deve converter esse valor em reais, exibindo a mensagem com o valor convertido;
    • DÓLAR: R$ 6.61;*/
    private static void ExercicioVinte() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor em Dólar: ");
        double valor = entrada.nextDouble();
        System.out.printf("R$ %.2f", valor * 6.61);
    }


    /*O custo de um carro novo ao consumidor é a soma do
    "custo de fábrica" com a "porcentagem do distribuidor" e dos
    "impostos" (aplicados ao custo de fábrica). Supondo que o
    percentual do distribuidor seja de 28% e os impostos de
    45%, crie uma programa para ler o custo de fábrica de um
    carro, calcular e escrever o custo final ao consumidor.*/
    private static void ExercicioVinteUm() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o custo de fábrica: ");
        double valor = entrada.nextDouble();
        System.out.printf("Custo Final: R$ %.2f", (valor * 0.28) + (valor * 0.45) + valor);
    }


    /*Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma
    comissão também fixa para cada carro vendido e mais 5%
    do valor das vendas por ele efetuadas. Crie um programa
    que leia o número de carros por ele vendidos, o valor total
    de suas vendas, o salário fixo e o valor que ele recebe por
    carro vendido. Calcule e escreva o salário final do vendedor.
    */
    private static void ExercicioVinteDois() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("N° de carros vendidos: ");
        int carrosVendidos = entrada.nextInt();
        System.out.println("Total de Vendas R$: ");
        double valorVendas = entrada.nextDouble();
        System.out.println("Salário fixo R$: ");
        double salarioFixo = entrada.nextDouble();
        System.out.println("R$ por carro vendido: ");
        double valorCarro = entrada.nextDouble();
        System.out.printf("Salário: R$ %.2f", (valorVendas * 0.05) + salarioFixo + carrosVendidos * valorCarro);
    }


    /*Crie um programa para ler uma temperatura em graus
    Fahrenheit, calcular e escrever o valor correspondente em
    graus Celsius (baseado na fórmula abaixo):*/
    private static void ExercicioVinteTres() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Temperatura em Fahrenheit: ");
        double temperatura = entrada.nextDouble();
        System.out.printf("Celsius: %.2f °C", ((temperatura - 32) * 5) / 9);
    }


    /*Crie um programa que leia três notas de um aluno,
    calcule e escreva a média final deste aluno. Considerar que
    a média é ponderada e que o peso das notas é 2, 3 e 5.
    Fórmula para o cálculo da média final é:*/
    private static void ExercicioVinteQuatro() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nota 1: ");
        double notaUm = entrada.nextDouble();
        System.out.println("Nota 2: ");
        double notaDois = entrada.nextDouble();
        System.out.println("Nota 3: ");
        double notaTres = entrada.nextDouble();
        verificaAprovacao((notaUm * 2 + notaDois * 3 + notaTres * 5) / 10);
    }

    /*Diz se o aluno foi aprovado ou não e diz também a nota dele*/
    private static void verificaAprovacao(double nota) {
        if (nota >= 7)
            System.out.printf("Aprovado!\nNota Final: %.2f", nota);
        else
            System.out.printf("Reprovado...\nNota Final: %.2f", nota);
    }


    /*Um motorista deseja colocar no seu tanque X reais de
    gasolina. Escreva um programa para ler o preço do litro da
    gasolina e o valor do pagamento, e exibir quantos litros ele
    conseguiu colocar no tanque.*/
    private static void ExercicioVinteCinco() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Preço do Litro da Gasolina R$: ");
        double precoLitro = entrada.nextDouble();
        System.out.println("Preço a se Pagar R$: ");
        double pagamento = entrada.nextDouble();
        System.out.printf("Litros Abastecidos: %.2f", pagamento / precoLitro);
    }


    /*Entrar com o dia e o mês de uma data e informar
    quantos dias se passaram desde o início do ano. Esqueça a
    questão dos anos bissextos e considere sempre que um mês
    possui 30 dias.*/
    private static void ExercicioVinteSeis() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Mês que estamos: ");
        String meses = entrada.nextLine();
        System.out.println("Dia que estamos: ");
        int dias = entrada.nextInt();
        System.out.printf("Dias Passados: %d", (converterMesEmNumero(meses) - 1) * 30 + dias - 1);
    }

    private static int converterMesEmNumero(String mes) {
        switch (mes) {
            case "janeiro", "Janeiro" -> {
                return 1;
            }
            case "fevereiro", "Fevereiro" -> {
                return 2;
            }
            case "março", "Março" -> {
                return 3;
            }
            case "abril", "Abril" -> {
                return 4;
            }
            case "maio", "Maio" -> {
                return 5;
            }
            case "junho", "Junho" -> {
                return 6;
            }
            case "julho", "Julho" -> {
                return 7;
            }
            case "agosto", "Agosto" -> {
                return 8;
            }
            case "setembro", "Setembro" -> {
                return 9;
            }
            case "outubro", "Outubro" -> {
                return 10;
            }
            case "novembro", "Novembro" -> {
                return 11;
            }
            case "dezembro", "Dezembro" -> {
                return 12;
            }
            default -> {
                return 0;
            }
        }
    }


    /*Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo
    vendida respectivamente por 10, 12 e 15 reais. Construa um programa em
    que o usuário forneça a quantidade de camisetas pequenas,
    médias e grandes referentes a uma venda, e a máquina informe quanto será o valor arrecadado.*/
    private static void ExercicioVinteSete() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantidade Camisas P: ");
        int camisasP = entrada.nextInt();
        System.out.println("Quantidade Camisas M: ");
        int camisasM = entrada.nextInt();
        System.out.println("Quantidade Camisas G: ");
        int camisasG = entrada.nextInt();
        System.out.printf("Dias Passados: %d", camisasP*10 + camisasM*12 + camisasG*15);
    }


    /*Três amigos, Carlos, André e Felipe. decidiram rachar
    igualmente a conta de um bar. Faça um programa para ler
    o valor total da conta e imprimir quanto cada um deve pagar,
    mas faça com que Carlos e André não paguem centavos.
    Ex: uma conta de R$101,53 resulta em R$33,00 para
    Carlos, R$33,00 para André e R$35,53 para Felipe.*/
    private static void ExercicioVinteOito(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor da Conta: ");
        double valorPagar = entrada.nextDouble();
        System.out.printf("Carlos e André: %d,00\nFelipe: %.2f", (int) (valorPagar / 3),
                ((int) (valorPagar / 3) + (valorPagar % 3)));
    }


    /*A lanchonete Gostosura vende apenas um tipo de sanduíche,
    cujo recheio inclui duas fatias de queijo, uma fatia
    de presunto e uma rodela de hambúrguer. Sabendo que cada fatia
    de queijo ou presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas,
    faça um programa em que o dono forneça a quantidade de sanduíches a fazer,
    e a máquina informe as quantidades (em quilos) de queijo,
    presunto e carne necessários para compra.
    2 fatias de queijo, 1 fatia de presunto e 1 rodela de hambúrguer
    - 1 fatia (queijo ou presunto) - 50 gramas
    - 1 rodela (hambúrguer) - 100 gramas*/
    private static void ExercicioVinteNove(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a quantidade de Sanduíches pra fazer: ");
        int sanduiches = entrada.nextInt();
        System.out.printf("Queijo: %.2f KG\nPresunto: %.2f KG\nHamburger: %.2f KG",
                sanduiches*0.1,sanduiches*0.05,sanduiches*0.1);
    }


    /*Alguns países medem temperaturas em graus Celsius,
    e outros em graus Fahrenheit. Faça um programa para ler
    uma temperatura Celsius e imprimi-Ia em Fahrenheit .*/
    private static void ExercicioTrinta(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a temperatura em Celsius: ");
        double temperatura = entrada.nextDouble();
        System.out.printf("Temperatura em Fahrenheits: %.2f °F", (temperatura * 1.8)+32);
    }


    /*A granja Frangotech possui um controle automatizado
    de cada frango da sua produção. No pé direito do frango há
    um anel com um chip de identificação; no pé esquerdo são
    dois anéis para indicar o tipo de alimento que ele deve
    consumir. Sabendo que o anel com chip custa R$4,00 e o
    anel de alimento custa R$3,50, faça um programa para calcular o
    gasto total da granja para marcar todos os seus frangos.*/
    private static void ExercicioTrintaUm(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o número de Frangos: ");
        int frangos = entrada.nextInt();
        System.out.printf("%d - Anéis Identificação: R$%.2f\n%d - Anéis Alimentação: R$%.2f",
                frangos, frangos*4.00,frangos*2,frangos*7.00);
    }


    /*A fábrica de refrigerantes Meia-Cola vende seu produto em três formatos:
    lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros.
    Se um comerciante compra uma determinada quantidade de cada formato,
    faça um programa para calcular quantos litros de refrigerante ele comprou.*/
    private static void ExercicioTrintaDois(){
        int valorTotal = 0;
        int[] latas = {350,600,2000};
        for (int i: latas) {
            valorTotal += calculaLiquidos(i);
        }
        System.out.printf("Quantidade total de Litros: %d", valorTotal);
    }

    private static int calculaLiquidos(int medida){

        System.out.printf("Quantas latas de %d ml: ", medida);
        Scanner entrada = new Scanner(System.in);
        int quantidade = entrada.nextInt();
        return quantidade*medida;
    }


    /*Pedrinho tem um cofrinho com muitas moedas, e deseja saber quantos reais conseguiu poupar.
    Faça um programa para ler a quantidade de cada tipo de moeda, e imprimir o valor total economizado,
    em reais. Considere que existam moedas de 1, 5, 10, 25 e 50 centavos,
    e ainda moedas de 1 real. Não havendo moeda de um tipo, a quantidade respectiva é zero.*/
    private static void ExercicioTrintaTres(){
        int valorTotal = 0;
        int[] moedas = {1,5,10,25,50,100}; // Poderia adicionar as cédulas com valores de 200,500... Caso quisesse
        for (int i: moedas) {
            valorTotal += calculaDinheiro(i);
        }
        System.out.printf("Somatória: R$%d,%d", valorTotal /100, valorTotal %100);
    }

    private static int calculaDinheiro(int dinheiro){
        Scanner entrada = new Scanner(System.in);
        int valor;
        if(dinheiro==100){
            System.out.printf("Quantas moedas de %d Real: ", dinheiro/100);
            valor = entrada.nextInt();
            return valor*dinheiro;
        }else if(dinheiro>100){
            System.out.printf("Quantas cédulas de %d Reais: ", dinheiro/100);
            valor = entrada.nextInt();
            return valor*dinheiro;
        }else{
            System.out.printf("Quantas moedas de %d Centavo(s): ", dinheiro);
            valor = entrada.nextInt();
            return valor*dinheiro;
        }
    }


    /*Um tonel de refresco é feito com 8 partes de água mineral e 2 partes de suco de maracujá.
    Faça um programa para calcular quantos litros de água e de suco são necessários para se
    fazer X litros de refresco (informados pelo usuário).*/
    private static void ExercicioTrintaQuatro(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe quanto litros de suco a se fazer: ");
        double sucoLitros = entrada.nextDouble();
        System.out.printf("Água Mineral: %.2f L\nSuco de Maracujá: %.2f L",sucoLitros*0.8, sucoLitros*0.2);
    }


    /*Faça um programa que receba o ano de nascimento de
    uma pessoa e o ano atual, calcule e mostre:
    a) a idade dessa pessoa em anos;
    b) a idade dessa pessoa em meses;
    c) a idade dessa pessoa em dias;
    d) a idade dessa pessoa em semanas.*/
    private static void ExercicioTrintaCinco(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu ano de nascimento: ");
        int anoNascimento = entrada.nextInt();
        System.out.println("Informe o ano atual: ");
        int anoAtual = entrada.nextInt();
        int diferencaAnos = anoAtual-anoNascimento;
        System.out.printf("Anos: %d\nMeses: %d\nSemanas: %d\nDias: %d",
                diferencaAnos, diferencaAnos*12, diferencaAnos*52, diferencaAnos*365);
    }


    /*Ler um valor e escrever a mensagem: É MAIOR QUE
    10, se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10;*/
    private static void ExercicioTrintaSeis(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Diz um número: ");
        int numero = entrada.nextInt();
        if(numero>10)
            System.out.println("É MAIOR QUE 10");
        else
            System.out.println("NÃO É MAIOR QUE 10");
    }


    /*Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).*/
    private static void ExercicioTrintaSete() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Diz um número: ");
        int numero = entrada.nextInt();
        if (numero < 0)
            System.out.println("Negativo");
        else
            System.out.println("Positivo");
    }


    /*As maçãs custam R$ 1,30 cada se forem compradas
    menos de uma dúzia, e R$ 1,00 se forem compradas pelo
    menos 12. Escreva um programa que leia o número de maçãs compradas,
    calcule e escreva o custo total da compra.*/
    private static void ExercicioTrintaOito() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas maçãs quer comprar: ");
        int numeroMacas = entrada.nextInt();
        if (numeroMacas < 12)
            System.out.printf("Preço: R$ %.2f", numeroMacas*1.30);
        else
            System.out.printf("Preço: R$ %d,00", numeroMacas);
    }


    /*Ler as notas da 1a. e 2a. avaliações de um aluno.
    Calcular a média aritmética simples e escrever uma mensagem
    que diga se o aluno foi ou não aprovado (considerar que
    nota igual ou maior que 6 o aluno é aprovado). Escrever
    também a média calculada.*/
    private static void ExercicioTrintaNove() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nota 1: ");
        double notaUm = entrada.nextDouble();
        System.out.println("Nota 2: ");
        double notaDois = entrada.nextDouble();
        if ((notaUm+notaDois)/2 >= 6)
            System.out.printf("Aprovado com a nota: %.2f", (notaUm+notaDois)/2);
        else
            System.out.printf("Reprovado com a nota: %.2f", (notaUm+notaDois)/2);
    }


    /*Ler o ano atual e o ano de nascimento de uma pessoa.
    Escrever uma mensagem que diga se ela poderá ou não votar este ano
    (não é necessário considerar o mês em que a pessoa nasceu).*/
    private static void ExercicioQuarenta(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu ano de nascimento: ");
        int anoNascimento = entrada.nextInt();
        System.out.println("Informe o ano atual: ");
        int anoAtual = entrada.nextInt();
        int diferencaAnos = anoAtual-anoNascimento;
        if (diferencaAnos >= 18)
            System.out.println("Poderá votar!");
        else
            System.out.println("Não poderá votar...");
    }


    /*Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.*/
    private static void ExercicioQuarentaUm(){
        Scanner entrada = new Scanner(System.in);
        int valores = 2;
        int[] vetorNumeros = new int[valores];
        for(int i = 0; i < valores ; i++){
            System.out.println("Diz um número: ");
            vetorNumeros[i] = entrada.nextInt();
        }
        OrdenaDecrescenteInt(vetorNumeros);
        System.out.printf("Maior Valor: %d",vetorNumeros[0]);
    }

    private static void OrdenaDecrescenteInt(int[] vetor){
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

    private static void OrdenaCrescenteInt(int[] vetor){
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

    private static void printaVetor(int[] vetor){
        for (int i : vetor) {
            System.out.println(i);
        }
    }


    /*Ler dois valores (considere que não serão lidos valores
    iguais) e escrevê-los em ordem crescente.*/
    private static void ExercicioQuarentaDois(){
        Scanner entrada = new Scanner(System.in);
        int valores = 2;
        int[] vetorNumeros = new int[valores];
        for(int i = 0; i < valores ; i++){
            System.out.println("Diz um número: ");
            vetorNumeros[i] = entrada.nextInt();
        }
        OrdenaCrescenteInt(vetorNumeros);
        printaVetor(vetorNumeros);
    }


    /*Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras,
    sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o
    tempo máximo de duração do jogo é de 24 horas e que o
    jogo pode iniciar em um dia e terminar no dia seguinte.*/
    private static void ExercicioQuarentaTres(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o horário do inicio da partida: ");
        int horaInicio = entrada.nextInt();
        System.out.println("Informe o horário do fim da partida: ");
        int horaFim = entrada.nextInt();
        if (horaInicio > horaFim)
            horaFim += 24;
        System.out.printf("A duração da partida foi de: %d", horaFim-horaInicio);
    }


    /*A jornada de trabalho semanal de um funcionário é de
    40 horas. O funcionário que trabalhar mais de 40 horas
    receberá hora extra, cujo cálculo é o valor da hora regular
    com um acréscimo de 50%. Escreva um programa que leia
    o número de horas trabalhadas em um mês, o salário por
    hora e escreva o salário total do funcionário, que deverá
    ser acrescido das horas extras, caso tenham sido trabalhadas
    (considere que o mês possua 4 semanas exatas).*/
    private static void ExercicioQuarentaQuatro(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe quantas horas trabalhou: ");
        int horasTrabalhadas = entrada.nextInt();
        System.out.println("Informe o valor do salário por hora: ");
        double salarioHoras = entrada.nextDouble();
        int horasExtras = horasTrabalhadas - 160;
        System.out.printf("Salário: %.2f", 160*salarioHoras + horasExtras*salarioHoras*1.50);
    }


    /*Ler o salário fixo e o valor das vendas efetuadas pelo
    vendedor de uma empresa. Sabendo-se que ele recebe uma
    comissão de 3% sobre o total das vendas até R$ 1.500,00
    mais 5% sobre o que ultrapassar este valor, calcular e
    escrever o seu salário total.*/
    private static void ExercicioQuarentaCinco(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu salário: ");
        double salarioFixo = entrada.nextDouble();
        System.out.println("Informe o Valor de Vendas: ");
        double valorDeVendas = entrada.nextDouble();
        if(valorDeVendas <= 1500)
            System.out.printf("Salário: %.2f",salarioFixo+valorDeVendas*0.03);
        else
            System.out.printf("Salário: %.2f",salarioFixo+valorDeVendas*0.05);
    }


    /*Faça um programa para ler: número da conta do cliente, saldo, débito e crédito.
    Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).
    Também testar se saldo atual for maior ou igual a zero escrever a mensagem
    'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.*/
    private static void ExercicioQuarentaSeis(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o número da conta: ");
        String numeroDaConta = entrada.nextLine();
        System.out.println("Informe o saldo: ");
        double saldo = entrada.nextDouble();
        System.out.println("Informe o debito: ");
        double debito = entrada.nextDouble();
        System.out.println("Informe o credito: ");
        double credito = entrada.nextDouble();
        double saldoFinal = saldo - debito + credito;
        if (saldoFinal < 0)
            System.out.printf("Número da Conta: %s\nSaldo Negativo de: R$ %.2f",numeroDaConta,saldoFinal);
        else
            System.out.printf("Número da Conta: %s\nSaldo Positivo de: R$ %.2f",numeroDaConta,saldoFinal);
    }


    /*Faça um programa para ler: quantidade atual em estoque, quantidade máxima
    em estoque e quantidade mínima em estoque de um produto.
    Calcular e escrever a quantidade média ((quantidade média = quantidade máxima +
    quantidade mínima)/2). Se a quantidade em estoque for
    maior ou igual a quantidade média escrever a mensagem
    'Não efetuar compra', senão escrever a mensagem 'Efetuar
    compra'.*/
    private static void ExercicioQuarentaSete(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe quantidade atual em estoque: ");
        int estoqueAtual = entrada.nextInt();
        System.out.println("Informe quantidade máxima em estoque: ");
        double estoqueMaximo = entrada.nextInt();
        System.out.println("Informe quantidade mínima em estoque: ");
        double estoqueMinimo = entrada.nextInt();
        double estoqueMedio = (estoqueMaximo+estoqueMinimo)/2;
        if(estoqueAtual>=estoqueMedio)
            System.out.println("Não Efetuar Compra");
        else
            System.out.println("Efetuar Compra");
    }


    /*Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.*/
    private static void ExercicioQuarentaOito(){
        Scanner entrada = new Scanner(System.in);
        int valores = 3;
        int[] vetorNumeros = new int[valores];
        for(int i = 0; i < valores ; i++){
            System.out.println("Diz um número: ");
            vetorNumeros[i] = entrada.nextInt();
        }
        OrdenaDecrescenteInt(vetorNumeros);
        System.out.printf("Maior valor: %d",vetorNumeros[0]);
    }


    /*Ler 3 valores (considere que não serão informados valores iguais) e escrever o menor deles.*/
    private static void ExercicioQuarentaNove(){
        Scanner entrada = new Scanner(System.in);
        int valores = 3;
        int[] vetorNumeros = new int[valores];
        for(int i = 0; i < valores ; i++){
            System.out.println("Diz um número: ");
            vetorNumeros[i] = entrada.nextInt();
        }
        OrdenaDecrescenteInt(vetorNumeros);
        System.out.printf("Menor valor: %d",vetorNumeros[valores-1]);
    }


    /*Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.*/
    private static void ExercicioCinquenta(){
        Scanner entrada = new Scanner(System.in);
        int valores = 3;
        int[] vetorNumeros = new int[valores];
        for(int i = 0; i < valores ; i++){
            System.out.println("Diz um número: ");
            vetorNumeros[i] = entrada.nextInt();
        }
        OrdenaDecrescenteInt(vetorNumeros);
        System.out.printf("Soma dos maiores: %d",vetorNumeros[0]+vetorNumeros[1]);
    }


    /*Ler 3 valores (considere que não serão informados valores iguais)
     e escrever a multiplicação dos 2 menores.*/
    private static void ExercicioCinquentaUm(){
        Scanner entrada = new Scanner(System.in);
        int valores = 3;
        int[] vetorNumeros = new int[valores];
        for(int i = 0; i < valores ; i++){
            System.out.println("Diz um número: ");
            vetorNumeros[i] = entrada.nextInt();
        }
        OrdenaDecrescenteInt(vetorNumeros);
        System.out.printf("Multiplicação dos menores: %d",
                vetorNumeros[valores-1]*vetorNumeros[valores-2]);
    }


    /*Ler 3 valores (considere que não serão informados valores iguais) e
    escrevê-los em ordem crescente.*/
    private static void ExercicioCinquentaDois(){
        Scanner entrada = new Scanner(System.in);
        int valores = 3;
        int[] vetorNumeros = new int[valores];
        for(int i = 0; i < valores ; i++){
            System.out.println("Diz um número: ");
            vetorNumeros[i] = entrada.nextInt();
        }
        OrdenaCrescenteInt(vetorNumeros);
        printaVetor(vetorNumeros);
    }


    /*Ler 3 valores (considere que não serão informados valores iguais)
     e escrevê-los em ordem decrescente.*/
    private static void ExercicioCinquentaTres(){
        Scanner entrada = new Scanner(System.in);
        int valores = 3;
        int[] vetorNumeros = new int[valores];
        for(int i = 0; i < valores ; i++){
            System.out.println("Diz um número: ");
            vetorNumeros[i] = entrada.nextInt();
        }
        OrdenaDecrescenteInt(vetorNumeros);
        printaVetor(vetorNumeros);
    }


    /*Ler 3 valores (A, B e C) representando as medidas dos
    lados de um triângulo e escrever se formam ou não um triângulo.
    OBS: para formar um triângulo, o valor de cada
    lado deve ser menor que a soma dos outros 2 lados.*/
    private static void ExercicioCinquentaQuatro(){
        Scanner entrada = new Scanner(System.in);
        int valores = 3;
        int[] vetorNumeros = new int[valores];
        for (int i = 0; i < valores; i++) {
            System.out.println("Informe o lado: ");
            vetorNumeros[i] = entrada.nextInt();
        }
        if (vetorNumeros[2] >= (vetorNumeros[0] + vetorNumeros[1]))
            System.out.println("Não formam um triângulo...");
        else if (vetorNumeros[1] >= (vetorNumeros[0] + vetorNumeros[2]))
            System.out.println("Não formam um triângulo...");
        else if (vetorNumeros[0] >= (vetorNumeros[1] + vetorNumeros[2]))
            System.out.println("Não formam um triângulo...");
        else
            System.out.println("Formam um triângulo!");
    }


    /*Ler o nome de 2 times e o número de gols marcados
    na partida (para cada time). Escrever o nome do vencedor.
    Caso não haja vencedor deverá ser impressa a palavra
    EMPATE.*/
    private static void ExercicioCinquentaCinco(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro time: ");
        String timeUm = entrada.nextLine();
        System.out.println("Informe a quantidade de Gols: ");
        int golsTimeUm = entrada.nextInt();

        System.out.println("Informe o segundo time: ");
        String timeDois = entrada.nextLine();
        System.out.println("Informe a quantidade de Gols: ");
        int golsTimeDois = entrada.nextInt();

        if(golsTimeUm > golsTimeDois)
            System.out.printf("Time Vencedor: %s",timeUm);
        else if(golsTimeDois > golsTimeUm)
            System.out.printf("Time Vencedor: %s",timeDois);
        else
            System.out.println("Partida Empatada");
    }
}
