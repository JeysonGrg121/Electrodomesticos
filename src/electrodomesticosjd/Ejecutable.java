/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomesticosjd;


import java.util.Scanner;

/**
 *
 * @author Carlos
 */

public class Ejecutable {
    Electrodomestico lista[]= new Electrodomestico[10];            
    double sumaElectrodomesticos=0;
    double sumaTelevisores=0;
    double sumaLavadoras=0;
    Scanner entrada =  new Scanner (System.in);
    
    public void Llenarlista(){   
        
    
    }
  
    public void recorerLiista(){
        for(int i=0;i<lista.length;i++){
        if(lista[i] instanceof Electrodomestico){
            sumaElectrodomesticos+=lista[i].precioFinal();
            }
        if(lista[i] instanceof Lavadora){
            sumaLavadoras+=lista[i].precioFinal();
            }
        if(lista[i] instanceof Televisor){
            sumaTelevisores+=lista[i].precioFinal();
            }
        }
    }
   
    public void ResultadosMenu(){
        recorerLiista();
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisores);
   
    }
    public void Menu(){
        int desicion = -1;
        while(desicion !=0){
            System.out.println("....Bienvenido...\nElectrodimestico a Seleccionar");
            System.out.println("1. Electrodomestico General \n2. Lavadora \n3. Televisor \n0. Salir ");
            desicion = entrada.nextInt();
            switch(desicion){
                case 0:
                    System.out.println("Garcias...");
                    break;
                case 1:
                    MenuElectrodomesticoGeneral();
                    break;
                case 2:
                     MenuLavadora();
                    break;
                case 3: 
                    MenuTelevisor();
                    break;
                default:
                    System.out.println("No esta dentros de las opciones...\n"
                            + "Intenta de nuevo\n");
            }
        }
    }
    public void MenuElectrodomesticoGeneral(){
        int desicion = -1;
        while(desicion !=0){
            System.out.println("Menu Electrodomestico Genral\n Elige una Opcion");
            System.out.println("1. Por Defecto \n2. Precio Base Y Peso"
                    + " \n3. Precio Bese, Peso, Consumo Energetico Y Color \n0. Salir ");
            desicion = entrada.nextInt();
            switch(desicion){
                case 0:
                   break;
                case 1:
                    GeneralDefecto();
                    break;
                case 2: 
                    PrecioCaseYPeso();
                    break;
                case 3:
                    TodoGeneral();
                    break;
                default:
                    System.out.println("No esta dentros de las opciones...\n"
                            + "Intenta de nuevo\n");                    
            }
        }
    }
    public void GeneralDefecto(){
        Electrodomestico electrodomestico =  new Electrodomestico(); 
        electrodomestico.ImprimirDefecto();
    }
    public void PrecioCaseYPeso(){
        double precioBase;
        double peso;
        System.out.println("Ingrese valor del Precio: ");
        precioBase = entrada.nextDouble();
        System.out.println("Ingrese valor del Peso: ");
        peso = entrada.nextDouble();        
        Electrodomestico electrodomestico =  new Electrodomestico(precioBase,peso);
        electrodomestico.ImprimirPrecioPeso();
        
    }

    public void TodoGeneral(){
        double precioBase;
        double peso;
        char consumoEnergetico;
        String color;
        System.out.println("Ingrese valor del Precio: ");
        precioBase = entrada.nextDouble();
        System.out.println("Ingrese valor del Peso: ");
        peso = entrada.nextDouble();  
        System.out.println("Ingrese la letra del Consumo: ");
        consumoEnergetico = entrada.next().charAt(0);
        System.out.println("Ingrese el color:");
        color = entrada.next();
        Electrodomestico electrodomestico =  new Electrodomestico(precioBase,peso,consumoEnergetico,color);
        electrodomestico.ImprmirTodo();
    }
  
    public void MenuLavadora(){
        int desicion = -1;
        while(desicion !=0){
            System.out.println("Menu Lavadora \n Elige una Opcion");
            System.out.println("1. Por Defecto \n2. Precio Base Y Peso"
                    + " \n3. Precio Bese, Peso, Consumo Energetico Y Color \n0. Salir ");
            desicion = entrada.nextInt();
            switch(desicion){
                case 0:
                   break;
                case 1:
                    lavadoraDefecto();
                    break;
                case 2: 
                    lavadorapesoyprecio();
                    break;
                case 3:
                    lavadoratodo();                            
                    break;
                default:
                    System.out.println("No esta dentros de las opciones...\n"
                            + "Intenta de nuevo\n");                    
            }
        }
    }
    public void lavadoraDefecto(){
        Lavadora lavadora = new Lavadora();
        lavadora.ImprimirDefectolavadora();
    }
    public void lavadorapesoyprecio(){
        double precioBase;
        double peso;
        System.out.println("Ingrese valor del Precio: ");
        precioBase = entrada.nextDouble();
        System.out.println("Ingrese valor del Peso: ");
        peso = entrada.nextDouble();  
        Lavadora lavadora = new Lavadora(precioBase, peso);
        lavadora.ImprimirPrecioPesolavadora();
    }
    public void lavadoratodo(){
        double precioBase;
        double peso;
        char consumoEnergetico;
        String color;
        int carga;
        System.out.println("Ingrese valor del Precio: ");
        precioBase = entrada.nextDouble();
        System.out.println("Ingrese valor del Peso: ");
        peso = entrada.nextDouble();  
        System.out.println("Ingrese la letra del Consumo: ");
        consumoEnergetico = entrada.next().charAt(0);
        System.out.println("Ingrese el color:");
        color = entrada.next();
        System.out.println("Ingrese Valor carga: ");
        carga = entrada.nextInt();
        Lavadora lavadora = new Lavadora(precioBase,peso,consumoEnergetico,color,carga);
        lavadora.ImprmirTodolavadora();
    }
    
    public void MenuTelevisor(){
        int desicion = -1;
        while(desicion !=0){
            System.out.println("Menu Televisor \n Elige una Opcion");
            System.out.println("1. Por Defecto \n2. Precio Base Y Peso"
                    + " \n3. Precio Bese, Peso, Consumo Energetico Y Color \n0. Salir ");
            desicion = entrada.nextInt();
            switch(desicion){
                case 0:
                   break;
                case 1:
                    televisorGeneral();
                    break;
                case 2: 
                    televsorpesoyprecio();
                    break;
                case 3:
                    televisortodo();                                            
                    break;
                default:
                    System.out.println("No esta dentros de las opciones...\n"
                            + "Intenta de nuevo\n");                    
            }
        }
    }
    public void televisorGeneral(){
        Televisor televisor = new Televisor();
        televisor.imprimir();
    }
    public void televsorpesoyprecio(){
        double precioBase;
        double peso;
        System.out.println("Ingrese valor del Precio: ");
        precioBase = entrada.nextDouble();
        System.out.println("Ingrese valor del Peso: ");
        peso = entrada.nextDouble();
        Televisor televisor = new Televisor(precioBase, peso);  
        televisor.imprimir2();
    }
    public void televisortodo(){
        double precioBase;
        double peso;
        char consumoEnergetico;
        String color;
        int resolucion;
        boolean sintonizadorTDT;
        System.out.println("Ingrese valor del Precio: ");
        precioBase = entrada.nextDouble();
        System.out.println("Ingrese valor del Peso: ");
        peso = entrada.nextDouble();  
        System.out.println("Ingrese la letra del Consumo: ");
        consumoEnergetico = entrada.next().charAt(0);
        System.out.println("Ingrese el color:");
        color = entrada.next();
        System.out.println("Ingrese El valor de la Resolucion: ");
        resolucion = entrada.nextInt();
        System.out.println("Sintonizador TDT:");
        sintonizadorTDT = entrada.nextBoolean();
        Televisor televisor = new Televisor(precioBase, peso,consumoEnergetico,color,resolucion,sintonizadorTDT);
        televisor.imprimir3();
        
    }
    
}
    

