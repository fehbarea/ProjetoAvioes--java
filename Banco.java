
//Felipe Alves Barea RA: 2454343
import java.util.ArrayList;
import java.util.List;

public class Banco {

    static Aviao aviao = new Aviao();
    static List<Aviao> listaAvioes = new ArrayList<Aviao>();

    static Banco bancoAvioes;

    private Banco() {

    }

    public static Banco getBanco() {

        if (bancoAvioes == null) {
            bancoAvioes = new Banco();
        }

        return bancoAvioes;
    }

    public static void cadastraAvioes() {

        // Dados do aviao fabriante, modelo
        System.out.println("\n\n Vamos cadastras os dados sobre o aviao: \n\n");
        String fabricanteAviao = Leitura.entDados("\nQual o fabricante do avião: ");
        String modeloAviao = Leitura.entDados("\nQual modelo do avião: ");
        String codAviao = Leitura.entDados("Digite o código desse aviao: ");

        // dados do motor
        System.out.println("Agora digite sobre o motor: ");
        int quantidadeMotores = Integer.parseInt(Leitura.entDados("\nQuantos motores possuem o avião: "));
        int PotenciaMotores = Integer.parseInt(Leitura.entDados("\nQual potencia do avião: "));
        String fabricanteMotor = Leitura.entDados("\nQual fabricante do motor: ");
        float consumoMotor = Float.parseFloat(Leitura.entDados(("\nQual consumo total do motor(kg/h): ")));

        Motor motor = new Motor();
        motor.setQuantidade(quantidadeMotores);
        motor.setPotencia(PotenciaMotores);
        motor.setFabricanteMotor(fabricanteMotor);
        motor.setConsumo(consumoMotor);

        // dados do voo
        int tipoVoo = Integer.parseInt(Leitura.entDados(
                "\n\nQual tipo de voo esse aviao fara: \n 1-Nacional \n 2-Internacional \n 3- Estadual \n\n"));

        Nacional nacional = new Nacional();
        Internacional internacional = new Internacional();
        Estadual estadual = new Estadual();
        do {
            switch (tipoVoo) {

                case 1:

                    System.out.println("\nVoce selecionou Nacional: \n\n");
                    String horaSaida1 = Leitura.entDados("\nQual hora de saida? ");
                    String horaChegada1 = Leitura.entDados("\nQual a hora de chegada?");
                    String cidadeSaida1 = Leitura.entDados("\nDe qual cidade o voo saira? ");
                    String cidadeChegada1 = Leitura.entDados("\nPara qual cidade o voo ira");

                    try {
                        nacional.setNumPassageiros(
                                Integer.parseInt(Leitura.entDados("\nQuantos passageiros são suportados nesse voo? ")));
                    } catch (NumPeqPsgException npe) {
                        npe.msgPeqException();
                        npe.corrigePeqNac(nacional);
                    } catch (NumGrdPsgException nge) {
                        nge.msgGrdException();
                        nacional = nge.corrigeGrdNac(nacional);
                    }
                    float tempoDeViagem1 = Float.parseFloat(
                            Leitura.entDados("Quanto tempo durará esse voo? (Responda em numero decimal) "));
                    int distancia1 = Integer.parseInt(Leitura.entDados("Digite a distancia aproximada da viagem: "));
                    String estadoSaida = Leitura.entDados("De qual estado você está saindo?");
                    String estadoDestino = Leitura.entDados("Para qual Estado você está indo? ");

                    nacional.setHorSaida(horaSaida1);
                    nacional.setHorChegada(horaChegada1);
                    nacional.setCidadeSaida(cidadeSaida1);
                    nacional.setCidadeDestino(cidadeChegada1);
                    nacional.setTempoDeViagem(tempoDeViagem1);
                    nacional.setDistancia(distancia1);

                    do {

                        if (nacional.verifica(estadoSaida, estadoDestino)) {

                            nacional.setEstadoSaida(estadoSaida);
                            nacional.setEstadoDestino(estadoDestino);

                            System.out.println("--------- Voo nacinal cadastrado com sucesso --------------");
                        } else {

                            System.out.println(
                                    "!!!!!!!!!!! O ESTADO DE SAIDA E DE DESTINO NÃO PODEM SER IGUAIS EM UM VOO NACIONAL !!!!!!!!!!!!!!!!!!!");
                            estadoSaida = Leitura.entDados("De qual estado você está saindo?");
                            estadoDestino = Leitura.entDados("Para qual Estado você está indo? ");
                            nacional.setEstadoSaida(estadoSaida);
                            nacional.setEstadoDestino(estadoDestino);

                        }

                    } while (nacional.verifica(estadoSaida, estadoDestino) == false);
                    break;

                case 2:

                    System.out.println("\nVoce selecionou Internacional: \n\n");
                    String horaSaida2 = Leitura.entDados("\nQual hora de saida?");
                    String horaChegada2 = Leitura.entDados("\nQual a hora de chegada?");
                    String cidadeSaida2 = Leitura.entDados("\nDe qual cidade o voo saira? ");
                    String cidadeChegada2 = Leitura.entDados("\nPara qual cidade o voo ira");

                    try {
                        internacional.setNumPassageiros(
                                Integer.parseInt(Leitura.entDados("\nQuantos passageiros irão nesse voo? ")));
                    } catch (NumGrdPsgException nge) {
                        nge.msgGrdException();
                        nge.corrigeGrdInter(internacional);
                    } catch (NumPeqPsgException npe) {
                        npe.msgPeqException();
                        internacional = npe.corrigePeqInter(internacional);
                    }

                    float tempoDeViagem2 = Float.parseFloat(
                            Leitura.entDados("Quanto tempo durará esse voo? (Responda em numero decimal) "));
                    int distancia2 = Integer.parseInt(Leitura.entDados("Digite a distancia aproximada da viagem: "));
                    String paisOrigem = Leitura.entDados("De qual pais você esta saindo? ");
                    String paisDestino = Leitura.entDados("Para qual pais vocÊ está indo? ");

                    internacional.setHorSaida(horaSaida2);
                    internacional.setHorChegada(horaChegada2);
                    internacional.setCidadeSaida(cidadeSaida2);
                    internacional.setCidadeDestino(cidadeChegada2);
                    internacional.setTempoDeViagem(tempoDeViagem2);
                    internacional.setDistancia(distancia2);

                    do {
                        if (internacional.verifica(paisDestino, paisOrigem)) {

                            internacional.setPaisOrigem(paisOrigem);
                            internacional.setPaisDestino(paisDestino);
                            System.out.println("--------- Voo nacinal cadastrado com sucesso --------------");

                        }

                        else {

                            System.out.println(
                                    "!!!!!!!!!!! O pais DE SAIDA E DE DESTINO NÃO PODEM SER IGUAIS EM UM VOO NACIONAL !!!!!!!!!!!!!!!!!!!");

                            paisOrigem = Leitura.entDados("De qual pais você esta saindo? ");
                            paisDestino = Leitura.entDados("Para qual pais voce está indo? ");
                            internacional.setPaisDestino(paisDestino);
                            internacional.setPaisOrigem(paisOrigem);
                        }

                    } while (internacional.verifica(paisDestino, paisOrigem) == false);
                    break;

                case 3:

                    System.out.println("\nVoce selecionou Estadual: \n\n");
                    String horaSaida3 = Leitura.entDados("\nQual hora de saida?");
                    String horaChegada3 = Leitura.entDados("\nQual a hora de chegada?");
                    String cidadeSaida3 = Leitura.entDados("\nDe qual cidade o voo saira? ");
                    String cidadeChegada3 = Leitura.entDados("\nPara qual cidade o voo ira");

                    try {
                        estadual.setNumPassageiros(
                                Integer.parseInt(Leitura.entDados("\nQuantos passageiros irao nesse voo? ")));
                    } catch (NumGrdPsgException nge) {

                        nge.msgGrdException();
                        nge.CorrigeGrdEsta(estadual);
                    } catch (NumPeqPsgException npe) {

                        npe.msgPeqException();
                        estadual = npe.corrigePeqEsta(estadual);
                    }

                    float tempoDeViagem3 = Float.parseFloat(
                            Leitura.entDados("\nQuanto tempo durará esse voo? (Responda em numero decimal) "));
                    int distancia3 = Integer.parseInt(Leitura.entDados("\nDigite a distancia aproximada da viagem: "));
                    String estado = Leitura.entDados("\nEm Qual estado o voo ocorre? ");
                    String porteAeroportoSaida = Leitura.entDados("\nQual porte do aeroporto de saida? ");
                    String porteAeroportoChegada = Leitura.entDados("\nQual porte do aeroporto de chegada? ");

                    estadual.setHorSaida(horaSaida3);
                    estadual.setHorChegada(horaChegada3);
                    estadual.setCidadeSaida(cidadeSaida3);
                    estadual.setCidadeDestino(cidadeChegada3);

                    estadual.setTempoDeViagem(tempoDeViagem3);
                    estadual.setDistancia(distancia3);
                    estadual.setEstado(estado);
                    estadual.setPorteAeroportoSaida(porteAeroportoSaida);
                    estadual.setPorteAeroportoDestino(porteAeroportoChegada);
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        } while (tipoVoo > 4 || tipoVoo == 0);

        // Adicona Tripulates
        System.out.println("\n\n Por ultimo vamos vadastrar os tripulates e passageiros");

        int i = Integer.parseInt(Leitura.entDados("Quatos tripulates deseja cadastrar? "));
        List<Tripulante> tripulantes = new ArrayList<>();
        for (int c = 0; c < i; c++) {

            String nomeTripu = Leitura.entDados("\nDigite o nome: ");
            String cpf = Leitura.entDados("Digite o CPF: ");

            Tripulante trip = new Tripulante();

            trip.setCPF(cpf);
            trip.setNome(nomeTripu);

            try {

                trip.setCargo(Leitura.entDados("Qual o cargo: "));
            }

            catch (NaoNuloException nne) {
                nne.msgCargNuloException();
                trip = nne.corrigeCargo(trip);
            }

            try {
                trip.setLicenca(Integer.parseInt(Leitura.entDados("Digite a licena para o cargo: ")));
            } catch (NaoNuloException nne) {
                nne.msgLinNuloException();
                trip = nne.corrigeLicenca(trip);
            }

            tripulantes.add(trip);
        }

        // adiciona passageiros
        List<Passageiro> passageiros = new ArrayList<>();

        i = Integer.parseInt(Leitura.entDados("Quatos Passageiros deseja cadastrar? "));
        for (int c = 0; c < i; c++) {

            String nomepass = Leitura.entDados("Digite o nome: ");
            String cpfpass = Leitura.entDados("DiGITE O CPF: ");
            String assento = Leitura.entDados("Qual o assento do passageiro: ");
            String ticket = Leitura.entDados("Qual o ticket: ");

            Passageiro pass = new Passageiro();

            pass.setNome(nomepass);
            pass.setCPF(cpfpass);
            pass.setAssento(assento);
            pass.setTicket(ticket);

            if (tipoVoo == 2) {
                int numPassaporte = Integer.parseInt(Leitura.entDados("Qual numero do passaporte? "));
                pass.setNumPassaporte(numPassaporte);
                passageiros.add(pass);
            } else {
                passageiros.add(pass);
            }
        }

        if (tipoVoo == 1) {

            aviao.setMotor(motor);
            aviao.setFabricanteAviao(fabricanteAviao);
            aviao.setNacional(nacional);
            aviao.setModelo(modeloAviao);
            aviao.setPassageiros(passageiros);
            aviao.setTripulante(tripulantes);
            aviao.setCodAviao(codAviao);
            aviao.setTipoVoo(tipoVoo);

        } else if (tipoVoo == 2) {

            aviao.setMotor(motor);
            aviao.setFabricanteAviao(fabricanteAviao);
            aviao.setInternacional(internacional);
            aviao.setModelo(modeloAviao);
            aviao.setPassageiros(passageiros);
            aviao.setTripulante(tripulantes);
            aviao.setCodAviao(codAviao);
            aviao.setTipoVoo(tipoVoo);

        } else if (tipoVoo == 3) {

            aviao.setMotor(motor);
            aviao.setFabricanteAviao(fabricanteAviao);
            aviao.setEstadual(estadual);
            aviao.setModelo(modeloAviao);
            aviao.setPassageiros(passageiros);
            aviao.setTripulante(tripulantes);
            aviao.setCodAviao(codAviao);
            aviao.setTipoVoo(tipoVoo);

        }

        listaAvioes.add(aviao);
    }

    public static void imprimeDados() {

        for (Aviao cadaAviao : listaAvioes) {

            int tipoVoo = cadaAviao.getTipoVoo();
            // 1-Nacional 2-Internacional 3- Estadual
            System.out.println("\n\n Apresentado voo " + cadaAviao.getCodAviao());

            System.out.println("\n Apresentando os dados cadastrados: \n");
            System.out.println("\nMotor: \n");
            System.out.println("Quantidade de motores: " + cadaAviao.getMotor().getQuantidade());
            System.out.println("Consumo:  " + cadaAviao.getMotor().getConsumo());
            System.out.println("Potencia: " + cadaAviao.getMotor().getPotencia());
            System.out.println("Fabricate do motor: " + cadaAviao.getMotor().getFabricanteMotor());

            System.out.println("\n Aviao \n");
            System.out.println("Modelo do avia: " + cadaAviao.getModelo());
            System.out.println("Fabricante: " + cadaAviao.getFabricanteAviao());

            System.out.println("\n VOO: \n");
            if (tipoVoo == 1) {
                System.out.println("Hora de saida: " + cadaAviao.getNacional().getHorSaida());
                System.out.println("Hora de chegada: " + cadaAviao.getNacional().getHorChegada());
                System.out.println("Cidade de saida: " + cadaAviao.getNacional().getCidadeSaida());
                System.out.println("Cidade de Destino: " + cadaAviao.getNacional().getCidadeDestino());
                System.out.println("Tempo de viagem: " + cadaAviao.getNacional().getTempoDeViagem());
                System.out.println("Distacia: " + cadaAviao.getNacional().getDistancia());
                System.out.println("Numero de pasageiros: " + cadaAviao.getNacional().getNumPassageiros());

                System.out.println("Estado de saida: " + cadaAviao.getNacional().getEstadoSaida());
                System.out.println("Cidade de destino: " + cadaAviao.getNacional().getEstadoDestino());
            } else if (tipoVoo == 2) {

                System.out.println("Hora de saida: " + cadaAviao.getInternacional().getHorSaida());
                System.out.println("Hora de chegada: " + cadaAviao.getInternacional().getHorChegada());
                System.out.println("Cidade de saida: " + cadaAviao.getInternacional().getCidadeSaida());
                System.out.println("Cidade de Destino: " + cadaAviao.getInternacional().getCidadeDestino());
                System.out.println("Tempo de viagem: " + cadaAviao.getInternacional().getTempoDeViagem());
                System.out.println("Distacia: " + cadaAviao.getInternacional().getDistancia());
                System.out.println("Numero de pasageiros: " + cadaAviao.getInternacional().getNumPassageiros());

                System.out.println("Pais de origem: " + cadaAviao.getInternacional().getPaisOrigem());
                System.out.println("Pais de destino: " + cadaAviao.getInternacional().getPaisDestino());

            } else if (tipoVoo == 3) {
                System.out.println("Hora de saida: " + cadaAviao.getEstadual().getHorSaida());
                System.out.println("Hora de chegada: " + cadaAviao.getEstadual().getHorChegada());
                System.out.println("Cidade de saida: " + cadaAviao.getEstadual().getCidadeSaida());
                System.out.println("Cidade de Destino: " + cadaAviao.getEstadual().getCidadeDestino());
                System.out.println("Tempo de viagem: " + cadaAviao.getEstadual().getTempoDeViagem());
                System.out.println("Distacia: " + cadaAviao.getEstadual().getDistancia());
                System.out.println("Numero de pasageiros: " + cadaAviao.getEstadual().getNumPassageiros());

                System.out.println("Estado do voo: " + cadaAviao.getEstadual().getEstado());
                System.out.println("Porte aeroporto de saida: " + cadaAviao.getEstadual().getPorteAeroportoSaida());
                System.out.println("Porte aeroporto de destino: " + cadaAviao.getEstadual().getPorteAeroportoDestino());
            }

            System.out.println("\nPassageiros: ");
            for (Passageiro cada : cadaAviao.getPassageiros()) {
                System.out.println("\nNome: " + cada.getNome());
                System.out.println("CPF: " + cada.getCPF());
                System.out.println("Assento: " + cada.getAssento());
                System.out.println("Ticket: " + cada.getTicket());
                System.out.println("\n");
            }

            System.out.println("\nTripulante: ");
            for (Tripulante cada : cadaAviao.getTripulante()) {
                System.out.println("\nNome: " + cada.getNome());
                System.out.println("CPF: " + cada.getCPF());
                System.out.println("Cargo: " + cada.getCargo());
                System.out.println("Licenca: " + cada.getLicenca());

            }
        }
    }

    public static void procuraVooDePassageiro(String CPF) {

        for (Aviao cadaAviao : listaAvioes) {
            int tipoVoo = cadaAviao.getTipoVoo();

            List<Passageiro> pass = new ArrayList<Passageiro>();
            pass = cadaAviao.getPassageiros();

            for (Passageiro CadaPassageiro : pass) {

                if (CadaPassageiro.getCPF().equals(CPF)) {

                    System.out.println("\n VOO: \n");
                    if (tipoVoo == 1) {
                        if (cadaAviao.getNacional() != null) {

                            System.out.println("Hora de saida: " + cadaAviao.getNacional().getHorSaida());
                            System.out.println("Hora de chegada: " + cadaAviao.getNacional().getHorChegada());
                            System.out.println("Cidade de saida: " + cadaAviao.getNacional().getCidadeSaida());
                            System.out.println("Cidade de Destino: " + cadaAviao.getNacional().getCidadeDestino());
                            System.out.println("Tempo de viagem: " + cadaAviao.getNacional().getTempoDeViagem());
                            System.out.println("Distacia: " + cadaAviao.getNacional().getDistancia());
                            System.out.println("Numero de pasageiros: " + cadaAviao.getNacional().getNumPassageiros());

                            System.out.println("Estado de saida: " + cadaAviao.getNacional().getEstadoSaida());
                            System.out.println("Cidade de destino: " + cadaAviao.getNacional().getEstadoDestino());
                        } else {
                            System.out.println("Ops...  Algo deu errado parece que o voo está vazio ");
                        }
                    } else if (tipoVoo == 2) {
                        if (cadaAviao.getInternacional() != null) {

                            System.out.println("Hora de saida: " + cadaAviao.getInternacional().getHorSaida());
                            System.out.println("Hora de chegada: " + cadaAviao.getInternacional().getHorChegada());
                            System.out.println("Cidade de saida: " + cadaAviao.getInternacional().getCidadeSaida());
                            System.out.println("Cidade de Destino: " + cadaAviao.getInternacional().getCidadeDestino());
                            System.out.println("Tempo de viagem: " + cadaAviao.getInternacional().getTempoDeViagem());
                            System.out.println("Distacia: " + cadaAviao.getInternacional().getDistancia());
                            System.out.println(
                                    "Numero de pasageiros: " + cadaAviao.getInternacional().getNumPassageiros());

                            System.out.println("Pais de origem: " + cadaAviao.getInternacional().getPaisOrigem());
                            System.out.println("Pais de destino: " + cadaAviao.getInternacional().getPaisDestino());
                        } else {
                            System.out.println("Ops...  Algo deu errado parece que o voo está vazio ");
                        }
                    } else if (tipoVoo == 3) {
                        if (cadaAviao.getEstadual() != null) {

                            System.out.println("Hora de saida: " + cadaAviao.getEstadual().getHorSaida());
                            System.out.println("Hora de chegada: " + cadaAviao.getEstadual().getHorChegada());
                            System.out.println("Cidade de saida: " + cadaAviao.getEstadual().getCidadeSaida());
                            System.out.println("Cidade de Destino: " + cadaAviao.getEstadual().getCidadeDestino());
                            System.out.println("Tempo de viagem: " + cadaAviao.getEstadual().getTempoDeViagem());
                            System.out.println("Distacia: " + cadaAviao.getEstadual().getDistancia());
                            System.out.println("Numero de pasageiros: " + cadaAviao.getEstadual().getNumPassageiros());

                            System.out.println("Estado do voo: " + cadaAviao.getEstadual().getEstado());
                            System.out.println(
                                    "Porte aeroporto de saida: " + cadaAviao.getEstadual().getPorteAeroportoSaida());
                            System.out.println("Porte aeroporto de destino: "
                                    + cadaAviao.getEstadual().getPorteAeroportoDestino());
                        } else {
                            System.out.println("Ops...  Algo deu errado parece que o voo está vazio ");
                        }
                    }
                }
            }
        }
    }

    public static void procuraVooDeTripulante(int licenca) {

        for (Aviao cadaAviao : listaAvioes) {
            
            int tipoVoo = cadaAviao.getTipoVoo();

            List<Tripulante> trip = new ArrayList<Tripulante>();
            trip = cadaAviao.getTripulante();

            for (Tripulante cadaTripulante : trip) {

                if (cadaTripulante.getLicenca() == licenca) {
                    System.out.println("\n VOO: \n");
                    if (tipoVoo == 1) {
                        System.out.println("Hora de saida: " + cadaAviao.getNacional().getHorSaida());
                        System.out.println("Hora de chegada: " + cadaAviao.getNacional().getHorChegada());
                        System.out.println("Cidade de saida: " + cadaAviao.getNacional().getCidadeSaida());
                        System.out.println("Cidade de Destino: " + cadaAviao.getNacional().getCidadeDestino());
                        System.out.println("Tempo de viagem: " + cadaAviao.getNacional().getTempoDeViagem());
                        System.out.println("Distacia: " + cadaAviao.getNacional().getDistancia());
                        System.out.println("Numero de pasageiros: " + cadaAviao.getNacional().getNumPassageiros());

                        System.out.println("Estado de saida: " + cadaAviao.getNacional().getEstadoSaida());
                        System.out.println("Cidade de destino: " + cadaAviao.getNacional().getEstadoDestino());
                    } else if (tipoVoo == 2) {

                        System.out.println("Hora de saida: " + cadaAviao.getInternacional().getHorSaida());
                        System.out.println("Hora de chegada: " + cadaAviao.getInternacional().getHorChegada());
                        System.out.println("Cidade de saida: " + cadaAviao.getInternacional().getCidadeSaida());
                        System.out.println("Cidade de Destino: " + cadaAviao.getInternacional().getCidadeDestino());
                        System.out.println("Tempo de viagem: " + cadaAviao.getInternacional().getTempoDeViagem());
                        System.out.println("Distacia: " + cadaAviao.getInternacional().getDistancia());
                        System.out.println("Numero de pasageiros: " + cadaAviao.getInternacional().getNumPassageiros());

                        System.out.println("Pais de origem: " + cadaAviao.getInternacional().getPaisOrigem());
                        System.out.println("Pais de destino: " + cadaAviao.getInternacional().getPaisDestino());

                    } else if (tipoVoo == 3) {
                        System.out.println("Hora de saida: " + cadaAviao.getEstadual().getHorSaida());
                        System.out.println("Hora de chegada: " + cadaAviao.getEstadual().getHorChegada());
                        System.out.println("Cidade de saida: " + cadaAviao.getEstadual().getCidadeSaida());
                        System.out.println("Cidade de Destino: " + cadaAviao.getEstadual().getCidadeDestino());
                        System.out.println("Tempo de viagem: " + cadaAviao.getEstadual().getTempoDeViagem());
                        System.out.println("Distacia: " + cadaAviao.getEstadual().getDistancia());
                        System.out.println("Numero de pasageiros: " + cadaAviao.getEstadual().getNumPassageiros());

                        System.out.println("Estado do voo: " + cadaAviao.getEstadual().getEstado());
                        System.out.println(
                                "Porte aeroporto de saida: " + cadaAviao.getEstadual().getPorteAeroportoSaida());
                        System.out.println(
                                "Porte aeroporto de destino: " + cadaAviao.getEstadual().getPorteAeroportoDestino());
                    }
                }
            }
        }
    }

    public static void consumoViagem() {

        for (Aviao cadaAviao : listaAvioes) {
            System.out.println("\nO combustivel necessario para o aviao: " + cadaAviao.getCodAviao() + " Eh de: " + cadaAviao.calcCombNec());
        }
    }

    public static void excluiTodosPassageiros(String codAviao) {

        for (Aviao cadaAviao : listaAvioes) {

            if (cadaAviao.getCodAviao().equals(codAviao)) {
                cadaAviao.excluiPassageiros();
            }

        }

    }

    public static void excluiTodosTripulantes(String codAviao) {

        for (Aviao cadaAviao : listaAvioes) {

            if (cadaAviao.getCodAviao().equals(codAviao)) {
                cadaAviao.excluiTripulante();
            }

        }

    }

}
