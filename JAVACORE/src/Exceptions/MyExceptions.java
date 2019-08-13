package com.company.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MyExceptions
{
    public static void main(String[] args) throws Exception
    {
        int[] array = new int[7];
        for (int i = 0; i < array.length ; i++)
        {
            array[i]=i;
            System.out.println(array[i]);
        }
        Thread.sleep(1000);
        try{
            System.out.println(array[7]);
        }

        catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("catch1");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("catch2");
        }

        finally
        {
            System.out.println("finally");
        }

        try {
            test();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Test");

    }
    private static void test() throws FileNotFoundException, IOException {
        File file = new File("asd");
        Scanner scanner = new Scanner(file);
    }
}
