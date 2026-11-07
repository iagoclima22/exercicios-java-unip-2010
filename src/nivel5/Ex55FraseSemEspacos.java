package nivel5;

import java.util.Scanner;

public class Ex55FraseSemEspacos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        String semEspacos = "";
        int espacos = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == ' ') {
                espacos++;
            } else {
                semEspacos += c;
            }
        }

        System.out.println("Sem espacos: " + semEspacos);
        System.out.println("Quantidade de espacos: " + espacos);

        sc.close();
    }
}