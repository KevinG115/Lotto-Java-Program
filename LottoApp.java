 /*
 * LottoApp.java
 * Kevin Gleeson x11371751
 */

import javabook.*;

 class LottoApp{
	 public static void main(String args[]){

 	//declare variables
 	int num1 = 0;
 	int num2 = 0;
 	int num3 = 0;
 	int num4 = 0;

		int random1;
		int random2;
		int random3;
		int random4;

	double wallet;

	int endWin;

	int line;

	int win1;
	int win2;
	int win3;
	int win4;

			 final double COST = 0.50; //how much it costs per line
			 final double WIN_2 = 0.50; //win for 2 num match
			 final int WIN_3 = 4; //win for 3 num match
		     final int WIN_4 = 100; //win for 4 num match
		     double newCost = 0; //cost after lines

		     String ans;

	//declare objects
	MainWindow mWindow;
	InputBox iBox;
	OutputBox oBox;
	Lotto myLotto;

	//create objects
	mWindow = new MainWindow();
	iBox = new InputBox(mWindow);
	oBox = new OutputBox(mWindow);
	myLotto = new Lotto();

	//show
	mWindow.show();
	oBox.show();
	oBox.println("Each line costs 0.50c to play.");
	oBox.println("You must match your first number, to the first random number and so on.");
	oBox.println("Min. of 2 matches for a win.");
	wallet = iBox.getDouble("Enter the amount you want to play.");
	oBox.println("Your balance is: " +wallet);
	oBox.println("=======================================================================");

	myLotto.generateRandom1();
	myLotto.generateRandom2();
	myLotto.generateRandom3();
	myLotto.generateRandom4();

	//input
	do{

	line = iBox.getInteger("Please enter the number of lines you want to play. Each line costs 50c. Max of 4 lines.");
	myLotto.setLine(line);


	if(line == 1){
		newCost = 0.50;
	}
	else if(line ==2){
		newCost = 1;
	}
	else if(line == 3){
		newCost = 1.50;
	}
	else if(line == 4){
		newCost = 2;
	}


	wallet = (wallet - newCost);
	oBox.println("Your new balance is: " +wallet+"e");
	oBox.println("===============================");

	if(line == 1){

			num1 = iBox.getInteger("Please enter your first number.");
			if(num1 > 10){
				num1 = iBox.getInteger("You can't pick the same number twice and it must be between 1-10. Please pick another number.");
			}
			myLotto.setNum1(num1);

			num2 = iBox.getInteger("Please enter your second number.");
			if(num2 == num1 ||num2 > 10){
				num2 = iBox.getInteger("You can't pick the same number twice and it must be between 1-10. Please pick another number.");
			}
			myLotto.setNum2(num2);

			num3 = iBox.getInteger("Please enter your third number.");
			if(num3 == num1 || num3 == num2 || num3 > 10){
				num3 = iBox.getInteger("You can't pick the same number twice and it must be between 1-10. Please pick another number.");
			}
			myLotto.setNum3(num3);

			num4 = iBox.getInteger("Please enter your fourth number.");
			if(num4 == num1 || num4 == num2 || num4 == num3 || num4 > 10){
				num4 = iBox.getInteger("You can't pick the same number twice and it must be between 1-10. Please pick another number.");
			}
			myLotto.setNum4(num4);

			//output

			random1 = myLotto.getRandom1();


			random2 = myLotto.getRandom2();


			random3 = myLotto.getRandom3();


			random4 = myLotto.getRandom4();

			//process
			myLotto.compute();

			oBox.println("You chose " +line+ " line(s).");
			oBox.println("You chose "+num1+ " & " +num2+ " & " +num3+ " & " +num4);
			oBox.println("The four random numbers were: "+random1+ " & " +random2+ " & " +random3+ " & " +random4);

			win1 = myLotto.getWin1();
			System.out.println(win1);
			win2 = myLotto.getWin2();
			System.out.println(win2);
			win3 = myLotto.getWin3();
			System.out.println(win3);
			win4 = myLotto.getWin4();
			System.out.println(win4);


			endWin = (win1 + win2 + win3 + win4);


			if(endWin == 1 || endWin == 0){
			oBox.println("You lose.");
			}
			else if(endWin == 2){
				wallet = wallet + WIN_2;
				oBox.println("You win " +WIN_2+ "e! Your current wallet balance is: " +wallet+"e");
			}
			else if(endWin == 3){
				wallet = wallet + WIN_3;
				oBox.println("You win " +WIN_3+ "e! Your current wallet balance is: " +wallet+"e");
			}
			else if(endWin == 4){
				wallet = wallet + WIN_4;
				oBox.println("You win " +WIN_4+ "e! Your current wallet balance is: " +wallet+"e");
			}
			oBox.println("===========================");
}

	else if(line == 2){
		for(int i = 0; i < 2; i = i +1){

			num1 = iBox.getInteger("Please enter your first number.");
			if(num1 > 10){
				num1 = iBox.getInteger("You can't pick the same number twice and it must be between 1-10. Please pick another number.");
			}
			myLotto.setNum1(num1);

			num2 = iBox.getInteger("Please enter your second number.");
			if(num2 == num1 ||num2 > 10){
				num2 = iBox.getInteger("You can't pick the same number twice and it must be between 1-10. Please pick another number.");
			}
			myLotto.setNum2(num2);

			num3 = iBox.getInteger("Please enter your third number.");

			if(num3 == num1 || num3 == num2 || num3 > 10){
				num3 = iBox.getInteger("You can't pick the same number twice and it must be between 1-10. Please pick another number.");
			}
			myLotto.setNum3(num3);

			num4 = iBox.getInteger("Please enter your fourth number.");

			if(num4 == num1 || num4 == num2 || num4 == num3 || num4 > 10){
				num4 = iBox.getInteger("You can't pick the same number twice and it must be between 1-10. Please pick another number.");
			}
			myLotto.setNum4(num4);




	//output

	random1 = myLotto.getRandom1();


	random2 = myLotto.getRandom2();


	random3 = myLotto.getRandom3();


	random4 = myLotto.getRandom4();

	//process
	myLotto.compute();

	oBox.println("You chose " +line+ " line(s).");
	oBox.println("You chose "+num1+ " & " +num2+ " & " +num3+ " & " +num4);
	if(i == 1){
	oBox.println("The four random numbers were: "+random1+ " & " +random2+ " & " +random3+ " & " +random4);
	}
	else{
		oBox.println("The four numbers will be revealed after you finish playing this round.");
	}

	win1 = myLotto.getWin1();
	System.out.println(win1);
	win2 = myLotto.getWin2();
	System.out.println(win2);
	win3 = myLotto.getWin3();
	System.out.println(win3);
	win4 = myLotto.getWin4();
	System.out.println(win4);

	endWin = win1 + win2 + win3 + win4;

			if(i == 1){
			if(endWin == 1 || endWin == 0){
			oBox.println("You lose. Your current wallet balance is: "+wallet+"e");
			}
			else if(endWin == 2){
				wallet = wallet + WIN_2;
				oBox.println("You win! Your current wallet balance is: " +wallet+"e");
			}
			else if(endWin == 3){
				wallet = wallet + WIN_3;
				oBox.println("You win! Your current wallet balance is: " +wallet+"e");
			}
			else if(endWin == 4){
				wallet = wallet + WIN_4;
				oBox.println("You win! Your current wallet balance is: " +wallet+"e");
			}
		}

		else{
			if(endWin <= 1){
				wallet = wallet;
			}
			else if(endWin == 2){
				wallet = wallet + WIN_2;
			}
			else if(endWin == 3){
				wallet = wallet + WIN_3;
			}
			else if(endWin == 4){
				wallet = wallet + WIN_4;
			}
		}

		oBox.println("===========================");
	}
}

	else if(line == 3){
			for(int i = 0; i < 3; i = i +1){

			num1 = iBox.getInteger("Please enter your first number.");
			if(num1 > 10){
				num1 = iBox.getInteger("You can't pick the same number twice and it must be between 1-10. Please pick another number.");
			}
			myLotto.setNum1(num1);

			num2 = iBox.getInteger("Please enter your second number.");
			if(num2 == num1 ||num2 > 10){
				num2 = iBox.getInteger("You can't pick the same number twice and it must be between 1-10. Please pick another number.");
			}
			myLotto.setNum2(num2);

			num3 = iBox.getInteger("Please enter your third number.");
			if(num3 == num1 || num3 == num2 || num3 > 10){
				num3 = iBox.getInteger("You can't pick the same number twice and it must be between 1-10. Please pick another number.");
			}
			myLotto.setNum3(num3);

			num4 = iBox.getInteger("Please enter your fourth number.");
			if(num4 == num1 || num4 == num2 || num4 == num3 || num4 > 10){
				num4 = iBox.getInteger("You can't pick the same number twice and it must be between 1-10. Please pick another number.");
			}
			myLotto.setNum4(num4);

		//output

		random1 = myLotto.getRandom1();


		random2 = myLotto.getRandom2();


		random3 = myLotto.getRandom3();


		random4 = myLotto.getRandom4();

		//process
		myLotto.compute();

		oBox.println("You chose " +line+ " line(s).");
		oBox.println("You chose "+num1+ " & " +num2+ " & " +num3+ " & " +num4);
		if(i == 2){
		oBox.println("The four random numbers were: "+random1+ " & " +random2+ " & " +random3+ " & " +random4);
		}
		else{
			oBox.println("The four numbers will be revealed after you finish playing this round.");
		}

		win1 = myLotto.getWin1();
		System.out.println(win1);
		win2 = myLotto.getWin2();
		System.out.println(win2);
		win3 = myLotto.getWin3();
		System.out.println(win3);
		win4 = myLotto.getWin4();
		System.out.println(win4);


		endWin = (win1 + win2 + win3 + win4);


					if(endWin <=1){
					oBox.println("You lose.");
					}
					else if(endWin == 2){
						wallet = wallet + WIN_2;
						oBox.println("You win " +WIN_2+ "e! Your current wallet balance is: " +wallet+"e");
					}
					else if(endWin == 3){
						wallet = wallet + WIN_3;
						oBox.println("You win " +WIN_3+ "e! Your current wallet balance is: " +wallet+"e");
					}
					else if(endWin == 4){
						wallet = wallet + WIN_4;
						oBox.println("You win " +WIN_4+ "e! Your current wallet balance is: " +wallet+"e");
					}

		oBox.println("===========================");
		}
	}

	else if(line == 4){
			for(int i = 0; i < 4; i = i +1){

			num1 = iBox.getInteger("Please enter your first number.");
			if(num1 > 10){
				num1 = iBox.getInteger("You can't pick the same number twice and it must be between 1-10. Please pick another number.");
			}
			myLotto.setNum1(num1);

			num2 = iBox.getInteger("Please enter your second number.");
			if(num2 == num1 ||num2 > 10){
				num2 = iBox.getInteger("You can't pick the same number twice and it must be between 1-10. Please pick another number.");
			}
			myLotto.setNum2(num2);

			num3 = iBox.getInteger("Please enter your third number.");
			if(num3 == num1 || num3 == num2 || num3 > 10){
				num3 = iBox.getInteger("You can't pick the same number twice and it must be between 1-10. Please pick another number.");
			}
			myLotto.setNum3(num3);

			num4 = iBox.getInteger("Please enter your fourth number.");
			if(num4 == num1 || num4 == num2 || num4 == num3 || num4 > 10){
				num4 = iBox.getInteger("You can't pick the same number twice and it must be between 1-10. Please pick another number.");
			}
			myLotto.setNum4(num4);

		//output

		random1 = myLotto.getRandom1();


		random2 = myLotto.getRandom2();


		random3 = myLotto.getRandom3();


		random4 = myLotto.getRandom4();

		//process
		myLotto.compute();

		oBox.println("You chose " +line+ " line(s).");
		oBox.println("You chose "+num1+ " & " +num2+ " & " +num3+ " & " +num4);
		if(i == 3){
		oBox.println("The four random numbers were: "+random1+ " & " +random2+ " & " +random3+ " & " +random4);
		}
		else{
			oBox.println("The four numbers will be revealed after you finish playing this round.");
		}

		win1 = myLotto.getWin1();
		System.out.println(win1);
		win2 = myLotto.getWin2();
		System.out.println(win2);
		win3 = myLotto.getWin3();
		System.out.println(win3);
		win4 = myLotto.getWin4();
		System.out.println(win4);


		endWin = (win1 + win2 + win3 + win4);


		if(endWin <=1){
		oBox.println("You lose.");
		}
		else if(endWin == 2){
			wallet = wallet + WIN_2;
			oBox.println("You win " +WIN_2+ "e! Your current wallet balance is: " +wallet+"e");
		}
		else if(endWin == 3){
			wallet = wallet + WIN_3;
			oBox.println("You win " +WIN_3+ "e! Your current wallet balance is: " +wallet+"e");
		}
		else if(endWin == 4){
			wallet = wallet + WIN_4;
			oBox.println("You win " +WIN_4+ "e! Your current wallet balance is: " +wallet+"e");
		}
		oBox.println("===========================");
		}
	}


	ans = iBox.getString("Would you like to play again? Yes or No");
}
	while (ans.equalsIgnoreCase("Yes") && line > 0 && wallet > 0.50);


	}
}




