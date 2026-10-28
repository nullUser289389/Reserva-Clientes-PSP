public class Evento {
    int entradasDisponibles = 12;
    public boolean reservar(int cantidad){
        if (cantidad <= entradasDisponibles){
            entradasDisponibles -= cantidad;
            return true;
        }
        return false;
    }
}
