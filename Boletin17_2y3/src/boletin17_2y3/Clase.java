package boletin17_2y3;

/**
 *
 * @author Adry
 */
public class Clase {
   int[]notas={1,6,7,9,7,5,6,9,10,8,3,6,2,8,5,6,7,9,5,4,8,9,7,4,5,6,6,1,3,9,8};
   int aprobados,suspensos;
   public void visualizarNotas(){
    for(int i=0;i<notas.length;i++){
        if(notas[i]>=5)
            aprobados++;
        else suspensos++;
    }
}
}
