package academy.atl.propiedades.repository;

import academy.atl.propiedades.models.Propiedad;
import org.springframework.data.repository.CrudRepository;

public interface IPropiedadRepository extends CrudRepository<Propiedad, Long> {

    //@Query("SELECT * FROM propiedad where nombre like '%sfsdfsd%'")
    // public Iterable<Propiedad> buscar();
}
