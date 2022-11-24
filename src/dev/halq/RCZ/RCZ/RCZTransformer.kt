package dev.halq.RCZ

/**
 * @author Halq
 * @since 10/10/22
 * @apiNote this is rewrite for rczEncrypt - java version
 */

object RCZTransformer {

    val prefix = "RCZ-,"
    val random = RCZMapping.randomJapanese()
    val getRandom = random

    fun encodeBytes(input: String): String {
        RCZMapping.res()
        val output = StringBuilder()
        for (i in input.indices) {
            val vq = input[i] + ""

            if (RCZMapping.byteMapping.containsKey(vq)) {
                output.append(RCZMapping.byteMapping.get(vq))
                output.toString().replace("[", "")
            } else {
                output.append(vq)
            }
        }
        return prefix + output.toString().replace("[", "").replace("]", "前今")
    }

    fun removeAB(input: String): String {
        if (input.startsWith(prefix)) {
            return input.replace(prefix, "")
        } else if (input.startsWith("[$prefix")) {
            return input.replace(getRandom, "-").replace("[$prefix", "").replace("]", "")
        }
        return input.replace(getRandom, "-")
    }

    fun decodeBytes(input: String): String {
        val input = removeAB(input)

        return RCZMapping.revertByteMap(RCZMapping.remap(input))
    }
}