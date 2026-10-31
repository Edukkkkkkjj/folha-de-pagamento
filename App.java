import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payroll payroll = new Payroll();
        String option = "";

        // O menu repete enquanto a opção não for "0"
        while (!option.equals("0")) {
            System.out.println("\n1. Cadastrar trabalhador padrão");
            System.out.println("2. Cadastrar trabalhador comissionado");
            System.out.println("3. Cadastrar trabalhador de produção");
            System.out.println("4. Gerar folha de pagamento");
            System.out.println("0. Sair");
            option = sc.nextLine();

            if (option.equals("1")) {
                System.out.println("Nome:");
                Worker w = new Worker(sc.nextLine());
                payroll.addWorker(w);
                System.out.println("Cadastrado! " + w.workerCreated());

            } else if (option.equals("2")) {
                System.out.println("Nome:");
                String name = sc.nextLine();
                System.out.println("Comissão (%):");
                double commission = Double.parseDouble(sc.nextLine());
                System.out.println("Total em vendas (R$):");
                double sales = Double.parseDouble(sc.nextLine());
                Worker w = new ComissionWorker(name, commission, sales);
                payroll.addWorker(w);
                System.out.println("Cadastrado! " + w.workerCreated());

            } else if (option.equals("3")) {
                System.out.println("Nome:");
                String name = sc.nextLine();
                System.out.println("Quantidade de peças:");
                int pieces = Integer.parseInt(sc.nextLine());
                System.out.println("Valor por peça (R$):");
                double price = Double.parseDouble(sc.nextLine());
                Worker w = new ProductionWorker(name, pieces, price);
                payroll.addWorker(w);
                System.out.println("Cadastrado! " + w.workerCreated());

            } else if (option.equals("4")) {
                payroll.printPayroll();

            } else if (!option.equals("0")) {
                System.out.println("Opção inválida.");
            }
        }

        System.out.println("Programa encerrado.");
        sc.close();
    }
}
