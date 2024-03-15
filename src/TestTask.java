import java.util.Scanner;

public class TestTask {
    public static void main(String[] args) {
        System.out.println("Practical 1.6, Антоненко Дарья Алексеевна, РИБО-04-22, Вариант 2");

        Telephone phone = new Telephone();
        Seller seller = new Seller();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the manufacture: ");
        phone.setManufacturer(scanner.nextLine());
        System.out.println(seller.modify(phone.getManufacturer()));
    }
}
