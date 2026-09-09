
void main(String[] args) {
    Aluno aluno = new Aluno("João", 16);
    Aluno aluno1 = new Aluno("Kauan", 21);

    ArrayList<Aluno> listaAlunos = new ArrayList<>();
    listaAlunos.add(aluno);
    listaAlunos.add(aluno1);

    Escola senai = new Escola("Senai", listaAlunos);
    senai.mostrarAlunos();

    Prova p1 = new Prova();
    p1.materia = Materia.MATEMATICA;
    p1.nota = 10.0;

    Prova p2 = new Prova();
    p2.materia = Materia.PORTUGUES;
    p2.nota = 5.0;

    ArrayList<Prova> provasDoKauan = new ArrayList<>();
    provasDoKauan.add(p1);
    provasDoKauan.add(p2);

    aluno.provas = provasDoKauan;
    aluno.calcularMedia();
}
