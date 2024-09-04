import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите целое число: ");
//        int num = in.nextInt();
//
//        if (num % 2 == 0)
//        {
//            System.out.println("Число чётное!");
//        }
//        else
//        {
//            System.out.println("Число нечётное!");
//        }
//
//        in.close();

        //Задача 2
//       Scanner in = new Scanner(System.in);
//
//       System.out.print("Введите 1 число: ");
//       int num1 = in.nextInt();
//
//       System.out.print("Введите 2 число: ");
//       int num2 = in.nextInt();
//
//       System.out.print("Введите 3 число: ");
//       int num3 = in.nextInt();
//
//       if ((num1 < num2) && (num1 < num3))
//       {
//           System.out.printf("Число %d является минимальным", num1);
//       }
//       else if ((num2 < num1) && (num2 < num3))
//       {
//           System.out.printf("Число %d является минимальным", num2);
//       }
//       else
//       {
//           System.out.printf("Число %d является минимальным", num3);
//       }
//
//       in.close();

        //Задача 3
//        for (int i = 1; i <= 10; i++)
//        {
//            System.out.printf("5 * %d = %d \n", i, 5 * i);
//        }

        //Задача 4
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите число N: ");
//        int N = in.nextInt();
//
//        int sum = 0;
//
//        for (int i = 1; i <= N; i++)
//        {
//            sum += i;
//        }
//
//        System.out.printf("Сумма чисел от 1 до %d равна %d", N, sum);
//
//        in.close();

        //Задача 5
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите число N: ");
//        int N = in.nextInt();
//
//        int num0 = 0;
//        int num1 = 1;
//        int num2;
//
//        System.out.printf("Первые %d чисел Фибоначчи: %d %d ", N, num0, num1);
//
//        for (int i = 3; i <= N; i++)
//        {
//            num2 = num0 + num1;
//            System.out.print(num2 + " ");
//            num0 = num1;
//            num1 = num2;
//        }
//
//        in.close();

        //Задача 6
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите число: ");
//        int a = in.nextInt();
//
//        boolean IsNotSimple = false;
//
//        if (a <= 1)
//        {
//            IsNotSimple = true;
//        }
//
//        for (int i = 2; i < a; i++)
//        {
//            if (a % i == 0)
//            {
//                IsNotSimple = true;
//                break;
//            }
//        }
//
//        if (IsNotSimple)
//        {
//            System.out.printf("Число %d не является простым", a);
//        }
//        else
//        {
//            System.out.printf("Число %d является простым", a);
//        }
//
//        in.close();

        //Задача 7
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите число N: ");
//        int N = in.nextInt();
//
//        for (int i = N; i >= 1; i--)
//        {
//            System.out.print(i + " ");
//        }
//
//        in.close();

        //Задача 8
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите число A: ");
//        int A = in.nextInt();
//
//        System.out.print("Введите число B: ");
//        int B = in.nextInt();
//
//        int sum = 0;
//
//        for (int i = A; i <= B; i++)
//        {
//            if (i % 2 == 0)
//            {
//                sum += i;
//            }
//        }
//
//        System.out.printf("Сумма всех чётных чисел в диапазоне от %d до %d равна %d", A, B, sum);
//
//        in.close();

        //Задача 9
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите строку: ");
//        String line = in.nextLine();
//
//        StringBuffer strBuffer = new StringBuffer(line);
//        strBuffer.reverse();
//        System.out.println(strBuffer.toString());
//
//        in.close();

        //Задача 10
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите число: ");
//        int n = in.nextInt();
//
//        var nDigits = String.valueOf(n).length();
//
//        System.out.printf("Количество цифр в числе %d равно %d", n, nDigits);
//
//        in.close();

        //Задача 11
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите число N: ");
//        int N = in.nextInt();
//
//        int f = 1;
//
//        for (int i = N; i >= 1; i--)
//        {
//            f *= i;
//        }
//
//        System.out.printf("Факториал числа %d равен %d", N, f);
//
//        in.close();

        //Задача 12
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите число N: ");
//        int a = in.nextInt();
//
//        int sum = 0;
//
//        while (a > 0)
//        {
//            sum = sum + a % 10;
//            a = a / 10;
//        }
//
//        System.out.printf("Сумма всех цифр числа равна %d", sum);
//
//        in.close();

        //Задача 13
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите строку: ");
//        String line = in.nextLine();
//        String reverseLine = "";
//
//        char[] characters = line.toCharArray();
//
//        for (int i = characters.length - 1; i >= 0; i--)
//        {
//            reverseLine = reverseLine + characters[i];
//        }
//
//        if (line.equals(reverseLine))
//        {
//            System.out.print("Строка является палиндромом");
//        }
//        else
//        {
//            System.out.print("Строка не является палиндромом");
//        }
//
//        in.close();

        //Задача 14
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите размер массива: ");
//        int size = in.nextInt();
//
//        int nums[] = new int[size];
//
//        System.out.print("Введите элементы массива: ");
//        for (int i = 0; i < size; i++)
//        {
//            nums[i] = in.nextInt();
//        }
//
//        int max = Arrays.stream(nums).max().getAsInt();
//
//        System.out.println("Максимальное число в массиве " + max);
//
//        in.close();

        //Задача 15
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите размер массива: ");
//        int size = in.nextInt();
//
//        int nums[] = new int[size];
//
//        System.out.print("Введите элементы массива: ");
//        for (int i = 0; i < size; i++)
//        {
//            nums[i] = in.nextInt();
//        }
//
//        int sum = Arrays.stream(nums).sum();
//
//        System.out.println("Сумма чисел в массиве " + sum);
//
//        in.close();

        //Задача 16
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите размер массива: ");
//        int size = in.nextInt();
//
//        int nums[] = new int[size];
//
//        System.out.print("Введите элементы массива: ");
//        for (int i = 0; i < size; i++)
//        {
//            nums[i] = in.nextInt();
//        }
//
//        int positive = 0;
//        int negative = 0;
//
//        for (int num : nums)
//        {
//            if (num > 0)
//            {
//                positive++;
//            }
//            else
//            {
//                negative++;
//            }
//        }
//
//        System.out.printf("Количество положительных чисел: %d \nКоличество отрицательных чисел: %d", positive, negative);
//
//        in.close();

        //Задача 17
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите число A: ");
//        int A = in.nextInt();
//
//        System.out.print("Введите число B: ");
//        int B = in.nextInt();
//
//        System.out.printf("Простые числа в диапазоне от %d до %d: ", A, B);
//
//        for (int i = A; i <= B; i++)
//        {
//            boolean IsPrime= true;
//
//            if (i <= 1)
//            {
//                IsPrime = true;
//            }
//            else
//            {
//                for (int j = 2; j <= Math.sqrt(i); j++)
//                {
//                    if (i % j == 0)
//                    {
//                        IsPrime = false;
//                        break;
//                    }
//                }
//            }
//
//            if (IsPrime)
//            {
//                System.out.print(i + " ");
//            }
//
//        }
//
//        in.close();

        //Задача 18
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите строку: ");
//        String line = in.nextLine();
//
//        var glas = "АаОоЭэЕеИиЫыУуЁёЮюЯя";
//        var sogl = "БбВвГгДдЗзЙйКкЛлМмНнПпРрСсТтФфХхЦцЧчШшЩщ";
//
//        int glasCount = 0;
//        int soglCount = 0;
//
//        for (int i = 0; i < line.length(); i++) {
//            char ch = line.charAt(i);
//            if (glas.indexOf(ch) != -1) {
//                glasCount++;
//            } else if (sogl.indexOf(ch) != -1) {
//                soglCount++;
//            }
//        }
//
//        System.out.printf("Количество гласных: %d \nКоличество согласных: %d", glasCount, soglCount );
//
//        in.close();

        //Задача 19
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите строку: ");
//        String line = in.nextLine();
//
//        String[] words = line.split(" ");
//        StringBuilder reversedString = new StringBuilder();
//
//        for (int i = words.length - 1; i >= 0; i--) {
//            reversedString.append(words[i]);
//            if (i > 0) {
//                reversedString.append(" ");
//            }
//        }
//
//        System.out.println("Слова в обратном порядке: " + reversedString.toString());
//
//        in.close();

        //Задача 20
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Введите число: ");
//        int num = in.nextInt();
//
//        int number = num;
//        int numberOfDigits = String.valueOf(num).length();
//        int sum = 0;
//
//        while (num > 0) {
//            int digit = num % 10;
//            sum += Math.pow(digit, numberOfDigits);
//            num /= 10;
//        }
//
//        if (sum == number) {
//            System.out.println(number + " является числом Армстронга.");
//        } else {
//            System.out.println(number + " не является числом Армстронга.");
//        }
//
//        in.close();
    }
}