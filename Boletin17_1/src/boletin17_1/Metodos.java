package boletin17_1;

/**
 *
 * @author Adry
 */
public class Metodos {
    int[]numeros=new int[6];
    public void cargarArray(){
        for(int i=0;i<numeros.length;i++){
            numeros[i]=(int)Math.random();
        }
    }
}
