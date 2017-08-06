import java.util.*;


public class Nodo{

    private int v;
    private Nodo izq;
    private Nodo der;


    public Nodo(int v){
        this.v = v;
    }

    public int getValor(){
        return v;
    }

    public Nodo getNodo(){
        return this;
    }

    public Nodo getIzq(){
        return izq;
    }

    public Nodo getDer(){
        return der;
    }



}