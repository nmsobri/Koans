import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = this.addTimeIntervals(timeInterval, 1)

operator fun MyDate.plus(repeatedTimes: RepeatedTimes) : MyDate = this.addTimeIntervals(repeatedTimes.timeInterval, repeatedTimes.times)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun TimeInterval.times(times: Int) : RepeatedTimes = RepeatedTimes(this, times)

class RepeatedTimes(val timeInterval: TimeInterval, val times: Int)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
