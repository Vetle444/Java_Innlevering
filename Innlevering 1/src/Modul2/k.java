package Modul2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class k {

    public static void main(String[] args) {

        int lines = 0;
        try {

            URL myUrl = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
            Scanner input = new Scanner(myUrl.openStream());

            while (input.hasNext()){

                lines++;
                input.next();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(lines);


    }
}

