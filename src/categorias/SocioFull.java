package categorias;

import actividades.Actividad;

import java.util.List;

/**
 * Puede hacer todas las actividades de manera ilimitada
 */
public class SocioFull extends Socio {

    public SocioFull(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public boolean validarActividad(Actividad actividad) {
        return true;
    }
}
