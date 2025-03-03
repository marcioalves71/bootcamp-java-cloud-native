public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume da TV: " + smartTv.volume);

        System.out.println("-------------------------------------------------------------------------------");
        smartTv.ligar();
        System.out.println("Tv ligada? " + smartTv.ligada);

        smartTv.alterarCanal(13);
        System.out.println("Canal novo: " + smartTv.canal);
    }
}
