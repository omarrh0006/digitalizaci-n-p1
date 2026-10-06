import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);
        int aprobados=0;
        String resultado= "si" ;
        do {
            System.out.println("introduce tu nota");
            nota = sc.nextInt();
            if (nota>=6){
                aprobados= aprobados +1;
                System.out.println("deseas seguir si/no");
                resultado= sc.next();


            }else{
                System.out.println("deseas seguir si/no");
                resultado= sc.next();

            }

        }
        while (resultado.equals("si"));


    }
}