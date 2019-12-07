import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Day01Test {

    @Test
    public void TestPart1() {
        Day01 day01 = new Day01();
        int result;

        result = day01.calculateRequiredFuel(12);
        assertEquals(2, result);

        result = day01.calculateRequiredFuel(14);
        assertEquals(2, result);

        result = day01.calculateRequiredFuel(1969);
        assertEquals(654, result);

        result = day01.calculateRequiredFuel(100756);
        assertEquals(33583, result);

        result = day01.calculateTotalFuelRequirement();
        assertEquals(3371958, result);
    }

    @Test
    public void TestPart2() {
        Day01 day01 = new Day01();
        int result;

        result = day01.calculateTotalFuelRequirementWithAddedFuel();
        assertEquals(5055050, result);
    }
}
