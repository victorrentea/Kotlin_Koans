import java.util.*

fun <T> Iterable<T>.partitionTo(
            list1:MutableCollection<T>,
            list2:MutableCollection<T>,
            predicate: (T)->Boolean) : Pair<Iterable<T>, Iterable<T>> {
    for (elem in this) {
        if (predicate(elem)) {
            list1.add(elem);
        } else {
            list2.add(elem);
        }
    }
    return list1 to list2
}

fun partitionWordsAndLines() {
    val pairs = listOf("a", "a b", "c", "d e").partitionTo(ArrayList<String>(), ArrayList())
    { s -> !s.contains(" ") }
    val (words, lines) = pairs
    words == listOf("a", "c")
    lines == listOf("a b", "d e")
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}').
            partitionTo(HashSet<Char>(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z'}
    letters == setOf('a', 'r')
    other == setOf('%', '}')
}
