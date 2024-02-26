package categorias;

import actividades.Actividad;

/**
 * Puede hacer una sola actividad por unica vez
 */
public class SocioPrueba extends Socio {

    private boolean disponible;

    public SocioPrueba(int id, String nombre) {
        super(id, nombre);
        disponible = true;
    }

    @Override
    public boolean validarActividad(Actividad actividad) {
        boolean autorizado;
        if(disponible) { // Si esta disponible autorizar por unica vez
            disponible = false;
            autorizado = true;
        } else {
            autorizado = false;
        }
        return autorizado;
    }
}
