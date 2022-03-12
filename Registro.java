/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnos;

/**
 *
 * @author mafer
 */
public class Registro {
    protected Nodo inicio, fin;
   
    
    public Registro(){
        this.inicio = null;
        this.fin = null;
    }
    
    public void agregar(perfil Perfil){
        inicio = new Nodo(Perfil,this.inicio);
        if(fin == null){
            fin = inicio;
        }
    }
    public void eliminar(int carne){
        Nodo actual = inicio;
        Nodo anterior = null;
        
        while(actual != null){
            if(actual.Perfil.getCarne()==carne){
                if(actual == inicio){
                    inicio = inicio.siguiente;
                    System.out.println("Elemento eliminado");
                }else{
                    anterior.siguiente = actual.siguiente;
                }
            }
        
            anterior = actual;
            actual = actual.siguiente;
        
        }    
    }
        public void buscar(int carne){
        Nodo aux = inicio;
        boolean encontrado = false;
        while(aux != null){
            
            if(aux.Perfil.getCarne()==carne){
                System.out.print("""
                                 Elemento encontrado
                                 Carne:"""+aux.Perfil.getCarne()+"\n"+"Nombre:"+aux.Perfil.getNombre()+"\n"+"Apellido:"+aux.Perfil.getApellido()+"\n"+"Email:"+aux.Perfil.getEmail());
                encontrado = true;
                break;
            }
            aux=aux.siguiente;
        }
        if(encontrado == false){
            System.out.print("NO ENCONTRADO");
        }
    }
    public void mostrar(){
        Nodo aux = inicio;
        while(aux != null){
            System.out.print("\n"+"Carne:"+aux.Perfil.getCarne()+"\n"+"Nombre:"+aux.Perfil.getNombre()+"\n"+"Apellido:"+aux.Perfil.getApellido()+"\n"+"Email:"+aux.Perfil.getEmail());
            aux=aux.siguiente;
        }
    }
}