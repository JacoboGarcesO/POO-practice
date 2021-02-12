package Package;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int opciones;
        String pulgadas="";
        String sintonizador="";
        String litros="";
        String procedencia="";
        String consumo="";
        String procedencia_Nevera="";
        String consumo_Nevera="";
        String procedencia_Televisor="";
        String consumo_Televisor="";
        Scanner sc = new Scanner(System.in);
        boolean controller=true;
        while(controller){
            System.out.println("-----------OPCIONES-----------");
            System.out.println("1. Ingresar compra de nevera.");
            System.out.println("2. Ingresar compra de televisor.");
            System.out.println("3. Ingresar compra de electrodoméstico.");
            System.out.println("4. Ver total a pagar.");
            System.out.println("5. Salir.");
            opciones=sc.nextInt();
            switch (opciones){
                case 1:{
                    System.out.println("Ingrese la procedencia de la nevera: ");
                    System.out.println("Nacional - Internacional");
                    procedencia_Nevera += sc.next()+"-";
                    System.out.println("Ingrese el consumo de la nevera: ");
                    System.out.println("A - B - C");
                    consumo_Nevera += sc.next()+"-";
                    System.out.println("Ingrese los litros de capacidad que tiene la nevera: ");
                    litros += sc.next()+"-";
                    Nevera nevera=new Nevera(litros,sintonizador,pulgadas,consumo,procedencia, procedencia_Nevera,consumo_Nevera, procedencia_Televisor, consumo_Televisor);
                    nevera.infoNevera();
                    break;
                }
                case 2:{
                    System.out.println("Ingrese la procedencia del televisor: ");
                    System.out.println("Nacional - Internacional");
                    procedencia_Televisor += sc.next()+"-";
                    System.out.println("Ingrese el consumo del televisor: ");
                    System.out.println("A - B - C");
                    consumo_Televisor += sc.next()+"-";
                    System.out.println("Ingrese las pulgadas del televisor: ");
                    pulgadas += sc.next()+"-";
                    System.out.println("¿Desea llevar sintonizador TDT incluido? (Sí/No): ");
                    sintonizador += sc.next()+"-";
                    Televisor televisor=new Televisor(litros,sintonizador,pulgadas,consumo,procedencia, procedencia_Nevera,consumo_Nevera, procedencia_Televisor, consumo_Televisor);
                    televisor.infoTelevisor();
                    break;
                }
                case 3:{
                    System.out.println("Ingrese la procedencia del electrodoméstico: ");
                    System.out.println("Nacional - Internacional");
                    procedencia += sc.next()+"-";
                    System.out.println("Ingrese la consumo del electrodoméstico: ");
                    System.out.println("A - B - C");
                    consumo += sc.next()+"-";
                    Electrodomesticos electrodomesticos=new Electrodomesticos(litros,sintonizador,pulgadas,consumo,procedencia, procedencia_Nevera,consumo_Nevera, procedencia_Televisor, consumo_Televisor);
                    electrodomesticos.infoElectrodomesticos();
                    break;
                }
                case 4:{
                    Nevera nevera=new Nevera(litros,sintonizador,pulgadas,consumo,procedencia, procedencia_Nevera,consumo_Nevera, procedencia_Televisor, consumo_Televisor);
                    nevera.precio_Nevera();

                    Electrodomesticos electrodomesticos=new Electrodomesticos(litros,sintonizador,pulgadas,consumo,procedencia, procedencia_Nevera,consumo_Nevera, procedencia_Televisor, consumo_Televisor);
                    electrodomesticos.precio_Electrodomesticos();

                    Televisor televisor=new Televisor(litros,sintonizador,pulgadas,consumo,procedencia, procedencia_Nevera,consumo_Nevera, procedencia_Televisor, consumo_Televisor);
                    televisor.precio_Televisor();

                    break;
                }
                case 5:{
                    System.out.println("Vuelva pronto...");
                    controller=false;
                    break;
                }
                default:{
                    System.out.println("Ingrese una opción válida...");
                    break;
                }
            }
        }
    }
}
