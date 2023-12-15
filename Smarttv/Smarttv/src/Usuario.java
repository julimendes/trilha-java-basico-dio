public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("A tv está ligada? " + smartTv.ligada);
        System.out.println(" Qual canal está? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status, a tv está ligada? " + smartTv.ligada);
        System.out.println(" Qual canal está? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.avancarCanal();
        smartTv.avancarCanal();
        smartTv.avancarCanal();
        smartTv.avancarCanal();
        System.out.println(" Canal atual " + smartTv.canal);
        smartTv.voltarCanal();
        smartTv.voltarCanal();
        System.out.println("Canal atual " + smartTv.canal);
        smartTv.mudarCanal(22);
        System.out.println(" Canal atual " + smartTv.canal);

    }

}