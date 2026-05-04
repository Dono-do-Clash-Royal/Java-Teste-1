public class Familia {

    private Pessoa encarregadoEducacao;
    private String parentescoEncEducacao;
    private Pessoa aluno;



    // Getters and Setters
    public Pessoa getEncarregadoEducacao() {
        return encarregadoEducacao;
    }

    public void setEncarregadoEducacao(Pessoa encarregadoEducacao) {
        this.encarregadoEducacao = encarregadoEducacao;
    }

    public String getParentescoEncEducacao() {
        return parentescoEncEducacao;
    }

    public void setParentescoEncEducacao(String parentescoEncEducacao) {
        this.parentescoEncEducacao = parentescoEncEducacao;
    }

    public Pessoa getAluno() {
        return aluno;
    }

    public void setAluno(Pessoa aluno) {
        this.aluno = aluno;
    }

    public Familia() {
    }

    public Familia(Pessoa encarregadoEducacao, String parentescoEncEducacao, Pessoa aluno) {
        this.encarregadoEducacao = encarregadoEducacao;
        this.parentescoEncEducacao = parentescoEncEducacao;
        this.aluno = aluno;
    }

    public void getInfoEncEducacao() {
        System.out.println("Encarregado de Educação: " + this.encarregadoEducacao);
        System.out.println("Parentesco: " + this.parentescoEncEducacao);
        System.out.println("Encarregado(a) do(a) Aluno(a): " + this.aluno);

    }

    /*public void getInfoFamilia() {
        System.out.println("Codigo do Curso: " + encarregadoEducacao.toUpperCase());
        System.out.println("Curso: " + parentescoEncEducacao.toUpperCase());
        System.out.println("anoInicio: " + aluno.toUpperCase());
    }*/
}
