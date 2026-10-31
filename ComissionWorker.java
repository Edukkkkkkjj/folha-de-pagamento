public class ComissionWorker extends Worker {

    private double commission;   // porcentagem
    private double amountSales;  // total vendido

    public ComissionWorker(String name, double commission, double amountSales) {
        super(name);
        this.commission = commission;
        this.amountSales = amountSales;
    }

    @Override
    public double getSalary() {
        double extra = amountSales * (commission / 100);
        return baseSalary + extra;
    }
}
