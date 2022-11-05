import java.util.Scanner;

public class agenda {

    public Scanner scan = new Scanner(System.in);
    public String nome;
    public int qtde=7;
    public String[] data = new String[qtde];
    public String[] at = new String[qtde];
    public String[] ds = new String[qtde];
    public String[] hr = new String[qtde];
    public int numDIA = 7;

    public void getInfo() {

        for (int i = 0; i < numDIA; i++) {

            System.out.println("Digite o dia da semana em que fara a atividade" + (i + 1));
            ds[i] = scan.nextLine();
            System.out.println("Digite a data do dia dessa atividade" + (i + 1));
            data[i] = scan.nextLine();
            System.out.println("Que atividade voce fara nesse dia? ");
            at[i] = scan.nextLine();
            System.out.println("Digite o horario do dia que fara essa atividade");
            hr[i] = scan.nextLine();

        }
    }

    public void impALL(String ds, String data, String hr, String at) {

        System.out.printf("\nDia: %s - %s\nHorario: %s\nAtividade: %s\n", ds, data, hr, at);
        System.out.println("========================");

    }

    public String Nome() {

        System.out.println("Digite seu nome");
        nome = scan.nextLine();
        return nome;
    }

    public void NomeImp(String  nome){
        System.out.print("\n========================\n" + nome + "\n========================");
    }

}
