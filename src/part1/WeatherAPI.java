package part1;

import java.util.Random;

// Погодное API (поверхностная абстракция)
class WeatherAPI {
    private final String[] conditions = {
            "Солнечно", "Облачно", "Пасмурно", "Дождь", "Гроза", "Снег", "Туман", "Ветрено", "Метель"
    };

    private final int[] temperatures = {
            -15, -10, -5, 0, 5, 10, 12, 15, 18, 20, 22, 25, 28, 30, 35
    };

    private final String[] timesOfDay = {
            "утром", "днём", "вечером", "ночью"
    };

    public String fetchWeather() {
        Random random = new Random();
        String condition = conditions[random.nextInt(conditions.length)];
        int temperature = temperatures[random.nextInt(temperatures.length)];
        String time = timesOfDay[random.nextInt(timesOfDay.length)];

        return String.format("%s %s, %s°C", condition, time, temperature);
    }
}
