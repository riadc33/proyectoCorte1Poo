
public abstract class Persona {
   private  int identificación;
   private String nombre;

    public Persona() {
    }

    public Persona(int identificación, String nombre) {
        this.identificación = identificación;
        this.nombre = nombre;
    }

    public int getIdentificación() {
        return identificación;
    }

    public void setIdentificación(int identificación) {
        this.identificación = identificación;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
 
    
}
