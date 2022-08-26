import java.util.List;

public class Titulo {
    //Variables
    public String titulo;
    public String edicion;
    public String isbn;
    List<Autor>autores;
    List<Categoria>categorias;
    //metodo constructor
    public Titulo (){
        System.out.println("El objeto titulo se creo");

    }
    public Titulo (String titulo, String edicion){
    this.titulo = titulo;
    this.edicion = edicion;

    }
}
