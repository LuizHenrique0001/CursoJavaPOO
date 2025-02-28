import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int atividade;

        System.out.print("Escolha qual atividade voce quer fazer (1, 2, 3): ");

        atividade = sc.nextInt();

        if(atividade == 1){
            int password;

            password = sc.nextInt();

            while (password != 2002) {

                System.out.println("Senha Invalida");
                password = sc.nextInt();
            }

            System.out.println("Acesso Permitido");
        }
        if(atividade == 2) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            while (x != 0 && y != 0) {
                if (x > 0 && y > 0) {
                    System.out.println("primeiro");
                } else if (x < 0 && y > 0) {
                    System.out.println("segundo");
                } else if (x < 0 && y < 0) {
                    System.out.println("terceiro");
                } else {
                    System.out.println("quarto");
                }
                x = sc.nextInt();
                y = sc.nextInt();
            }
        }

        if(atividade == 3) {

        int combustivel, alcool = 0, gasoliza = 0, diesel = 0;


        combustivel = sc.nextInt();

        while (combustivel != 4){

            if (combustivel == 1){
                alcool+= 1;
            }else
            if (combustivel == 2){
                gasoliza+= 1;
            }else
            if (combustivel == 3){
                diesel+= 1;
            }else{
                System.out.println("Valor Incorreto");
            }

            combustivel = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+ alcool);
        System.out.println("Gasolina: "+ gasoliza);
        System.out.println("Diesel: "+ diesel);



        }


        sc.close();
    }
}