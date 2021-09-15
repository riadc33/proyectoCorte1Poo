
public class Estudiante extends Persona {
    private String programa;
    private double promedio;

    public Estudiante() {
    }

    public Estudiante(String programa, double promedio, int identificación, String nombre) {
        super(identificación, nombre);
        this.programa = programa;
        this.promedio = promedio;
    }


    @Override
  public String toString(){
  return  "ID: "+ this.getIdentificación() + "\nNombre: "+ this.getNombre()+ "\nPrograma: "+ this.getPrograma()+ "\nPromedio: "+ this.getPromedio() ;
  }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
   }
