package actividades;

import categorias.Socio;

public class Pileta extends Actividad {

    private int carril;

    public Pileta(int id, String nombre, String profesor, String sala, int carril) {
        super(id, nombre, profesor, sala);
    }

    @Override
    public boolean esAutorizado(Socio socio) {
        return socio.isRevisionMedica();
    }
}
