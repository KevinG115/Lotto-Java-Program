/*
 * Lotto.java
 * Kevin Gleeson x11371751
 */

class Lotto{

 	//data members
 	private int num1;
 	private int num2;
 	private int num3;
 	private int num4;

		private int random1;
		private int random2;
		private int random3;
		private int random4;

	private double wallet;
	private final double COST = 0.50;
	private final double WIN_2 = 0.50;
	private final int WIN_3 = 4;
	private final int WIN_4 = 100;

	private int line;
	private int endWin;

	private int win1, win2, win3, win4;

	//constructor
	public Lotto(){
		num1 = 0;
		num2 = 0;
		num3 = 0;
		num4 = 0;
		wallet = 0;
		line = 0;
	}

	//secret number
	public void generateRandom1(){
		random1 = (int)(Math.random() * 10)+1;
	}

	public void generateRandom2(){
		random2 = (int)(Math.random() * 10)+1;
		if(random2 == random1){
			random2 = (int)(Math.random() * 10)+1;
		}
	}

	public void generateRandom3(){
		random3 = (int)(Math.random() * 10)+1;
		if(random3 == random1 || random3 == random2){
			random3 = (int)(Math.random() * 10)+1;
		}
	}

	public void generateRandom4(){
		random4 = (int)(Math.random() * 10)+1;
		if(random4 == random1 || random4 == random2 || random4 == random3){
			random4 = (int)(Math.random() * 10)+1;
		}
	}

	//set methods
	public void setNum1(int num1){
		this.num1 = num1;
	}
	public void setNum2(int num2){
		this.num2 = num2;
	}
	public void setNum3(int num3){
		this.num3 = num3;
	}
	public void setNum4(int num4){
		this.num4 = num4;
	}
	public void setLine(int line){
		this.line = line;
	}

	//compute
	public void compute(){
		if(line == 1 || line == 2 || line == 3 || line == 4){
			if(num1 == random1 || num1 == random2 || num1 == random3 || num1 == random4){
				win1 = 1;
			}
			else{
				win1 = 0;
			}
			if(num2 == random1 || num2 == random2 || num2 == random3 || num2 == random4){
				win2 = 1;
			}
			else{
				win2 = 0;
			}
			if(num3 == random1 ||  num3 == random2 || num3 == random3 || num3 == random4){
				win3 = 1;
			}
			else{
				win3 = 0;
			}
			if(num4 == random1 || num4 == random2 || num4 == random3 || num4 == random4){
				win4 = 1;
			}
			else{
				win4 = 0;
			}
		}
	}



	//get method
	public int getWin1(){
		return win1;
	}
	public int getWin2(){
		return win2;
	}
	public int getWin3(){
		return win3;
	}
	public int getWin4(){
		return win4;
	}
	public int getRandom1(){
		return random1;
	}
	public int getRandom2(){
		return random2;
	}
	public int getRandom3(){
		return random3;
	}
	public int getRandom4(){
		return random4;
	}
}




