package Package;

public class Electrodomesticos extends Operaciones{
    public float valor_Electrodomesticos=0;
    String[] arr_Consumo_Electrodomesticos;
    String[] arr_Procedencia_Electrodomesticos;
    public Electrodomesticos(String litros, String sintonizador, String pulgadas, String consumo, String procedencia, String procedencia_Nevera, String consumo_Nevera, String procedencia_Televisor, String consumo_Televisor){
        super(litros, sintonizador,pulgadas,consumo, procedencia, procedencia_Nevera, consumo_Nevera, procedencia_Televisor, consumo_Televisor);
        this.consumo=consumo;
        this.procedencia=procedencia;
    }
    public void infoElectrodomesticos() {
        System.out.println("Consumo: " + this.consumo);
        System.out.println("Procedencia: " + this.procedencia);
    }
    public void precio_Electrodomesticos(){
        arr_Consumo_Electrodomesticos=this.consumo.split("-");
        arr_Procedencia_Electrodomesticos=this.procedencia.split("-");
        for (int i = 0; i < arr_Consumo_Electrodomesticos.length; i++) {
            switch (arr_Consumo_Electrodomesticos[i]){
                case "A":{
                    valor_Electrodomesticos+=400000;
                    break;
                }
                case "B":{
                    valor_Electrodomesticos+=350000;
                    break;
                }
                case "C":{
                    valor_Electrodomesticos+=250000;
                    break;
                }
            }
            if (arr_Procedencia_Electrodomesticos[i].equals("Nacional")){
                valor_Electrodomesticos+=250000;
            }else if (arr_Procedencia_Electrodomesticos[i].equals("Internacional")){
                valor_Electrodomesticos+=350000;
            }
        }
        System.out.println("El precio total de los electrodomésticos es: "+valor_Electrodomesticos);
    }
}
