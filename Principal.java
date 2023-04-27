//Felipe Alves Barea RA: 2454343
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Leitura leitura = new Leitura();

        System.out.println("----------------- Vamos cadastras a sua frota de aviões ------------------------");


        // Dados do aviao fabriante, modelo
        System.out.println("\n\n Vamos cadastras os dados sobre o aviao: \n\n");
        String fabricanteAviao = leitura.entDados("\nQual o fabricante do avião: ");
        String modeloAviao = leitura.entDados("\nQual modelo do avião: ");

        // dados do motor
        System.out.println("Agora digite sobre o motor: ");
        int quantidadeMotores = Integer.parseInt(leitura.entDados("\nQuantos motores possuem o avião: "));
        int PotenciaMotores = Integer.parseInt(leitura.entDados("\nQual potencia do avião: "));
        String fabricanteMotor = leitura.entDados("\nQual fabricante do motor: ");
        float consumoMotor = Float.parseFloat(leitura.entDados(("\nQual consumo total do motor: ")));

        Motor motor = new Motor(quantidadeMotores, PotenciaMotores, fabricanteMotor, consumoMotor);

        // dados do voo
        int op = Integer.parseInt(leitura.entDados("\n\nQual tipo de voo esse aviao fara: \n 1-Nacional \n 2-Internacional \n 3- Estadual \n\n"));
        
        Nacioanl nacioal = new Nacioanl();
        Internacional internacional = new Internacional();
        Estadual estadual = new Estadual();
        do {
            switch (op) {

                case 1:

                    System.out.println("\nVoce selecionou Nacional: \n\n");
                    String horaSaida1 = leitura.entDados("\nQual hora de saida? Digite no formato(dd/MM/yyyy)");
                    String horaChegada1 = leitura.entDados("\nQual a hora de chegada? Digite no formato(dd/MM/yyyy)");
                    String cidadeSaida1 = leitura.entDados("\nDe qual cidade o voo saira? ");
                    String cidadeChegada1 = leitura.entDados("\nPara qual cidade o voo ira");
                    int numPassageiros1 = Integer.parseInt(leitura.entDados("\nQuantos passageiros irão nesse voo? "));
                    float tempoDeViagem1 = Float.parseFloat(
                            leitura.entDados("Quanto tempo durará esse voo? (Responda em numero decimal) "));
                    int distancia1 = Integer.parseInt(leitura.entDados("Digite a distancia aproximada da viagem: "));
                    String estadoSaida = leitura.entDados("De qual estado você está saindo?");
                    String estadoDestino = leitura.entDados("Para qual Estado você está indo? ");

                    if (nacioal.verifica(estadoSaida, estadoDestino)) { 
                        nacioal = new Nacioanl(horaSaida1, horaChegada1, cidadeSaida1, cidadeChegada1, numPassageiros1, tempoDeViagem1, distancia1, estadoSaida, estadoDestino);
                        System.out.println("--------- Voo nacinal cadastrado com sucesso --------------");
                    } else {
                        
                        System.out.println("!!!!!!!!!!! O ESTADO DE SAIDA E DE DESTINO NÃO PODEM SER IGUAIS EM UM VOO NACIONAL !!!!!!!!!!!!!!!!!!!");
                        estadoSaida = leitura.entDados("De qual estado você está saindo?");
                        estadoDestino = leitura.entDados("Para qual Estado você está indo? ");
                        nacioal = new Nacioanl(horaSaida1, horaChegada1, cidadeSaida1, cidadeChegada1, numPassageiros1, tempoDeViagem1, distancia1, estadoSaida, estadoDestino);
                    
                    }

                    break;

                case 2:

                    System.out.println("\nVoce selecionou Internacional: \n\n");
                    String horaSaida2 = leitura.entDados("\nQual hora de saida? Digite no formato(dd/MM/yyyy)");
                    String horaChegada2 = leitura.entDados("\nQual a hora de chegada? Digite no formato(dd/MM/yyyy)");
                    String cidadeSaida2 = leitura.entDados("\nDe qual cidade o voo saira? ");
                    String cidadeChegada2 = leitura.entDados("\nPara qual cidade o voo ira");
                    int numPassageiros2 = Integer.parseInt(leitura.entDados("\nQuantos passageiros irão nesse voo? "));
                    float tempoDeViagem2 = Float.parseFloat(leitura.entDados("Quanto tempo durará esse voo? (Responda em numero decimal) "));
                    int distancia2 = Integer.parseInt(leitura.entDados("Digite a distancia aproximada da viagem: "));
                    String paisOrigem = leitura.entDados("De qual pais você esta saindo? ");
                    String paisDestino = leitura.entDados("Para qual pais vocÊ está indo? ");
                    internacional = new Internacional(horaSaida2, horaChegada2, cidadeSaida2, cidadeChegada2, numPassageiros2, tempoDeViagem2, distancia2, paisOrigem, paisDestino);
                    if (internacional.verifica(paisDestino, paisOrigem)) {
                        System.out.println("--------- Voo nacinal cadastrado com sucesso --------------");
                    } else {
                        System.out.println(
                                "!!!!!!!!!!! O pais DE SAIDA E DE DESTINO NÃO PODEM SER IGUAIS EM UM VOO NACIONAL !!!!!!!!!!!!!!!!!!!");
                        paisOrigem = leitura.entDados("De qual pais você esta saindo? ");
                        paisDestino = leitura.entDados("Para qual pais vocÊ está indo? ");
                        internacional.setPaisDestino(paisDestino);
                        internacional.setPaisOrigem(paisOrigem);
                    }

                    break;

                case 3:

                    System.out.println("\nVoce selecionou Estadual: \n\n");
                    String horaSaida3 = leitura.entDados("\nQual hora de saida? Digite no formato(dd/MM/yyyy)");
                    String horaChegada3 = leitura.entDados("\nQual a hora de chegada? Digite no formato(dd/MM/yyyy)");
                    String cidadeSaida3 = leitura.entDados("\nDe qual cidade o voo saira? ");
                    String cidadeChegada3 = leitura.entDados("\nPara qual cidade o voo ira");
                    int numPassageiros3 = Integer.parseInt(leitura.entDados("\nQuantos passageiros irão nesse voo? "));
                    float tempoDeViagem3 = Float.parseFloat( leitura.entDados("\nQuanto tempo durará esse voo? (Responda em numero decimal) "));
                    int distancia3 = Integer.parseInt(leitura.entDados("\nDigite a distancia aproximada da viagem: "));
                    String estado = leitura.entDados("\nEm Qual estado o voo ocorre? ");
                    String porteAeroportoSaida = leitura.entDados("\nQual porte do aeroporto de saida? ");
                    String porteAeroportoChegada = leitura.entDados("\nQual porte do aeroporto de chegada? ");

                    estadual = new Estadual(horaSaida3, horaChegada3, cidadeSaida3, cidadeChegada3,numPassageiros3, tempoDeViagem3, distancia3, estado, porteAeroportoSaida,porteAeroportoChegada);
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        } while (op > 4 || op == 0);

        //Adicona Tripulates
        System.out.println("\n\n Por ultimo vamos vadastrar os tripulates e passageiros");

        int i = Integer.parseInt(leitura.entDados("Quatos tripulates deseja cadastrar? "));
        List<Tripulante> tripulantes = new ArrayList<>();
        for(int c = 0; c < i; c++){
            String nomeTripu = leitura.entDados("\nDigite o nome: ");
            String cpf = leitura.entDados("Digite o CPF: ");
            String cargo = leitura.entDados("Qual o cargo: ");
            int licenca = Integer.parseInt(leitura.entDados("Digite a licena para o cargo: "));
            Tripulante trip = new Tripulante(cpf, nomeTripu, cargo, licenca);
            
            tripulantes.add(trip);
        }

        //adiciona passageiros 
        List<Passageiro> passageiros = new ArrayList<>();

        i = Integer.parseInt(leitura.entDados("Quatos Passageiros deseja cadastrar? "));
        for(int c = 0; c < i; c++){
            String nomepass = leitura.entDados("Digite o nome: ");
            String cpfpass = leitura.entDados("DiGITE O CPF: ");
            String assento = leitura.entDados("Qual o assento do passageiro: ");
            String ticket = leitura.entDados("Qual o ticket: ");
            if(op == 2){
                int numPassaporte = Integer.parseInt("Qual numero do passaporte? ");
                Passageiro pass = new Passageiro(cpfpass, nomepass, assento, ticket, numPassaporte);
                passageiros.add(pass);
            }
            else{
                Passageiro pass = new Passageiro(cpfpass, nomepass, assento, ticket);
                passageiros.add(pass);
            }
        }

        Aviao aviao = new Aviao();
        if(op == 1){
            aviao = new Aviao(motor, fabricanteAviao,nacioal, modeloAviao,  passageiros, tripulantes);
        }
        else if(op == 2){
            aviao = new Aviao(motor, fabricanteAviao, internacional, modeloAviao, passageiros, tripulantes);
        }
        else if(op == 3){
            aviao = new Aviao(motor, fabricanteAviao, estadual, modeloAviao, passageiros, tripulantes);
        }

        System.out.println("\n\n\n\n Apresentando os dados cadastrados: ");
        System.out.println("\nMotor: \n");
        System.out.println("Quantidade de motores: " + aviao.getMotor().getQuantidade());
        System.out.println("Consumo:  " + aviao.getMotor().getConsumo());
        System.out.println("Potencia: " + aviao.getMotor().getPotencia());
        System.out.println("Fabricate do motor: "+aviao.getMotor().getFabricanteMotor());

        System.out.println("\n Aviao \n");
        System.out.println("Modelo do avia: " + aviao.getModelo());
        System.out.println("Fabricante: " + aviao.getFabricanteAviao());

        System.out.println("\n VOO: \n");
        if(op == 1){
            System.out.println("Hora de saida: " + aviao.getNacional().getHorSaida());
            System.out.println("Hora de chegada: "+ aviao.getNacional().getHorChegada());
            System.out.println("Cidade de saida: "+ aviao.getNacional().getCidadeSaida());
            System.out.println("Cidade de Destino: "+ aviao.getNacional().getCidadeDestino());
            System.out.println("Tempo de viagem: "+ aviao.getNacional().getTempoDeViagem());
            System.out.println("Distacia: "+ aviao.getNacional().getDistancia());
            System.out.println("Numero de pasageiros: " + aviao.getNacional().getNumPassageiros());

            System.out.println("Estado de saida: "+ aviao.getNacional().getEstadoSaida());
            System.out.println("Cidade de destino: " + aviao.getNacional().getEstadoDestino());
        }
        else if(op == 2){

            System.out.println("Hora de saida: " + aviao.getInternacional().getHorSaida());
            System.out.println("Hora de chegada: "+ aviao.getInternacional().getHorChegada());
            System.out.println("Cidade de saida: "+ aviao.getInternacional().getCidadeSaida());
            System.out.println("Cidade de Destino: "+ aviao.getInternacional().getCidadeDestino());
            System.out.println("Tempo de viagem: "+ aviao.getInternacional().getTempoDeViagem());
            System.out.println("Distacia: "+ aviao.getInternacional().getDistancia());
            System.out.println("Numero de pasageiros: " + aviao.getInternacional().getNumPassageiros());

            System.out.println("Pais de origem: "+ aviao.getInternacional().getPaisOrigem());
            System.out.println("Pais de destino: "+ aviao.getInternacional().getPaisDestino());

        }
        else if(op == 3){
            System.out.println("Hora de saida: " + aviao.getEstadual().getHorSaida());
            System.out.println("Hora de chegada: "+ aviao.getEstadual().getHorChegada());
            System.out.println("Cidade de saida: "+ aviao.getEstadual().getCidadeSaida());
            System.out.println("Cidade de Destino: "+ aviao.getEstadual().getCidadeDestino());
            System.out.println("Tempo de viagem: "+ aviao.getEstadual().getTempoDeViagem());
            System.out.println("Distacia: "+ aviao.getEstadual().getDistancia());
            System.out.println("Numero de pasageiros: " + aviao.getEstadual().getNumPassageiros());

            System.out.println("Estado do voo: " + aviao.getEstadual().getEstado());
            System.out.println("Porte aeroporto de saida: "  + aviao.getEstadual().getPorteAeroportoSaida());
            System.out.println("Porte aeroporto de destino: " + aviao.getEstadual().getPorteAeroportoDestino());
        }

        System.out.println("\nPassageiros: ");
        for (Passageiro cada : aviao.getPassageiros()) {
            System.out.println("Nome: " + cada.getNome());
            System.out.println("CPF: " + cada.getCPF());
            System.out.println("Assento: " + cada.getAssento());
            System.out.println("Ticket: " + cada.getTicket());
            System.out.println("\n");
        }

        System.out.println("\nTripulante: ");
        for (Tripulante cada : aviao.getTripulante()) {
            System.out.println("Nome: " + cada.getNome());
            System.out.println("CPF: "+ cada.getCPF());
            System.out.println("Cargo: " + cada.getCargo());
            System.out.println("Licenca: " + cada.getLicenca());

        }
    }
}
