//Felipe Alves Barea RA: 2454343

public class NaoNuloException extends Exception {
    
    public void msgLinNuloException(){
        System.out.println("O tripulate precisa ter licenca!!");
    }

    public void msgCargNuloException(){
        System.out.println("O tripulate precisa ter um cargo com mais de 3 letra!!");
    }

    public Tripulante corrigeLicenca(Tripulante tripulante){

        try{
            tripulante.setLicenca(Integer.parseInt(Leitura.entDados("Digite a licenca!!")));
        }

        catch(NaoNuloException nne){
            nne.msgLinNuloException();
            nne.corrigeLicenca(tripulante);
        }
        return tripulante;
    }

    public Tripulante corrigeCargo(Tripulante tripulante){

        try{
            tripulante.setCargo(Leitura.entDados("Digite o cargo!!"));
        }

        catch(NaoNuloException nne){
            nne.msgCargNuloException();
            nne.corrigeCargo(tripulante);
        }

        return tripulante;
    }

    

}
