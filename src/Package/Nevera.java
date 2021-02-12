package Package;

public class Nevera extends Operaciones{
    public double valor_Neveras=0;
    int litros_1=0;
    String[] arr_Litros_Nevera;
    String[] arr_Consumo_Neveras;
    String[] arr_Procedencia_Neveras;
    public Nevera(String litros, String sintonizador, String pulgadas, String consumo, String procedencia, String procedencia_Nevera, String consumo_Nevera, String procedencia_Televisor, String consumo_Televisor){
        super(litros, sintonizador, pulgadas, consumo, procedencia, procedencia_Nevera, consumo_Nevera, procedencia_Televisor, consumo_Televisor);
        this.consumo=consumo_Nevera;
        this.procedencia=procedencia_Nevera;
        this.litros=litros;
    }
    public void infoNevera() {
        System.out.println("Consumo Nevera: " + this.consumo);
        System.out.println("Procedencia Nevera: " + this.procedencia);
    }
    public void precio_Nevera(){
        arr_Consumo_Neveras=this.consumo.split("-");
        arr_Procedencia_Neveras=this.procedencia.split("-");
        arr_Litros_Nevera=this.litros.split("-");
        for (int i = 0; i < arr_Consumo_Neveras.length; i++) {
            litros_1=Integer.parseInt(arr_Litros_Nevera[i]);
            switch (arr_Consumo_Neveras[i]){
                case "A":{
                    valor_Neveras+=400000;
                    break;
                }
                case "B":{
                    valor_Neveras+=350000;
                    break;
                }
                case "C":{
                    valor_Neveras+=250000;
                    break;
                }
            }
            if (arr_Procedencia_Neveras[i].equals("Nacional")){
                valor_Neveras+=250000;
            }else if (arr_Procedencia_Neveras[i].equals("Internacional")) {
                valor_Neveras+=350000;
            }
            if(litros_1>120){
                while(litros_1>=120){
                    valor_Neveras=valor_Neveras+(valor_Neveras*0.05);
                    litros_1-=5;
                }
            }
        }

        System.out.println("El precio total de las neveras es: "+valor_Neveras);
    }
}

