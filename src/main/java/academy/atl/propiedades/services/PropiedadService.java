package academy.atl.propiedades.services;

import academy.atl.propiedades.models.Propiedad;
import academy.atl.propiedades.repository.IPropiedadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class PropiedadService {

    @Autowired
    private IPropiedadRepository repository;

    public void agregar(@RequestBody Propiedad propiedad){
        if (propiedad.getTitulo().equals("")){
            return;
        }
        repository.save(propiedad);
    }

    public void modificar(@RequestBody Propiedad propiedad, @PathVariable("id") Long id){
        // lógica para modificar un propiedad que se encuentra en la base de datos
        repository.save(propiedad);
    }

    public void eliminar(@PathVariable("id") Long id){
        // lógica para eliminar un propiedad que se encuentra en la base de datos
        repository.deleteById(id);
    }


    public Propiedad get(@PathVariable("id") Long id){
        return repository.findById(id).get();
    }

    public List<Propiedad> getAll(){
        return (List) repository.findAll();
    }
}
