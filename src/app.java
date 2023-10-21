import entities.Iphone;

public class app {
    public static void main(String[] args){
        Iphone iphone = new Iphone();
        iphone.abrirNavegador("https://web.dio.me");
        iphone.fazerChamada("999999");
        iphone.reproduzirMusica();
    }
}
