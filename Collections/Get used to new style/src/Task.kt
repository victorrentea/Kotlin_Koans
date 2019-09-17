fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {

    val groupsByLength = collection. groupBy { it.length }

    val maximumSizeOfGroup = groupsByLength.values.map { it.size }.max()

    return groupsByLength.values.firstOrNull { group -> group.size == maximumSizeOfGroup }
}


//fun doSomethingStrangeWithCollection(
//        collection: Collection<String>
//): Collection<String>? {
//    val groupsByLength = Maps.newHashMap()
//    for (s in collection) {
//        var strings: MutableList<String>? = groupsByLength.get(s.length)
//        if (strings == null) {
//            strings = Lists.newArrayList()
//            groupsByLength.put(s.length, strings)
//        }
//        strings.add(s)
//    }
//
//    var maximumSizeOfGroup = 0
//    for (group in groupsByLength.values) {
//        if (group.size > maximumSizeOfGroup) {
//            maximumSizeOfGroup = group.size
//        }
//    }
//
//    for (group in groupsByLength.values) {
//        if (group.size == maximumSizeOfGroup) {
//            return group
//        }
//    }
//    return null
//}