package d07_writingCleanJavaCode;

import java.util.Date;
import java.util.List;

public class Main {
    public static final int GRID_SIZE = 9;
    public static final CatRepository catRepo = new CatRepository();

    public static void main(String[] args) {
        float floatCatWeightInKg = 94.5f; // not num
        Date updateTimestamp = new Date();
        int maxHitPoints = 100;

    }

    private static void save(Cat cat) {
        catRepo.save(cat);
    }

    public static Double calculateAverage (List<Double> numbers){
        return numbers.stream().mapToDouble(a -> a).average().orElse(Double.NaN);
    }
}
