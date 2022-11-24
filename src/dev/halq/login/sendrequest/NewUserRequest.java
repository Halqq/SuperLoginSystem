package dev.halq.login.sendrequest;

import dev.halq.RCZ.RCZCrypto;

/**
 * @author Halq
 * @since 22/11/2022 at 19:34
 */

public class NewUserRequest {

    public static void send(String newUser, String newPass) {
        String encodeuser = RCZCrypto.INSTANCE.cryptoRCZ(1, newUser + ":" + newPass);
        WebHookUtil.main("New user make request for you add in database: " + "\n" +
                "Encode user (put this in database): " + encodeuser + "\n" +
                "Decode user (for you see): " + newUser + ":" + newPass);
    }
}
