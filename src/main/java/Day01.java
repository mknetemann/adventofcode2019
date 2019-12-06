import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day01 {

    int calculateTotalFuelRequirement() {
        int totalFuelRequirement = 0;

        List<Integer> modules = getModules();
        for (int module : modules) {
            int requiredFuelPerModule = calculateRequiredFuelPerModule(module);
            totalFuelRequirement += requiredFuelPerModule;
        }

        return totalFuelRequirement;
    }

    int calculateRequiredFuelPerModule(int mass) {
        return mass / 3 - 2;
    }

    private List<Integer> getModules() {
        File file = new File("src/main/resources/Day01.txt");
        List<Integer> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                list.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
