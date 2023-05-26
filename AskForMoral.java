import java.util.Scanner;
public class AskForMoral {
    

    //recursion pog
    public static double Ask(String name){
        Scanner sc = new Scanner(System.in);
        double moral = 999999;
        while (moral < 1 || moral > 100) {
            System.out.println("On a scale of 1-99, how good/evil would " + name + " be? (1 = very evil, 99 = very good)");
            
            try{
                
                moral = sc.nextInt();

            }catch(Exception e){

                moral = AskForMoral.Ask(name);
            }
            
      }

      return moral;

    }
}
