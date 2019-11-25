
public class Calculator {

    private Reader reader;
    private int statistics;

    public Calculator() {
        this.reader = new Reader();
        this.statistics = 0;
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

    private void sum() {
        int[] values = readTwoValues();
        System.out.println("sum of the values "
                + (values[0] + values[1]));
    }

    private void difference() {
        int[] values = readTwoValues();
        System.out.println("difference of the values "
                + (values[0] - values[1]));
    }

    private void product() {
        int[] values = readTwoValues();
        System.out.println("product of the values "
                + (values[0] * values[1]));
    }

    private int[] readTwoValues() {
        this.statistics++;
        
        int[] values = new int[2];

        System.out.println("value1: ");
        values[0] = reader.readInteger();
        System.out.println("value2: ");
        values[1] = reader.readInteger();

        return values;
    }

    private void statistics() {
        System.out.println("Calculations done " + this.statistics);
    }
}
