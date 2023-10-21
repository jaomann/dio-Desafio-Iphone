package entities;
import contracts.Iiphone;

public class Iphone implements Iiphone {
    public String modelo;
    public int armazenamento;
    public String cor;

    public void fazerChamada(String numero){
        System.out.println("Ligando para: "+numero);
    }
    public void abrirNavegador(String url){
        System.out.println("Conexão estabecida para: "+url);
    }
    public void reproduzirMusica(){
        System.out.println("Tocando música");
    }
}
