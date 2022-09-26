package com.spring.construcorWithDepObj;

public class Address {
	
		private String city;
		private String name;
		private String country;
		
		public Address(String city, String name, String country) {
			super();
			this.city = city;
			this.name = name;
			this.country = country;
		}
		@Override
		public String toString() {
			return "Address [city=" + city + ", name=" + name + ", country=" + country + "]";
		}
		
		
}
