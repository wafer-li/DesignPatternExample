package kotlin_example.observer

import kotlin.properties.Delegates

/**
 * This is the Observers class
 * Please put some info here.
 *
 * @author Wafer Li
 * @since 16/11/14 22:04
 */

interface Observer {
    fun update(data: Data)
}

interface DisplayElement {
    fun display()
}

class CurrentConditionDisplay(private val subject: Subject) : Observer, DisplayElement {

    init {
        subject.addObserver(this)
    }

    lateinit var data: Data

    override fun update(data: Data) {
        this.data = data
        display()
    }

    override fun display() {
        println("Current conditions: ${data.temperature} F degree, and ${data.humidity} humidity")
    }
}

class StatisticsDisplay(private val subject: Subject) : Observer, DisplayElement {

    init {
        subject.addObserver(this)
    }

    var data: Data by Delegates.observable(Data(Float.NaN, Float.NaN, Float.NaN)) {
        prop, old, new ->

        if (!new.temperature.isNaN()) {
            if (max.isNaN() || max < new.temperature) {
                max = new.temperature
            }

            if (min.isNaN() || min > new.temperature) {
                min = new.temperature
            }
        }
    }

    var max: Float by Delegates.observable(Float.NaN) {
        prop, old, new ->
        triggerCalculateAvg(old, new)
    }

    var min: Float by Delegates.observable(Float.NaN) {
        prop, old, new ->
        triggerCalculateAvg(old, new)
    }

    var avg: Float = 0f

    fun triggerCalculateAvg(old: Float, new: Float) {
        if (!old.isNaN() && !new.isNaN()) {
            calculateAvg()
        }
    }

    private fun calculateAvg() {
        avg = (max + min) / 2
    }

    override fun update(data: Data) {
        this.data = data
        display()
    }

    override fun display() {
        println("Avg/Max/Min temperature = $avg/$max/$min")
    }

}

class ForecastDisplay(private val subject: Subject) : Observer, DisplayElement {

    init {
        subject.addObserver(this)
    }

    private var first: Boolean = true

    private var data: Data by Delegates.observable(Data(Float.NaN, Float.NaN, Float.NaN)) {
        prop, old, new ->

        val temperatureChange: TemperatureChange
        val humidityChange: HumidityChange

        when {
            new.temperature > old.temperature ->
                    temperatureChange = TemperatureChange.HOTTER
            new.temperature < old.temperature ->
                    temperatureChange = TemperatureChange.COOLER
            else ->
                    temperatureChange = TemperatureChange.NOT_CHANGE
        }

        when {
            new.humidity > old.humidity ->
                    humidityChange = HumidityChange.WETTER
            new.humidity < old.humidity ->
                    humidityChange = HumidityChange.DRIER
            else ->
                    humidityChange = HumidityChange.NOT_CHANGE
        }

        changeDisplayMsg(temperatureChange, humidityChange)
    }

    enum class TemperatureChange {
        COOLER, HOTTER, NOT_CHANGE
    }

    enum class HumidityChange {
        WETTER, DRIER, NOT_CHANGE
    }

    var displayMsg: String = ""

    private fun changeDisplayMsg(temperatureChange: TemperatureChange,
                                 humidityChange: HumidityChange) {
        if (first) {
            displayMsg = "Improving weather on the way!"
            first = false
        } else {

            displayMsg = "Watch out for %s weather"

            when (temperatureChange) {
                ForecastDisplay.TemperatureChange.COOLER ->
                    displayMsg = displayMsg.format("cooler, %s")
                ForecastDisplay.TemperatureChange.HOTTER ->
                    displayMsg = displayMsg.format("hotter, %s")
                TemperatureChange.NOT_CHANGE ->
                    displayMsg = displayMsg.format("\b%s")
            }

            when (humidityChange) {
                ForecastDisplay.HumidityChange.WETTER ->
                    displayMsg = String.format(displayMsg, "rainy")
                ForecastDisplay.HumidityChange.DRIER ->
                    displayMsg = String.format(displayMsg, "drier")
                HumidityChange.NOT_CHANGE ->
                    displayMsg = "More of the same"
            }
        }
    }

    override fun update(data: Data) {
        this.data = data
        display()
    }

    override fun display() {
        println("Forecast: $displayMsg")
    }
}
