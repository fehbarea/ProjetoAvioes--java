//Felipe Alves Barea RA: 2454343
public final class Tripulante extends Pessoa {
    
    private String cargo;
    private int licenca;


    public Tripulante(){
        cargo = null;
        licenca = 0;
    }

    public Tripulante(String CPF, String nome, String cargo, int licenca) {
        super(CPF, nome);
        this.cargo = cargo;
        this.licenca = licenca;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public int getLicenca() {
        return licenca;
    }
    public void setLicenca(int licenca) {
        this.licenca = licenca;
    }

    

}
