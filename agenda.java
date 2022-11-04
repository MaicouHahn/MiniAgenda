import java.util.Scanner;

public class agenda {

    public Scanner scan = new Scanner(System.in);
    public String nome;
    public String[] data = new String[7];
    public String[] at = new String[7];
    public String[] ds = new String[7];
    public int numDIA = 7;

    public void getInfo() {

        for (int i = 0; i < numDIA; i++) {

            System.out.println("Digite a data " + (i + 1));
            data[i] = scan.nextLine();
            System.out.println("Digite o dia da semana " + (i + 1));
            ds[i] = scan.nextLine();
            System.out.println("Digite a atividade " + (i + 1));
            at[i] = scan.nextLine();
        }
    }

    public void impALL(String nome, String data, String ds, String at) {

        System.out.printf("%s\n%s\n%s\n%s\n", nome, data, ds, at);
        System.out.println("========================");
    }

    public String Nome() {

        System.out.println("Digite seu nome");
        nome = scan.nextLine();
        return nome;
    }

}
