package categorias;

import actividades.Actividad;

import java.util.List;

/**
 * Puede hacer todas las actividades de manera ilimitada
 */
public class SocioFull extends Socio {

    @Override
    public boolean validarActividad(Actividad actividad) {
        return true;
    }
}
