import main.TemperatureConverter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TemperatureConverterTest {

    @Test
    public void test32is0Celsius() {
        TemperatureConverter converter = new TemperatureConverter();
        List<Integer> temperatures = new ArrayList();
        temperatures.add(32);

        List<Integer> convertedList = converter.mapToCelsius(temperatures);

        assertEquals(0, convertedList.get(0).intValue());
    }

    @Test
    public void testAddsAllGivenTemperatures() {
        TemperatureConverter converter = new TemperatureConverter();
        List<Integer> temperatures = new ArrayList();
        temperatures.add(32);
        temperatures.add(50);

        List<Integer> convertedList = converter.mapToCelsius(temperatures);

        assertEquals(0, convertedList.get(0).intValue());
        assertEquals(10, convertedList.get(1).intValue());
    }
}
