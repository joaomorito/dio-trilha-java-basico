public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("APÓS AÇÃO -> TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("APÓS AÇÃO -> TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();

        smartTv.abaixarVolume();

        smartTv.mudarCanal(50);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.voltarCanal();
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
