package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import com.lucasl36.cursojavacompleto.helpers.FileHelper;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_16_161_1 extends OOJavaExercise {
    
    private final String stockFileName;
    private final String summaryFilename;
    private final String summaryColumns;
    
    public Exercise_16_161_1() {
        super("Exercise mod. 16 lesson 161 num. 1 - Convert TXT file content to CSV");
        stockFileName = "stock";
        summaryFilename = "summary";
        summaryColumns = "Product,Total Value";
    }
    
    @Override
    public void execute() {
        System.out.println("Converting stock.txt file to summary.csv file...");
        try {
            String stockText = FileHelper.readTxtFileFromResource(stockFileName);
            String summaryText = transformStockIntoSummary(stockText);
            FileHelper.writeCsvFromString(summaryFilename, FileHelper.convertTextToTable(summaryColumns.split(","), summaryText));
        } catch(Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private String transformStockIntoSummary(String stockText) {
        StringBuilder summaryTextSb = new StringBuilder();
        for(String line : stockText.split("\\r\\n|\\n|\\r")) {
            String[] columns = line.split(FileHelper.csvColumnSeparator);
            Double totalValue = Double.valueOf(columns[1].trim())*Integer.valueOf(columns[2].trim());
            summaryTextSb.append(columns[0]);
            summaryTextSb.append(FileHelper.csvColumnSeparator);
            summaryTextSb.append(String.format("%.2f", totalValue));
            summaryTextSb.append(System.lineSeparator());
        }
        return summaryTextSb.toString();
    }
    
}
