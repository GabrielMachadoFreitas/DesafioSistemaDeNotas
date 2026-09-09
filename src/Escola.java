import java.util.ArrayList;

public class Escola {
    String nome;
    ArrayList<Aluno> alunos;

    public Escola(String nome, ArrayList<Aluno> alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void mostrarAlunos() {
        for (Aluno al : alunos) {
            System.out.println("\nAluno: ");
            System.out.println(" Nome: " + al.nome);
            System.out.println(" Idade: " + al.idade);
        }

    }
}
