package org.example.seminar1.hw1;

import java.util.Scanner;
import java.lang.*;
public class TASK1 {
    public static void main(String[] args) {
        System.out.println(sumEl());
    }

    public static int sumEl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа массива, после каждого числа нажмите enter. Если хотите завершить ввод, нажмите 0 и enter!");

        String values;
        String temp;
        temp = "";
        values = "";
        int count = 0;

        while(!temp.equals("0")) {
            temp = sc.nextLine();
            try{
                Integer.parseInt(temp);
                values += temp + ",";
                count++;
            } catch(Exception e) {
                System.out.println("Не знаю такого числа, попробуйте еще разочек!");
            }

        }

        String[] str_arr;
        str_arr = values.split(",");
        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++) {
            arr[i] =  Integer.parseInt(str_arr[i]);
        }

        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<0 && arr[i-1]>0){
                sum += arr[i-1];
            }
        }
        return sum;
    }
}
