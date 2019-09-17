import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class LazyProperty(val initializer: () -> Int) {
    val lazyValue: Int by lazy(initializer) // (C) Mihai Balaniscu
//    val lazyValue: Int by CeMamaMasii(initializer)
}
class CeMamaMasii(val initializer: () -> Int) : ReadOnlyProperty<LazyProperty, Int> {
    var v: Int? = null
    override fun getValue(thisRef: LazyProperty, property: KProperty<*>): Int {
        print("thisRef:$thisRef")
        if (v == null) {
            v = initializer()
        }
        return v !!
    }

}
