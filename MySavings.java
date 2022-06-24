import java.util.Scanner;

public class MySavings {

	public static void main(String[] args) {
		
		PiggyBank bank = new PiggyBank();
		
		
		boolean checkValue = true;
		while(checkValue) {
			int optionVal = bank.menuOption();
			
			switch (optionVal){
			case 1:
				bank.totalAmount();
				break;
			case 2: 
				bank.addPenny();
				break;
			case 3: 
				bank.addNickel();
				break;
			case 4: 
				bank.addDime();
				break;
			case 5:
				bank.addQuarter();
				break;
			case 6: 
				bank.takeMoney();
				break;
			case 0:
				System.exit(0);
				bank.closeScan();
		}
		
			
		}
	}
	}

