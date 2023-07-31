package academy.atl.propiedades.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "propiedad")
public class Propiedad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private String precio;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "m2")
    private String m2;

    @Column(name = "banios")
    private String banios;

    @Column(name = "anio")
    private String anio;

    @Column(name = "habitaciones")
    private String habitaciones;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "latitud")
    private String latitud;

    @Column(name = "longitud")
    private String longitud;

    @Column(name = "estado")
    private String estado;

    @Column(name = "disponible")
    private String disponible;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_vendedor")
    private Vendedor vendedor;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_galeria")
    private Galeria galeria;

    @Column(columnDefinition = "DATETIME", name = "fecha_creacion", updatable = false, nullable = false)
    private Date fecha_creacion;

    @Column(columnDefinition = "DATETIME", name = "fecha_eliminacion", updatable = false, nullable = false)
    private String fecha_eliminacion;
}
