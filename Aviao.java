//Felipe Alves Barea RA: 2454343
import java.util.List;

public class Aviao {
    
    private Motor motor;
    private String fabricanteAviao;
    private String modelo;

    private Estadual estadual;
    private Internacional internacional;
    private Nacioanl nacional;
    
    private List<Passageiro> passageiros;
    private List<Tripulante> tripulante;
    
    public Aviao(){
        motor = null;
        fabricanteAviao = null;
        estadual = null;
        internacional = null;
        nacional = null;
        passageiros = null;
        tripulante = null;
        modelo = null;

    }
    public Aviao(Motor motor, String fabricanteAviao, Nacioanl nacional,String modelo, List<Passageiro> passageiros, List<Tripulante> tripulante) {
        this.motor = motor;
        this.fabricanteAviao = fabricanteAviao;
        this.nacional = nacional;
        this.passageiros = passageiros;
        this.tripulante = tripulante;
        this.modelo = modelo;
        estadual = null;
        internacional = null;
    }

    public Aviao(Motor motor, String fabricanteAviao, Internacional internacional,String modelo, List<Passageiro> passageiros,List<Tripulante> tripulante) {
        this.motor = motor;
        this.fabricanteAviao = fabricanteAviao;
        this.internacional = internacional;
        this.passageiros = passageiros;
        this.tripulante = tripulante;
        this.modelo = modelo;
        estadual = null;
        nacional = null;
    }

    public Aviao(Motor motor, String fabricanteAviao, Estadual estadual, String modelo, List<Passageiro> passageiros, List<Tripulante> tripulante) {
        this.motor = motor;
        this.fabricanteAviao = fabricanteAviao;
        this.estadual = estadual;
        this.passageiros = passageiros;
        this.tripulante = tripulante;
        this.modelo = modelo;
        internacional = null;
        nacional = null;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getFabricanteAviao() {
        return fabricanteAviao;
    }

    public Estadual getEstadual() {
        return estadual;
    }

    public Internacional getInternacional() {
        return internacional;
    }

    public Nacioanl getNacional() {
        return nacional;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public List<Tripulante> getTripulante() {
        return tripulante;
    }

    public String getModelo(){
        return modelo;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setFabricanteAviao(String fabricanteAviao) {
        this.fabricanteAviao = fabricanteAviao;
    }

    public void setEstadual(Estadual estadual) {
        this.estadual = estadual;
    }

    public void setInternacional(Internacional internacional) {
        this.internacional = internacional;
    }

    public void setNacional(Nacioanl nacional) {
        this.nacional = nacional;
    }

    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    public void setTripulante(List<Tripulante> tripulante) {
        this.tripulante = tripulante;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    
    public float calcCombNec(){

        if(nacional != null){
            return nacional.getDistancia() * motor.getConsumo();
        }
        else if(internacional != null){

            return internacional.getDistancia() * motor.getConsumo();
        }
        else if(estadual != null){
            return estadual.getDistancia() * motor.getConsumo();
        }
        else{
            return 0;
        }
    }

    public void excluiPassageiros(){

        passageiros.clear();
    }

    public void excluiTripulante(){

        tripulante.clear();
    }

    public Passageiro procuraPassageiro(String ticketPorcurado){

        for (Passageiro cadaPassageiro : passageiros) {
            
            if(cadaPassageiro.getTicket().equals(ticketPorcurado)){

                Passageiro pass = cadaPassageiro;
                return pass;
            }
            
        }
        return null;
    }



}
