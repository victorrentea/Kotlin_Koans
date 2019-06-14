import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    f2(1, Comparator { _, _ -> 1 }, Comparator { o1, o2 -> 1 })
    Collections.sort(arrayList) { o1, o2 -> o2!!.compareTo(o1!!) }
    return arrayList
}

fun f2(i:Int, c1: Comparator<Int>, c2:Comparator<Int>) = 1
