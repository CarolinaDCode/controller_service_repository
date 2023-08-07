package academy.atl.propiedades.repository;

import academy.atl.propiedades.models.Propiedad;
import academy.atl.propiedades.services.PropiedadInterface;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;
public class PropiedadRepository implements PropiedadInterface{

    @PersistenceContext
    EntityManager conexion;

    @Override
    public void agregar(Propiedad propiedad) {

    }

    @Override
    public void modificar(Propiedad propiedad) {

    }

    @Override
    public void eliminar(Long id) {

    }

    @Override
    public Propiedad get(Long id) {
        List<Propiedad> resultados = conexion.createNativeQuery("FROM Propiedad p WHERE p.id = " + id)
                .getResultList();
        return resultados.get(0);
    }

    @Override
    public List<Propiedad> getAll() {
        return null;
    }
}
