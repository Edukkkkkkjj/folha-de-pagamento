public class Worker {

    protected String name;
    protected double baseSalary = 2000;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return baseSalary;
    }

    public String workerCreated() {
        return "Nome: " + name + " | Salário: R$ " + getSalary();
    }
}
