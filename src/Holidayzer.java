import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Holidayzer {

  public static void main(String[] args) {
    String userInput = getUserInput();

    HashMap<String, String> holidays = Holidays.get();

    String HolidayName = holidays.get(userInput);

    if (HolidayName == null) {
      System.out.println("Essa data não é um feriado.");
      System.exit(0);
    }

    System.out.println("Essa data é o feriado: "+HolidayName);
  }

  private static String getUserInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a data no formato DD/MM/AAAA e pressione enter:");

    String userInput = scanner.nextLine();
    return userInput;
  }
}
