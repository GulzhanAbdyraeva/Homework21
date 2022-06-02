package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try(FileWriter fileWriter = new FileWriter("myText.txt")){
            for(char i ='A'; i<='Z'; i++){
                fileWriter.append(i+""+Character.toLowerCase(i)+" \n");
            }for(int i = 0; i<=9; i++){
                fileWriter.append(i+"\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        try(FileReader fileReader = new FileReader("myText.txt")){
            Scanner scanner = new Scanner(fileReader);
            int number = 1;
            while(scanner.hasNextLine()) {
                System.out.println(number+") "+scanner.nextLine());
                number++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
