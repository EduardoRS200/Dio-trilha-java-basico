public class SmartTv {
    
    boolean ligada =  false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void dimunuirCanal(){
        canal--;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
 
    public void aumentarVolume() {
       volume++;
       System.out.println("Aumentando o Volume para : " + volume);

    }

    public void dimuinuirVolume() {
        volume--;
        System.out.println("Diminuindo o Volume para : " + volume);
    }

}
