package dev.halq.login.verifylogin;

import dev.halq.RCZ.RCZCrypto;

/**
 * @author Halq
 * @since 22/11/2022 at 19:24
 */

public class DecodeLine {

    public static String decodeLine(String line) {
        String decodeline = RCZCrypto.INSTANCE.cryptoRCZ(2, line).replace("[", "").replace("]", "");
        return decodeline;
    }
}
