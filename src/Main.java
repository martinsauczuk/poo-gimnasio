import actividades.Actividad;
import actividades.Pileta;
import categorias.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Lista de actividades
        Actividad musculacionPlantaBaja = new Actividad(100, "Salon PB", "Luciano", "PB");
        Pileta piletaLibreTarde = new Pileta(21, "Pileta libre por la tarde", "Erica", "Pileta olimpica", 3);
        Actividad karateConMarcos = new Actividad(8, "Clases de Karate", "Marcos", "Salon de usos multiples");

        // Socios por actividad
        Cliente martin = new Cliente(
                1,
                "Martin Sauczuk",
                new SocioPorActividades(Arrays.asList(musculacionPlantaBaja, piletaLibreTarde))
        );



        ControladorIngreso controlAcceso = new ControladorIngreso();

        // Martin intenta ingresar a la clase de Karate -> se espera que el sistema no autorizado
        controlAcceso.autorizar(martin, karateConMarcos);

        // Martin intenta ingresar a musculacion -> se espera un ok
        controlAcceso.autorizar(martin, musculacionPlantaBaja);

        // Matias es un socio de prueba, debe poder ingresar una sola vez a una sola clase
        Cliente socioClasePrueba = new Cliente(12, "Matias", new SocioPrueba());
        controlAcceso.autorizar(socioClasePrueba,piletaLibreTarde);
        controlAcceso.autorizar(socioClasePrueba,piletaLibreTarde);

        // Andrea solo puede ingresar a 3 clases
        Cliente andrea = new Cliente(21, "Andrea", new SocioPorCantActividades(3));
        controlAcceso.autorizar(andrea, piletaLibreTarde);
        controlAcceso.autorizar(andrea, karateConMarcos);
        controlAcceso.autorizar(andrea, piletaLibreTarde);
        controlAcceso.autorizar(andrea, musculacionPlantaBaja);

        // Andrea ahora decide pagar la membresia Full y convertirse en SocioFull
        andrea.setCategoriaSocio(new SocioFull());

        // Validamos que ahora puede ingresar sin problemas a otra clase
        controlAcceso.autorizar(andrea, musculacionPlantaBaja);


        // Ejemplo de uso de la pileta
        Cliente melina = new Cliente(32, "Melina", new SocioFull());
        melina.setRevisionMedica(false);

        controlAcceso.autorizar(melina, piletaLibreTarde);
    }
}