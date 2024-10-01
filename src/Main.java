
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        String partyAffiliation = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Party Affiliation[R,D,I]: ");
        partyAffiliation = in.nextLine();

        if (partyAffiliation.equalsIgnoreCase("R"))
        {
            System.out.println("You Get an Elephant");
        }
        else if(partyAffiliation.equalsIgnoreCase("D"))
        {
            System.out.println("You Get a Donkey");
        }
        else if(partyAffiliation.equalsIgnoreCase("I"))
        {
                System.out.println("You get a Man");
        }
        else
            {

                System.out.println("I don't recognize that Party");
            }
        }
    }
