import actividades.Actividad;
import categorias.Cliente;
import categorias.Socio;

public class ControladorIngreso {

    public boolean autorizar(Cliente cliente, Actividad actividad){
        System.out.println("[Controlador] Verificando acceso para " + cliente.getNombre() + " en " + actividad.getNombre() + "...");

        boolean socioAutorizadoPorActividad = actividad.esAutorizado(cliente);
        System.out.println(
                socioAutorizadoPorActividad
                        ? "[Controlador] Actividad autorizada"
                        : "[Controlador] Actividad no autorizado"
        );

        boolean actividadAutorizadaPorSocio = cliente.validarActividad(actividad);
        System.out.println(
                actividadAutorizadaPorSocio
                        ? "[Controlador] Socio autorizado"
                        : "[Controlador] Socio no autorizado"
        );

        return socioAutorizadoPorActividad & actividadAutorizadaPorSocio;
    }

}
