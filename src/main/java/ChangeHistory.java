import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> list;

    public ChangeHistory() {
        this.list = new ArrayList<>();
    }

    public void add(double status) {
        list.add(status);
    }

    public void clear() {
        list.clear();
    }

    public String toString() {
        return list.toString();
    }

    public double maxValue() {
        double maxValue = 0;
        for (Double line : list) {
            if (maxValue < line) {
                maxValue = line;
            }
        }
        return  maxValue;
    }

    public double minValue() {
        if (this.list.size() == 0) {
            return 0;
        }
        double minValue = 9999999999.99;
        for (Double line : list) {
            if (minValue > line) {
                minValue = line;
            }
        }
        return minValue;
    }

    public double average() {
        double sum = 0.0;
        int count = 0;
        for (Double line : list) {
            sum += line;
            count++;
        }
        return (sum / count);
    }
}
