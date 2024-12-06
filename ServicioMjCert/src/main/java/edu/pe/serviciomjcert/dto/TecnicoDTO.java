package edu.pe.serviciomjcert.dto;


import javax.validation.constraints.NotNull;

public class TecnicoDTO {

    //
    private Integer idTecnico;

    @NotNull
    private String nombreTecnico;

    @NotNull
    private String apellidoTecnico;

    @NotNull
    private String correoTecnico;

    @NotNull
    private String fotoTecnico;

    @NotNull
    private String dniTecnico;

    @NotNull
    private String direccionTecnico;

    public @NotNull String getApellidoTecnico() {
        return apellidoTecnico;
    }

    public void setApellidoTecnico(@NotNull String apellidoTecnico) {
        this.apellidoTecnico = apellidoTecnico;
    }

    public @NotNull String getCorreoTecnico() {
        return correoTecnico;
    }

    public void setCorreoTecnico(@NotNull String correoTecnico) {
        this.correoTecnico = correoTecnico;
    }

    public @NotNull String getDireccionTecnico() {
        return direccionTecnico;
    }

    public void setDireccionTecnico(@NotNull String direccionTecnico) {
        this.direccionTecnico = direccionTecnico;
    }

    public @NotNull String getDniTecnico() {
        return dniTecnico;
    }

    public void setDniTecnico(@NotNull String dniTecnico) {
        this.dniTecnico = dniTecnico;
    }

    public @NotNull String getFotoTecnico() {
        return fotoTecnico;
    }

    public void setFotoTecnico(@NotNull String fotoTecnico) {
        this.fotoTecnico = fotoTecnico;
    }

    public Integer getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(Integer idTecnico) {
        this.idTecnico = idTecnico;
    }

    public @NotNull String getNombreTecnico() {
        return nombreTecnico;
    }

    public void setNombreTecnico(@NotNull String nombreTecnico) {
        this.nombreTecnico = nombreTecnico;
    }
}
