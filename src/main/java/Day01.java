import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Day01 {

    int calculateTotalFuelRequirement() {
        int totalFuelRequirement = 0;
        List<Integer> modules = getModules();

        for (int module : modules) {
            int requiredFuel = calculateRequiredFuel(module);
            totalFuelRequirement += requiredFuel;
        }

        return totalFuelRequirement;
    }

    int calculateTotalFuelRequirementWithAdditionalFuel() {
        int totalFuelRequirement = 0;
        List<Integer> modules = getModules();

        for (int module : modules) {
            int requiredFuel = calculateRequiredFuelWithAdditionalFuel(module);
            totalFuelRequirement += requiredFuel;
        }

        return totalFuelRequirement;
    }

    int calculateRequiredFuelWithAdditionalFuel(int mass) {
        int totalFuelRequirement = 0;

        do {
            int requiredFuel = calculateRequiredFuel(mass);
            if (requiredFuel > 0) totalFuelRequirement += requiredFuel;
            mass = requiredFuel;
        } while (mass > 0);

        return totalFuelRequirement;
    }

    int calculateRequiredFuel(int mass) {
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
