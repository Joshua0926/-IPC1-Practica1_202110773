
package pacman1.pkg4;

import java.util.Random;
import java.util.Scanner;

public class PacMan14 {


    public static void main(String[] args) {
         Scanner pac = new Scanner(System.in);
         Historial[] jugadores = new Historial[50];
        int opcion = 0; 
        String nombreJugador="";
        int edadJugador=0;
        int filas=0, columnas=0;
        int i=0;
        int j=0;
        int pacman=0;
        int pacman2=0;
        int puntaje=10;
        int contador=0;
        int Jugadores=0; 
        
        
                    
        while(opcion!=3){
            
            System.out.println("Introduce el Numero de la opcion que quieras Elegir");
            System.out.println("**************");
            System.out.println("*1. Jugar    *");
            System.out.println("*2. Historial*");
            System.out.println("*3. Salir    *");
            System.out.println("**************");
            
                
                
               
            opcion = pac.nextInt();
            pac.nextLine();
            
            switch(opcion){
                case 1:                    
                   System.out.println("Escriba su Nombre de Jugador");
                   nombreJugador = pac.nextLine();
                    System.out.println("Esciba su Edad");
                    edadJugador = pac.nextInt();
                    pac.nextLine(); 
                    
                   // Historial Variables              
                            Jugadores++;
                            Historial jugadorA = new Historial(nombreJugador, edadJugador, 10, contador);
                   
                    System.out.println("Escribir Cantidad de Filas Deseadas (Mimmo 8)");
                    filas = pac.nextInt()+2;
                    pac.nextLine();
                    while(filas<10){
                        System.out.println("Escriba un Numero Mayor o Igual a 8");
                        columnas = pac.nextInt()+2;
                        pac.nextLine();
                    }
                 
                    System.out.println("Escribir Cantidad de Columnas Deseadas (Minimo 8)");
                    columnas = pac.nextInt()+2;
                    pac.nextLine();
                    while(columnas<10){
                        System.out.println("Escribir un Numero Mayor o Igual a 8");
                        filas = pac.nextInt()+2;
                        pac.nextLine();
                    }
                    
                    
                    pacman = (int) (Math.random() * ((filas-1) -1)) +1;
                    pacman2 = (int) (Math.random() * ((columnas) -1)) +1;
                    int dolar = (int) (Math.random() * ((filas-1) -1) +1);
                    int dolar2 = (int) (Math.random() * ((columnas-1) -1) +1);
                    int aste = (int) (Math.random() * ((filas-1) -1) +1);
                    int aste2 = (int) (Math.random() * ((columnas-1) -1) +1);
                    int arro = (int) (Math.random() * ((filas-1) -1) +1);
                    int arro2 = (int) (Math.random() * ((columnas-1) -1) +1);
                    while(pacman==dolar || pacman==aste || pacman==arro || dolar==aste || aste==arro || dolar==arro){
                    
                       pacman = (int) (Math.random() * ((filas-1) -1)) +1;
                       pacman2 = (int) (Math.random() * ((columnas) -1)) +1;
                     dolar = (int) (Math.random() * ((filas-1) -1) +1);
                     dolar2 = (int) (Math.random() * ((columnas-1) -1) +1);
                     aste = (int) (Math.random() * ((filas-1) -1) +1);
                     aste2 = (int) (Math.random() * ((columnas-1) -1) +1);
                     arro = (int) (Math.random() * ((filas-1) -1) +1);
                     arro2 = (int) (Math.random() * ((columnas-1) -1) +1); 
                     
                    }
                    System.out.println("Su posición inicial es de: ("+pacman+" , "+pacman2+")");
                    System.out.println("Cantidad de Movimientos:"+contador);
                    
                    
                    Scanner mat=new Scanner(System.in);
                    String matriz[][]=new String [filas][columnas];
                    int espacio1, espacio2, espacio3=-1;
                    
                    if(filas%2==0){
                        espacio1 = (filas/2)-1;
                        espacio2 = espacio1+1;
                    }else{
                        espacio1 = ((filas-1)/2)-1;
                        espacio2 = espacio1+1;
                        espacio3 = espacio2+1;
                    }
                    for ( i = 0; i < filas; i++) {
                        for ( j = 0; j < columnas; j++) {
                            
                           if(i==0 || i==filas-1){
                                matriz[i][j]="*";    
                        }
                           else if(i==espacio1 || i==espacio2 || i==espacio3){
                               matriz[i][j]=" ";
                        }
                           else if(j==0 || j==columnas-1){
                               matriz[i][j]="*";
                           }
                           
                           
                           else{
                               matriz[i][j]=" ";
                               
                               
                               
                            matriz[pacman][pacman2]="V";
                           matriz[dolar][dolar2]="$";
                           matriz[aste][aste2]="#";
                           matriz[arro][arro2]="@";   
                               
                           Random random = new Random();
                           String muros = "*"+" "+" "+" ";
                           int randomI = random.nextInt(muros.length());
                           char randomC = muros.charAt(randomI);
                           matriz[i][j] = ""+randomC;    
                           }
                           
                           
                           
                           
                           
                    }
                     
                        
                        
                        
                    }
                    
                     System.out.println("Su puntaje inicial es de: ("+puntaje+")puntos");
                        for ( i = 0; i < filas; i++) {
                            for ( j = 0; j < columnas; j++) {
                                System.out.print(matriz[i][j]+"");
                            }
                            System.out.println("");
                        }
                        
                        
                        
                        
                        
                        Scanner mov = new Scanner(System.in);                      
                        String movimiento="";
                        
                        
                        
                        while(!movimiento.equals("m")){
                            
                     
                            
                            System.out.println("Ingrese su movimiento");
                            movimiento = mov.nextLine();
                            
                                 
                            
                            
                            
                            
                            
                            switch(movimiento){
                                case "w": 
                                                                        
                             pacman=pacman-1;    
                             matriz[pacman][pacman2]="V";
                             matriz[pacman+1][pacman2]=" ";
                                          
                            contador++;
                                    System.out.println("Cantidad de Movimientos:"+contador);
                            
               
                        
   
                             
                          if(matriz[pacman][pacman2].equals(matriz[dolar][dolar2])){
                          
                          dolar = (int) (Math.random() *(filas-filas+1) * (filas-2)+1 );
                          dolar2 = (int) (Math.random() *(columnas-columnas+1) * (columnas-2)+1 );
                          
                            if (!" ".equals(matriz[dolar][dolar2])) {
                            
                            }
                          
                            else {
                                matriz[dolar][dolar2]="$";
                            }
                            
                            puntaje=puntaje+15;
                              
                          }
                    
                     
                          
                          
                          if(matriz[pacman][pacman2].equals(matriz[arro][arro2])){
                          
                          arro = (int) (Math.random() *(filas-filas+1) * (filas-2)+1 );
                          arro2 = (int) (Math.random() *(columnas-columnas+1) * (columnas-2)+1 );
                          
                            if (!" ".equals(matriz[arro][arro2])) {
                            
                            }
                          
                            else {
                                matriz[arro][arro2]="@";
                            }
                            
                            puntaje=puntaje+10;
                              
                          }
                          
                          
                          
                          if(matriz[pacman][pacman2].equals(matriz[aste][aste2])){
                          
                          aste = (int) (Math.random() *(filas-filas+1) * (filas-2)+1 );
                          aste2 = (int) (Math.random() *(columnas-columnas+1) * (columnas-2)+1 );
                          
                            if (!" ".equals(matriz[aste][aste2])) {
                            
                            }
                          
                            else {
                                matriz[aste][aste2]="#";
                            }
                            
                            puntaje=puntaje-10;
                              
                          }
                          
                          
                          
                    
                     System.out.println("Su puntaje es de: ("+puntaje+")puntos");
                        for ( i = 0; i < filas; i++) {
                            for ( j = 0; j < columnas; j++) {
                                System.out.print(matriz[i][j]+"");
                                
                            }
                            System.out.println("");
                        }
                     
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    break;
                                    
                                case "a":
                                    
                                  pacman2=pacman2-1;  
                                 
                                  contador++;
                                    System.out.println("Cantidad de Movimientos:"+contador);
                                                
                    matriz[pacman][pacman2]="V";
                    matriz[pacman][pacman2+1]=" ";
                    
                    
                    
                    
                                    
                                    if(matriz[pacman][pacman2].equals(columnas+1)){
                          
                          pacman = espacio1; 
                         
                          pacman2 = espacio1;
                          if (!" ".equals(espacio1)) {
                            
                            }
                          
                            else {
                                matriz[pacman][pacman]="V";
                            }
                      
                            
                              
                          }
                                    
                           if(matriz[pacman][pacman2].equals(espacio2)){
                          
                          pacman = columnas;
                          pacman2 = columnas;
                          
                           if (!" ".equals(espacio2)) {
                            
                            }
                          
                            else {
                                matriz[pacman][pacman]="V";
                            } 
                         
                             
                            
                              
                          }
                           
                           if(matriz[pacman][pacman2].equals(espacio3)){
                          
                          pacman = columnas;
                          pacman2 = columnas;
                          
                            if (!" ".equals(espacio3)) {
                            
                            }
                          
                            else {
                                matriz[pacman][pacman]="V";
                            }
                         
                              
                            
                              
                          }
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                          if(matriz[pacman][pacman2].equals(matriz[dolar][dolar2])){
                          
                          dolar = (int) (Math.random() *(filas-filas+1) * (filas-2)+1 );
                          dolar2 = (int) (Math.random() *(columnas-columnas+1) * (columnas-2)+1 );
                          
                            if (!" ".equals(matriz[dolar][dolar2])) {
                            
                            }
                          
                            else {
                                matriz[dolar][dolar2]="$";
                            }
                            
                            puntaje=puntaje+15;
                              
                          }
                    
                     
                          
                          
                          if(matriz[pacman][pacman2].equals(matriz[arro][arro2])){
                          
                          arro = (int) (Math.random() *(filas-filas+1) * (filas-2)+1 );
                          arro2 = (int) (Math.random() *(columnas-columnas+1) * (columnas-2)+1 );
                          
                            if (!" ".equals(matriz[arro][arro2])) {
                            
                            }
                          
                            else {
                                matriz[arro][arro2]="@";
                            }
                            
                            puntaje=puntaje+10;
                              
                          }
                          
                          
                          
                          if(matriz[pacman][pacman2].equals(matriz[aste][aste2])){
                          
                          aste = (int) (Math.random() *(filas-filas+1) * (filas-2)+1 );
                          aste2 = (int) (Math.random() *(columnas-columnas+1) * (columnas-2)+1 );
                          
                            if (!" ".equals(matriz[aste][aste2])) {
                            
                            }
                          
                            else {
                                matriz[aste][aste2]="#";
                            }
                            
                            puntaje=puntaje-10;
                              
                          }
                                  
                                  
                                  
                                  
                                  
                                  
                                   
                    
                     System.out.println("Su puntaje es de: ("+puntaje+")puntos");
                        for ( i = 0; i < filas; i++) {
                            for ( j = 0; j < columnas; j++) {
                                System.out.print(matriz[i][j]+"");
                            }
                            System.out.println("");
                        }
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    break;
                                    
                                case "s":
                                    
                                   pacman=pacman+1; 
                                  matriz[pacman][pacman2]="V"; 
                                  matriz[pacman-1][pacman2]=" ";
                                contador++;
                                    System.out.println("Cantidad de Movimientos:"+contador);                 
                    
                          if(matriz[pacman][pacman2].equals(matriz[dolar][dolar2])){
                          
                          dolar = (int) (Math.random() *(filas-filas+1) * (filas-2)+1 );
                          dolar2 = (int) (Math.random() *(columnas-columnas+1) * (columnas-2)+1 );
                          
                            if (!" ".equals(matriz[dolar][dolar2])) {
                            
                            }
                          
                            else {
                                matriz[dolar][dolar2]="$";
                            }
                            
                            puntaje=puntaje+15;
                              
                          }
                    
                     
                          
                          
                          if(matriz[pacman][pacman2].equals(matriz[arro][arro2])){
                          
                          arro = (int) (Math.random() *(filas-filas+1) * (filas-2)+1 );
                          arro2 = (int) (Math.random() *(columnas-columnas+1) * (columnas-2)+1 );
                          
                            if (!" ".equals(matriz[arro][arro2])) {
                            
                            }
                          
                            else {
                                matriz[arro][arro2]="@";
                            }
                            
                            puntaje=puntaje+10;
                             
                          }
                          
                          
                          
                          if(matriz[pacman][pacman2].equals(matriz[aste][aste2])){
                          
                          aste = (int) (Math.random() *(filas-filas+1) * (filas-2)+1 );
                          aste2 = (int) (Math.random() *(columnas-columnas+1) * (columnas-2)+1 );
                          
                            if (!" ".equals(matriz[aste][aste2])) {
                            
                            }
                          
                            else {
                                matriz[aste][aste2]="#";
                            }
                            
                            puntaje=puntaje-10;
                              
                          }
                                   
                                   
                                   
                                   
                                   
                                   
                                   
                                   
                                   
                    
                     System.out.println("Su puntaje es de: ("+puntaje+")puntos");
                        for ( i = 0; i < filas; i++) {
                            for ( j = 0; j < columnas; j++) {
                                System.out.print(matriz[i][j]+"");
                            }
                            System.out.println("");
                        }
                                    
                                    
                                    
                                    
                                    
                                    
                                    break;
                                    
                                case "d":
                                    
                                    pacman2=pacman2+1; 
                                    matriz[pacman][pacman2]="V";
                                    matriz[pacman][pacman2-1]=" ";
                                   contador++;
                                    System.out.println("Cantidad de Movimientos:"+contador); 
                                   
                           
                      
                          if(matriz[pacman][pacman2].equals(matriz[dolar][dolar2])){
                          
                          dolar = (int) (Math.random() *(filas-filas+1) * (filas-2)+1 );
                          dolar2 = (int) (Math.random() *(columnas-columnas+1) * (columnas-2)+1 );
                          
                            if (!" ".equals(matriz[dolar][dolar2])) {
                            
                            }
                          
                            else {
                                matriz[dolar][dolar2]="$";
                            }
                            
                            puntaje=puntaje+15;
                              
                          }
                    
                     
                          
                          
                          if(matriz[pacman][pacman2].equals(matriz[arro][arro2])){
                          
                          arro = (int) (Math.random() *(filas-filas+1) * (filas-2)+1 );
                          arro2 = (int) (Math.random() *(columnas-columnas+1) * (columnas-2)+1 );
                          
                            if (!" ".equals(matriz[arro][arro2])) {
                            
                            }
                          
                            else {
                                matriz[arro][arro2]="@";
                            }
                            
                            puntaje=puntaje+10;
                              
                          }
                          
                          
                          
                          if(matriz[pacman][pacman2].equals(matriz[aste][aste2])){
                          
                          aste = (int) (Math.random() *(filas-filas+1) * (filas-2)+1 );
                          aste2 = (int) (Math.random() *(columnas-columnas+1) * (columnas-2)+1 );
                          
                            if (!" ".equals(matriz[aste][aste2])) {
                            
                            }
                          
                            else {
                                matriz[aste][aste2]="#";
                            }
                            
                            puntaje=puntaje-10;
                              
                          }
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                   
                    
                     System.out.println("Su puntaje es de: ("+puntaje+")puntos");
                        for ( i = 0; i < filas; i++) {
                            for ( j = 0; j < columnas; j++) {
                                System.out.print(matriz[i][j]+"");
                            }
                            System.out.println("");
                        }
                                    
                                    
                                    
                                    
                                    
                                    break;


                                    
                                default: 
                                    
                                   System.out.println("Movimiento no Valido");     
                                    
                            
                            }
                            if (puntaje>=100){
                                System.out.println("!!"+nombreJugador+" GANASTE!!");
                                break;
                            }else if (puntaje<=0){
                                System.out.println("X"+nombreJugador+" HAS PERDIDO"+":("+"X");
                                
                                break; 
                            }
                             
                        }
                 
                     
                     
                     
                     
                     
                     
              jugadorA._puntaje= puntaje;
       jugadorA._contador=contador;
       jugadores [Jugadores] = jugadorA;        
        
       
    
                    
                     
                    break;
                    
                    
                 
                
                case 2:
                    System.out.println("======================");
                    System.out.println("Historial de Jugadores");    
                    System.out.println("======================");
                    
                 for (int k = 1; k < jugadores.length; k++) {
                      Historial jugador = jugadores[k];
                      if(jugador == null)break;
                        System.out.println("===============");
                        System.out.println("Nombre de Jugador: "+jugador._nombre );
                        System.out.println("Edad de Jugador:"+jugador._edad);
                        System.out.println("Cantidad de Puntos: "+jugador._puntaje);
                        System.out.println("Movimientos Totales: "+jugador._contador);
                        System.out.println("===============");
                    }
                    
                    
                        
                    
                    
                    
                    
                    break; 
                    
                case 3:
                     
                  
                    break;   
                    
                default: 
                    System.out.println("Elegir una opcion entre 1 y 3");
            }
            
            
            
            
            
        }
    }

    
    
}