package App;

import Classes.Disciplina;
import Classes.Pessoas.*;
import Classes.Universidade;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Docente> professores = new ArrayList<>();
        ArrayList<Monitor> monitor = new ArrayList<>();


      //  ArrayList<Universidade> univer = new ArrayList<>();


        alunos.add(new Aluno(519508858, "Ste Moreira", 18, "ste@gmail.com",new double[]{6.00,7.00}, 75.00));
        alunos.add(new Aluno(749876793, "Maria Eduarda", 19, "maria@gmail.com",new double[]{4.00,5.00} , 70.00));
        alunos.add(new Aluno(676546785, "Souza Carlos", 17, "souza@gmail.com",new double[]{4.00,10.00} , 75.00));

        professores.add(new Professor(3244435,"Celso",40, "celso@gmail.com"));
        professores.add(new Professor(3244435,"Cleiton",50, "cleiclei@gmail.com"));
        professores.add(new Professor(3244435,"Isaias",30, "isa@gmail.com"));

        monitor.add(new Monitor(1234556,"Cecilia", 40, "ceci@gmail.com",2000,20.00));
        monitor.add(new Monitor(6756544,"Carlos", 40, "car@gmail.com",2020,70.00));
        monitor.add(new Monitor(4354567,"Léo", 40, "le@gmail.com",2017,50.00));

        professores.add((new Coordenador(6756433,"Julius",30,"julius@gmail.com")));
        professores.add((new Coordenador(2354567,"Matheus",45,"julius@gmail.com")));
        professores.add((new Coordenador(9807854,"Jade",25,"julius@gmail.com")));

        professores.add((new Diretor(6756433,"Julius",30,"julius@gmail.com")));
        professores.add((new Diretor(2354567,"Matheus",45,"julius@gmail.com")));
        professores.add((new Diretor(9807854,"Jade",25,"julius@gmail.com")));


        Disciplina porcentagem = new Disciplina("porcentagem aprovada", alunos, professores, monitor);

//        matematica.getAlunos().get(0).setPresenca(70);
//        ingles.getAlunos().get(1).setPresenca(60);
//        geografia.getAlunos().get(2).setPresenca(75);

        System.out.println("||||||||||||||||||||||Turma|||||||||||||||||||||||||");
        System.out.println("Nome:" +alunos.get(0).getNome() + " | Email: " + alunos.get(0).getEmail() + " | Presença: " +alunos.get(0).getPresenca() + " | Media: " +alunos.get(0).getMedia() + " | Status: " +alunos.get(0).getStatus());
        System.out.println("Nome:" + alunos.get(1).getNome() + " | Email: " + alunos.get(1).getEmail() + "| Presença: " +alunos.get(1).getPresenca() + " | Media: " +alunos.get(1).getMedia() + " | Status: " +alunos.get(1).getStatus());
        System.out.println("Nome:" +alunos.get(2).getNome() + " | Email: " + alunos.get(2).getEmail() + " | Presença: " +alunos.get(2).getPresenca() + " | Media: " +alunos.get(2).getMedia() + " | Status: " +alunos.get(2).getStatus());
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||\n");

        System.out.println("|||||||||||Disciplinas e seus professores|||||||||||");
        System.out.println("Matemática - "+ "Nome:" +professores.get(0).getNome() + " | Email:" +professores.get(0).getEmail() + " | Idade:" +professores.get(0).getIdade());
        System.out.println("Inglês - "+ "Nome:" +professores.get(1).getNome() + " | Email:" +professores.get(1).getEmail() + " | Idade:" +professores.get(1).getIdade());
        System.out.println("Geografia - "+"Nome:" +professores.get(2).getNome() + " | Email:" +professores.get(2).getEmail() + " | Idade:" +professores.get(2).getIdade());
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||\n");

        System.out.println("||||||||||||||||||||||Monitores||||||||||||||||||||||");
        System.out.println("Nome:" + monitor.get(0).getNome() + " | Email:" + monitor.get(0).getEmail() + " | Ano:" + monitor.get(0).getAno() + " | Bolsa:" + monitor.get(0).getBolsa());
        System.out.println("Nome:" + monitor.get(1).getNome() + " | Email:" + monitor.get(1).getEmail() + " | Ano:" + monitor.get(1).getAno() + " | Bolsa:" + monitor.get(1).getBolsa());
        System.out.println("Nome:" + monitor.get(2).getNome() + " | Email:" + monitor.get(2).getEmail() + " | Ano:" + monitor.get(2).getAno() + " | Bolsa:" + monitor.get(2).getBolsa());
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||\n");



        System.out.println("|||||||||||||||||||||||Aumentos ou Descontos||||||||||||||||||||\n");
        porcentagem.calcularAprovada();
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        for (int i = 0; i < alunos.size(); i++) {
            alunos.get(0).getIdade();

        }

        System.out.println("|||||||||||||||||||||||Desafios||||||||||||||||||||||||||||");
        porcentagem.mediaSala();
        porcentagem.maiorMenor();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");





    }
}
