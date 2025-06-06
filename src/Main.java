import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = null;
        Set<Integer> codStudent = new HashSet<>();
        try {

            sc = new Scanner(System.in);
            int n;
                            //COURSE A
            System.out.print("How many students for course A?: ");
            n = sc.nextInt();

            for (int i=0;i<n;i++){
                codStudent.add(sc.nextInt());
            }
                            //COURSE B
            System.out.print("How many students for course B?: ");
            n = sc.nextInt();

            for (int i=0;i<n;i++){
                codStudent.add(sc.nextInt());
            }
                            //COURSE C
            System.out.print("How many students for course C?: ");
            n = sc.nextInt();

            for (int i=0;i<n;i++){
                codStudent.add(sc.nextInt());
            }

            System.out.println();
            System.out.print("Total students: "+ codStudent.size());

            sc.close();

        } catch (Exception e) {

            if (sc != null){
                sc.close();
            }
            System.out.print("Error: "+ e.getMessage());
        }


    }
}