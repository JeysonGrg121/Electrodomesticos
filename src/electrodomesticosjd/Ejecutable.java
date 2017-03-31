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
    
//metdod que recorre el array
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
 // metodo donde saca los resultado de los electrodomesticos en total
    public void ResultadosMenu(){
        recorerLiista(); // llama el metodo recorrer lista par luego poder imprimir
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisores);
   
    }
    // metodo del menu general
    public void Menu(){
        char seguir;// variable para poder seguir o salir
        do{
            int desicion;
            System.out.println("....Bienvenido...\nElectrodimestico a Seleccionar");
            System.out.println("1. Electrodomestico General \n2. Lavadora \n3. Televisor \n4. Resultados");
            desicion = entrada.nextInt();// lee la entrada
            if(desicion ==1){
                MenuElectrodomesticoGeneral();// llamado del metodo para ir al menu electrodomestico general
            }if(desicion==2){
                MenuLavadora(); // llama el metodo para menu lavadora
            }if(desicion==3){
                MenuTelevisor();// lamado para el metodo del menu televisor
            }if(desicion==4){
                System.out.println("Los resultados son los siguentes: ");
                ResultadosMenu();// llamado del metodo que va a mostrar los resultado del array             
            }if(desicion>4){
                System.out.println("No esta dentro de las opciones...");
            }
            System.out.println("Desea Contuniar En el Menu General Si (S) o No (N): ");
            seguir = entrada.next().charAt(0);// lee la entrada para poder seguir o salir del programa
        }while((seguir == 'S'|| seguir == 's'));
     }
        
    // metodo del menu electrodomestoc general
    /* en este metodo es igual que el mebu principal solo que llama
    diferentes metodo de acuerdo a cada seleccion del usuario
    */
    public void MenuElectrodomesticoGeneral(){
        char seguir;
        do{
            int desicion;
            System.out.println("Menu Electrodomestico Genral\n Elige una Opcion");
            System.out.println("1. Por Defecto \n2. Precio Base Y Peso"
                    + " \n3. Precio Bese, Peso, Consumo Energetico Y Color");
            desicion = entrada.nextInt();
            if(desicion == 1){
                GeneralDefecto();// llamdo metodo por defecto
            }if(desicion== 2){
                PrecioCaseYPeso();// lamado metodo por defecto y 2 parametrso ingresados por el usuario
            }if(desicion == 3){
                TodoGeneral();// lamado metodo donde se modifica todo por el usuario
            }if(desicion>3){
                System.out.println("No esta dentro de las opciones...");
            }
        System.out.println("Desea Contuniar en el Menu Electrodomestico General Si (S) o No (N): ");
            seguir = entrada.next().charAt(0);
        }while((seguir == 'S'|| seguir == 's'));
    }
        
        // metodo del electrodomestico por defecto        
    public void GeneralDefecto(){
        Electrodomestico electrodomestico =  new Electrodomestico(); // se instacia el objeto en la clase
        electrodomestico.ImprimirDefecto();// se imprime los valores por defecto 
    }
    // metodo electrodomestico con precio y base del usuario y el resto por defecto
    public void PrecioCaseYPeso(){
        double precioBase;
        double peso;
        System.out.println("Ingrese valor del Precio: ");
        precioBase = entrada.nextDouble();// lee el precio que ingresa el usuario
        System.out.println("Ingrese valor del Peso: ");
        peso = entrada.nextDouble();       // lee el peso del usuario 
        Electrodomestico electrodomestico =  new Electrodomestico(precioBase,peso);// se instacia el objeto y se encia a con los parametros ingresados
        electrodomestico.ImprimirPrecioPeso();// muestra los valoes ingresados y por defecto
        
    }
// metodo donde se lee todo ingresado por el usuario
    public void TodoGeneral(){
        double precioBase;
        double peso;
        char consumoEnergetico;
        String color;
        System.out.println("Ingrese valor del Precio: ");
        precioBase = entrada.nextDouble();// lee el precio
        System.out.println("Ingrese valor del Peso: ");
        peso = entrada.nextDouble();  // lee el peso
        System.out.println("Ingrese la letra del Consumo: ");
        consumoEnergetico = entrada.next().charAt(0);// lee la letra del consumo
        System.out.println("Ingrese el color:");
        color = entrada.next();// lee el color
        Electrodomestico electrodomestico =  new Electrodomestico(precioBase,peso,consumoEnergetico,color);
        electrodomestico.ImprmirTodo();// imprime los datos
    }
 /* en este metodo es igual que el mebu principal solo que llama
    diferentes metodo de acuerdo a cada seleccion del usuario
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
                System.out.println("No esta dentro de las opciones...");
            }
        System.out.println("Desea Contuniar en el Menu Lavadora Si (S) o No (N): ");
            seguir = entrada.next().charAt(0);
        }while((seguir == 'S'|| seguir == 's'));
    }
    // metodo de los datos de la lavadora por defecto
    public void lavadoraDefecto(){
        Lavadora lavadora = new Lavadora();
        lavadora.ImprimirDefectolavadora();// imrpime los datos
    }
    // metodo con 2 parametros y el resto por defecto de la lavadora
    public void lavadorapesoyprecio(){
        double precioBase;
        double peso;
        System.out.println("Ingrese valor del Precio: ");
        precioBase = entrada.nextDouble();// lee el precio
        System.out.println("Ingrese valor del Peso: ");
        peso = entrada.nextDouble();  // lee el peso
        Lavadora lavadora = new Lavadora(precioBase, peso);
        lavadora.ImprimirPrecioPesolavadora();// imprime los datos
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
        Lavadora lavadora = new Lavadora(precioBase,peso,consumoEnergetico,color,carga);
        lavadora.ImprmirTodolavadora();// imprime todos los datos
    }
    
    /* en este metodo es igual que el mebu principal solo que llama
    diferentes metodo de acuerdo a cada seleccion del usuario
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
                System.out.println("No esta dentro de las opciones...");
            }
        System.out.println("Desea Contuniar en el Menu Televisor Si (S) o No (N): ");
            seguir = entrada.next().charAt(0);
        }while((seguir == 'S'|| seguir == 's'));
    }
    //metodo por defecto del televisor
    public void televisorGeneral(){
        Televisor televisor = new Televisor();
        televisor.imprimir();// imprime los datos
    }
    // metodo con 2 parameytrso y el resto por defecto del televisor
    public void televsorpesoyprecio(){
        double precioBase;
        double peso;
        System.out.println("Ingrese valor del Precio: ");
        precioBase = entrada.nextDouble();// lee precio
        System.out.println("Ingrese valor del Peso: ");
        peso = entrada.nextDouble();//lee peso
        Televisor televisor = new Televisor(precioBase, peso);  
        televisor.imprimir2();// imprime los datos
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
        Televisor televisor = new Televisor(precioBase, peso,consumoEnergetico,color,resolucion,sintonizadorTDT);
        televisor.imprimir3();// imprime los datos
        
    }
    
}
    

