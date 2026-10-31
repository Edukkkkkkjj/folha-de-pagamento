public class ComissionWorker extends Worker {

    double amountSales, commission;
    double baseSalary = BASE_SALARY;

    public ComissionWorker(String name, double commission, double amountSales) {
        super(name);

        this.amountSales = amountSales;
        this.commission = commission;
    }

    public double getCommission() {
        return getSalary() - baseSalary;
    }

    public double getSalary () {
        double totalCommission = amountSales * (commission / 100);

        return baseSalary + totalCommission;
    }

@Override
    public String toString() {
        return "Worker ID: " + this.id +
                "\n" + "Nome: " + this.name +
                "\n" + "Salário base: R$" + baseSalary +
                "\n" + "Comissão: " + commission + "%" +
                "\n" + "Valor total em vendas: R$" + amountSales +
                "\n" + "Comissão total: R$" + (getSalary() - baseSalary) +
                "\n" + "Salário total no mês: " + getSalary();


    }

}
