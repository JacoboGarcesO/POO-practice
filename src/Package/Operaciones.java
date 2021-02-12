package Package;

public class Operaciones {
    public String litros;
    public String sintonizador;
    public String pulgadas;
    public String consumo;
    public String procedencia;
    public String procedencia_Nevera;
    public String consumo_Nevera;
    public String procedencia_Televisor;
    public String consumo_Televisor;
    public Operaciones(String litros,String sintonizador,String pulgadas, String consumo, String procedencia, String procedencia_Nevera, String consumo_Nevera, String procedencia_Televisor, String consumo_Televisor){
        this.procedencia=procedencia;
        this.consumo=consumo;
        this.procedencia_Nevera=procedencia_Nevera;
        this.consumo_Nevera=consumo_Nevera;
        this.procedencia_Televisor=procedencia_Televisor;
        this.consumo_Televisor=consumo_Televisor;
        this.pulgadas=pulgadas;
        this.sintonizador=sintonizador;
        this.litros=litros;
    }
}

