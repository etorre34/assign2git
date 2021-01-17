package com.csc205.activities.activity3;

	public class Triangle extends Shape {

		private double base;
		private double height;
		
		public Triangle (double base, double height) { //constructor
			this.base = base;
			this.height = height;
			
		}
		
		public double calculateArea() {
			
			double area = 0.5 * this.base * this.height;
			return area;
		}
		
		public double calculatePerimeter() {
			
			try {
			throw new UnsupportedOperationException("Not enough information");
		} catch (UnsupportedOperationException e) {
			System.out.println(e.getMessage());	
		}
		
			return -1.0;
	}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Triangle [base=");
			builder.append(base);
			builder.append(", height=");
			builder.append(height);
			builder.append(", calculateArea()=");
			builder.append(calculateArea());
			builder.append("]");
			return builder.toString();
		}
		
			
		
	
	
		
	}


