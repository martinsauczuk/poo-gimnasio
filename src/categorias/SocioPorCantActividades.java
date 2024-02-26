package categorias;

import actividades.Actividad;

public class SocioPorCantActividades extends Socio {

    private int cantDisponible;

    public SocioPorCantActividades(int id, String nombre, int cantDisponible) {
        super(id, nombre);
        this.cantDisponible = cantDisponible;
    }

    @Override
    public boolean validarActividad(Actividad actividad) {
        if (cantDisponible > 0 ){
            cantDisponible --;
            return true;
        } else {
            return false;
        }
    }
}
