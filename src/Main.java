
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class Main {
     public static void main(String[] args) {
      Estudiante estudiantes[] = new Estudiante[]{};
        char activate;
        double promedioMax=0;
        double promedioMin=0;
        
       do{

           
         activate=JOptionPane.showInputDialog( "Elija una opción"+"\n"
                                      +"1. Ingresar estudiante"+ 
                                      "\n2. Promedio mas alto\n" +
                                       "3. Promedio mas bajo\n"
                                      +"4. Lista estudiantes\n" +
                                       "5. Salir\n\n").charAt(0);
         
         
        switch(activate){
            case '1':
                int identificación = Integer.parseInt(JOptionPane.showInputDialog(null, "identificación:"));
                 String nombre = JOptionPane.showInputDialog(null, "nombre:");
                 String programa = JOptionPane.showInputDialog(null, "programa:");
                 double promedio = Double.parseDouble(JOptionPane.showInputDialog(null, "promedio:"));
                 Estudiante e = new Estudiante(programa, promedio, identificación, nombre);
                 Estudiante _estudiantes[] = new Estudiante[estudiantes.length + 1];
                for (int i = 0; i < _estudiantes.length; i++) {
                    if(i == _estudiantes.length - 1) {
                        _estudiantes[i] = e;    
                    } else {
                        _estudiantes[i] = estudiantes[i];
                    }
                }
                estudiantes= new Estudiante[]{};
                estudiantes = _estudiantes;
                 JOptionPane.showMessageDialog(null,  e.toString());
                 
                 
                break;
                
           case '2':
               if(estudiantes.length>0){
                   
                 
               Estudiante promMax=new Estudiante("",0,-1,"");
               for (int i = 0; i < estudiantes.length; i++) {
               if(estudiantes[i].getPromedio()>promedioMax){
                   promedioMax=estudiantes[i].getPromedio();
                   promMax=estudiantes[i];
               }
               
           }
                JOptionPane.showMessageDialog(null,  "promedio mas alto: \n " + promMax);
            }else{
                     JOptionPane.showMessageDialog(null,  "No hay estudiantes ");
                     break;
                 }   
               break;
               
           case '3':
                 Estudiante promMin=new Estudiante("",0,-1,"");
                 if(estudiantes.length>0){
                   promedioMin= estudiantes[0].getPromedio();
                   promMin=estudiantes[0];
                 }else{
                     JOptionPane.showMessageDialog(null,  "No hay estudiantes ");
                     break;
                 }
               for (int i = 0; i < estudiantes.length; i++) {
               if(estudiantes[i].getPromedio()<promedioMin){
                   promedioMin=estudiantes[i].getPromedio();
                   promMin=estudiantes[i];
               }
               
           }
                JOptionPane.showMessageDialog(null,  "promedio mas bajo: \n  " + promMin);
               

               break;
               
          case '4':
              if(estudiantes.length>0){
              String lista="";
              for (int i = 0; i < estudiantes.length; i++) {
               lista+= estudiantes[i]+"\n";
               }

              JOptionPane.showMessageDialog(null,  "Lista de estudiantes: \n " + lista);
              break;
              }else{
              JOptionPane.showMessageDialog(null,  "No hay estudiantes ");
              break;
              }
         case '5':
             break;
        }
       }while(activate!='5');
         
       }
         
     }


