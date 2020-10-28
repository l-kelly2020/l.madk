import java.util.Arrays;

public class Zadacha3
{
	public static void main(String[] args) 
	{
        // Согласно условию - в каждой из последовательностей члены различны, 
        // т.е не может быть например две тройки.
        int[] arrayFirst = { 5, 4, 2, 6, 3};
        int[] arraySecond = { 3, 1, 0, 6, 9 };
		int q = 0;	// Счетчик.

        System.out.println("1st array: "+Arrays.toString(arrayFirst));
        System.out.println("2nd array: "+Arrays.toString(arraySecond));

        for (int a = 0; a < (arrayFirst.length); a++)
        {
                for (int b = 0; b < (arraySecond.length); b++)
                {
					            if (arrayFirst[a]==arraySecond[b])
            {
                q++;
                break;
            }
                }
        }
		
		      
System.out.println("Count: " + q);
}
}