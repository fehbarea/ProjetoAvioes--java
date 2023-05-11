//Felipe Alves Barea RA: 2454343

public class Principal {

    static Banco banco = Banco.getBanco();

    static Aviao aviao = new Aviao();

    public static void main(String[] args) {

        int op;

        do{
            System.out.println("Escolhas uma das opcoes baixo: ");
            System.out.println("\n 1 - cadastrar avioes;");
            System.out.println("\n 2 - imprimir tudo;");
            System.out.println("\n 3 - Procura o voo de um passageiro;");
            System.out.println("\n 4 - Procura voo de um tripulante;");
            System.out.println("\n 5 - Calcula o combustivel necessario para cada voo;");
            System.out.println("\n 6 - Exclui todos os tripulantes de um voo");
            System.out.println("\n 7 - Exclui todos os passageitos de um voo");
            System.out.println("\n 0 - sair");

            try{
                op = Integer.parseInt(Leitura.entDados("\n Digite o numero opcao desejada"));
            }
            catch(NumberFormatException nfe){
                
                op = Integer.parseInt(Leitura.entDados("\n Digite o numero(Inteiro) opcao desejada"));op = Integer.parseInt(Leitura.entDados("\n Digite o numero da opcao desejada"));

            }

            switch (op) {

                case 1:

                    banco.cadastraAvioes();
                    break;

                case 2: 

                    Banco.imprimeDados();

                break;

                case 3: 

                    String cpf = Leitura.entDados("Digite o CPF do passageiro");
                    banco.procuraVooDePassageiro(cpf);

                break;
                
                case 4: 
                    
                    int licenca = Integer.parseInt(Leitura.entDados("Digite a liceca do tripulante"));
                    banco.procuraVooDeTripulante(licenca);
                break;

                case 5:

                    banco.consumoViagem();
                
                break;
                
                case 6 :

                    banco.excluiTodosTripulantes(Leitura.entDados("Digite o codigo do Voo: "));
                
                break;

                case 7: 

                    banco.excluiTodosPassageiros(Leitura.entDados("Digite o codigo do Voo: "));

                break;

                case 0:

                    System.out.println("\n\n\n Tchau!");
                    
                break;

                default:
                    System.out.println("\n Opcao errada!!!!!!");
                    break;
            }

        }while(op >0);
        
        
    }

}
