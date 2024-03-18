
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 1061017158
 */
public class Parcial {
    
    
    
    public static double [][] notasEstudiantes = {
        
            {2.5, 2.6, 3.9, 5.0}, //Notas del estudiante 1
            {4.5, 1.6, 2.9, 3.4}, //Notas del estudiante 2
            {3.5, 4.6, 4.9, 4.9}, //Notas del estudiante 3
            
        };
    

    
    public static void main(String[] args) {
        //Crear menu
       
        Scanner scan = new Scanner(System.in);
        int opcion;
        boolean x = true;
        while(x){
            
        System.out.println("*****NOTAS COLEGIO*****");
        System.out.println("*****----MENU----*****");
        System.out.println("1. Calcular el promedio");
        System.out.println("2. Encontrar la nota maxima");
        System.out.println("3. Intercambiar las notas");
        System.out.println("4. Imprimir la matriz");
        System.out.println("5. Salir");
        
        System.out.println("Selccione una opcion: ");
        
        opcion = scan.nextInt();//Opcion que ingresa el usuario por teclado
        
        //Ingresar a las opciones para realizar las operaciones ingresadas por el usuario
        switch (opcion) {
            case 1:
                System.out.println("Resultado del promedio");
                calcularElPromedioEstudiante(notasEstudiantes, scan);
                break;
                
            case 2:
                System.out.println("Nota maxima");
                encontrarNotaMax(notasEstudiantes);
                break;
                
            case 3:
                System.out.println("Intercambio");
                intercambiarNotas(notasEstudiantes);
                break;
                
            case 4:
                System.out.println("Motrar matriz");
                mostrarMatriz(notasEstudiantes);
                break;
                
            case 5:
                System.out.println("Salimos del programa");
                x = false;
                break;
                
            default:
                System.out.println("Opcion no valida");
                break;
                
        }// Finaliza el Switch
    }//finaliza el While
    }
    //Hallar el promedio por notas por estudiante
    public static void calcularElPromedioEstudiante(double [][] notasEstudiantes, Scanner scan){
        System.out.println("Ingresar el estudiante para el promedio (1,2,3)");
        int numEstudiante = scan.nextInt();
        if (numEstudiante >=1 && numEstudiante <= notasEstudiantes.length){
        double sumaNotas = 0; //Variable acumula todas las notas
        
        for(int i = 0; i < notasEstudiantes[numEstudiante - 1].length; i++){
            sumaNotas += notasEstudiantes[numEstudiante - 1][i];
            
        }   
        double promedio = sumaNotas / notasEstudiantes[numEstudiante - 1].length;
            System.out.println(" El pomedio del estudiante : "+ numEstudiante + " es: " + promedio);
        }else{
            System.out.println("Numero del estudiante incorecto");
        }
    }
    //Hallar la nota maxima de la matriz
    public static void encontrarNotaMax(double [][] notasEstudiantes){
        double notaMaxima = notasEstudiantes[0][0];
        for (int i = 0; i < notasEstudiantes.length; i++){
            for(int j = 0; j < notasEstudiantes[i].length; j++){
              if(notasEstudiantes[i][j] > notaMaxima){
                  notaMaxima = notasEstudiantes[i][j];
              }  
            }
        }
        System.out.println("La nota maxima es : " + notaMaxima);
        }
    
    //Intercambiar las notas el estudiante
    public static void intercambiarNotas(double [][] notasEstudiantes){
        double [] temp = notasEstudiantes[0]; //Arreglo temporal
        notasEstudiantes[0] = notasEstudiantes[2];
        notasEstudiantes[2] = temp;
        System.out.println("Notas Intercambiadas");
        mostrarMatriz(notasEstudiantes);
    }
    
    public static void mostrarMatriz(double [][] notasEstudiantes){
        for (int i = 0; i < notasEstudiantes.length; i++){
            for(int j = 0; j < notasEstudiantes[i].length; j++){
                System.out.println(notasEstudiantes[i][j] + " ");
              } 
            System.out.println();
            }
        }
}

