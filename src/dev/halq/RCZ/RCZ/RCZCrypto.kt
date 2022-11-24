package dev.halq.RCZ

/**
 * @author Halq
 * @since 10/10/22
 * @apiNote this is rewrite for rczEncrypt - java version
 */

object RCZCrypto {

    val ENCRYPT_MODE = 1
    val DECRYPT_MODE = 2

    fun cryptoRCZ(mode: Int, input: String): String {

        val output: ArrayList<String> = ArrayList<String>()

        when (mode) {
            1 -> {
                output.add(RCZTransformer.encodeBytes(input))
            }
            2 -> {
                output.add(RCZTransformer.decodeBytes(input).replace("前今", ""))
            }
        }

        return output.toString()
    }
}