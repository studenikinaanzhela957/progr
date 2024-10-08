//Массивы и строки 

class Arrays {
	public static void main(String args[]) {
		int[] sample = new int[10];
		int sample1[] = new int[10];
		int i;

		for(i = 0; i < 10; i++)
			sample[i] = 2*i;
		for(i = 0; i < 10; i++)
			System.out.println("Элеиент с индексом " + i + ": " + sample[i]);
		//поиск минимального и максимального занчения в массиве
		System.out.println();
		sample1[0] = 99;
		sample1[1] = 20;
		sample1[2] = 90;
		sample1[3] = -242;
		sample1[4] = -20;
		sample1[5] = 3;
		sample1[6] = 53;
		sample1[7] = 51;
		sample1[8] = -67;
		sample1[9] = 22;
		//sample1[10] = 423; -Выход за границы массива вызыват ошибку периода исполнения
		int max, min;
		min = max = sample1[0];
		for ( i = 1; i < 10; i++) {
			if (sample1[1] < min) min = sample1[i];
			if (sample1[1] < max) max = sample1[i];
		}
		System.out.println("Минимальное и максимальное значение: " + min + " " + max);

		//Инициализация массива
		System.out.println();
		int[] sample2 = {87, 100, -42, 34, 20, -25, -424, 62, 74, 8};
		 min = max = sample2[0];
                for ( i = 1; i < 10; i++) {
                        if (sample2[1] < min) min = sample1[i];
                        if (sample2[1] < max) max = sample1[i];

		}
	}
}
