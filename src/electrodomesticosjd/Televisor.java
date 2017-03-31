/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticosjd;

/**
 *
 * @author Carlos
 */
public class Televisor extends Electrodomestico {
    private final static int ResolucionDefecto=20;
    private int resolucion;
    private boolean sintonizadorTDT;
    
    public double precioFinal(){
        double plus=super.precioFinal();
        if (resolucion>40){
            plus+=precioBase*0.3;
        }
        if (sintonizadorTDT){
            plus+=50;
        }
        return plus;
    }
    public Televisor(){
        this(PrecioBaseDefecto, PesoDefecto, ConsumoEnergeticoDefecto, ColorDefecto, ResolucionDefecto, false);
        
    }
    
    public Televisor(double precioBase, double peso){
        this(precioBase, peso, ConsumoEnergeticoDefecto, ColorDefecto, ResolucionDefecto, false);
        
    }
    
    public Televisor(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
       
    }
    public void imprimir(){
        System.out.println("Precio: "+PrecioBaseDefecto+"\nPeso: "+PesoDefecto+"\nConsumo"
            +ConsumoEnergeticoDefecto+"Color: "+ColorDefecto+"\nResolucion: "+
                ResolucionDefecto+"\nSincronizador TDT: "+false);
    }
    public void imprimir2(){
        System.out.println("Precio: "+precioBase+"\nPeso: "+peso+
                "\nConsumo"+ConsumoEnergeticoDefecto+"Color: "+ColorDefecto+
                "\nResolucion: "+ResolucionDefecto+"\nSincronizador TDT: "+false);
    }
    public void imprimir3(){
        System.out.println("Precio: "+precioBase+"\nPeso:"+peso+"\nConsumo:"
                +consumoEnergetico+"\nColor: "+color+"\nResolucion: "
                +resolucion+"\nSintonizador TDT: "+sintonizadorTDT);
    }
}

