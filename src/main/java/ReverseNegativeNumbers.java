import java.util.Scanner;

public final class ReverseNegativeNumbers {

    private ReverseNegativeNumbers() { }
    public static void main(final String[]  args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть текст: ");
        String text1 = scanner.nextLine();
        Text text = new Text(text1);
        scanner.close();
        System.out.println("Результат: " + text.reverseNumber());
    }
}
