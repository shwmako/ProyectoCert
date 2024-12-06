package edu.pe.serviciomjcert.model;




import javax.persistence.*;


@Entity
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSolicitud;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String correo;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private String tipoServicio;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = true)
    private String estado;

    public Solicitud() {
    }

    public Solicitud(String apellido, String correo, String descripcion, String estado, Integer idSolicitud, String nombre, String telefono, String tipoServicio) {
        this.apellido = apellido;
        this.correo = correo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.idSolicitud = idSolicitud;
        this.nombre = nombre;
        this.telefono = telefono;
        this.tipoServicio = tipoServicio;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(Integer idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
}
