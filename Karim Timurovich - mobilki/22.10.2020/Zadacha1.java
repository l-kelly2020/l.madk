import java.util.Arrays;

public class Zadacha1 
{
	public static void main(String[] args) 
	{
        int[] numbers = { 2, 1, 4, 3, 6, 5, 8, 7 };
        int temp;

        System.out.println("Current array: "+Arrays.toString(numbers));

        for (int i = 0; i < (numbers.length - 1); i++)
        {
            temp = numbers[i];
            numbers[i] = numbers[i + 1];
            numbers[i + 1] = temp;
            i++;
        }
        System.out.println("Modified array: "+Arrays.toString(numbers));
	}
}