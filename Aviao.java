//Felipe Alves Barea RA: 2454343
import java.util.List;

public class Aviao {
    
    private Motor motor;
    private String fabricanteAviao;
    private String modelo;
    private String codAviao;
    private int tipoVoo;

    private Estadual estadual;
    private Internacional internacional;
    private Nacional nacional;
    
    private List<Passageiro> passageiros;
    private List<Tripulante> tripulante;
    
    //sobrecarga
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
    //sobrecarga
    public Aviao(Motor motor, String fabricanteAviao, Nacional nacional,String modelo, List<Passageiro> passageiros, List<Tripulante> tripulante) {
        this.motor = motor;
        this.fabricanteAviao = fabricanteAviao;
        this.nacional = nacional;
        this.passageiros = passageiros;
        this.tripulante = tripulante;
        this.modelo = modelo;
        estadual = null;
        internacional = null;
    }
    //sobrecarga
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
    //sobrecarga
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

    public String getCodAviao(){
        return codAviao;
    }

    public void setCodAviao(String codAviao){
        this.codAviao = codAviao;
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

    public Nacional getNacional() {
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

    public void setNacional(Nacional nacional) {
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
    public int getTipoVoo() {
        return tipoVoo;
    }
    public void setTipoVoo(int tipoVoo) {
        this.tipoVoo = tipoVoo;
    }



    
    public float calcCombNec(){

        if(tipoVoo == 1) {

            return nacional.getTempoDeViagem() * motor.getConsumo();

        }
        else if(tipoVoo == 2) {

            return internacional.getTempoDeViagem() * motor.getConsumo();

        }
        else if(tipoVoo == 3) {

            return estadual.getTempoDeViagem() * motor.getConsumo();

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

}
