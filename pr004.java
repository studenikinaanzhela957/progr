class Avtomobil {
	int pass; //кол-во пассажиров
	int v; //объем топл бака в л.
	double rash; //расод топлива в л. на 100 км.

        void rasst() { 
		System.out.println("Расстояние на полним баке: " + ((int)(v/rash *100)));	

	}

	int rasst2() { 
		return (int)(v/rash *100);
	}

	doudle fuelNeeded(int km) {
		return ((double)km/100)*rash;
	}

}
class pr004 {
	public static void main(String args[]) {
		//Созадние экземпляра класса
		Avtomobil lada = new Avtomobil();
		Avtomobil porshe = new Avtomobil();
		int rasst,rasst2;

		//Присваиваем значение внутренним переменным экземпляра класса
		lada.pass = 4;
		lada.v = 40;
		lada.rash = 5.5;

		porshe.pass = 1;
		porshe.v = 100;
		porshe.rash = 14.0;

		System.out.println("для расстояния в 10 км, нужно " + lada.fuelNeeded(10) + "литров бензина");

		/*
		Avtomobil mercedes;

		mercedes = porshe;
		System.out.println("rash для Mercedes: " + mercedes.rash);
		mercedes.rash = 18.0;
		System.out.println("rash для Porshe: " + porshe.rash);
		*/

		//Расчет расстояния, которое lada проедет на полном баке
		//rasst = (int) (lada.v/lada/rash * 100);
		//rasst2 =(int) (porshe.v/porshe.rash * 100);
		


		System.out.println("Lada: " );
		lada.rasst();
		rasst = lada.rasst2();
		System.out.println("Результат вызова метода rasst2(): " + rasst );

		System.out.println("porshe: ");
		porshe.rasst();
		System.out.println("Результат вызова метода rasst2(): " + porshe.rasst2() );

	}
}

