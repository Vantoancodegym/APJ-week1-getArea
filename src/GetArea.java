import java.util.Scanner;

public class GetArea {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("input width: ");
        float width = scanner.nextFloat();
        System.out.println("input height: ");
        float height = scanner.nextFloat();
        float area = width*height;
        System.out.println("This area = "+area);
    }
}
