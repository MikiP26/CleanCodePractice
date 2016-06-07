package com.talentica.CleanCodePractice;

public class InterfaceSegregationExample {
	// Bad Code
	public class Customer {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String string) {
			name = string;
		}

		public String toXML() {
			return "<Customer><Name>" + name + "</Name></Customer>";
		}
	}

	// Good Code
	public class Cust implements SerializableToXml {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String string) {
			name = string;
		}

		public String toXML() {
			return "<Customer><Name>" + name + "</Name></Customer>";
		}
	}
	
	
	public interface SerializableToXml {
		public abstract String toXML();
		}
}
