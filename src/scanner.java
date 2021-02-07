import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Grapse imerominia genisis sou :");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Grapse to onoma sou");
        String name = scanner.nextLine();
        int age = 2021 - yearOfBirth;

        System.out.println(" To onoma sou einai " + name + ", kai eisai " + age + "xronon.");

        scanner.close();
    }
}
