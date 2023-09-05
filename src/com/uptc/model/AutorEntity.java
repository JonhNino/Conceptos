package com.uptc.model;

import java.util.ArrayList;
import java.util.List;


public class AutorEntity {

    private Long id;
    private String nombre;
    private String correo;

    private List<MenssageEntity> mensajes;

    public AutorEntity(){
        System.out.println("Se creo Autor");
        mensajes= new ArrayList<>();
    }
    public List<MenssageEntity> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<MenssageEntity> mensajes) {
        this.mensajes = mensajes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
