class LazyProperty(val initializer: () -> Int) {
    private var _lazy:Int? = null
    val lazy: Int
        get() {
            if (_lazy == null) {
                _lazy = initializer()
            }
//            return _lazy ?: throw AssertionError("Set to null by another thread")
            return _lazy !! // SParta@!!! No other threads around me!
        }
}

//straniu