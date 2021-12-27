package classes;

public class Aluno {
    double notaUm;
    double notaDois;
    double notaTres;
    double notaQuatro;
    double media;

    public Aluno(double notaUm, double notaDois, double notaTres, double notaQuatro) {
        this.notaUm = notaUm;
        this.notaDois = notaDois;
        this.notaTres = notaTres;
        this.notaQuatro = notaQuatro;
        calculaMedia();
    }

    private void calculaMedia(){
        this.media = (this.notaUm + this.notaDois + this.notaTres + this.notaQuatro)/4;
    }

    public boolean checkAprovado(){
        if(this.media >= 7){
            return true;
        }else{
            return false;
        }
    }

    public void showResult(){
        if(checkAprovado()){
            System.out.println("Parabéns, foi aprovado com média: "+this.media+" !!\n");
        }else{
            System.out.println("Infelizmente foi reprovado com média: "+this.media+" ...\n");
        }
    }

    public double getMedia(){
        return this.media;
    }
}
