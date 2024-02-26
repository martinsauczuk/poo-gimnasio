package categorias;

import actividades.Actividad;

import javax.accessibility.AccessibleTable;

public class Cliente {
    private int id;
    private String nombre;
    private boolean revisionMedica;
    private Socio categoriaSocio;

    public Cliente(int id, String nombre, Socio categoriaSocio) {
        this.id = id;
        this.nombre = nombre;
        this.categoriaSocio = categoriaSocio;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public boolean isRevisionMedica() {
        return revisionMedica;
    }
    public void setRevisionMedica(boolean revisionMedica) {
        this.revisionMedica = revisionMedica;
    }

    public Socio getCategoriaSocio() {
        return categoriaSocio;
    }

    public void setCategoriaSocio(Socio categoriaSocio) {
        this.categoriaSocio = categoriaSocio;
    }

    public boolean validarActividad(Actividad actividad) {
        return categoriaSocio.validarActividad(actividad);
    }

}
