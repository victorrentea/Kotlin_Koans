operator fun MyDate.rangeTo(other: MyDate) = DateRange(this, other)

class DateRange(override val start: MyDate,
                override val endInclusive: MyDate): ClosedRange<MyDate>
//override val start: MyDate;
//override val endInclusive: MyDate;
//constructor(s:MyDate,e:MyDate) {
//    start =s
//    endInclusive =e
//}


fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}
