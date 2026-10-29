import java.util.Random;

public class ReservaEntradas {
    public static void main() throws InterruptedException {

        Evento evento = new Evento();
        Random random = new Random();

        String[] nombres = {"Juan", "Maria", "Gonzalo", "Carlos", "Pepo", "Sebastian","Antonio","Abigail","Lia","Janire"};
        Thread[] hilos = new Thread[10];

        for (int i = 0; i < nombres.length; i++) {
            Cliente cliente = new Cliente(nombres[i], random.nextInt(1, 3), evento);
            Thread hilo = new Thread(cliente);
            hilos[i] = hilo;
            hilo.start();
        }



    }
}
