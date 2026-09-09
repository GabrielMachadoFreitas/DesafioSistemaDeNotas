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
        Double mediaTotal = 0.0;
        for(Prova p: provas){
            mediaTotal += p.nota;
        }
        mediaTotal /= provas.size();
        System.out.println("\nmédia total: " + mediaTotal);
    }
    public void adicionarProva (){
    }
    public void exibirInfoAluno () {

    }
}
