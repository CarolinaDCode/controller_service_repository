package academy.atl.propiedades.controllers;
import academy.atl.propiedades.services.PropiedadService;
import academy.atl.propiedades.models.Propiedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PropiedadController {

    //Lo que hace autowired es llenar el obj propiedadService automaticamente.
    @Autowired
    private PropiedadService propiedadService;
    @PostMapping("/api/propiedad")
    public void agregar(@RequestBody Propiedad propiedad){
        // lógica para agregar un propiedad a la base de datos
        propiedadService.agregar(propiedad);
    }

    @PutMapping("/api/propiedad/{id}")
    public void modificar(@RequestBody Propiedad propiedad, @PathVariable("id") Long id){
        // lógica para modificar un propiedad que se encuentra en la base de datos
        propiedadService.modificar(propiedad, id);
    }

    @DeleteMapping("/api/propiedad/{id}")
    public void eliminar(@PathVariable("id") Long id){
        // lógica para eliminar un propiedad que se encuentra en la base de datos
        propiedadService.eliminar(id);
    }

    @GetMapping("/api/propiedad/{id}")
    public Propiedad get(@PathVariable("id") Long id){
        // lógica para mostrar o traer un propiedad que se encuentra en la base de datos
        return propiedadService.get(id);
    }

    @GetMapping("/api/propiedad")
    public List<Propiedad> getAll(){
        return propiedadService.getAll();
    }
}
