import java.util.Calendar;
public class Pessoa {
    
    public int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    private int numeroCC;
    private String nomeProprio;
    private String nomeApelido;
    private int anoNascimento;
    private int mesNascimento;
    private int diaNascimento;

    public int getNumeroCC() {
        return numeroCC;
    }
    public String getNomeProprio() {
        return nomeProprio;
    }
    public String getNomeApelido() {
        return nomeApelido;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public int getMesNascimento() {
        return mesNascimento;
    }
    public int getDiaNascimento() {
        return diaNascimento;
    }


    public void setNumeroCC(int numeroCC) {
        this.numeroCC = numeroCC;
    }
    public void setNomeProprio(String nomeProprio) {
        this.nomeProprio = nomeProprio;
    }
    public void setNomeApelido(String nomeApelido) {
        this.nomeApelido = nomeApelido;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }
    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }
    public Pessoa() {
        this.numeroCC = 0;
        this.nomeProprio = "";
        this.nomeApelido = "";
        this.anoNascimento = 0;
        this.mesNascimento = 0;
        this.diaNascimento = 0;       
    }

    public Pessoa(int numeroCC, String nomeProprio, String nomeApelido, int anoNascimento, int mesNascimento,
            int diaNascimento) {
        this.numeroCC = numeroCC;
        this.nomeProprio = nomeProprio;
        this.nomeApelido = nomeApelido;
        this.anoNascimento = anoNascimento;
        this.mesNascimento = mesNascimento;
        this.diaNascimento = diaNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa [numeroCC=" + numeroCC + ", nomeProprio=" + nomeProprio + ", nomeApelido=" + nomeApelido
                + ", anoNascimento=" + anoNascimento + ", mesNascimento=" + mesNascimento + ", diaNascimento="
                + diaNascimento + "]";
    }

    
    
    public String getNomeCompleto() {
        System.out.println("Nome do(a) aluno(a): " + this.nomeProprio + " " + this.nomeApelido);
        return this.nomeProprio + " " + this.nomeApelido;
    }

    public String getIdade() { 
        System.out.println("Idade do(a) aluno(a): " + (currentYear - this.anoNascimento));
        return "Idade do(a) aluno(a): " + (currentYear - this.anoNascimento);
    }

}