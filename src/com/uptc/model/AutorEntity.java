package com.uptc.model;

<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.List;

>>>>>>> 948fe23 (1/9/23 Sin el for)
public class AutorEntity {

    private Long id;
    private String nombre;
    private String correo;
<<<<<<< HEAD
=======
    private List<MenssageEntity> messageEntity;
    public AutorEntity(){
        System.out.println("Se creo un nuevo autor");
        messageEntity=new ArrayList<>();
    }

    public List<MenssageEntity> getMessageEntity() {
        return messageEntity;
    }

    public void setMessageEntity(List<MenssageEntity> messageEntity) {
        this.messageEntity = messageEntity;
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
>>>>>>> 948fe23 (1/9/23 Sin el for)
}
