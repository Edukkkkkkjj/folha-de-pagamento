import java.util.ArrayList;

public class Payroll {

    private ArrayList<Worker> workers = new ArrayList<>();

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public void printPayroll() {
        if (workers.isEmpty()) {
            System.out.println("Nenhum trabalhador cadastrado.");
            return;
        }

        System.out.println("\n==== FOLHA DE PAGAMENTO ====");
        for (Worker w : workers) {
            // Polimorfismo: cada tipo usa a sua própria versão de getSalary()
            System.out.println(w.workerCreated());
        }
        System.out.println("Total de trabalhadores: " + workers.size());
    }
}
