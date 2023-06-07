import com.sun.xml.internal.ws.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        //чтение в буфер введенного значения
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        //регулярка на проверку, число или нет
        String reg = "^[-+]?[0-9]+$";
        //String regArray = "^[-+]?[0-9]*[.]?[0-9]+$";

        String chislo;
        do {
            System.out.println("Введите число 1: ");
            chislo = buffer.readLine();
        } while (!(chislo.matches(reg)) || chislo.equals("0"));
        String numberOne = chislo;

        do {
            System.out.println("Введите число 2: ");
            chislo = buffer.readLine();
        } while (!(chislo.matches(reg)) || chislo.equals("0"));
        int numberTwo = Integer.parseInt(chislo);

        int numberMax = Math.max(numberTwo, Integer.parseInt(numberOne));
        int numberMin = Math.min(numberTwo, Integer.parseInt(numberOne));

        System.out.println("Максимальное число: " + numberMax + "\nМинимальное число, умноженное на 3: " + numberMin*3.0);

    }
}