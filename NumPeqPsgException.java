//Felipe Alves Barea RA: 2454343

public class NumPeqPsgException extends Exception{

    public void msgPeqException(){
        System.out.println(
             "O voo precisa ter pelo menos 1 passageiro!!!");
    }

    public Nacional corrigePeqNac(Nacional nacional){

        try{
            nacional.setNumPassageiros(Integer.parseInt(Leitura.entDados("Digite o numero de passageiros novamente")));
        }

        catch(NumPeqPsgException npe){
            msgPeqException();
            nacional = corrigePeqNac(nacional);
        }

        catch(NumberFormatException nfe){
            System.out.println(
                 "O valor precisa ser um numero inteiro");
            nacional = corrigePeqNac(nacional);
        }

        catch(NumGrdPsgException nge){
            nge.msgGrdException();
            nacional = nge.corrigeGrdNac(nacional);
        }
        return nacional;

    }

    public Internacional corrigePeqInter(Internacional internacional){

        try{
            internacional.setNumPassageiros(Integer.parseInt(Leitura.entDados("Digite o numero de passageiros novamente")));
        }

        catch(NumPeqPsgException npe){
            msgPeqException();
            internacional = corrigePeqInter(internacional);
        }
        catch(NumberFormatException nfe){
            System.out.println(
                 "O valor precisa ser um numero inteiro");
            internacional = corrigePeqInter(internacional);
        }
        
        catch(NumGrdPsgException nge){
            nge.msgGrdException();
            internacional = nge.corrigeGrdInter(internacional);
        }
        return internacional;

    }

    public Estadual corrigePeqEsta(Estadual estadual){

        try{
            estadual.setNumPassageiros(Integer.parseInt(Leitura.entDados("Digite o numero de passageiros novamente")));
        }

        catch(NumPeqPsgException npe){
            msgPeqException();
            estadual = corrigePeqEsta(estadual);
        }
        catch(NumberFormatException nfe){
            System.out.println(
                 "O valor precisa ser um numero inteiro");
            estadual = corrigePeqEsta(estadual);
        }
        catch(NumGrdPsgException nge){
            nge.msgGrdException();
            estadual = nge.CorrigeGrdEsta(estadual);
        }
        return estadual;

    }

    
}
