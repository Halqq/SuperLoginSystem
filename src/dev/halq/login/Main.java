package dev.halq.login;

import dev.halq.login.ui.Frame;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Halq
 * @since 22/11/2022 at 18:45
 */

public class Main {

    public static Date date = new Date();
    public static DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
    public static String strDate = dateFormat.format(date);
    public static String log = "[" + strDate + "] ";

        public static void main(String[] args) throws Exception {
            Frame.mainUI();
        }

}
