//Felipe Alves Barea RA: 2454343
public class Motor {
    
    private int quantidade;
    private int potencia;
    private String fabricanteMotor;
    private float consumo;

    public Motor(int quantidade, int potencia, String fabricante, float consumo) {
        this.quantidade = quantidade;
        this.potencia = potencia;
        this.fabricanteMotor = fabricante;
        this.consumo = consumo;
    }

    public Motor(){

        quantidade = 0;
        potencia = 0;
        fabricanteMotor = null;
        consumo = 0;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getFabricanteMotor() {
        return fabricanteMotor;
    }

    public void setFabricanteMotor(String fabricante) {
        this.fabricanteMotor = fabricante;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

}
