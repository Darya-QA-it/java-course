import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введи возвраст");
        int age =scanner.nextInt();
        if (age==10);
        switch (age){
            case 0:
                System.out.println("Ты родился");
                break;
            case 7:
                System.out.println("ТЫ пошел в школу");
                break;

            case 18:
                System.out.println("ТЫ ЗАКОНЧИЛ ШКОЛУ ");
                break;
            default:
                System.out.println("ни одно из условий не подошло");
        }



    }
}
