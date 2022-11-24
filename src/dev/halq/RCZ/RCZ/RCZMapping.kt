package dev.halq.RCZ

import kotlin.random.Random

/**
 * @author Halq
 * @since 10/10/22
 * @apiNote this is rewrite for rczEncrypt - java version
 */

object RCZMapping {

    val byteMapping: HashMap<String, String> = HashMap<String, String>()

    val japaneseList: ArrayList<String> = ArrayList<String>()

    fun res() {
        byteMapping["A"] = "b".toByteArray().contentToString()
        byteMapping["B"] = "z".toByteArray().contentToString()
        byteMapping["C"] = "f".toByteArray().contentToString()
        byteMapping["D"] = "n".toByteArray().contentToString()
        byteMapping["E"] = "o".toByteArray().contentToString()
        byteMapping["F"] = "r".toByteArray().contentToString()
        byteMapping["G"] = "v".toByteArray().contentToString() //a/b/c/d/e/f/g
        byteMapping["H"] = "i".toByteArray().contentToString()
        byteMapping["I"] = "j".toByteArray().contentToString()
        byteMapping["J"] = "k".toByteArray().contentToString()
        byteMapping["K"] = "l".toByteArray().contentToString()
        byteMapping["L"] = "m".toByteArray().contentToString()
        byteMapping["M"] = "q".toByteArray().contentToString()
        byteMapping["N"] = "w".toByteArray().contentToString()
        byteMapping["O"] = "p".toByteArray().contentToString()
        byteMapping["P"] = "t".toByteArray().contentToString()
        byteMapping["Q"] = "e".toByteArray().contentToString()
        byteMapping["R"] = "x".toByteArray().contentToString()
        byteMapping["S"] = "c".toByteArray().contentToString()
        byteMapping["T"] = "u".toByteArray().contentToString()
        byteMapping["V"] = "d".toByteArray().contentToString()
        byteMapping["U"] = "y".toByteArray().contentToString()
        byteMapping["Y"] = "h".toByteArray().contentToString()
        byteMapping["W"] = "a".toByteArray().contentToString()
        byteMapping["X"] = "s".toByteArray().contentToString()
        byteMapping["Z"] = "g".toByteArray().contentToString()

        byteMapping["a"] = "B".toByteArray().contentToString()
        byteMapping["b"] = "Z".toByteArray().contentToString()
        byteMapping["c"] = "F".toByteArray().contentToString()
        byteMapping["d"] = "N".toByteArray().contentToString()
        byteMapping["e"] = "O".toByteArray().contentToString()
        byteMapping["f"] = "R".toByteArray().contentToString()
        byteMapping["g"] = "V".toByteArray().contentToString() //a/b/c/d/e/f/g
        byteMapping["h"] = "I".toByteArray().contentToString()
        byteMapping["i"] = "J".toByteArray().contentToString()
        byteMapping["j"] = "K".toByteArray().contentToString()
        byteMapping["k"] = "L".toByteArray().contentToString()
        byteMapping["l"] = "M".toByteArray().contentToString()
        byteMapping["m"] = "Q".toByteArray().contentToString()
        byteMapping["n"] = "W".toByteArray().contentToString()
        byteMapping["o"] = "P".toByteArray().contentToString()
        byteMapping["p"] = "T".toByteArray().contentToString()
        byteMapping["q"] = "E".toByteArray().contentToString()
        byteMapping["r"] = "X".toByteArray().contentToString()
        byteMapping["s"] = "C".toByteArray().contentToString()
        byteMapping["t"] = "U".toByteArray().contentToString()
        byteMapping["v"] = "D".toByteArray().contentToString()
        byteMapping["u"] = "Y".toByteArray().contentToString()
        byteMapping["y"] = "H".toByteArray().contentToString()
        byteMapping["w"] = "A".toByteArray().contentToString()
        byteMapping["x"] = "S".toByteArray().contentToString()
        byteMapping["z"] = "G".toByteArray().contentToString()
    }

    fun japaneseChars(): List<String> {
        japaneseList.add("前今&前u@")
        japaneseList.add("円後語前7*")
        japaneseList.add("時前)J)C$$#")
        japaneseList.add("間午)J@Zr前{}")
        japaneseList.add("前今前+)(前u@")
        japaneseList.add("円後)前J#@&前7*")
        japaneseList.add("時前@@S*&~C$$#")
        japaneseList.add("間午)¨&%$#¨前{}")
        japaneseList.add("前今Zr&前u@")
        japaneseList.add("円後前*_7*")
        japaneseList.add("時前)J@前語($#")
        japaneseList.add("間午)J@語N#前{}")
        japaneseList.add("前今校**語(前u@")
        japaneseList.add("円後)前@&前7*")
        japaneseList.add("時前@@)S$$#")
        japaneseList.add("間午)¨J2Zr前{}")
        japaneseList.add("前今前+&前Ç@")
        japaneseList.add("円後語*&7*")
        japaneseList.add("時語()))(*$$#")
        japaneseList.add("間午語Zr前{}")
        japaneseList.add("校**語(前@@")
        japaneseList.add("円後%@$$#@&前7*")
        japaneseList.add("時前@前)8*&~C$$#")
        japaneseList.add("間午¨語$@*(前{}")
        japaneseList.add("+)語&%&前u@")
        japaneseList.add("@前N*")
        japaneseList.add("前語()))#$$#")
        japaneseList.add("間N#語語Zr前{}")
        japaneseList.add("前*語(前u@")
        japaneseList.add("円7*")
        japaneseList.add("時前@&~C$$#")
        japaneseList.add("間午)%#&%前{}")

        return japaneseList
    }

    fun randomJapanese(): String {
        val characters = 1
        var name: String = ""
        for (i in 0 until characters) {
            val random = Random
            val ch = japaneseChars().get(random.nextInt(japaneseChars().size))
            name += ch
        }
        return name
    }

    fun revertByteMap(input: String): String {
        return input.replace("b", "A").replace("z", "B").replace("f", "C").replace("f", "C").replace("n", "D")
            .replace("o", "E").replace("r", "F").replace("v", "G").replace("i", "H").replace("j", "I").replace("k", "J")
            .replace("l", "K").replace("m", "L").replace("q", "M").replace("w", "N").replace("p", "O").replace("t", "P")
            .replace("e", "Q").replace("x", "R").replace("c", "S").replace("u", "T").replace("y", "U").replace("d", "V")
            .replace("h", "Y").replace("a", "W").replace("s", "X").replace("g", "Z").replace("B", "a").replace("Z", "b")
            .replace("F", "c").replace("F", "c").replace("N", "d").replace("O", "e").replace("R", "f").replace("V", "g")
            .replace("I", "h").replace("J", "i").replace("K", "j").replace("L", "k").replace("M", "l").replace("Q", "m")
            .replace("W", "n").replace("P", "o").replace("T", "p").replace("E", "q").replace("X", "r").replace("C", "s")
            .replace("U", "t").replace("Y", "u").replace("D", "v").replace("H", "y").replace("A", "w").replace("S", "x")
            .replace("G", "z")

    }

    fun remap(input: String): String {
        return input.replace("97", "a").replace("98", "b").replace("99", "c").replace("100", "d").replace("101", "e")
            .replace("102", "f").replace("103", "g").replace("104", "h").replace("105", "i").replace("106", "j")
            .replace("107", "k").replace("108", "l").replace("109", "m").replace("110", "n").replace("111", "o")
            .replace("112", "p").replace("113", "q").replace("114", "r").replace("115", "s").replace("116", "t")
            .replace("117", "u").replace("118", "v").replace("119", "w").replace("120", "x").replace("121", "y")
            .replace("122", "z").replace("65", "A").replace("66", "B").replace("67", "C").replace("68", "D")
            .replace("69", "E").replace("70", "F").replace("71", "G").replace("72", "H").replace("73", "I")
            .replace("74", "J").replace("75", "K").replace("76", "L").replace("77", "M").replace("78", "N")
            .replace("79", "O").replace("80", "P").replace("81", "Q").replace("82", "R").replace("83", "S")
            .replace("84", "T").replace("85", "U").replace("86", "V").replace("87", "W").replace("88", "X")
            .replace("89", "Y").replace("90", "Z")
    }

}