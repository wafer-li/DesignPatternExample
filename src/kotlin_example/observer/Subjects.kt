package kotlin_example.observer

/**
 * This is the Subjects file
 *
 * Contain the subjects
 *
 * @author Wafer Li
 * @since 16/11/14 21:59
 */
interface Subject {
    fun addObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObserver()
}

class WeatherData : Subject {

    private val observers: MutableList<Observer> =  mutableListOf()

    private var data: Data = Data(Float.NaN, Float.NaN, Float.NaN)

    override fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObserver() {
        for (observer in observers) {
            observer.update(data)
        }
    }

    fun measureChanged() {
        notifyObserver()
    }

    /**
     * A test method
     * Just to make the measure change
     */
    fun setMeasure(temperature: Float, humidity: Float, pressure: Float) {
        data = Data(temperature, humidity, pressure)
        measureChanged()
    }
}