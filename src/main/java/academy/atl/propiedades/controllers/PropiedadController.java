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
        Propiedad propiedad = new Propiedad();
        propiedad.setId(1L);
        propiedad.setAnio("1945");
        propiedad.setBanios("3");
        propiedad.setDescripcion("Hermoso departamento al frente de la playa");
        propiedad.setLongitud("-11.9485243");
        propiedad.setLatitud("-77.0922908");
        return propiedad;
    }


    @GetMapping("/api/propiedad")
    public List<Propiedad> getAll(){
        List<Propiedad> listPropiedad = new ArrayList<>();
        Propiedad propiedad1 = new Propiedad();
        propiedad1.setId(1L);
        propiedad1.setAnio("1946");
        propiedad1.setBanios("3");
        propiedad1.setDescripcion("Hermoso departamento al frente de la playa 2");
        propiedad1.setLongitud("-11.9485283");
        propiedad1.setLatitud("-77.0922918");
        listPropiedad.add(propiedad1);

        Propiedad propiedad2 = new Propiedad();
        propiedad2.setId(1L);
        propiedad2.setAnio("1948");
        propiedad2.setBanios("3");
        propiedad2.setDescripcion("Hermoso departamento al frente de la playa 3");
        propiedad2.setLongitud("-11.9485273");
        propiedad2.setLatitud("-77.0922948");
        listPropiedad.add(propiedad2);

        return listPropiedad;
    }
}
