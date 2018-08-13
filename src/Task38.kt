import java.util.HashMap

fun <K, V> buildMap(hashBuilder: HashMap<K, V>.() -> Unit): Map<K, V> {
    val hm = HashMap<K, V>()
    hm.hashBuilder()
    return hm
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
