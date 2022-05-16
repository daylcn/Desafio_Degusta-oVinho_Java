import java.util.Scanner;

public class App 
{
        public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        String T = sc.nextLine();

        String respostasCompetidores = sc.nextLine();
        String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");

        int count = 0;
        for (int i = 0; i < respostasCompetidoresSplit.length; i++) 
        {

            if (respostasCompetidoresSplit[i].equals(T)) 
            {
                count++;
            }

        }

        System.out.println(count);

    }
}
