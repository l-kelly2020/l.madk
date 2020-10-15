class Zadacha2
{
public static void main( String[] args ) 
{
	int count = 1; // Счетчик членов последовательности.
	int n = 12; // Задание первых 12-ти членов последовательности.
	int sum = 0; // Сумма первых N членов роследовательности.
	int b = 5; // N-й член последовательности по заданному номеру.
	int itmp = 0; // buffer 1.
	int m = 10; // Заданное m число по заданию.
	int itmp2 = 0; // buffer 2.
	int counttmp2 = 0; // buffer 2.
	boolean gate = false; // Переключатель для первого числа больше заданного.
	int countstart = 3; // 1й заданный номер для суммы.
	int countend = 7; // 2й заданный номер для суммы.
	int countsum = 0; // Сумма заданных между 1-м и 2-м номерами роследовательности.
	
	System.out.println("a) the 1st 12 numbers:");
for (int i = 2; i <= 999; ++i) {
	int a = i;
	while(a % 2 == 0) a = a/2; 
	while(a % 3 == 0) a = a/3;
	while(a % 5 == 0) a = a/5;
	if (a == 1) {
		sum += i;
		System.out.println("["+count+"] "+i);
		if (count == b) itmp = i;
		if (gate == false && i > m){
			itmp2 = i;
			counttmp2 = count;
			gate = true;
		}
		if (count >= countstart && count <= countend) countsum += i;
		if (count == n) break;
		count++;
	}
}
System.out.println("b) Sum of the 1st 12 numbers: "+ sum);
System.out.println("v) 5th number of Hamming's sequence: "+itmp);
System.out.println("g) The 1st number > 10 with it's count: "+"["+counttmp2+"] "+itmp2);
System.out.println("d) The sum of numbers between 3 and 7 (includes): "+countsum);
}
}