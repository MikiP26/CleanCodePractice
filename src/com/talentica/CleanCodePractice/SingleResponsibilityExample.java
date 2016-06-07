package com.talentica.CleanCodePractice;

//Single Responsibility design principle
public class SingleResponsibilityExample {

	//Bad Code 
	class Customer {
		private String name;
		private String workPhoneAreaCode;
		private String workPhoneNumber;
	}

	// Good Code
	class Cust {
		private String name;
		private Phone workPhone;
	}

	class Phone {
		private String areaCode;
		private String number;
	}
}
