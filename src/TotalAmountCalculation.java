import java.util.Scanner;

public class TotalAmountCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("how many kurus your vehicle burns per kilometer? ");
        double kurus = scanner.nextDouble();
        System.out.print("how many kilometers did you travel with your vehicle? ");
        int length=scanner.nextInt();
        double productivity=kurus/length ;
        System.out.println("Your car productivity is  " + productivity);
        System.out.println("total amount you have to pay: "+ (kurus*productivity)+ "TL");







    }
}

  /*  import java.util.Scanner;

      public class Test {
    public static void main(String[] args) {


        Bir arac&#x131;n kilometrede ne kadar yakt&#x131;&#x11F;&#x131; ve ka&ccedil; kilometre yol yapt&#x131;&#x11F;&#x131; bilgilerini al&#x131;n ve
        s&uuml;r&uuml;c&uuml;n&uuml;n toplam ne kadar &ouml;demesini gerekti&#x11F;ini hesaplay&#x131;n.


Scanner scanner = new Scanner(System.in);

        System.out.print("Arac&#x131;n&#x131;z kilometre ka&ccedil; kuru&#x15F; yak&#x131;yor? (&Ouml;rnek : 0,32):");
double kurus = scanner.nextDouble();

        System.out.print("Arac&#x131;n&#x131;zla ka&ccedil; kilometre gittiniz ? :");

int km = scanner.nextInt();

        System.out.println("Toplam &ouml;demeniz gereken tutar : " + (kurus * km) + " tl dir...");

        }

        }
      */