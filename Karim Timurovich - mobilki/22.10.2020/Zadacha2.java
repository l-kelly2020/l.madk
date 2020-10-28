import java.util.Arrays;

public class Zadacha2 
{
	public static void main(String[] args) 
	{
        // Согласно условию - в каждой из последовательностей члены различны, 
        // т.е не может быть например две тройки.
        int[] arrayFirst = { 6, 3, 4, 9, 1, 2, 8 };
        int[] arraySecond = { 9, 4, 1 };
        int [] arrayThird = new int [3];
        int c = 0;
		int flag = 0;	// Для поиска нуля в первом массиве.
		int flag2 = 0;	// Для поиска нуля во втором массиве.
		int flag3 = 0;	// Для вывода ответа.

        System.out.println("1st array: "+Arrays.toString(arrayFirst));
        System.out.println("2nd array: "+Arrays.toString(arraySecond));

        for (int b = 0; b < (arraySecond.length); b++)
        {
                for (int a = 0; a < (arrayFirst.length); a++)
                {
                        if (arraySecond[b] == arrayFirst[a]) 
                        {
                                arrayThird[c] = arrayFirst[a];
                                c++;
								break;
                        }
                }
        }
		
		      for (int counter = 0; counter < (arrayFirst.length); counter++) 
			  {
         if (arrayFirst[counter] == 0) {
           flag = 1;	// Сообщаем что ноль есть в первом.
           break;
         }
      }
	  
	  		      for (int counter2 = 0; counter2 < (arraySecond.length); counter2++) 
			  {
         if (arraySecond[counter2] == 0) {
           flag2 = 1;	// Сообщаем что ноль есть во втором.
           break;
         }
      }
if (flag2 == 0 && (Arrays.equals(arraySecond, arrayThird)) == true) flag3 = 1;

if (flag == 1 && flag2 == 1 && (Arrays.equals(arraySecond, arrayThird)) == true) flag3 = 1;

if (flag3 == 1) System.out.println("True");
	else	System.out.println("False");
}
}