package kotlin_example.observer

/**
 * This is the Test class
 * Please put some info here.
 *
 * @author Wafer Li
 * @since 16/11/14 23:40
 */

fun main(args: Array<String>) {
    val data: WeatherData = WeatherData()

    val currentDisplay: CurrentConditionDisplay = CurrentConditionDisplay(data)
    val statisticsDisplay: StatisticsDisplay = StatisticsDisplay(data)
    val forecastDisplay: ForecastDisplay = ForecastDisplay(data)

    data.setMeasure(80f, 65f, 30.4f)
    data.setMeasure(82f, 70f, 29.2f)
    data.setMeasure(78f, 90f, 29.2f)
}
