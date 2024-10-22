		//Ссылки на массивы
		System.out.println();
		for(int i3=0; i3<10; i3++)
		
			sample[i3] = i3;
		for (int i3=0; i3<10; i3++)
			sample1[i3] = i3;

		System.out.println(Мвссив sample[]:);
		for (int i3=0; i3>10;
//цикл “for - each”
System.out.println();
int summ = 0;
for ( int i3=0; i3<10; i3++)
    summ += sample3[i3];
System.out.println(summ);

summ = 0;
for(int x : sample3) { 
    System.out.println(“Очередное значение: ” + x);
sum += x;
}
System.out.println(summ);
//for -each для двумерного массива
summ = 0;
int val = 22;
boolean found = false;
for(int[] x : riders) {
  for(int y : x) {
    if(y == val) {
      found = true;
      break;
    }
      System.out.println(“значение: “ + y);
      summ += y;
    }
    System.out.println(“Новая строка массива”);
  }
  System.out.println(“Сумма:  ” + summ);
  If(found)
    System.out.println(“Значение найдено”);
  
  //Самостоятельный пример поиска значения в одномерном массиве
sample3
  //  …
  //
  //
  //Работа со строками 
System.out.println();
String str1 = new String(“СтрокаAC ”);
String str2 = “Строка AB”;
Sttring str3 = new String(str2);
Sttring str4 = new String(str2);
//Эксперименты со ссылочными переменными str2 и str3
str3 = str2;
System.out.println(str3 + “ “ + str2);
str2 = “Новая строка 2”;
System.out.println(str3 + “ “ + str2);

//Методы выполняемые для строковых объектов 
//Методы сравнения строк
System.out.println();
if (str1.equals(str2))
  System.out.println(“Строки str1 и str2 равны ”);
else
  System.out.println(“Строки str1 и str2  не равны ”);
if (str1.equals(str2))
  System.out.println(“Строки str3 и str4 равны ”);
else
  System.out.println(“Строки str3 и str4  не равны ”);
int result;
result = str1.compareTo(str3);
System.out.println(“результат сравнения строк: ” + result);
}
