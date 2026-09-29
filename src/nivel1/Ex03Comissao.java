package nivel1;

import java.util.Locale;
import java.util.Scanner;

public class Ex03Comissao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Identificação do vendedor: ");
        String identificacaoVendedor = sc.nextLine();
        System.out.print("Código da peça: ");
        String codigoPeca = sc.nextLine();
        System.out.print("Preço unitário da peça: ");
        double precoUnitario = sc.nextDouble();
        System.out.print("Quantidade vendida: ");
        int quantidadeVendida = sc.nextInt();

        double totalVenda = precoUnitario * quantidadeVendida;
        double comissao = 0.05 * totalVenda;
        System.out.printf("O valor da comissão do vendedor %s será de R$ %.2f%n", identificacaoVendedor, comissao);

        sc.close();
    }
}
