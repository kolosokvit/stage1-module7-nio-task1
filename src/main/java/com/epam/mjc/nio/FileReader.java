package com.epam.mjc.nio;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class FileReader {

    public Profile getDataFromFile(File file) {
        try (BufferedReader reader = Files.newBufferedReader(file.toPath())) {
            String name = reader.readLine().split(": ")[1];
            int age = Integer.parseInt(reader.readLine().split(": ")[1]);
            String email = reader.readLine().split(": ")[1];
            long phone = Long.parseLong(reader.readLine().split(": ")[1]);
            return new Profile(name, age, email, phone);
        } catch (IOException e) {
            throw new ImpossibleToPerformReadingFromFileException("Impossible to perform reading from file", e);
        }
    }
}