package academy.atl.propiedades.controllers;

import academy.atl.propiedades.models.Vendedor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class VendedorController {
    @PostMapping("/api/vendedor")
    public void agregar(@RequestBody Vendedor vendedor){
        // lógica para agregar un vendedor a la base de datos
    }

    @PutMapping("/api/vendedor/{id}")
    public void modificar(@RequestBody Vendedor vendedor, @PathVariable("id") Long id){
        // lógica para modificar un vendedor que se encuentra en la base de datos
    }

    @DeleteMapping("/api/vendedor/{id}")
    public void eliminar(@PathVariable("id") Long id){
        // lógica para eliminar un vendedor que se encuentra en la base de datos
    }

    @GetMapping("/api/vendedor/{id}")
    public Vendedor get(@PathVariable("id") Long id){
        // lógica para mostrar o traer un vendedor que se encuentra en la base de datos
        Vendedor vendedor = new Vendedor();
        vendedor.setId(2L);
        vendedor.setDni("71658392");
        vendedor.setNombre("Mario");
        vendedor.setApellido("Martinez");
        vendedor.setTelefono("989625345");
        vendedor.setEmail("mario.martinez@gmail.com");
        vendedor.setFechaCreacion(LocalDate.now());
        return vendedor;
    }


    @GetMapping("/api/vendedor")
    public List<Vendedor> getAll(){
        List<Vendedor> listVendedor = new ArrayList<>();
        Vendedor vendedor1 = new Vendedor();
        vendedor1.setId(3L);
        vendedor1.setDni("71658392");
        vendedor1.setNombre("Marco");
        vendedor1.setApellido("Carhuamanta");
        vendedor1.setTelefono("9685412562");
        vendedor1.setEmail("marco.carhuamanta@gmail.com");
        vendedor1.setFechaCreacion(LocalDate.now());
        listVendedor.add(vendedor1);

        Vendedor vendedor2 = new Vendedor();
        vendedor2.setId(4L);
        vendedor2.setDni("77865241");
        vendedor2.setNombre("Jessica");
        vendedor2.setApellido("Carhuamanta");
        vendedor2.setTelefono("985852634");
        vendedor2.setEmail("jessica.carhuamanta@gmail.com");
        vendedor2.setFechaCreacion(LocalDate.now());
        listVendedor.add(vendedor2);

        return listVendedor;
    }
    //Realizar una busqueda especifica por nombre o algo especificos, iniciales.
}
