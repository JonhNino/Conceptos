import com.uptc.model.AutorEntity;
import com.uptc.model.MenssageEntity;

public class Main {
    public static void main(String[] args) {
        AutorEntity autorEntity = new AutorEntity();
        autorEntity.setId(123L);
        autorEntity.setNombre("Jonh Niño");
        System.out.println(autorEntity.getId()) ;

        MenssageEntity menssageEntity = new MenssageEntity();
        menssageEntity.setAutorEntity(autorEntity);
        autorEntity.getMessageEntity().add(menssageEntity);
        menssageEntity.setTexto("HOla Mensaje");

        System.out.println(menssageEntity.getAutorEntity().getNombre());

    }
}