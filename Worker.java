public class Worker {

    String name;
    int id = 0;
    static int counter = 0;

    static final double BASE_SALARY  = 2000;


    public Worker(String name) {
        id = ++counter;
        this.name = name;
    }

    public double getBaseSalary() {
        return BASE_SALARY;
    }

    public String workerCreatedSucessfully() {
        return "\nMatrícula: " + id +
                "\nNome: " + name +
                "\nSalário: " + BASE_SALARY;
    }

}
