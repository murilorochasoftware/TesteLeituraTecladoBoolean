import java.util.Scanner;

public class TesteLeituraTecladoBoolean {

    public static void main(String[] args) {
        boolean dadoBooleanoDigitado;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dado do tipo booleano e tecle enter:");
        dadoBooleanoDigitado = scanner.nextBoolean();

        System.out.printf("O dado booleano digitado foi: %b", dadoBooleanoDigitado);
    }
}
