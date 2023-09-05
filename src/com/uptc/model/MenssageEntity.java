package com.uptc.model;

import com.uptc.decorator.Entity;

import java.util.Date;
import java.util.List;

@Entity(table ="MESSAGE")
public class MenssageEntity {
    private Long id;
    private Integer num;
    private String texto;
    private Date fecha;

    private AutorEntity autor;

    public AutorEntity getAutor() {
        return autor;
    }

    public void setAutor(AutorEntity autor) {
        this.autor = autor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
