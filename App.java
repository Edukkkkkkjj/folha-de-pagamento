import java.util.Scanner;

public class App {
    static void quitProgram() {
        System.out.println("\nPrograma encerrado.");
        return;
    }

    // Listagem de opções que usuário vai selecionar
    static String options =
            "\n1. Cadastrar trabalhador padrão" +
                    "\n2. Cadastrar trabalhador comissionado" +
                    "\n3. Cadastrar trabalhador de produção " +
                    "\n4. Gerar folha de pagamento" +
                    "\n0. Sair do programa";
    public static void main(String[] args) {
       // Objeto de respostas do usuário
        Scanner inputObj = new Scanner(System.in);
        String userChoice = "";
        Payroll payroll = new Payroll();


        // Mantém aplicação ativa
        while (!userChoice.equals("0")) {


            // Apresenta as opções do usuário e registra a escolha dele
            System.out.println("O que você gostaria de fazer? (digite o número)" + options);
            userChoice = inputObj.nextLine();


            if(userChoice.equals("0")) {
                quitProgram();
                break;
            }

            // CADASTRO DE USUÁRIO COMUM
            if(userChoice.equals("1")) {

                // Registrando nome do trabalhador
                System.out.println("Por favor digite o nome do novo trabalhador");
                String workerName = inputObj.nextLine();
                Worker newWorker = new Worker(workerName);

                // Usuário criado
                System.out.println(newWorker.workerCreatedSucessfully());
                payroll.addWorker(newWorker);
            }

            // CADASTRO DE USUÁRIO COMISSIONADO
            else if(userChoice.equals("2")) {
                // Recebe Nome
                System.out.println("Por favor digite o nome do novo trabalhador");
                String workerName = inputObj.nextLine();

                // Recebe valor da comissão
                System.out.println("Por favor digite o qual a porcentagem da comissão do trabalhador");
                double workerCommission = inputObj.nextDouble();
                inputObj.nextLine();

                // Recebe total em vendas
                System.out.println("Por favor digite o valor total em vendas do trabalhador");
                double amountSales = inputObj.nextDouble(); // leaves a \n character that was a bug
                inputObj.nextLine(); // cleans up \n left behind

                // Criar novo trabalhador comissionado
                ComissionWorker newComissionWorker = new ComissionWorker(workerName, workerCommission, amountSales);

                // Mensagem de criação e retorna string do objeto criado
                System.out.println("Trabalhador comissionado cadastrado com sucesso!");
                System.out.println(newComissionWorker.toString());

                payroll.addWorker((Worker) newComissionWorker);
            }

            // CADASTRO DE USUÁRIO DE PRODUÇÃO
            else if(userChoice.equals("3")) {
                // Recebe Nome
                System.out.println("Por favor digite o nome do novo trabalhador");
                String workerName = inputObj.nextLine();

                // Recebe quantidade de peças
                System.out.println("Por favor digite a quantidade de peças que este trabalhador produziu");
                int pieceQuantity = inputObj.nextInt();
                inputObj.nextLine();

                // Recebe valor de cada peça
                System.out.println("Por favor digite o valor de cada peça");
                double pricePerPiece = inputObj.nextDouble(); // leaves a \n character that was a bug
                inputObj.nextLine(); // cleans up \n left behind

                // Criar novo trabalhador comissionado
                ProductionWorker newProductionWorker = new ProductionWorker(workerName, pieceQuantity, pricePerPiece);

                // Mensagem de criação e retorna string do objeto criado
                System.out.println("Trabalhador de produção cadastrado com sucesso!");
                System.out.println(newProductionWorker.getProductionWorker());

                payroll.addWorker((Worker) newProductionWorker);
            }

            else if(userChoice.equals("4")) {
                payroll.printPayroll();
            }

            // Quer cadastrar outro funcionário
            System.out.println("\nGostaria de realizar outra operação?\n1. Sim\n2. Não, encerrar programa.");
            String continueOrNot = inputObj.nextLine();

            if(continueOrNot.equals("1")) {
                continueOrNot = "";
            } else {
                continueOrNot = "";
                userChoice = "0";
                quitProgram();
            };


        }

    }
}
