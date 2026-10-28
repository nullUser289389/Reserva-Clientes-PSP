public class ReservaEntradas {
    public static void main() throws InterruptedException {
        Evento evento = new Evento();

        Thread hiloAna = new Thread(()->{
            if(evento.reservar(7)){
                System.out.println("[Ana]Se han reservado 7 entradas para Ana y quedan " + evento.entradasDisponibles + " entradas disponibles");
            }else{
                System.out.println("No quedan reservas suficientes");
            }
        }, "Ana");

        Thread hiloLea = new Thread(()->{
            if(evento.reservar(6)){
                System.out.println("[Lea]Se han reservado 6 entradas para Lea y quedan " + evento.entradasDisponibles + " entradas disponibles");
            }else{
                System.out.println("No quedan reservas suficientes");
            }
        }, "Lea");

        Thread hiloMarcos = new Thread(()->{
            if(evento.reservar(5)){
                System.out.println("[Marcos]Se han reservado 5 entradas para Marcos y quedan " + evento.entradasDisponibles + " entradas disponibles");
            }else{
                System.out.println("No quedan reservas suficientes");
            }
        }, "Marcos");

        hiloMarcos.start();
        hiloLea.start();
        hiloAna.start();

        hiloMarcos.join();
        hiloLea.join();
        hiloAna.join();

    }
}
