package boletin17_1;

/**
 *
 * @author Adry
 */
public class Metodos {
    int[]numeros=new int[6];
    /*
    Hacer constructores
    */
    public void cargarArray(){
        for(int i=0;i<numeros.length;i++){
            numeros[i]=(int)(Math.random()*49+1);
        }
    }
    public void visualizarArray(){
        System.out.println("Numeros: ");
        for(int i=5;i>=0;i--)
            System.out.print(numeros[i]+" ");
    }
}
