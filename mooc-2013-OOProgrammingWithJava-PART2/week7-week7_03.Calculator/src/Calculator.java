public class Calculator {

    private Reader reader;
    private int counter = 0;

    public Calculator() {
        this.reader = new Reader();
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }


    private void sum() {
        System.out.println("Value1: ");
        int firstNumber = reader.readInteger();
        System.out.println("Value2: ");
        int secondNumber = reader.readInteger();
        System.out.println("Sum of the values is: " + (firstNumber + secondNumber));
        this.counter++;
    }

    private void difference() {
        System.out.println("Value1: ");
        int firstNumber = reader.readInteger();
        System.out.println("Value2: ");
        int secondNumber = reader.readInteger();
        System.out.println("Difference of the values is: " + (firstNumber - secondNumber));
        this.counter++;
    }

    private void product() {
        System.out.println("Value1: ");
        int firstNumber = reader.readInteger();
        System.out.println("Value2: ");
        int secondNumber = reader.readInteger();
        System.out.println("Product of the values is: " + (firstNumber * secondNumber));
        this.counter++;
    }

    private void statistics() {
        System.out.println("Calculations done " + this.counter);
    }

}

