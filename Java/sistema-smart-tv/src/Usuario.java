public class Usuario {
    public static void main(String[] args) throws  Exception{
        SmartTv smartTV = new SmartTv();

        System.out.println("TV Ligada? " + smartTV.ligada);

        smartTV.ligar();
        System.out.println("TV Ligada? " + smartTV.ligada);

        System.out.println("Canal atual: " + smartTV.canal);

        System.out.println("Volume atual: " + smartTV.volume);
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume Atual: " +smartTV.volume);

        smartTV.mudarCanal(13);

        System.out.println("Canal atual: " + smartTV.canal);

        smartTV.desligar();
        System.out.println("TV Ligada? " + smartTV.ligada);
    }
    }

