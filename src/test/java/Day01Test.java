import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Day01Test {

    @Test
    public void TestPart1() {
        Day01 day01 = new Day01();
        int result;

        result = day01.calculateRequiredFuelPerModule(12);
        assertEquals(result, 2);

        result = day01.calculateRequiredFuelPerModule(14);
        assertEquals(result, 2);

        result = day01.calculateRequiredFuelPerModule(1969);
        assertEquals(result, 654);

        result = day01.calculateRequiredFuelPerModule(100756);
        assertEquals(result, 33583);

        result = day01.calculateTotalFuelRequirement();
        assertEquals(result, 3371958);
    }
}
