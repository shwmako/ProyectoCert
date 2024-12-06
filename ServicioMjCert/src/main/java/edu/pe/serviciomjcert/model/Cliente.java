package edu.pe.serviciomjcert.model;



import javax.persistence.*;


@Entity
public class Cliente {


    //
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String correo;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false)
    private String dni;

    @Column(nullable = false)
    private String telefono;

    public Cliente() {
    }

    public Cliente(String apellido, String correo, String direccion, String dni, Integer idCliente, String nombre, String telefono) {
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.dni = dni;
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.telefono = telefono;
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

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
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
}
