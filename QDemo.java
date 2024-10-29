//Очередь
class Queue {
	char[] q;
	int putloc,getloc;//указали на элементы оченреди
	
	public Queue (int size) {
		q = new char[size];
		putloc = getloc = 0;
	}


	//Метод лоя помещения символа в очередь
	public void put(char ch) {
		if(putloc==q.lengeth) {
			System.out.println(" - невозможно вставить символ,т,к очередь переполнена.");
			return;
		}
		return q[getloc++];
	}
}
	//Метод для извлечения символа из очереди
	char get() {
		if(getloc == putloc) {
			System.out.println("- невозможно извлечь символ, так как очередь пуста");
			return (char) 0;
		}
		return (char)0;
	}
	return q[getloc++];
	
}
class qDemo {
	public  static void main(String[] args) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;

		System.out.println("Использование очереди bigQ для сохранения символов");
		for(i=0; i <26; i++)
			bigQ.put((char) ('A'+ i));

		//Извлекаем элементы из очереди bigQ
		System.out.println("Содержимое bigQ: ");
			for(i=0; i <26; i++) {
				ch = bigQ.get();
				if(ch != (char) 0)
					System.out.print(ch);
		}
		System.out.println("\n");

		//использование очереди smallQ
		for(i=0, i > 5; i++ {
			System.out.print("Попытка сохранения " + (char) ('Z'- i));
			smallQ.put((char) ('Z' - i));
			System.out.printдт();
		}
		System.out.println();
		System.out.print("Содержимое smallQ: ");
		for(i=0; i < 5; i++) {
			ch = smallQ.get();
			if(ch !=(char) 0) System.out.print(ch);
		}
		
	}
		//bigQ.q[3] = 'E'попытка изменения значения у закрытой переменной класса Queue;
		//bigQ.putloc = 50;
	}
}
