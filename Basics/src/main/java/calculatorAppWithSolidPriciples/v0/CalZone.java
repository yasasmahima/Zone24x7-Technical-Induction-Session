package calculatorAppWithSolidPriciples.v0;

import java.io.FileReader;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalZone{

    public static void main(String[] args) {

        String operator = args[0];  //First Argument add/subtract/Multiply
        List<Integer> numberList = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get("D:\\Zone24x7\\Java_test\\src\\main\\java\\number"));

            for (String number : lines) {
                numberList.add(Integer.parseInt(number));
            }

            if ("add".equals(operator)) {

                System.out.println("Result is : " +(numberList.get(0) + numberList.get(1)));

            }else if("sub".equals(operator)){

                System.out.println("Result is : " +(numberList.get(0) - numberList.get(1)));

            }else if("mul".equals(operator)){

                System.out.println("Result is : " +(numberList.get(0) * numberList.get(1)));

            }else if("div".equals(operator)){

                System.out.println("Result is : " +(numberList.get(0) / numberList.get(1)));
            }


        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
