//Felipe Alves Barea RA: 2454343

public class NumGrdPsgException extends Exception {

    public void msgGrdException(){
        System.out.println("O voo precisa ter menos de 853 passageiro!!!");
    }

    public Nacional corrigeGrdNac(Nacional nacional){

        try{
            nacional.setNumPassageiros(Integer.parseInt(Leitura.entDados("Digite o numero de passageiros novamente")));
        }

        catch(NumGrdPsgException nge){
            nge.msgGrdException();
            corrigeGrdNac(nacional);
        }

        catch(NumberFormatException nfe){
            System.out.println("O valor precisa ser um numero inteiro");
            nacional = corrigeGrdNac(nacional);
        }

        catch(NumPeqPsgException npe){
            npe.msgPeqException();
            nacional = npe.corrigePeqNac(nacional);
        }

        return nacional;

    }

    public Internacional corrigeGrdInter(Internacional internacional){

        try{
            internacional.setNumPassageiros(Integer.parseInt(Leitura.entDados("Digite o numero de passageiros novamente")));
        }

        catch(NumGrdPsgException nge){
            nge.msgGrdException();
            corrigeGrdInter(internacional);
        }

        catch(NumberFormatException nfe){
            System.out.println(
                "O valor precisa ser um numero inteiro");
            internacional = corrigeGrdInter(internacional);
        }

        catch(NumPeqPsgException npe){
            npe.msgPeqException();
            internacional = npe.corrigePeqInter(internacional);
        }

        return internacional;

    }

    public Estadual CorrigeGrdEsta(Estadual estadual){

        try{
            estadual.setNumPassageiros(Integer.parseInt(Leitura.entDados("Digite o numero de passageiros novamente")));
        }

        catch(NumGrdPsgException nge){
            nge.msgGrdException();
            CorrigeGrdEsta( estadual);
        }

        catch(NumberFormatException nfe){
            System.out.println(
                "O valor precisa ser um numero inteiro");
            estadual = CorrigeGrdEsta( estadual);
        }

        catch(NumPeqPsgException npe){
            npe.msgPeqException();
            estadual = npe.corrigePeqEsta( estadual);
        }

        return  estadual;

    }

}
