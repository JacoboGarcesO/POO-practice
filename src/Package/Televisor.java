package Package;

public class Televisor extends Operaciones{
    public double valor_Televisores=0;
    String[] arr_Consumo_Televisores;
    String[] arr_Procedencia_Televisores;
    String[] arr_Pulgadas_Televisores;
    String[] arr_TDT_Televisores;
    public Televisor(String litros, String sintonizador, String pulgadas, String consumo, String procedencia, String procedencia_Nevera, String consumo_Nevera, String procedencia_Televisor, String consumo_Televisor){
        super(litros, sintonizador, pulgadas, consumo, procedencia, procedencia_Nevera, consumo_Nevera, procedencia_Televisor, consumo_Televisor);
        this.consumo=consumo_Televisor;
        this.procedencia=procedencia_Televisor;
        this.pulgadas=pulgadas;
        this.sintonizador=sintonizador;
    }
    public void infoTelevisor() {
        System.out.println("Consumo Televisor: " + this.consumo);
        System.out.println("Procedencia Televisor: " + this.procedencia);
        System.out.println("Pulgadas: " + this.pulgadas);
    }
    public void precio_Televisor(){
        arr_Consumo_Televisores=this.consumo.split("-");
        arr_Procedencia_Televisores=this.procedencia.split("-");
        arr_Pulgadas_Televisores=this.pulgadas.split("-");
        arr_TDT_Televisores=this.sintonizador.split("-");
        for (int i = 0; i < arr_Pulgadas_Televisores.length; i++) {

        }
        for (int i = 0; i < arr_Consumo_Televisores.length; i++) {
            switch (arr_Consumo_Televisores[i]){
                case "A":{
                    valor_Televisores+=400000;
                    break;
                }
                case "B":{
                    valor_Televisores+=350000;
                    break;
                }
                case "C":{
                    valor_Televisores+=250000;
                    break;
                }
            }
            if (arr_Procedencia_Televisores[i].equals("Nacional")){
                valor_Televisores+=250000;
            }else if (arr_Procedencia_Televisores[i].equals("Internacional")){
                valor_Televisores+=350000;
            }
            if(!(arr_Pulgadas_Televisores[i].equals(""))){
                if(Integer.parseInt(arr_Pulgadas_Televisores[i])>40){
                    valor_Televisores=valor_Televisores+(valor_Televisores*0.3);
                }
            }

            if (arr_TDT_Televisores[i].equals("Sí")){
                valor_Televisores+=250000;
            }

        }

        System.out.println("El precio total de los televisores es: "+valor_Televisores);
    }
}
