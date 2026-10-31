public class ProductionWorker extends Worker {

    private int pieceQuantity;
    private double pricePerPiece;

    public ProductionWorker(String name, int pieceQuantity, double pricePerPiece) {
        super(name);
        this.pieceQuantity = pieceQuantity;
        this.pricePerPiece = pricePerPiece;
    }

    @Override
    public double getSalary() {
        double extra = pieceQuantity * pricePerPiece;
        return baseSalary + extra;
    }
}
