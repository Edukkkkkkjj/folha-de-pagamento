import java.util.ArrayList;

public class Payroll {

    private ArrayList<Worker> workers = new ArrayList<>();

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public void printPayroll() {
        if(workers.isEmpty()) {
            System.out.println("Nenhum trabalhador cadastrado.");
            return;
        }

        System.out.println("\n==== FOLHA DE PAGAMENTO ====");

        for(Worker worker: workers) {
            System.out.println("------------------------------");
            System.out.println("ID:   " + worker.id);
            System.out.println("Nome: " + worker.name);


            if(worker instanceof ComissionWorker) {
                ComissionWorker cw = (ComissionWorker) worker;
                System.out.println("Tipo:         Comissionado");
                System.out.println("Salário base: R$ " + cw.getBaseSalary());
                System.out.println("Comissão:     R$ " + cw.getCommission()); // base * commission %
                System.out.println("Total:        R$ " + cw.getSalary());
            }

            else if (worker instanceof ProductionWorker) {
                ProductionWorker pw = (ProductionWorker) worker;
                System.out.println("Tipo:         Produção");
                System.out.println("Salário base: R$ " + pw.getBaseSalary());
                System.out.println("Bônus prod.:  R$ " + pw.getExtraPay());
                System.out.println("Total:        R$ " + pw.getFullPay());

            }

            else {
                System.out.println("Tipo:         Padrão");
                System.out.println("Salário base: R$ " + worker.getBaseSalary());
                System.out.println("Total:        R$ " + worker.getBaseSalary());
            }
        }

        System.out.println("==============================");
        System.out.println("Total de trabalhadores: " + workers.size());
        }

    }

