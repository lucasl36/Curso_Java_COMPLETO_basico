package com.lucasl36.cursojavacompleto.helpers;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;

/**
 *
 * @author Lucas Lopes
 */
public class FileHelper {

    public static final String csvColumnSeparator = ",";
    
    private static final String txtSufix = ".txt";
    private static final String csvSufix = ".csv";
    
    public static String readTxtFileFromResource(String fileName) throws IOException {
        InputStream inputStream = FileHelper.class.getClassLoader().getResourceAsStream(fileName + FileHelper.txtSufix);
        if (inputStream == null) {
            throw new IOException("File not found in resources: " + fileName);
        }
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
            return content.toString();
        }
    }
        
    public static String[] convertTextToTable(String[] columns, String text) {
        List<String> table = new ArrayList<>();
        table.add(String.join(FileHelper.csvColumnSeparator, columns));
        for(String line : text.split("\\r\\n|\\n|\\r")) {
            table.add(line);
        }
        Object[] tmpArray = table.toArray();
        return Arrays.stream(tmpArray).map(Object::toString).toArray(String[]::new);
    }
    
    public static void writeCsvFromString(String fileName, String[] source) throws IOException {
        Path outputDir = Paths.get("target", "output");
        Files.createDirectories(outputDir);
        Path outputPath = outputDir.resolve(fileName + FileHelper.csvSufix);
        try (BufferedWriter writer = Files.newBufferedWriter(outputPath, StandardCharsets.UTF_8)) {
            for (String line : source) {
                writer.write(line);
                writer.newLine();
            }
        }
    } 
    
}
