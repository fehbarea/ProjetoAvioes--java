//Felipe Alves Barea RA: 2454343
public final class Internacional extends Voo implements VerificaChegadaSaida {

    private String paisOrigem;
    private String paisDestino;

    //sobrecarga
    public Internacional(String paisOrigem, String paisDestino) {
        this.paisOrigem = paisOrigem;
        this.paisDestino = paisDestino;
    }

    //sobrecarga
    public Internacional(String horSaida, String horChegada, String cidadeSaida, String cidadeDestino, int numPassageiros, float tempoDeViagem, int distancia, String paisOrigem, String paisDestino) {
        super(horSaida, horChegada, cidadeSaida, cidadeDestino, numPassageiros, tempoDeViagem, distancia);
        this.paisOrigem = paisOrigem;
        this.paisDestino = paisDestino;
    }
    public Internacional() {
        paisOrigem = null;
        paisDestino = null;
    }
    public String getPaisOrigem() {
        return paisOrigem;
    }
    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
    public String getPaisDestino() {
        return paisDestino;
    }
    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    //sobreescrita
    public boolean verifica(String Saida, String Destino){

        if( Saida.equals(Destino)){
            return false;
        }
        return true ;
    }
}
