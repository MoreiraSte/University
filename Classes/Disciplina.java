package Classes;

import Classes.Interfaces.AlunoChangeListener;
import Classes.Pessoas.*;

import java.util.ArrayList;

public class Disciplina implements AlunoChangeListener {

    private String nome;
    private ArrayList<Aluno> alunos;
    private ArrayList<Docente> professores;
    private ArrayList<Monitor> monitor;
    private double aprovada;

    public Disciplina(String nome, ArrayList<Aluno> alunos, ArrayList<Docente> professores, ArrayList<Monitor> monitor) {
        this.nome = nome;
        this.alunos = alunos;
        this.professores = professores;
        this.monitor = monitor;

        calcularAprovada();

        for (Aluno aluno : alunos) {
            aluno.addListener(this);
        }
    }

    public void calcularAprovada() {
        double total = 0;
        for (Aluno aluno : alunos) {
            if (aluno.getStatus()) {
                total += 1;
            }
        }
        this.aprovada = (total / this.alunos.size()) * 100;

        if (this.aprovada >= 60) {
            System.out.println("Monitores,Professores,Coordenadores e Diretores receberam aumento:\n");
            for (Monitor monitor : monitor) {
                double value = monitor.aumento();
                System.out.println("Monitor: " + value);
            }

            for (Docente professor : professores) {
                if (professor instanceof Professor) {
                    double valueProf = ((Professor) professor).aumento();
                    System.out.println("Prof: "+valueProf);
                }
            }

            for (Docente coordenador : professores) {
                if (coordenador instanceof Coordenador) {
                    double valueCoor = ((Coordenador) coordenador).aumento();
                    System.out.println("Coordenador:"+valueCoor);

                }
            }

            for (Docente diretor : professores) {
                if (diretor instanceof Diretor) {
                    double valueDir = ((Diretor) diretor).aumento();
                    System.out.println("Diretor:"+valueDir);

                }
            }

        }
        if (this.aprovada < 50) {
            System.out.println("Monitores,Professores,Coordenadores e Diretores foram descontados:\n");
            for (Monitor monitor : monitor) {
                double value = monitor.desconto();
                System.out.println("Monitor:"+value);
            }

            for (Docente professor : professores) {
                if (professor instanceof Professor) {
                    double valueProf = ((Professor) professor).desconto();
                    System.out.println("Prof: "+valueProf);
                }
            }

            for (Docente coordenador : professores) {
                if (coordenador instanceof Coordenador) {
                    double valueCoor = ((Coordenador) coordenador).desconto();
                    System.out.println("Coordenador:"+valueCoor);
                }
            }

            for (Docente diretor : professores) {
                if (diretor instanceof Diretor) {
                    double valueDir = ((Diretor) diretor).desconto();
                    System.out.println("Diretor:"+valueDir);
                }
            }
        }
        //System.out.println(calcularAprovada());

    }
   
    public void mediaSala(){
        double mediaTurma = 0;
        double turmaFinal = 0;
        for (Aluno mediaTurmAluno : alunos){
            mediaTurma = mediaTurma+ mediaTurmAluno.media;
            
        }
        System.out.println("media turma:" + mediaTurma);
    }
    public void maiorMenor() {
        double maior = 0, menor = 10, maiorIdade = 0, menorIdade = 100;
        for (Aluno aluno: alunos) {
            if (aluno.media > maior) {
                maior = aluno.media;
            }
            if (aluno.media < menor) {
                menor = aluno.media;
            }
        }
        for (Aluno aluno:alunos) {
            if (aluno.media == maior) {
                System.out.println(aluno.nome + " - " + String.format("%.2f", aluno.media));
            }
            if (aluno.media == menor) {
                System.out.println(aluno.nome + " - " + String.format("%.2f", aluno.media));
            }
        }
        for (Aluno aluno:alunos) {
            if (aluno.idade > maiorIdade) {
                maiorIdade = aluno.idade;
            }
            if (aluno.idade < menorIdade) {
                menorIdade = aluno.idade;
                System.out.println(menorIdade);
            }
        }
        for (Aluno aluno:alunos) {
            if (aluno.idade == maiorIdade) {
                System.out.println(aluno.nome + " - " + aluno.idade + " Anos");
            }
            if (aluno.idade == menorIdade) {
                System.out.println(aluno.nome + " - " + aluno.idade + " Anos");
            }
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void getAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Docente> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Docente> professores) {
        this.professores = professores;
    }

    public ArrayList<Monitor> getMonitores() {
        return monitor;
    }

    public void setMonitores(ArrayList<Monitor> monitores) {
        this.monitor = monitores;
    }



    @Override
    public String toString() {
        return "Classes.Disciplina{" +
                "nome='" + nome + '\'' +
                ", turma=" + alunos +
                ", professores=" + professores +
                ", monitores=" + monitor +
                '}';
    }

    @Override
    public void onAlunoChange() {
        this.calcularAprovada();
    }
}
