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
       double doub = 3.141_592_653_589_793_238_462_643d;
       char ch = '*';
       boolean boo = false;
       //  Третье задание
        float i = Math(3.14f, 2.15f,4f,4f);
        System.out.println(i);
        //четвертое задание
        /*boolean r = isSumRegion10to20(12f, 3f);
        if (r) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        */
        System.out.println(isSumRegion10to20(12f, 3f));
        //пятое задание
        Number();
        //шестое задание
        check();
        //Cедьмое задание
        Name();


    }

    static float Math(float a,float b,float c, float d)
    {
        return (a * (b + (c / d)));
    }
    /*static boolean isSumRegion10to20(float a, float b)
    {
        float sum = a+b;
        boolean isSum = sum>=10 && sum<=20;
        return isSum;
    }*/

    static boolean isSumRegion10to20(float a, float b)
    {
        float sum = a+b;
        return (sum>=10 && sum<=20);
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
        System.out.println("Привет," + a + "!");
    }
}
