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
//clase ejecutable
public class Ejecutable {
    Electrodomestico lista[]= new Electrodomestico[10]; // array de 10 posiciones donde se guardara cada electrodomesticos       
    double sumaElectrodomesticos=0; // un contador iniciado en ceros para la suma de electrodomesticos
    double sumaTelevisores=0; // contador de televisores en total
    double sumaLavadoras=0; // contador de lavadoras en total
    Scanner entrada =  new Scanner (System.in);// variable para leer cada entrada por consola
    
    private Electrodomestico eletro;
    
    
//metdod que recorre el array
    public void recorerLiista(){
        for(int i=0;i<lista.length;i++){
            if(lista[i] instanceof Electrodomestico){//El operador instanceof nos permite comprobar si un objeto es de una clase concreta.
                sumaElectrodomesticos+=lista[i].precioFinal();
            }if(lista[i] instanceof Lavadora){//El operador instanceof nos permite comprobar si un objeto es de una clase concreta.
                sumaLavadoras+=lista[i].precioFinal();
            }if(lista[i] instanceof Televisor){//El operador instanceof nos permite comprobar si un objeto es de una clase concreta.
                sumaTelevisores+=lista[i].precioFinal();
            }
       
        }
    }
 // metodo donde saca los resultado de los electrodomesticos en total
    public void ResultadosMenu(){
        recorerLiista(); // llama el metodo recorrer lista par luego poder imprimir
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisores);
   
    }
    // metodo del menu general
    public void Menu(){
        int desicion;
        for(int i=0; i<=10;i++){
            System.out.println("....Bienvenido...\nElectrodimestico a Seleccionar");
            System.out.println("1. Lavadora \n2. Televisor \n3. Resutados");
            desicion = entrada.nextInt();// lee la desicion del usuario
            if(desicion==1){
                MenuLavadora();
                lista[i]= eletro;                
            }if(desicion==2){
                MenuTelevisor();
                lista[i]=  eletro;
            }if(desicion==3){
                ResultadosMenu();
                break;
            }if(desicion>3){
                System.out.println("No esta dentros de las opciones...");
            }           
         
         
        }
        
     }
        
    
 /* en este metodo es igual que el mebu principal solo que llama
    diferentes metodo de acuerdo a cada seleccion del usuario con do() y un While()
    */
    public void MenuLavadora(){
        char seguir;
        do{
            int desicion;
            System.out.println("Menu Lavadora \n Elige una Opcion");
            System.out.println("1. Por Defecto \n2. Precio Base Y Peso"
                    + " \n3. Precio Bese, Peso, Consumo Energetico Y Color");
            desicion = entrada.nextInt();
            if(desicion==1){
                lavadoraDefecto();// lavadora por defecto
            }if(desicion==2){
                lavadorapesoyprecio();// lavadora por defecto con 2 parametros
            }if(desicion==3){
                lavadoratodo(); // lavadora con todos los parametrso modificados
            }if(desicion>3){
                eletro = null;
                System.out.println("No esta dentro de las opciones...");
            }
        System.out.println("Desea Contuniar en el Menu Lavadora Si (S) o No (N): ");
            seguir = entrada.next().charAt(0);
        }while((seguir == 'S'|| seguir == 's'));
    }
    // metodo de los datos de la lavadora por defecto
    public void lavadoraDefecto(){
        eletro = new Lavadora();
        ((Lavadora) eletro).ImprimirDefectolavadora();// imrpime los datos
       
    }
    // metodo con 2 parametros y el resto por defecto de la lavadora
    public void lavadorapesoyprecio(){
        double precioBase;
        double peso;
        System.out.println("Ingrese valor del Precio: ");
        precioBase = entrada.nextDouble();// lee el precio
        System.out.println("Ingrese valor del Peso: ");
        peso = entrada.nextDouble();  // lee el peso
        eletro = new Lavadora(precioBase, peso);
       ((Lavadora) eletro).ImprimirDefectolavadora();// imrpime los datos       
    }
    // metodo con todos los parametros a ingresar por el usuario de la lavadora
    public void lavadoratodo(){
        double precioBase;
        double peso;
        char consumoEnergetico;
        String color;
        int carga;
        System.out.println("Ingrese valor del Precio: ");
        precioBase = entrada.nextDouble();// lee precio
        System.out.println("Ingrese valor del Peso: ");
        peso = entrada.nextDouble();  // lee peso
        System.out.println("Ingrese la letra del Consumo: ");
        consumoEnergetico = entrada.next().charAt(0);// lee la letra del consumo
        System.out.println("Ingrese el color:");
        color = entrada.next();// lee el color
        System.out.println("Ingrese Valor carga: ");
        carga = entrada.nextInt();// lee la carga
        eletro = new Lavadora(precioBase,peso,consumoEnergetico,color,carga);
        ((Lavadora) eletro).ImprimirDefectolavadora();// imrpime los datos   
       
    }
    
    /* en este metodo es igual que el mebu principal solo que llama
    diferentes metodo de acuerdo a cada seleccion del usuario con do() y un While()
    */
    public void MenuTelevisor(){
        char seguir;
        do{
            int desicion;
            System.out.println("Menu Televisor \n Elige una Opcion");
            System.out.println("1. Por Defecto \n2. Precio Base Y Peso"
                    + " \n3. Precio Bese, Peso, Consumo Energetico Y Color \n");
            desicion = entrada.nextInt();
            if( desicion == 1){
                televisorGeneral();// metodo por defecto del televisor
            }if(desicion ==2){
                televsorpesoyprecio();// metodo por defecto y dos paremetrso del televisor
            }if (desicion==3){
                televisortodo(); // metodo de todos los parmetrso ingresados por el usuario del telvisor
            }if(desicion>3){
                eletro=null;
                System.out.println("No esta dentro de las opciones...");
            }
        System.out.println("Desea Contuniar en el Menu Televisor Si (S) o No (N): ");
            seguir = entrada.next().charAt(0);
        }while((seguir == 'S'|| seguir == 's'));
    }
    //metodo por defecto del televisor
    public void televisorGeneral(){
        eletro = new Televisor();
        ((Televisor)eletro).imprimir();// imprime los datos
       
    }
    // metodo con 2 parameytrso y el resto por defecto del televisor
    public void televsorpesoyprecio(){
        double precioBase;
        double peso;
        System.out.println("Ingrese valor del Precio: ");
        precioBase = entrada.nextDouble();// lee precio
        System.out.println("Ingrese valor del Peso: ");
        peso = entrada.nextDouble();//lee peso
        eletro= new Televisor(precioBase, peso);  
        ((Televisor)eletro).imprimir2();// imprime los datos
     
    }
    //metodo de todos los parametros modificados por el usuario
    public void televisortodo(){
        double precioBase;
        double peso;
        char consumoEnergetico;
        String color;
        int resolucion;
        boolean sintonizadorTDT;
        System.out.println("Ingrese valor del Precio: ");
        precioBase = entrada.nextDouble();// lee precio
        System.out.println("Ingrese valor del Peso: ");
        peso = entrada.nextDouble();  // lee peso
        System.out.println("Ingrese la letra del Consumo: ");
        consumoEnergetico = entrada.next().charAt(0);// lee la letra del consumo
        System.out.println("Ingrese el color:");
        color = entrada.next();//lee el color
        System.out.println("Ingrese El valor de la Resolucion: ");
        resolucion = entrada.nextInt();// lee la resolucion del televisor
        System.out.println("Sintonizador TDT:");
        sintonizadorTDT = entrada.nextBoolean();// lee si es enytrada de tdt
        eletro = new Televisor(precioBase, peso,consumoEnergetico,color,resolucion,sintonizadorTDT);
        ((Televisor)eletro).imprimir3();// imprime los datos
   
        
    }
  
}
    

