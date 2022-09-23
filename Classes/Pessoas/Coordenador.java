package Classes.Pessoas;

public class Coordenador extends Docente{

    private double salario;

    public Coordenador(int CPF, String nome, int idade, String email) {
        super(CPF, nome, idade, email);
        this.salario = 11000;
    }

    public double aumento(){
       double aumento;

       aumento =  salario * 1.15;
       return aumento;
    }

    public double desconto(){
        double desconto;

        desconto =  salario * 0.75;
        return desconto;
    }

    public double getSalarioCoor(double salario){
        return salario;
    }

    public void setSalarioCoor(double salario){
        this.salario = salario;
    }

}
