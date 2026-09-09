import java.util.ArrayList;

public class Aluno {
    String nome;
    Integer idade;
    ArrayList<Prova> provas;
    Double media;

    public Aluno(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public void calcularMedia(){
        for(Prova p: provas){
            for (int i = 0; i < provas.size(); i++) {}
                media = p.nota;
            System.out.println(media);
        }
        System.out.println("Tamanho da lista: " + provas.size());
    }
    public void adicionarProva(Prova prova){
    }
    public void exibirInfoAluno () {

    }
}
