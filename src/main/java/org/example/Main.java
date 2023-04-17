package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) throws IOException {

//        file -> byte[]

        File file = new File("anotherFile.txt");
        try (FileInputStream is = new FileInputStream("/Users/Narek_Musakhanyan/Personal/Goris Training/Projects/IOStreams/IOStreams/sample.txt");
             OutputStream out = new FileOutputStream(file)) {
//        OutputStream ous = new FileOutputStream();

            String readText = new String(is.readAllBytes());

            System.out.println(readText);

            out.write(readText.getBytes());
            out.flush();
        }

        List<String> strings = Arrays.asList("Users", "Narek_Musakhanyan", "Personal", "Goris Training", "Projects", "IOStreams", "IOStreams", "sample.txt");

        System.out.println(concatStrings(strings));

//        URL url = new URL("https://dewfd.com");
        // TODO Homework

//        try-with-resource

    }

    private static String concatStrings(List<String> strings) {
        String temp = "Users" + "Narek_Musakhanyan";
        temp += "Personal";

        StringJoiner joiner = new StringJoiner("/");
//        StringBuilder sb = new StringBuilder("/");
        for(String s : strings) {
            joiner.add(s);
        }
        return joiner.toString();
    }
}