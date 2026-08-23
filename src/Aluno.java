public class Aluno {

    private String nomeAluno;
    private double[] notasAluno;

    public Aluno(String nomeAluno, int quantidadeProvas) {
        this.nomeAluno = nomeAluno;
        this.notasAluno = new double[quantidadeProvas];
    }

    public void adicionarNota(int numeroProva, double nota) {
        notasAluno[numeroProva] = nota;
    }

    public double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < notasAluno.length; i++) {
            soma=soma+notasAluno[i];
        }
        return soma / notasAluno.length;
    }
    public String getNomeAluno() {
        return nomeAluno;
    }
}