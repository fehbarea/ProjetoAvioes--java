//Felipe Alves Barea RA: 2454343
public final class Estadual extends Voo {

    private String estado;
    private String porteAeroportoSaida;
    private String porteAeroportoDestino;

    //sobrecarga
    public Estadual(String estado, String porteAeroportoSaida, String porteAeroportoDestino) {
        this.estado = estado;
        this.porteAeroportoSaida = porteAeroportoSaida;
        this.porteAeroportoDestino = porteAeroportoDestino;
    }
    //sobrecarga
    public Estadual(String horSaida, String horChegada, String cidadeSaida, String cidadeDestino, int numPassageiros, float tempoDeViagem, int distancia, String estado, String porteAeroportoSaida,
            String porteAeroportoDestino) {
        super(horSaida, horChegada, cidadeSaida, cidadeDestino, numPassageiros, tempoDeViagem, distancia);
        this.estado = estado;
        this.porteAeroportoSaida = porteAeroportoSaida;
        this.porteAeroportoDestino = porteAeroportoDestino;
    }

    public Estadual() {
        estado = null;
        porteAeroportoSaida = null;
        porteAeroportoDestino = null;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getPorteAeroportoSaida() {
        return porteAeroportoSaida;
    }
    public void setPorteAeroportoSaida(String porteAeroportoSaida) {
        this.porteAeroportoSaida = porteAeroportoSaida;
    }
    public String getPorteAeroportoDestino() {
        return porteAeroportoDestino;
    }
    public void setPorteAeroportoDestino(String porteAeroportoDestino) {
        this.porteAeroportoDestino = porteAeroportoDestino;
    }

}
