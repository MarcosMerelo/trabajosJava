import java.util.Scanner;
/**
 *
 * @author MarcosMerelo
 */
public class tiempo_Transcurrido {

    public static void main(String[] args) {
        
    
     int segundosIniciales;
     int segundos;
     int minutos;
     int horas;
     
     Scanner entrada = new Scanner (System.in);
     
    
     System.out.print("Ingrese los segundos");   
     segundosIniciales = entrada.nextInt();
     
     minutos = segundosIniciales / 60;
     segundos = segundosIniciales % 60;
     horas = minutos / 60;
     minutos = minutos % 60;
     System.out.println(segundosIniciales + "segundos son:" + horas + " horas, " + minutos + " min y " + segundos + "segundos");
  }