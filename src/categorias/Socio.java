package categorias;

import actividades.Actividad;

public abstract class Socio {

    private int id;
    private String nombre;

    private boolean revisionMedica;

    public Socio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract boolean validarActividad(Actividad actividad);

    public boolean isRevisionMedica() {
        return revisionMedica;
    }

    public void setRevisionMedica(boolean revisionMedica) {
        this.revisionMedica = revisionMedica;
    }
}
