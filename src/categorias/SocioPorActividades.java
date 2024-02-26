package categorias;


import actividades.Actividad;

import java.util.List;

/**
 * Puede realizar una lista esp ecifica de actividades asignadas
 */
public class SocioPorActividades extends Socio{

    List<Actividad> actividadesPagas;

    public SocioPorActividades(List<Actividad> actividadesPagas) {
        this.actividadesPagas = actividadesPagas;
    }

    @Override
    public boolean validarActividad(Actividad actividad) {
        return actividadesPagas.contains(actividad);
    }


}
