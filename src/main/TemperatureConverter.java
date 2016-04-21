package main;

import java.util.ArrayList;
import java.util.List;

public class TemperatureConverter {

    public List<Integer> mapToCelsius(List<Integer> temperatures) {
        List<Integer> convertedTemperatures = new ArrayList();

        for(int i = 0; i < temperatures.size(); i++)
            convertedTemperatures.add(convertToCelsius(temperatures.get(i)));

        return convertedTemperatures;
    }

    private int convertToCelsius(int temperature) {
        return (temperature - 32) * 5 / 9;
    }
}
