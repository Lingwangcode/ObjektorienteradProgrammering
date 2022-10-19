package sprint2.övning8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Temperatur {

    String temp;
    String tempPath = "src/sprint2/övning8/temp.txt";


    public List<Double> readFile(String tempPath) {
        List<Double> tempList = new ArrayList<>();
        try (BufferedReader bf = new BufferedReader(new FileReader(tempPath))) {

            while ((temp = bf.readLine()) != null) {
                double temperatur = parseDoubleValue(temp);
                tempList.add(temperatur);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tempList;
    }

    public double parseDoubleValue(String line){
        double tempLine;
        String replace = line.replace(",", ".");
        tempLine = Double.parseDouble(replace);
        return tempLine;
    }

    public double highestTemp(List<Double> tempList){
     double higtestTemp = Collections.max(tempList);
     return higtestTemp;

    }

    public double loweattTemp(List<Double> tempList){
        double minimumTemp = Collections.min(tempList);
        return minimumTemp;

    }

    public double averageTemp(List<Double> tempList){
        double sum = 0;
        for (int i = 0; i < tempList.size(); i ++){
            sum += tempList.get(i);
        }
        double averageTemp = sum / tempList.size();
        return averageTemp;
    }

    public Temperatur(){
        List<Double>tempList = readFile(tempPath);

        System.out.println("Maxtemperaturen är: "+ highestTemp(tempList));
        System.out.println("Minsta temperaturen är: " + loweattTemp(tempList));
        System.out.println("Medeltemperaturen är: "+ averageTemp(tempList));

    }

   // public Temperatur(){
       /* try(BufferedReader bf = new BufferedReader(new FileReader("src/sprint2/övning8/temp.txt"))) {

            while ((temp = bf.readLine()) != null) {
                String temp1 = temp.replace(",", ".");
                double temperatur = Double.parseDouble(temp1);
                tempList.add(temperatur);
            }

            double higtestTemp = Collections.max(tempList);
            double minnimunTemp = Collections.min(tempList);
            System.out.println("Högsta temperaturen är: " + higtestTemp);
            System.out.println("Minsta temperaturen är: " + minnimunTemp);
            double sum = 0;
            for (int i = 0; i < tempList.size(); i ++){
                sum += tempList.get(i);
            }
            double averageTemp = sum / tempList.size();
            System.out.println("Medeltemperaturen är: "+ averageTemp);

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        */

   // }

    public static void main(String[] args) {
        Temperatur t = new Temperatur();
    }
}
