public class Autor {
    //variables globales
    String nombre;
    String primerApellido;
    String segundoApellido;
    //metodo constructor
    public Autor(){
    }
    //primera sobrecarga
    public Autor(String nombre, String primerApellido){
        this.nombre = nombre;
                this.primerApellido = primerApellido;

    }
    public Autor(String nombre, String primerApellido, String segundoApellido){
    this.nombre = nombre;
    this.primerApellido = primerApellido;
    this.segundoApellido = segundoApellido;
    }
}
