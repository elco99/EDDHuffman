package huffman;

import java.io.Serializable;

public class node implements Serializable {

    node rightBro;
    node leftSon;
    int frecuencia;
    String letra;

    public node() {
    }
    
    public node(node rightBro, node leftSon, int frecuencia, String letra) {
        this.rightBro = rightBro;
        this.leftSon = leftSon;
        this.frecuencia = frecuencia;
        this.letra = letra;
    }
    
    public node(String letra){
        this.letra = letra;
        this.rightBro = null;
        this.leftSon = null;
        this.frecuencia = 1;  
    }  
    
    
    public node getRightBro() {
        return rightBro;
    }

    public void setRightBro(node rightBro) {
        this.rightBro = rightBro;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    public node getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(node leftSon) {
        this.leftSon = leftSon;
    }
    
    public int incrementar(){
        return this.frecuencia+=1;
    }
    
    public boolean isLeaf(){
        if(leftSon == null && rightBro == null) {
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString() {
        return letra + "\t" + frecuencia;
    }

}
