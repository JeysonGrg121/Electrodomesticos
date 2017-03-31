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

//clase elcetrodmdomestico padre
public class Electrodomestico {
    //variables del padre donde estan por defecto segun la hoja dada
    protected final static String ColorDefecto="blanco";//varaible del color por defecto
    protected final static char ConsumoEnergeticoDefecto='F';// consumo electrico por defecto
    protected final static double PrecioBaseDefecto=100; // precio por defecto
    protected final static double PesoDefecto=5; // peso por defecto
    protected double precioBase; // variable donde se guarda el precio que ingresa el usuario
    protected String color; // variable donde se gusrada el color segun el usuario
    protected char consumoEnergetico;// variable CHAR de consumo ( de la A a la F)
    protected double peso;// variable donde se guarda el peso del elecytrodomestico segun el usuario
    
    
    private void comprobarColor(String color){       // se compara el color con el ingresado por el usuario
        String colores[]={"blanco", "negro", "rojo", "azul", "gris","BLANCO","NEGRO","ROJO","AZUL","GRIS"};// array de lista de los colores en mayucula y miniscula
        boolean encontrado=false;// boolean para encontrar el color 
        for(int i=0;i<colores.length && !encontrado;i++){    // se recorre el array segun los colores y se compara segun  el ingresado por el usuario          
            if(colores[i].equals(color)){ // si esta dentro del los colores del array entonces es true" verdadero"
                encontrado=true; // se cambia el valor de la variable encontrado a True
            }              
        }          
        if(encontrado){//si el color fue encontrado en el array 
            this.color=color; // le asigna a color la variable del padre
        }else{
            this.color=ColorDefecto;// si no e color es por defecto BLANCo
        } 
    }
    // metodo comparar consummo energetico
   public void comprobarConsumoEnergetico(char consumoEnergetico){   // el metodo recibe el consumo       
        if(consumoEnergetico>=65 && consumoEnergetico<=70){// si el consimo es entre 65 y 70 le asigna a la variabl del padre
            this.consumoEnergetico=consumoEnergetico;
        }else{// si no el consumo es por defecto
            this.consumoEnergetico=ConsumoEnergeticoDefecto;
        }          
    }
   // get para obtener el precio
    public double getPrecioBase() {
        return precioBase;
    }
    // get para obtener el color
    public String getColor() {
        return color;
    }
    // get para obtener el consumo energetico
     public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
     //get par obtener el peso
    public double getPeso() {
        return peso;
    }
    //metodo del precio final
    public double precioFinal(){
        double plus=0; // el plus es un variable para aumentar al consumo energetico segun su clase  solo en mayusculas
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
        if(peso>=0 && peso<19){// dependiendo del peso tambien se le añade un precio mas alto
            plus+=10;
        }else if(peso>=20 && peso<49){
            plus+=50;
        }else if(peso>=50 && peso<=79){
            plus+=80;
        }else if(peso>=80){
            plus+=100;
        }   
        return precioBase+plus;// se retorna el precio con el plus
    }
    // contructo por defecto
    public Electrodomestico(){
        this(PrecioBaseDefecto, PesoDefecto, ConsumoEnergeticoDefecto, ColorDefecto);                        
    }
    //contructor por defecto con 2 paramentros ingresados por el usuario
     public Electrodomestico(double precioBase, double peso){
        this(precioBase, peso, ConsumoEnergeticoDefecto, ColorDefecto);
        
    }   
    // contructor con todo los paramentros ingresado por el usuario
      public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
        
    }
    
}
