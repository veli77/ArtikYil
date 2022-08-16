import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sene;
        System.out.println("Yılı giriniz: ");
        sene = giris.nextInt();

        if (sene % 100 == 0) {
            if (sene % 400 == 0) {
                System.out.println(sene + "Artık yıldır");
            } else {
                System.out.println(sene + "Artık yıl değildir");
            }
        } else if (sene % 4 == 0) {
            System.out.println(sene + "Artık yıldır");
        } else {
            System.out.println(sene + "Artık yıl değildir");
        }
    }
}
