import actividades.Actividad;
import categorias.Socio;
import categorias.SocioPorActividades;
import categorias.SocioPorCantActividades;
import categorias.SocioPrueba;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Lista de actividades
        Actividad musculacionPlantaBaja = new Actividad(100, "Salon PB", "Luciano", "PB");
        Actividad piletaLibreTarde = new Actividad(21, "Pileta libre por la tarde", "Erica", "Pileta olimpica");
        Actividad karateConMarcos = new Actividad(8, "Clases de Karate", "Marcos", "Salon de usos multiples");

        // Socios por actividad
        Socio martin = new SocioPorActividades(1, "Martin Sauczuk",
                Arrays.asList(musculacionPlantaBaja, piletaLibreTarde)
        );

        ControladorIngreso controlAcceso = new ControladorIngreso();

        // Martin intenta ingresar a la clase de Karate -> se espera que el sistema no autorizado
        controlAcceso.autorizar(martin, karateConMarcos);

        // Martin intenta ingresar a musculacion -> se espera un ok
        controlAcceso.autorizar(martin, musculacionPlantaBaja);

        // Matias es un socio de prueba, debe poder ingresar una sola vez a una sola clase
        SocioPrueba socioClasePrueba = new SocioPrueba(12, "Matias");
        controlAcceso.autorizar(socioClasePrueba,piletaLibreTarde);
        controlAcceso.autorizar(socioClasePrueba,piletaLibreTarde);

        // Andrea solo puede ingresar a 3 clases
        SocioPorCantActividades andreaPack3clases = new SocioPorCantActividades(21, "Andrea", 3);
        controlAcceso.autorizar(andreaPack3clases, piletaLibreTarde);
        controlAcceso.autorizar(andreaPack3clases, karateConMarcos);
        controlAcceso.autorizar(andreaPack3clases, piletaLibreTarde);
        controlAcceso.autorizar(andreaPack3clases, musculacionPlantaBaja);

    }
}