import groovy.time.TimeCategory

use(TimeCategory) {

    println 11.hour.from.now
    println 10.minute.ago

    def someDate = new Date()

    println someDate - 3.months
}