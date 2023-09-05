import com.uptc.model.AutorEntity;
import com.uptc.model.MenssageEntity;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AutorEntity autor = new AutorEntity();
        autor.setId(123L);
        autor.setNombre("Jonh Niño");
        System.out.println(autor.getId()) ;
        System.out.println(autor.getNombre()) ;
        MenssageEntity menssage1 = new MenssageEntity();
        menssage1.setAutor(autor);

        autor.getMensajes().add(menssage1);
        menssage1.setTexto("Hola Mensaje");
        System.out.println(menssage1.getTexto());
        System.out.println(menssage1.getAutor().getNombre());
        for (int i = 0; i < autor.getMensajes().size(); i++) {
            System.out.println(autor.getMensajes().get(i).getTexto());
        }

    }
}