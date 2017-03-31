/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticosjd;

/**
 *
 * @author Jeyson Duarte
 */

// clase lavadora hija
public class Lavadora extends Electrodomestico {
    // variables de la hija
    private final static int CargaDefecto=5; // carga por defecto
    private int carga;// cariable donde se guarda la carga segun el usuario
    
    // get para obtener la carga
    public int getCarga() {
        return carga;
    }
    // metodo para el precio final de la lavadora
    public double precioFinal(){        
        double plus=super.precioFinal();  // se llama el precio final del padre
        if (carga>30){// siempre y cunado el precio final sea mayor a 30 se le hace un plus de 50
            plus+=50;
        }  
        return plus;// se retorna el plus modificado
    }
    // contructor por defecto
    public Lavadora(){
        this(PrecioBaseDefecto, PesoDefecto, ConsumoEnergeticoDefecto, ColorDefecto, CargaDefecto);
        
    }
    // contructor por defecto con 2 parametros
    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, ConsumoEnergeticoDefecto, ColorDefecto, CargaDefecto);
       
    }
    // contructor por defecto con todos lo paramentrso ingresados por el usuario
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
        
    }
    // imprime los datos por defecto
    public void ImprimirDefectolavadora(){
        System.out.println("Precio: "+PrecioBaseDefecto +"\nPeso: "+ PesoDefecto
                +"\nConsumo: "+ConsumoEnergeticoDefecto+"\nColor "
                +  ColorDefecto+"\nCarga:"+CargaDefecto);
    }
    // imprime los datos por defecto con los dos paramentros ingresados por el usuario
    public void ImprimirPrecioPesolavadora(){
        System.out.println("Precio: "+ precioBase+"\nPeso: "+peso+"\nConsumo: "
                + ConsumoEnergeticoDefecto+"\nColor "+ColorDefecto+"\nCarga:"+CargaDefecto);
    }
    // imprime todo los parametrso ingresados por el usuario
    public void ImprmirTodolavadora(){
        System.out.println("Precio: "+ precioBase+"\nPeso: "+peso+"\nConsumo: "
                +consumoEnergetico+"\nColor:"+color+"\n Carga:"+carga);
    }
    
    
}
