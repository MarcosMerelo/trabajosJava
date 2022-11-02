import java.util.Scanner;

/**
 *
 * @author MarcosMerelo
 */
public class PM_AM {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
    String am_pm;
    int horas;
    int minutos;
    System.out.println("Ingrese horas [Formato 24]");
    horas = entrada.nextInt();
    System.out.println("Ingrese minutos");
    minutos = entrada.nextInt();
    If ((horas < 0 || horas > 24)); {
     System.out.println("Valor incorrecto");
    } else {
       If (horas > 12); {
          horas = horas - 12;
          am_pm = "PM";
        } else {
             am_pm = "AM";
        }     
        System.out.println("La hora es " + horas + ":" + minutos + " " + am_pm);
        }
    }

    private static void If(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}   
