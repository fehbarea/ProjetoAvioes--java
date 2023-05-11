//Felipe Alves Barea RA: 2454343
public final class Nacional  extends Voo implements VerificaChegadaSaida{
    
    private String estadoSaida;
    private String estadoDestino;

    //sobrecarga
    public Nacional(String estadoSaida, String estadoDestino) {
        this.estadoSaida = estadoSaida;
        this.estadoDestino = estadoDestino;
    }

    //sobrecarga
    public Nacional(String horSaida, String horChegada, String cidadeSaida, String cidadeDestino, int numPassageiros, float tempoDeViagem, int distancia, String estadoSaida, String estadoDestino) {
        super(horSaida, horChegada, cidadeSaida, cidadeDestino, numPassageiros, tempoDeViagem, distancia);
        this.estadoSaida = estadoSaida;
        this.estadoDestino = estadoDestino;
    }

    //sobrecarga
    public Nacional() {
        estadoSaida = null;
        estadoDestino = null;
    }

    public void setEstadoSaida(String estadoSaida) {
        this.estadoSaida = estadoSaida;
    }
    public void setEstadoDestino(String estadoDestino) {
        this.estadoDestino = estadoDestino;
    }
    public String getEstadoSaida() {
        return estadoSaida;
    }
    public String getEstadoDestino() {
        return estadoDestino;
    }

    //sobreescrita
    public boolean verifica(String Saida, String Destino){
        if(Destino.equals(Saida)){
            return false;
        }
        return true;
    }

}
