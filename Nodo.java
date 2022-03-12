/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnos;
/**
 *
 * @author mafer
 */
public class Nodo {
    public perfil Perfil;
    public Nodo siguiente;

    public Nodo(perfil Perfil){
        this.Perfil = Perfil;
        
    }
    public Nodo(perfil Perfil,Nodo siguiente){
        this.Perfil = Perfil;
        this.siguiente = siguiente;
    }
}
