package com.pingan.monkey.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hujiachun on 16/12/21.
 */
public class Shell {



    public static void exec(String command) throws IOException, InterruptedException {
        Process p;
        p = Runtime.getRuntime().exec(command);
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(p.getInputStream()));
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println(line);
//        }

//        bufferedReader.close();
        p.waitFor();
        p.destroy();

    }
}
