public class Cliente implements Runnable{
    int entradas;
    Evento evento;

    public Cliente(String nombre, int entradas, Evento evento){
        this.entradas = entradas;
        this.evento = evento;
        Thread.currentThread().setName(nombre);
    }
    @Override
    public void run() {
        if(evento.entradasDisponibles <= entradas){
            evento.entradasDisponibles -= entradas;
            System.out.println();
            System.out.println("[" + Thread.currentThread().getName() + "]==> " + "Reservo " + entradas);
            System.out.println("[+]==> Quedan " + evento.entradasDisponibles);
            System.out.println();
        }else{
            System.out.println();
            System.out.println("[!]==> No fue posible realizar la reserva de " + entradas + ". Faltarian " + (entradas - evento.entradasDisponibles) + " para poder realizarla");
            System.out.println("[+]==> Quedan " + evento.entradasDisponibles);
        }
    }
}
