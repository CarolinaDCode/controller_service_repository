package academy.atl.propiedades.services;

import academy.atl.propiedades.models.Propiedad;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class PropiedadService {

    public void agregar(@RequestBody Propiedad propiedad){
        if (propiedad.getTitulo().equals("")){
            return;
        }
        // Llamar a la base de datos.
    }

    public void modificar(@RequestBody Propiedad propiedad, @PathVariable("id") Long id){
        // lógica para modificar un propiedad que se encuentra en la base de datos
    }

    public void eliminar(@PathVariable("id") Long id){
        // lógica para eliminar un propiedad que se encuentra en la base de datos
    }


    public Propiedad get(@PathVariable("id") Long id){
        return null;
    }

    public List<Propiedad> getAll(){
        return null;
    }
}
