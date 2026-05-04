public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pessoa João = new Pessoa();
        João.setNumeroCC(12345678);
        João.setNomeProprio("João");
        João.setNomeApelido("Xavier");
        João.setAnoNascimento(2010);
        João.setMesNascimento(3);
        João.setDiaNascimento(15);


        Pessoa Maria = new Pessoa();
        Maria.setNumeroCC(12345678);
        Maria.setNomeProprio("Maria");
        Maria.setNomeApelido("Xavier");
        Maria.setAnoNascimento(2012);
        Maria.setMesNascimento(6);
        Maria.setDiaNascimento(20);

        Familia familia1 = new Familia();
        familia1.setEncarregadoEducacao(Maria);
        familia1.setParentescoEncEducacao("Mãe");  
        familia1.setAluno(João);

        João.getNomeCompleto();
        João.getIdade();

        Maria.getNomeCompleto();
        Maria.getIdade();

        familia1.getInfoEncEducacao();
        /*familia1.getInfoFamilia();*/
    }
}
