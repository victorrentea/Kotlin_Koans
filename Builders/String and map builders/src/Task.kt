fun buildMap(ciorap: MutableMap<Int, String>.() -> Unit): Map<Int, String> {
    val map = HashMap<Int, String>()
    map.ciorap()
    return map
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}

fun buildString(build: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.build()
    return stringBuilder.toString()
}

val s = buildString {
    append("Numbers: ")
    for (i in 1..3) {
        // 'this' can be omitted
        append(i)
    }
}

// @Data ~ Lombok
data class FullName2(val firstName: String, val lastName: String)

class FullName {
    var firstName: String? = null
    var lastName: String? = null
    override fun toString(): String {
        return firstName + " " + lastName?.toUpperCase()
    }
}

fun buildFullName(fill: FullName.() -> Unit): FullName {
    val fullName = FullName()
    fullName.fill()
    return fullName
}


fun main() {
    val f1 = buildFullName {
        firstName = "John"
        lastName = "Doe"
    }
    println(f1)

    val f2 = FullName().apply {
        firstName = "John"
        lastName = "Doe"
    }
    println (f2)

}
