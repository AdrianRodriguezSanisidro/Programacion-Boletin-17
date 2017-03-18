package boletin17_2y3;

import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class Clase {
   int[]notas={1,6,7,9,7,5,6,9,10,8,3,6,8,9,10,7,9,5,4,8,9,7,4,5,6,6,1,3,9,8};
   String[]alumnos={"Pepe","Juan","Ana","Luis","Carlos","Carla","Roberto","Richard","Cristina","Luisa","Clara","Ricardo","Eloisa","Sandra","Adrian","Tamara","Ainhoa","Diego","Maria","Gena","Alba","Laura","Iago","Isaac","Marco","Aaron","Lucia","Aida","David","Jesus"};
   int aprobados,suspensos=0;
   public void visualizarNotas(){
    for(int i=0;i<notas.length;i++){
        if(notas[i]>=5)
            aprobados++;
        else suspensos++;
    }
       System.out.println("Aprobaron "+aprobados+" y suspendieron "+suspensos);
}
   public void calcularMedia(){
       int aux=0;
       for(int i=0;i<notas.length;i++){
           aux=aux+notas[i];
       }
       System.out.println("La media es "+((float)aux/notas.length));
   }
   public void notaAlta(){
    int mejorNota=0;
    for(int i=0;i<notas.length;i++){
        if(notas[i]>mejorNota)
            mejorNota=notas[i];
    }
       System.out.println("La nota mas alta es "+mejorNota);
}
   public void visualizarNotaAlumno(){
       boolean encontrado=false;
       String aux=JOptionPane.showInputDialog("Nombre del alumno:");
       for(int i=0;i<alumnos.length;i++){
           if(aux.equals(alumnos[i]))
               System.out.println("A nota de "+alumnos[i]+" e "+notas[i]);
               encontrado=true;
       }
       if(encontrado==false)
           System.out.println("O alumno non existe");
   }
   public void alumnosAprobados(){
       System.out.println("Aprobaron:");
       for(int i=0;i<notas.length;i++){
           if(notas[i]>=5)
               System.out.println(alumnos[i]+"="+notas[i]);
       }
           
   }
}
