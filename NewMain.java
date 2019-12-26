
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        int num;
        int copia;
        int dim = 0;
        int c_dim;
        int i = 0;
        int aux;
        String receptor;
        int acu;

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese el numero a convertir: ");
        num = in.nextInt();
        copia = num;

        while ((copia / 16) != 0) {
            copia = copia / 16;
            dim++;
        }
        //System.out.println(dim);
       
        c_dim = dim;
        String Vec[] = new String[c_dim+1];

        copia = num;
        i = dim ;
        while (i >= 0) {

            aux = copia / 16;
            aux = aux * 16;
            if ((copia - aux) == 10) {

                Vec[i] = "A";

            } else if ((copia - aux) == 11) {

                Vec[i] = "B";
            } else if ((copia - aux) == 12) {

                Vec[i] = "C";
            } else if ((copia - aux) == 13) {

                Vec[i] = "D";
            } else if ((copia - aux) == 14) {

                Vec[i] = "E";
            } else if ((copia - aux) == 15) {

                Vec[i] = "F";
            } else {

                acu = copia - aux;
                receptor = Integer.toString(acu);
                //System.out.println(receptor);
                Vec[i] = receptor;

            }
            i--;
            copia = copia / 16;
        }

        for (i = 0; i <=c_dim; i++) {
            System.out.print("" + Vec[i]);
        }
        System.out.println("");
    }
}
