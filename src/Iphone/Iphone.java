package Iphone;

import Util.Class.*;
import Util.Interface.*;

import java.util.*;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
    private List<Music> musicList;
    private List<Contats> contatsList;
    private List<String> abasList;

    public Iphone() {
        this.musicList = new ArrayList<>();
        this.contatsList = new ArrayList<>();
        this.abasList = new ArrayList<>();
    }

    public void adicionarmusica(String musica) {
        musicList.add(new Music(musica));
    }

    public void Start(String nomeMusica) {
        if (!musicList.isEmpty()) {
            for (Music m : musicList) {
                if (m.getNomeMusica().equalsIgnoreCase(nomeMusica)) {
                    m.setEstadoMusic(true);
                    System.out.println(m);
                    break;
                }
            }
        } else {
            System.out.println("Lista de Musica Vazia");
        }
    }


    public void Pause(String nomeMusica) {
        if (!musicList.isEmpty()) {
            for (Music m : musicList) {
                if (m.getNomeMusica().equalsIgnoreCase(nomeMusica)) {
                    m.setEstadoMusic(false);
                    System.out.println(m);
                    break;
                }
            }
        } else {
            System.out.println("Lista de Musica Vazia");
        }
    }

    public void SelectMusic(String nomeMusica) {
        if (!musicList.isEmpty()) {
            for (Music m : musicList) {
                if (m.getNomeMusica().equalsIgnoreCase(nomeMusica)) {
                    m.setEstadoMusic(true);
                    System.out.println("Musica " + m.getNomeMusica() + " selecionada e Reproduzindo");
                    break;
                }
            }
        } else {
            System.out.println("Lista de Musica Vazia");
        }
    }

    public void adicionarContato(String contato, Integer numero) {
        contatsList.add(new Contats(contato, numero));
    }

    @Override
    public void call(String nomeContato) {
        if (!contatsList.isEmpty()) {
            for (Contats c : contatsList) {
                if (c.getNomeContato().equalsIgnoreCase(nomeContato)) {
                    System.out.println("Ligando para o contato " + c.getNomeContato() + " .....");
                    System.out.println("Chamada Iniciada");
                    System.out.println("Alô, Ninguém em casa Tchau......tu..tu..tu..tu");
                    System.out.println("Chamada finalizada");
                    break;

                }
            }
        } else {
            System.out.println("Nenhum Contato na lista");
        }
    }

    public void call(Integer numero) {
        if (!contatsList.isEmpty()) {
            boolean verificador = false;
            for (Contats c : contatsList) {
                if (Objects.equals(numero, c.getNumero())) {
                    call(c.getNomeContato());
                    verificador = true;
                }
            }
            if (!verificador) {
                System.out.println("Ligando para o contato " + numero + " .....");
                System.out.println("Chamada Iniciada");
                System.out.println("Alô, Vai dormir......tu..tu..tu..tu");
                System.out.println("Chamada finalizada");
            }
        } else {
            System.out.println("Nenhum Contato na lista");
        }
    }

    @Override
    public void takeACall() {
        if (!contatsList.isEmpty()) {
            Random gerador = new Random();
            Contats c = contatsList.get(gerador.nextInt(contatsList.size()));
            System.out.println("Atendendo o contato " + c.getNomeContato() + " .....");
            System.out.println("Chamada Iniciada");
            System.out.println("Alô, Você é incrivel Tchau......tu..tu..tu..tu");
            System.out.println("Chamada finalizada");
        } else {
            System.out.println("Nenhum Contato na lista");
        }

    }

    @Override
    public void startVoiceMail(String nomeContato) {
        if (!contatsList.isEmpty()) {
            for (Contats c : contatsList) {
                if (c.getNomeContato().equalsIgnoreCase(nomeContato)) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Ligando para o contato " + c.getNomeContato() + " .....");
                    System.out.println(c.getNomeContato()+" não atende correio de voz iniciado");
                    System.out.println("Deixe um recado para o contato " + c.getNomeContato() + " .....");
                    System.out.print("Correio de Voz iniciado: ");
                    String Correio = sc.nextLine();
                    System.out.println("recado Gravado e enviando .....");
                    System.out.println("Correio de Voz finalizada");
                    break;

                }
            }
            System.out.println("Contato não Encontrado");
        } else {
            System.out.println("Nenhum Contato na lista");
        }

    }

    @Override
    public void exibirPagina(String url) {
        if (!abasList.isEmpty()) {
            for (String a : abasList) {
                if (a.equalsIgnoreCase(url)) {
                    boolean exibindo = true;
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Abrindo pagina: " + a + ".....");
                    System.out.println("Aba aberta");
                    while (exibindo) {
                        System.out.println("deseja sair da aba: [sim] ou [nao]");
                        String sair = sc.nextLine();
                        if (sair.equalsIgnoreCase("sim")) {
                            exibindo = false;
                        }
                    }
                    System.out.println("fechando aba");
                    break;
                }
            }
        } else {
            System.out.println("Aba inexistenete");
        }
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando aba: " + url);
        abasList.add(url);
    }

    @Override
    public void atualizarPagina(String url) {
        System.out.println("Atualizando Pagina....");
        exibirPagina(url);
    }
}
