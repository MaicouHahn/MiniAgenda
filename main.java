import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanBT = new Scanner(System.in);
        Scanner scanDT = new Scanner(System.in);
        String DT;
        agenda a1 = new agenda();
        int bt, bt2 = 0;
        a1.Nome();
        a1.getInfo();

        System.out.println("Como deseja consultar? 1-Toda Lista 2- Consulta individual por data");
        bt = scanBT.nextInt();
        
        switch (bt) {
            case 1:

                a1.NomeImp(a1.nome);

                for (int i = 0; i < a1.numDIA; i++) {
                    a1.impALL(a1.ds[i], a1.data[i], a1.hr[i], a1.at[i]);
                }
                break;

            case 2:

                while (bt2 == 0) {

                    System.out.println("Informe a data");
                    DT = scanDT.nextLine();

                    for (int i = 0; i < a1.numDIA; i++) {

                        if (DT.equals(a1.data[i])) {

                            a1.NomeImp(a1.nome);

                            a1.impALL(a1.ds[i], a1.data[i], a1.hr[i], a1.at[i]);
                            bt2 = 1;
                        } else {
                            System.out.println("data invalida");
                        }
                    }
                }

                break;
        }

    }

}