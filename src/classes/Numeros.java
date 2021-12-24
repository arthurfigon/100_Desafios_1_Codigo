package classes;

public class Numeros {
    private int valor;
    private String parOuImpar;

    public Numeros(int valor) {
        this.valor = valor;
        setParOuImpar(valor);
    }

    private void setParOuImpar(int numero) {
        if(numero % 2 == 0){
            this.parOuImpar = "Par";
        } else{
            this.parOuImpar = "Impar";
        }
    }

    public int getValor() {
        return valor;
    }

    public String getParOuImpar() {
        return parOuImpar;
    }

}
