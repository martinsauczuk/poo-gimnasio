import actividades.Actividad;
import categorias.Socio;

public class ControladorIngreso {

    public boolean autorizar(Socio socio, Actividad actividad){
        System.out.println("[Controlador] Verificando acceso para " + socio.getNombre() + " en " + actividad.getNombre() + "...");

        boolean socioAutorizadoPorActividad = actividad.esAutorizado(socio);
        System.out.println(
                socioAutorizadoPorActividad
                        ? "[Controlador] Actividad autorizada"
                        : "[Controlador] Actividad no autorizado"
        );

        boolean actividadAutorizadaPorSocio = socio.validarActividad(actividad);
        System.out.println(
                actividadAutorizadaPorSocio
                        ? "[Controlador] Socio autorizado"
                        : "[Controlador] Socio no autorizado"
        );

        return socioAutorizadoPorActividad & actividadAutorizadaPorSocio;
    }

}
