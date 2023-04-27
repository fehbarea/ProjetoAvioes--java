//Felipe Alves Barea RA: 2454343
public final class Passageiro extends Pessoa{
    
    private String assento;
    private String ticket;
    private int numPassaporte;
    
    //sobrecarga
    public Passageiro() {
        assento = null;
        ticket = null;
        numPassaporte = 0;
    }
    //sobrecarga
    public Passageiro(String CPF, String nome, String assento, String ticket, int numPassaporte) {
        super(CPF, nome);
        this.assento = assento;
        this.ticket = ticket;
        this.numPassaporte = numPassaporte;
    }
    //sobrecarga
    public Passageiro(String CPF, String nome, String assento, String ticket) {
        super(CPF, nome);
        this.assento = assento;
        this.ticket = ticket;
    }

    public String getAssento() {
        return assento;
    }

    public String getTicket() {
        return ticket;
    }

    public int getNumPassaporte() {
        return numPassaporte;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public void setNumPassaporte(int numPassaporte) {
        this.numPassaporte = numPassaporte;
    }
    

    
}
