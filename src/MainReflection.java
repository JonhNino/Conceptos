import com.uptc.model.AutorEntity;

import java.lang.reflect.Field;

public class MainReflection {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        AutorEntity autor = new AutorEntity();
        autor.setId(1L);
        autor.setNombre("Jonh Niño");
        autor.setCorreo("autor@correo.com");
        System.out.println(autor);
        useReflection(autor);
        System.out.println(autor);
    }

    public static void useReflection(AutorEntity autor) throws IllegalAccessException, NoSuchFieldException {
        Field[] listField =AutorEntity.class.getDeclaredFields();
        for (int i = 0; i <listField.length ; i++) {
            listField[i].setAccessible(true);
            System.out.println(listField[i].getName()+"--"+listField[i].get(autor));
        }
        Field nombre= AutorEntity.class.getDeclaredField("nombre");
        nombre.setAccessible(true);
        nombre.set(autor,"JonhF");
    }
}
