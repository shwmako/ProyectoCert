package edu.pe.serviciomjcert.model;



import javax.persistence.*;


@Entity
public class TipoServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoServicio;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    public TipoServicio() {
    }

    public TipoServicio(String descripcion, Integer idTipoServicio, String nombre) {
        this.descripcion = descripcion;
        this.idTipoServicio = idTipoServicio;
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdTipoServicio() {
        return idTipoServicio;
    }

    public void setIdTipoServicio(Integer idTipoServicio) {
        this.idTipoServicio = idTipoServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
