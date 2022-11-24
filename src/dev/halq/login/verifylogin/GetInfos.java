package dev.halq.login.verifylogin;

import dev.halq.login.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Halq
 * @since 22/11/2022 at 19:08
 */

public class GetInfos {

    public static String  urlText = "https://pastebin.com/raw/xxxxxxxxx";
    static List<String> lines = new ArrayList<String>();
    public static boolean isUser ;

    public static void readUrl(String user, String pass) throws Exception {
        URL url = new URL(urlText);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;

        while ((line = in.readLine()) != null) {
            lines.add(DecodeLine.decodeLine(line));
        }
        in.close();

        if(lines.contains(user + ":" + pass)){
            isUser = true;
            System.out.println( Main.log + "HWID is valid");
        } else {
            isUser = false;
            System.out.println(Main.log + "HWID is invalid");
        }
    }
}
