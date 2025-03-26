import java.util.HashMap

fun <K, V> buildMutableMap(build: MutableMap<K, V>.() -> Unit): MutableMap<K, V> {
    val map = mutableMapOf<K, V>()
    map.build()
    return map
}

fun usage(): Map<Int, String> {
    return buildMutableMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
