package com.designpattern1.creational.abstractFactory;

class BankFactory extends AbstractFactory {
	public Bank getBank(String bank) {
		if (bank == null) {
			return null;
		}
		if (bank.equalsIgnoreCase("HSBC")) {
			return new HSBC();
		} else if (bank.equalsIgnoreCase("CITI")) {
			return new Citi();
		}
//       else if(bank.equalsIgnoreCase("SBI")){  
//         return new SBI();  
//      }  
		return null;
	}

	public Loan getLoan(String loan) {
		return null;
	}
}// End of the BankFactory class.
