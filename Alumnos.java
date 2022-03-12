/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumnos;
import java.util.Scanner;
/**
 *
 * @author mafer
 */
public class Alumnos {
    Scanner in = new Scanner(System.in);
    Registro lista = new Registro();
    protected Nodo inicio, fin;
    /**
     */
    public void Agregar(){
        perfil Perfil = new perfil();
        System.out.print("Ingresar carne:");
        Perfil.setCarne(in.nextInt());
        System.out.print("Ingresar nombre:");
        Perfil.setNombre(in.next());
        System.out.print("Ingresar apellido:");
        Perfil.setApellido(in.next());
        System.out.print("Ingresar email:");
        Perfil.setEmail(in.next());
        lista.agregar(Perfil);
    }   
    public void Buscar(){
        System.out.print("Ingresar carne:");
        lista.buscar(in.nextInt());
    }
    public void Eliminar(){
        System.out.print("Ingresar carne:");
        lista.eliminar(in.nextInt());
    }
    public void menu(){
    boolean salir = false;
    int opcion;    
        
        while(!salir){
            
           System.out.println("\n 1. Agregar 1");
           System.out.println("2. Eliminar 2");
           System.out.println("3. Buscar  3");
           System.out.println("4. Mostrar 4");
           System.out.println("5. Salir 5");
           System.out.println("Escribe una de las opciones:");
           opcion = in.nextInt();
           
           switch(opcion){
               case 1:
                   System.out.println("-----------------Agregar-----------------");
                   Agregar();
                   break;
               case 2:
                   System.out.println("-----------------Eliminar-----------------");
                   Eliminar();
                   break;
                case 3:
                   System.out.println("-----------------Buscar-----------------");
                   Buscar();
                   break;
                case 4:
                   System.out.println("-----------------Mostrar-----------------");
                   lista.mostrar();
                   break;
                case 5:
                   salir=true;
                   System.out.println("Programa terminado");
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
           }   
        }
    }

    public static void main(String[] args) {
        Alumnos list = new Alumnos();
        list.menu();
    }
    
}
