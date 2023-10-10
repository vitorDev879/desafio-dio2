import java.util.Scanner;

public class Program {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de vitorias: ");
        int win = sc.nextInt();
        System.out.println("Digite o numero de derrotas: ");
        int defeat = sc.nextInt();
        ranked(win, defeat);

    }
    static void ranked(int win, int defeat) {

        int result = win - defeat;
        String rank;

        if (result < 10) {
            rank = "Ferro";
        } else if (result >= 11 && result <= 20) {
            rank = "Bronze";
        } else if (result >= 21 && result <= 50) {
            rank = "Prata";
        } else if (result >= 51 && result <= 80) {
            rank = "Ouro";
        } else if (result >= 81 && result <= 90) {
            rank = "Diamante";
        } else if (result >= 91 && result <= 100) {
            rank = "Lendario";
        } else {
            rank = "Imortal";
        }
        System.out.println("O Herói tem de saldo de " + result + " está no nível de " + rank);
    }
}