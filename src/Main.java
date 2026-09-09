
void main(String[] args) {
    Aluno aluno1 = new Aluno("Kauan", 21);
    Aluno aluno2 = new Aluno("João", 16);

    ArrayList<Aluno> listaAlunos = new ArrayList<>();
    listaAlunos.add(aluno1);
    listaAlunos.add(aluno2);

    Escola senai = new Escola("Senai", listaAlunos);

    Prova p1 = new Prova();
    p1.materia = Materia.MATEMATICA;
    p1.nota = 10.0;

    Prova p2 = new Prova();
    p2.materia = Materia.PORTUGUES;
    p2.nota = 5.0;

    Prova p3 = new Prova();
    p3.materia = Materia.GEOGRAFIA;
    p3.nota = 7.0;

    Prova p4 = new Prova();
    p4.materia = Materia.MATEMATICA;
    p4.nota = 5.0;

    ArrayList<Prova> provasDoKauan = new ArrayList<>();
    provasDoKauan.add(p1);
    provasDoKauan.add(p2);
    senai.mostrarAlunos();

    aluno2.provas = provasDoKauan;
    aluno2.calcularMedia();

    ArrayList<Prova> provasDoJoao = new ArrayList<>();
    provasDoJoao.add(p3);
    provasDoJoao.add(p4);

    aluno1.provas = provasDoJoao;
    aluno1.calcularMedia();


}
