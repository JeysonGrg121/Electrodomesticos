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
public class Electrodomestico {
    protected final static String ColorDefecto="blanco";
    protected final static char ConsumoEnergeticoDefecto='F';
    protected final static double PrecioBaseDefecto=100;
    protected final static double PesoDefecto=5;
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    
    
    private void comprobarColor(String color){       
        String colores[]={"blanco", "negro", "rojo", "azul", "gris","BLANCO","NEGRO","ROJO","AZUL","GRIS"};
        boolean encontrado=false;  
        for(int i=0;i<colores.length && !encontrado;i++){              
            if(colores[i].equals(color)){
                encontrado=true;
            }              
        }          
        if(encontrado){
            this.color=color;
        }else{
            this.color=ColorDefecto;
        } 
    }
   public void comprobarConsumoEnergetico(char consumoEnergetico){          
        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=ConsumoEnergeticoDefecto;
        }          
    }
    public double getPrecioBase() {
        return precioBase;
    }
    public String getColor() {
        return color;
    }
     public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public double getPeso() {
        return peso;
    }
    public double precioFinal(){
        double plus=0;
        switch(consumoEnergetico){
            case 'A':
                plus+=100;
                break;
            case 'B':
                plus+=80;
                break;
            case 'C':
                plus+=60;
                break;
            case 'D':
                plus+=50;
                break;
            case 'E':
                plus+=30;
                break;
            case 'F':
                plus+=10;
                break;
        }   
        if(peso>=0 && peso<19){
            plus+=10;
        }else if(peso>=20 && peso<49){
            plus+=50;
        }else if(peso>=50 && peso<=79){
            plus+=80;
        }else if(peso>=80){
            plus+=100;
        }   
        return precioBase+plus;
    }
    public Electrodomestico(){
        this(PrecioBaseDefecto, PesoDefecto, ConsumoEnergeticoDefecto, ColorDefecto);
        
                
    }
     public Electrodomestico(double precioBase, double peso){
        this(precioBase, peso, ConsumoEnergeticoDefecto, ColorDefecto);
        
    }   
    
      public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
        
    }
    public void ImprimirDefecto(){
        System.out.println("Precio: "+PrecioBaseDefecto +"\nPeso: "
                + PesoDefecto+"\nConsumo: "+ ConsumoEnergeticoDefecto+"\nColor "
                +  ColorDefecto);
    }
    public void ImprimirPrecioPeso(){
        System.out.println("Precio: "+ precioBase+"\nPeso: "+peso+"\nConsumo: "
                + ConsumoEnergeticoDefecto+"\nColor "+  ColorDefecto);
    }
    public void ImprmirTodo(){
        System.out.println("Precio: "+ precioBase+"\nPeso: "+peso+"\nConsumo: "
                +consumoEnergetico+"\nColor:"+color);
    }
   
    
}
