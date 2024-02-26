package actividades;

import categorias.Socio;

public class Actividad {

    private int id;
    private String nombre;
    private String profesor;
    private String sala;

    public Actividad(int id, String nombre, String profesor, String sala) {
        this.id = id;
        this.nombre = nombre;
        this.profesor = profesor;
        this.sala = sala;
    }

    public String getNombre() {
        return nombre;
    }


}
