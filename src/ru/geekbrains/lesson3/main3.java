package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){
            game();

            System.out.println("Повторить игру. 1-да? 0 - нет");
            if(scanner.nextInt()==0){
                break;
            }
        }


    }

    public static int randRange(int from, int to){
        return new Random().nextInt(to - from) +from;
    }

    public static void whichIsBigger(int a, int b){
        //System.out.println("Число загаданное компьютером больше вашего?"+(a>b));
        System.out.println("Число загаданное компьютером "+((a>b)? "Больше вашего":"Меньше вашего"));
    }

    public static void game(){
        int value = randRange(0,9);
        System.out.println("Введите число от 0 до 9:");
        Scanner scan = new Scanner(System.in);
        int userValue = scan.nextInt();
        System.out.println("Пользователь ввёл число: "+userValue);
        whichIsBigger(value,userValue);

        boolean isWin = false;

        for (int step = 0; step<3; step ++) {
            if (value == userValue) {

                isWin=true;
                break;
            }else {
                if(step!=2)
                {
                    System.out.println("Введите число от 0 до 9:");
                    userValue = scan.nextInt();
                    whichIsBigger(value,userValue);
                }

            }
        }

        if (isWin){
            System.out.println("Вы победили!");
        }else{
            System.out.println("Попробуйте еще раз");
        }
    }
}
