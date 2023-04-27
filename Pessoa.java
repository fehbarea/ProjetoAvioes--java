//Felipe Alves Barea RA: 2454343
public abstract class Pessoa {
    
    private String CPF;
    private String nome;

    public Pessoa(String CPF, String nome) {
        this.CPF = CPF;
        this.nome = nome;
    }

    public Pessoa() {
        CPF = null;
        nome = null;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
