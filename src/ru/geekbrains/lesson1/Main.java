// Первое задание
package ru.geekbrains.lesson1;

public class Main {

    public static void main(String[] args)
    {
        // Второе задание
       byte by = 127;
       short sho = 32767;
       int in = 2147483647;
       long lo = 9223372036854775807L;
       float fl = 3.14f;
       double doub = 3.141592653589793238462643;
       char ch = '*';
       boolean boo = false;
       //  Третье задание
        int i = Math();
        System.out.println(i);
        //четвертое задание
        int r = Check();
        if (r>10 && r <20) {
            System.out.println(true);
        }
        if (r<10 || r>20) {
            System.out.println(false);
        }
        //пятое задание
        Number();
        //шестое задание
        check();
        //седьмое задание
        Name();


    }

    static int Math()
    {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 1;
        return (a * (b + (c / d)));
    }
    static int Check()
    {
        int a = 5;
        int b = 10;
        return (a+b);
    }
    static void Number()
    {
        int a = -5;
        if (a<0)
        {
            System.out.println("Отрицательное");
        }
        if (a>=0)
        {
            System.out.println("Положительное");
        }
    }
    static boolean check(){
        int a = 2;
        if(a<0);
        return true;
    }
    static void Name()
    {
        String a = "Алексей";
        System.out.println("Привет," + a);
    }
}
