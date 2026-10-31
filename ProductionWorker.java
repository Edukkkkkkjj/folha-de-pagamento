public class ProductionWorker extends Worker {
    int pieceQuantity;
    double pricePerPiece;
    double baseSalary = BASE_SALARY;

    double getExtraPay() {
        return pieceQuantity * pricePerPiece;
    }

    double getFullPay() {
        return baseSalary + getExtraPay();
    }

    public ProductionWorker(String name, int pieceQuantity, double pricePerPiece) {
        super(name);

        this.pieceQuantity = pieceQuantity;
        this.pricePerPiece = pricePerPiece;
    }


    String getProductionWorker() {
        return "Matrícula:  " + id +
                "\n" + "Nome: " + this.name +
                "\n" + "Salário base: R$" + baseSalary +
                "\n" + "Extra: R$" + getExtraPay() +
                "\n" + "Salário total: R$" + getFullPay();
    }
}
