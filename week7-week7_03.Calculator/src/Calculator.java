
public class Calculator {

    private Reader reader;

    public Calculator() {
        reader = new Reader();
    }

    public void start() {

        while (true) {
            System.out.println("command: ");
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

    public void sum() {

    }

    public void difference() {
    }

    public void product() {
    }

    public void statistics() {
    }
}
