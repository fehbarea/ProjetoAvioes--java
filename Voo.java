//Felipe Alves Barea RA: 2454343
public abstract class Voo {

    private String horSaida;
    private String horChegada;
    private String cidadeSaida;
    private String cidadeDestino;
    private int numPassageiros;
    private float tempoDeViagem;
    private int distancia;

    public Voo(String horSaida, String horChegada, String cidadeSaida, String cidadeDestino, int numPassageiros, float tempoDeViagem, int distancia) {
        this.horSaida = horSaida;
        this.horChegada = horChegada;
        this.cidadeSaida = cidadeSaida;
        this.cidadeDestino = cidadeDestino;
        this.numPassageiros = numPassageiros;
        this.tempoDeViagem = tempoDeViagem;
        this.distancia = distancia;
    }

    public Voo() {
        horSaida = null;
        horChegada = null;
        cidadeSaida = null;
        cidadeDestino = null;
        numPassageiros = 0;
        tempoDeViagem = 0;
        distancia = 0;
    }

    public String getHorSaida() {
        return horSaida;
    }

    public void setHorSaida(String horSaida) {
        this.horSaida = horSaida;
    }

    public String getHorChegada() {
        return horChegada;
    }

    public void setHorChegada(String horChegada) {
        this.horChegada = horChegada;
    }

    public String getCidadeSaida() {
        return cidadeSaida;
    }

    public void setCidadeSaida(String cidadeSaida) {
        this.cidadeSaida = cidadeSaida;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public float getTempoDeViagem() {
        return tempoDeViagem;
    }

    public void setTempoDeViagem(float tempoDeViagem) {
        this.tempoDeViagem = tempoDeViagem;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    
}

