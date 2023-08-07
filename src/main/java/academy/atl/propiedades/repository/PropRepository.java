package academy.atl.propiedades.repository;

import academy.atl.propiedades.models.Propiedad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropRepository extends CrudRepository<Propiedad, Long> {
}
