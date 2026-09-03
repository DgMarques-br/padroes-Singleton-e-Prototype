public class Certificado implements Cloneable {
    private String nomeCurso;
    private String nomeAluno;

    public Certificado(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        this.nomeAluno = ""; // Nome do aluno em branco conforme o roteiro
    }

    public Certificado clonar() {
        try {
            return (Certificado) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Erro ao clonar o certificado.");
            return null;
        }
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getDados() {
        return "Certificado do curso " + this.nomeCurso + " conferido a " + this.nomeAluno;
    }
}