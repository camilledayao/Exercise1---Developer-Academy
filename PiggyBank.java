import java.util.Scanner;

public class PiggyBank {
	
	Scanner scan = new Scanner(System.in);
	int intVal;
	int pennyAmount;
	int nickelAmount;
	int dimeAmount;
	int quarterAmount;
	int validOption;
	
	String addPenny;
	String addNickel;
	String addDime;
	String addQuarter;
	String option;
	
	int pennyTotalAmount;
	int nickelTotalAmount;
	int dimeTotalAmount;
	int quarterTotalAmount;

	
	private String seperator = "----------------------------------------------------------------------------------";
	public final String hdg_fmt= "%-13s %-13s %-13s %-14s";
	public final String data_fmt = "%-13s %-13s %-13s %-14s";
	
	public void totalAmount() {
		System.out.printf(hdg_fmt, "PENNY", "NICKEL", "DIME", "QUARTER");
		System.out.println();
		System.out.printf(data_fmt,pennyTotalAmount, nickelTotalAmount, dimeTotalAmount, quarterTotalAmount);
		System.out.println("\n\n");
		}
	
	public int addPenny() {
		boolean repeatLoop = true;
		while(repeatLoop) {
			System.out.println("Please enter Penny you want to add in the bank: ");
			String addPenny = scan.nextLine();
			this.addPenny = addPenny;
			if(validateAmount(addPenny,0,999999999) == true) {
				pennyAmount = Integer.parseInt(addPenny);
				pennyTotalAmount = pennyTotalAmount + pennyAmount;
				repeatLoop = false;
				}
			else {
				repeatLoop = true;
				}
			}
		return pennyTotalAmount;
		}


	public int addNickel() {
		boolean repeatLoop = true;
		while(repeatLoop) {
			System.out.println("Please enter Nickel you want to add in the bank: ");
			String addNickel = scan.nextLine();
			if(validateAmount(addNickel,0,999999999) == true) {
				nickelAmount = Integer.parseInt(addNickel);
				nickelTotalAmount = nickelTotalAmount+ nickelAmount;
				repeatLoop = false;
				}
			else {
				repeatLoop = true;
				}
			}
		return nickelTotalAmount;
		}
	
	public int addDime() {
		boolean repeatLoop = true;
		while(repeatLoop) {
			System.out.println("Please enter Dime you want to add in the bank: ");
			String addDime = scan.nextLine();
			this.addDime = addDime;
			if(validateAmount(addDime,0,999999999) == true) {
				dimeAmount = Integer.parseInt(addDime);
				dimeTotalAmount =dimeTotalAmount+ dimeAmount;
				repeatLoop = false;
				}
			else {
				repeatLoop = true;
				}
			}
		return dimeTotalAmount;
		}
	
	public int addQuarter() {
		boolean repeatLoop = true;
		while(repeatLoop) {
			System.out.println("Please enter Quarter you want to add in the bank: ");
			String addQuarter = scan.nextLine();
			this.addQuarter = addQuarter;
			if(validateAmount(addQuarter,0,999999999) == true) {
				quarterAmount = Integer.parseInt(addQuarter);
				quarterTotalAmount =quarterTotalAmount+ quarterAmount;
				repeatLoop = false;
				}
			else {
				repeatLoop = true;
				}
			}
		return quarterTotalAmount;
		}
	
	public int checkOptionValue() {
		boolean repeatLoop = true;
		while(repeatLoop) {
			System.out.println(seperator+"\n1. PENNY \n2. NICKEL \n3. DIME \n4. QUARTER \nPlease choose the number of option you want to withdraw:");
			String option = scan.nextLine();
			if(validateAmount(option,1,4) == true) {
				validOption = Integer.parseInt(option);
				repeatLoop = false;
				}
			else {
				repeatLoop = true;
				}
			}
		return validOption;
	}
	
	public void takeMoney() {
		int option = checkOptionValue();
		if(option == 1) {
			System.out.println("Please enter you want to take from PENNY:");
			String takePenny = scan.nextLine();
			if(validateAmount(takePenny, 0, pennyTotalAmount) == true) {
				int intPenny = Integer.parseInt(takePenny);
				pennyTotalAmount = pennyTotalAmount - intPenny;
				System.out.println("Take Money SUCCESSFUL!");
			}
			else {
				System.out.println("Take amount is more than current PENNY balance!\n");
			}
		}
		else if(option == 2) {
				System.out.println("Please enter you want to take from NICKEL:");
				String takeNickel = scan.nextLine();
				if(validateAmount(takeNickel, 0,nickelTotalAmount) == true) {
					int intNickel = Integer.parseInt(takeNickel);
					nickelTotalAmount = nickelTotalAmount - intNickel;
					System.out.println("Take Money SUCCESSFUL!");
				}
				else {
					System.out.println("Take amount is more than current NICKEL balance!\n");
				}
		}
		else if(option == 3) {
			System.out.println("Please enter you want to take from DIME:");
			String takeDime = scan.nextLine();
			if(validateAmount(takeDime, 0,dimeTotalAmount) == true) {
				int intDime = Integer.parseInt(takeDime);
				dimeTotalAmount = dimeTotalAmount - intDime;
				System.out.println("Take Money SUCCESSFUL!");
			}
			else {
				System.out.println("Take amount is more than current DIME balance!\n");
			}
		}
		else if(option == 4) {
			System.out.println("Please enter you want to take from QUARTER:");
			String takeQuarter = scan.nextLine();
			if(validateAmount(takeQuarter, 0,quarterTotalAmount) == true) {
				int intDime = Integer.parseInt(takeQuarter);
				quarterTotalAmount = quarterTotalAmount - intDime;
				System.out.println("Take Money SUCCESSFUL!");
			}
			else {
				System.out.println("Take amount is more than current QUARTER balance!\n");
			}
		}
	}
	
	public boolean validateAmount(String inputAmount, int MinVal, int MaxVal) {
		boolean isInputNumber = false;
		if(inputAmount == "") {
			isInputNumber = false;
		}
		else {
			try {
				int intVal = Integer.parseInt(inputAmount);
				this.intVal = intVal;
			
				if(intVal>=MinVal && intVal<=MaxVal) {
					isInputNumber = true;
					}
				else
				{
				isInputNumber = false;
				System.out.println("Input is out of range!");
					}
				}catch(Exception e) {
					System.out.println("Invalid Value!");
					isInputNumber = false;
					}
			}
		return isInputNumber;
	}
	
	
	public int menuOption() {
		boolean repeatLoop = true;
		while(repeatLoop) {
			System.out.print("1. Show total amount in the bank \n2. Add Penny \n3. Add Nickel \n4. Add Dime \n5. Add quarter \n6. Take money from bank"
					+ "\nEnter 0 to quit \nEnter your choice: ");
			String option = scan.nextLine();
			if(validateAmount(option,0,6) == true) {
				repeatLoop = false;
				this.option = option;
				}
			else {
				repeatLoop = true;
					}
				}
			int validOption = Integer.parseInt(option);
			this.validOption = validOption;
			return validOption;
		}
	
	public void closeScan() {
		System.exit(0);
		scan.close();
	}
	}
	
