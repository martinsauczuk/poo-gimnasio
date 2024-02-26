import actividades.Actividad;
import categorias.Socio;

public class ControladorIngreso {

    public boolean autorizar(Socio socio, Actividad actividad){
        System.out.println("[Controlador] Verificando acceso para " + socio.getNombre() + " en " + actividad.getNombre() + "...");
        boolean isAuth = socio.validarActividad(actividad);
        System.out.println(isAuth ? "[Controlador] Autorizado" : "[Controlador] No autorizado");
        return isAuth;
    }

}
