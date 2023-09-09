package Iphone;

public class main {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone();
        iphone1.adicionarmusica("Dont Bother me- The Beatles");
        iphone1.adicionarmusica("Eleanor Rigby- The Beatles");
        iphone1.Start("Eleanor Rigby- The Beatles");
        iphone1.Pause("Eleanor Rigby- The Beatles");
        iphone1.SelectMusic("Dont Bother me- The Beatles");
        iphone1.Pause("Dont Bother me- The Beatles");
        iphone1.adicionarContato("Jão",12345);
        iphone1.adicionarContato("Pedro",54321);
        iphone1.call("Jão");
        iphone1.call(54321);
        iphone1.call(543211);
        iphone1.takeACall();
        iphone1.startVoiceMail("Jão");
        iphone1.adicionarNovaAba("X.com");
        iphone1.adicionarNovaAba("Youtube.com");
        iphone1.exibirPagina("X.com");
        iphone1.exibirPagina("facebook.com");
        iphone1.atualizarPagina("X.com");
    }
}
