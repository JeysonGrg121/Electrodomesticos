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
//calse televisor Hija
public class Televisor extends Electrodomestico {
    // variable del hijo por defecto y que se pueden moficiar por el usuario
    private final static int ResolucionDefecto=20;
    private int resolucion;
    private boolean sintonizadorTDT;
    
    //metdo de precio final con el plus 
    public double precioFinal(){
        double plus=super.precioFinal();// se llama el plus del padre
        if (resolucion>40){// si el plus es mayor a 40 se le multiplica el 30%
            plus+=precioBase*0.3;
        }
        if (sintonizadorTDT){// es consicronozador tdt se le añade un plu mas 
            plus+=50;
        }
        return plus;// se retorna el plus
    }
    // contructo por defceto
    public Televisor(){
        this(PrecioBaseDefecto, PesoDefecto, ConsumoEnergeticoDefecto, ColorDefecto, ResolucionDefecto, false);
        
    }
    // contructor por defecto con 2 parametros
    public Televisor(double precioBase, double peso){
        this(precioBase, peso, ConsumoEnergeticoDefecto, ColorDefecto, ResolucionDefecto, false);
        
    }
        // contructor por defecto con todos lo paramentrso ingresados por el usuario
    public Televisor(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
       
    }
        // imprime los datos por defecto 
    public void imprimir(){
        System.out.println("Precio: "+PrecioBaseDefecto+"\nPeso: "+PesoDefecto+"\nConsumo"
            +ConsumoEnergeticoDefecto+"Color: "+ColorDefecto+"\nResolucion: "+
                ResolucionDefecto+"\nSincronizador TDT: "+false);
    }
    // imprime los datos por defecto con los parametros ingresados por el usuario
    public void imprimir2(){
        System.out.println("Precio: "+precioBase+"\nPeso: "+peso+
                "\nConsumo"+ConsumoEnergeticoDefecto+"Color: "+ColorDefecto+
                "\nResolucion: "+ResolucionDefecto+"\nSincronizador TDT: "+false);
    }
    // imprime los datos modificados por el usuario
    public void imprimir3(){
        System.out.println("Precio: "+precioBase+"\nPeso:"+peso+"\nConsumo:"
                +consumoEnergetico+"\nColor: "+color+"\nResolucion: "
                +resolucion+"\nSintonizador TDT: "+sintonizadorTDT);
    }
}

