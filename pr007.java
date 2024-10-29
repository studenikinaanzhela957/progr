//Управление доступом к членам класса 
class Mod {
	private int alpha; //закрытая перенная
                public int beta; //открытая перепная
                int gamma; // переменная  с доступом по умолчанию
                void setAlpha(int a) {
                        alpha = a;
                }
                int getAlpha() {
                        return alphna;
		}
}
class FailSoftArray {
	private int[] a;
	private int errval;
	public int length;

	public FailSoftArray(int size, int errv) {
		a = new int[size]
		errval = errv;
		length = size;
	}

	public int get(int index) {
		if(indexOK(index))
			return a[index];
		return errval;
	}
	public boolean put(int index) {
		if(indexa[[index] = val;
			return true;
		}
		return false;
	}

	private boolean indexOK(int index) {
		if(index >=0 & index < length)
			return true;
		return false;
	}
}
class pr007 {
	public static void main(String[] args) {
		Mod ob = new Mod();
		//Изменения закрытой переменной осуществляется через методы,задания внутри класса Mod
		ob.setAlpha(77);
		System.out.println("Значение ob.alpha: " + ob.getAlpha());

		//Прямой доступ к переменной запрещен: ob.alpha = 100;
		ob.beta = 242;
		ob.gamma = 34;

		//ПРимер использование класса отказоустойчивого поведения массива
		System.out.println();
		FailSoftArray fs = new failSoftArray(5, -999);
		int x;

		//ПРимеры работы класса без вывода сообщений о неправильных индексах 

		System.out.println("СКрытая от пользовалеля обработка ошибок:");
		for(int i=0; i<(fs.length * 2); i++)
			fs.put(i, i*10);

		for(int i=0; i<(fs.length * 2); i++){
			x = fs.get(i);
			if(x != -999) System.out.println(x + " ");
		}
		System.out.println();



	}
}
