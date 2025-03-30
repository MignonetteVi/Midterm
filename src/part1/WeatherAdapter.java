package part1;

import java.util.List;
import java.util.Random;

// Адаптер, корректирующий результат WeatherAPI в зависимости от температуры

public class WeatherAdapter {
    private final WeatherAPI api;
    private final Random random = new Random();

    public WeatherAdapter(WeatherAPI api) {
        this.api = api;
    }

    public String fetchAdjustedWeather() {
        String rawWeather = api.fetchWeather();

        String[] parts = rawWeather.split("[ ,°]+");

        String condition = parts[0];
        String timeOfDay = parts[1];
        int temperature = Integer.parseInt(parts[2]);

        String adjustedCondition = adjustConditionByTemperature(temperature);

        return String.format("%s %s, %s°C", adjustedCondition, timeOfDay, temperature);
    }

    private String adjustConditionByTemperature(int temp) {
        List<String> options;

        if (temp < 0) {
            options = List.of("Снег", "Метель", "Туман");
        } else if (temp <= 10) {
            options = List.of("Дождь", "Пасмурно", "Облачно", "Туман");
        } else {
            options = List.of("Солнечно", "Облачно", "Дождь", "Гроза", "Ветрено");
        }

        return options.get(random.nextInt(options.size()));
    }
}
