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
    public void setCargo(String cargo) throws NaoNuloException{

        if(cargo.length() > 3){
            this.cargo = cargo;
        }

        else{
            throw new NaoNuloException();
        }
    
    }
    public int getLicenca() {
        return licenca;
    }
    public void setLicenca(int licenca) throws NaoNuloException {

        if(licenca != 0){
            this.licenca = licenca;
        }
        else{
            throw new NaoNuloException();
        }
    }

    

}
