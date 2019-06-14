fun containsEven(collection: Collection<Int>): Boolean =
        collection.any { n -> n % 2 == 0 }
