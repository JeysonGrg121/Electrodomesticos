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
public class Lavadora extends Electrodomestico {
    private final static int CargaDefecto=5;
    private int carga;
    
    public int getCarga() {
        return carga;
    }
    
    public double precioFinal(){        
        double plus=super.precioFinal();  
        if (carga>30){
            plus+=50;
        }  
        return plus;
    }
    
    public Lavadora(){
        this(PrecioBaseDefecto, PesoDefecto, ConsumoEnergeticoDefecto, ColorDefecto, CargaDefecto);
        
    }
    
    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, ConsumoEnergeticoDefecto, ColorDefecto, CargaDefecto);
       
    }
    
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
        
    }
    
    public void ImprimirDefectolavadora(){
        System.out.println("Precio: "+PrecioBaseDefecto +"\nPeso: "+ PesoDefecto
                +"\nConsumo: "+ConsumoEnergeticoDefecto+"\nColor "
                +  ColorDefecto+"\nCarga:"+CargaDefecto);
    }
    
    public void ImprimirPrecioPesolavadora(){
        System.out.println("Precio: "+ precioBase+"\nPeso: "+peso+"\nConsumo: "
                + ConsumoEnergeticoDefecto+"\nColor "+ColorDefecto+"\nCarga:"+CargaDefecto);
    }
    
    public void ImprmirTodolavadora(){
        System.out.println("Precio: "+ precioBase+"\nPeso: "+peso+"\nConsumo: "
                +consumoEnergetico+"\nColor:"+color+"\n Carga:"+carga);
    }
    
    
}
