package Classes.Pessoas;
import Classes.Interfaces.AlunoChangeListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;



public class Aluno extends Discente{

    private double[] notas;
    public double media;
    private boolean status;
    private double presenca;
    private int ano;
    private int faltas;

    private List<AlunoChangeListener> ListagemDisc= new ArrayList<AlunoChangeListener>();

    public void addListener(AlunoChangeListener disciplina){
        this.ListagemDisc.add(disciplina);
    }

    public Aluno(int CPF, String nome, int idade, String email, double[] notas, double presenca) {
        super(CPF, nome, idade, email);
        this.notas = notas;
        this.presenca = presenca;

        calcularMedia();
        calcularAprovado();
    }

    private void calcularAprovado(){
        this.setStatus(this.media >= 5 && this.presenca >= 75);

        for (AlunoChangeListener disciplina: ListagemDisc){
            disciplina.onAlunoChange();
        }
    }

    private void calcularMedia(){
        int total = 0;
        for (double nota : this.notas){
            total += nota;
        }

        this.media = (double) total / this.notas.length;

        for (AlunoChangeListener disciplina: ListagemDisc){
            disciplina.onAlunoChange();
        }
    }

   
    


    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
        calcularMedia();
        calcularAprovado();
    }

    

    public boolean getStatus() {
        return status;
    }

    private void setStatus(boolean status){
        this.status = status;
    }

    public double getPresenca() {
        return presenca;
    }

    public void setPresenca(double presenca) {
        this.presenca = presenca;
        calcularAprovado();
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                " media=" + media +
                ", status=" + status +
                ", presenca=" + presenca +
                ", ano=" + ano +
                ", faltas=" + faltas +
                '}';
    }
}

