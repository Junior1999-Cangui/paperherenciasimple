package paperherenciasimple;
class DispositivoElectronico{
      double voltaje;
      double intensidad;
      
      void MostrarCaracteristicasPotencia(){
          System.out.println("El voltaje y la intensidad es: "
          +voltaje+"v  y " +intensidad+"A");
              }
          }
          
          //Herencia simple: Una sub clase de DispositivoElectrico es Sensor 1
          class Sensor1 extends DispositivoElectronico{
              String tipo;
              
              double CalcularPotencia(){
                  return voltaje*intensidad;
              }
              
              void mostrarTipo(){
                  System.out.println("El Tipo de Sensor es: "+tipo);
         
              }
          }
          //Herencia simple: Una subclase de DispositivoEñectrico es Sensor 2
          class Sensor2 extends DispositivoElectronico{
              String tipo;
              
              double CalcularPotencia(){
                  return voltaje*intensidad;
              }
              
              void mostrarTipo(){
                  System.out.println("El Tipo de Sensor es: "+tipo);
      }
}

/**
 *
 * @author Junior Steven Cangui Toapanta
 */
public class PaperHerenciaSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sensor1 sensor1=new Sensor1();
        Sensor2 sensor2=new Sensor2();
        
        sensor1.voltaje=8;
        sensor1.intensidad=2;
        sensor1.tipo="Sensor de Baja Potencia";  
                                       
        sensor2.voltaje=12;
        sensor2.intensidad=4;
        sensor2.tipo="Sensor de Alta potencia";
        
        System.out.println("\tUniversidad de las Fuerzas Armadas ESPE ");
        System.out.println("\t\tSede Latacunga");
        System.out.println("Estudiante: Junior Cangui");
        System.out.println("Carrera: Ingenieria Automotriz");
        System.out.println("Asignatura: Programacion [7450]");
        System.out.println("Tema: HERENCIA SIMPLE\n");
        
        System.out.println("Se muestra  los calculos obtenidos mediante dos sensores "
                + "que operan en un motor eléctrico\n");
        
        System.out.println("Informacion para el Sensor 1: ");
        sensor1.mostrarTipo();
        sensor1.MostrarCaracteristicasPotencia();
        System.out.println("La potencia medida por el sensor1 es: "+sensor1.CalcularPotencia()+"HP(horsepower)");
        System.out.println();
        
        System.out.println("Informacion para el Sensor 2: ");
        sensor2.mostrarTipo();
        sensor2.MostrarCaracteristicasPotencia();
        System.out.println("La potencia medida por el sensor1 es: "+sensor2.CalcularPotencia()+"HP(horsepower)");
    }                                  
    
    
}

