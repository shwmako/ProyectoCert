package edu.pe.serviciomjcert.model;



import javax.persistence.*;


@Entity
public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTecnico;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String foto;

    @Column(nullable = false)
    private String dni;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false)
    private String correo;

    public Tecnico() {
    }

    public Tecnico(String apellido, String correo, String direccion, String dni, String foto, Integer idTecnico, String nombre) {
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.dni = dni;
        this.foto = foto;
        this.idTecnico = idTecnico;
        this.nombre = nombre;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Integer getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(Integer idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
