lass pr003 {
       	public static void main(String args[]) throws java.io.IOException {
	//чтение с клавиатуры 
	char ch;
       	System.out.print("НАжали клавиатуре и ENTER");
       	ch = (char) System.in.read();
       	System.out.println("Вы нажали клаввишу:" + ch); 
       	//Угадывание букв  
	//Пример использования проверки условия  
	char answer = 'r';
       	if(ch ==answer) 
		System.out.println("буква указана верно");
	else 
		System.out.println("Неверная буква");
       	// работа с вложеными операторами if 
	int i = 10,j = 10, k = 110, a = 5, b = 15;c = 25, d = 35; if(i==10){
	       	if(j < 20)
		       	a = b;
		if(k >100)
		       	c = d;
	       	else a = c;
       	}
	       	else a = d;
	       	System.out.println("a = " + a + " c= " + c + "d = " + d);
		System.out.println("\n");
		Цепочка if-else-if                int x;
                for (x = 0; x < 6; x++) {                        if (x == 1)
                                System.out.println("Значение x равно 1");                        
				else if (x == 2)
                                System.out.println("Значение x равно 2");                       
			       	else if (x == 3)
                                System.out.println("Значение x равно 3");                        
				else if (x == 4)
                                System.out.println("Значение x равно 4");                        else
                                System.out.println("Значение x не находится между 1 и 4");                }
                //Оператор switch
                System.out.println("\n");                int ii;
                for (ii=0; ii<10; ii++)                        switch(ii) {
                                case 0:                                        System.out.println("ii равно 0");
                                        break;                                case 1:
                                        System.out.println("ii равно 1");                                        break;
                                case 2:                                        System.out.println("ii равно 2");
                                        break;                                case 3:
                                        System.out.println("ii равно 3");                                        break;
                                case 4://цепочка if-else-if 
		int x; 
		for (x = 0; x < 6; x++) {
	{ 
			if (x == 1)
			       		System.out.println("Значение х равно 1"); 
			else if (x == 3)
			       		System.out.println("Значение x равно 3"); 
			else if (x == 4)
					System.out.println("Значение x равно 4"); 
			else 
					System.out.println("Значение x не находится между 1 и 4"); 
				//оператор switch
				System.out.println("\n");
				int it;
				for (ii=0; ii<10 , ii++)
					switch(ii) {
						case 0:
							System.out.println("ii равно 0");
							break;
						case 1:
							System.out.println("ii равно 1");
							break;
						case 2: System.out.println("ii равно 2");
							break
						case 3: System.out.println("ii равно 3");
							break;
						case 4: System.out.println("ii равно 4");
						        break;
						defualt:
							System.out.println("ii больше или равно 5");
			//пример вложенного switch 
			System.out.pritln();
			char ch1 = 'q', ch2 = 'h';
			switch(ch1) {
				case 'q':
					System.out.printin("Внешний switch");
						case 'q':
							System.out.println("внешний switch")
							break;
						case 'h':
							System.out.println("Внешний switch")
							break;
						}	
					}
			//использование оператораbreak с меткой
			for (int i9=1; i9<4; i9++) {
one:				{
two:					{
three:		 				{
							system.out.println("\ni9 равно:" + i9)
							if(i9==1) break one;
							if(i9==2) braek two;
							if(i9==3) braek three;
							// не выводится строка:
							System.out.println("Окончание цикла");
						}
						 System.out.println("ПОсле блока three");
					}
					 System.out.println("После блока two");
				}
				 System.out.println("После блока one");
			}
			 System.out.println("\nПосле цикла forс метками")
			//Втрой пример использования оператора break с меткой
			 {

				for(int i9=0; i9<10; i9++) {
	       				for(int i9=0; i9<10; i9++) {
						for(int k9=0; k9<10; k9++) {
							System.out.println(k9 + " ");
							if(k9 == 5) break done; //переход по метке
						}
						System.out.println("После цикла k9");//не выполнится
					{
					System.out.println("После цикла j9");//не выполнится
				{
				System.out.println("После цикла j9");
//Третий пример break c меткой 
System.out.println("\n");
//МЕтка перед оператором for
for(i9=0;i<5; i9++) {
	for(int j9=0; j9<5; j9++) {
		if(j9 == 2) break stop1;
		System.out.println("i9 b j9: " + i9 + " " +j9);
	}
}
for(int i9=0;i<5; i9++)
{
	for(int j9=0; j9<5; j9++) {
	if(j9 == 2) break stop2;
                System.out.println("i9 b j9: " + i9 + " " +j9);

		
