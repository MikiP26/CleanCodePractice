package com.talentica.CleanCodePractice;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.text.html.parser.Entity;

public class NamingConvention<Table> {

	
	 //Names have to reveal your intentions
		// Bad Code
		int d; // elapsed time in days
		int ds;
		int dsm;
		int faid;
		
		//Clean Code
		int elapsedTimeInDays;
		int daysSinceCreation;
		int daysSinceModification;
		int fileAgeInDays;
	
		
	 //Avoid Disinformation
		// Bad Code
		String[] customerList;
		Table theTable;
		
		//Clean Code
		String[] customers;
		Table employees;
		
	//Good names length
		// Bad Code
		String theCustomersListWithAllCustomersIncludedWithoutFilter;
		String list;
				
		//Clean Code
		String allCustomers;
		String customersInOrder;
		
	//Use Pronounceable Names
		//Bad Code
		private Date genymdhms;
		private Date modymdhms;
		private final String pszqint = "102";
		
		//Clean Code
		private Date generationTimestamp;
		private Date modificationTimestamp;;
		private final String recordId = "102";
		
	//Always code in one notation
		//Bad Code
		public static final int maxcount = 25;
		Boolean change = true;
		private String NAME;
		public class personaddress {
		}
		public void getallorders()
		{}
				
		//Clean Code
		public static final int MAXCOUNT = 1;
		Boolean isChanged = true;
		private String _name;
		public class PersonAddress
		{}
		void GetAllOrders()
		{}

		
	 //Use one word per one concept. Don’t mix multiple concepts per one word
		//Bad Code
		void LoadSingleData() {}
		void FetchDataFiltered() {}
		void GetAllData() {}
		void SetDataToView() {}
		void SetObjectValue(int value) {}

		//Clean Code
		void GetSingleData() {}
		void GetDataFiltered() {}
		//void GetAllData() {}
		void LoadDataToView() {}
		//void SetObjectValue(int value) {}
		

	//Use meaningful names in Domain Context
		//Bad Code
		public class EntitiesRelation
		{
			Entity o1;
			Entity o2;
		}
		
		//Good Code
		public class ProductWithCategory
		{
			Entity product;
			Entity category;
		}
			
		
	//Use meaningful names in their self context
		//Bad Code
		String addressCity;
		String addressHomeNumber;
		String addressPostCode;
	
		//Good Code
		class Address
		{
		String city;
		String homeNumber;
		String postCode;
		}
		
		
	//Avoid Encodings
		//Bad Code
		PhoneString phoneString; // name not changed when type changed
		
		//Good Code
		PhoneNumber phoneString2;

	//Avoid Prefixes
		//Bad Code
		private String m_dsc;  //The more we see the code, the less we see the prefixes.
		void setName(String name) {
			m_dsc = name;
			}
		
		//Good Code
		private String description;
		void setDescription(String description) {
			this.description = description;
			}
		
	//Interfaces and Implementations:
		//Bad Code
		public interface IShapeFactory{};
		
		//Good Code
		public interface ShapeFactory{};
		public class ShapeFactoryImp implements ShapeFactory{};
		
	
		
	 	//Bad Code
		public List<int[]> getThem() {
			List<int[]> list1 = new ArrayList<int[]>();
			List<int[]> theList = new ArrayList<int[]>();
			for (int[] x : theList)
			if (x[0] == 4)
			list1.add(x);
			return list1;
			}
			
		//Bad Code
		public List<int[]> getFlaggedCells() {
			List<int[]> gameBoard = new ArrayList<int[]>();
			int STATUS_VALUE = 0;
			int FLAGGED = 4;
			List<int[]> flaggedCells = new ArrayList<int[]>();
			for (int[] cell : gameBoard)
			if (cell[STATUS_VALUE] == FLAGGED)
			flaggedCells.add(cell);
			return flaggedCells;
			}

			//Correct Way:
		public List<Cell> getFlaggedCells1() {
			List<Cell> gameBoard = new ArrayList<Cell>();
			List<Cell> flaggedCells = new ArrayList<Cell>();
			for (Cell cell : gameBoard)
			if (cell.isFlagged())
			flaggedCells.add(cell);
			return flaggedCells;
			}

	}