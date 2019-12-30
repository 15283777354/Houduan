package edu.swjtuhc.demo.model;

public class Fankui {
		
		private int orders;
		private String dormitory;
		private String item;
		private String score;
		private String advice;
		
		
		public int getOrders() {
			return orders;
		}


		public void setOrders(int orders) {
			this.orders = orders;
		}


		public String getDormitory() {
			return dormitory;
		}


		public void setDormitory(String dormitory) {
			this.dormitory = dormitory;
		}


		public String getItem() {
			return item;
		}


		public void setItem(String item) {
			this.item = item;
		}


		public String getScore() {
			return score;
		}


		public void setScore(String score) {
			this.score = score;
		}


		public String getAdvice() {
			return advice;
		}


		public void setAdvice(String advice) {
			this.advice = advice;
		}


		@Override
		public String toString() {
			return "Fankui [orders=" + orders + ", dormitory=" + dormitory + ", item=" + item + ", score=" + score
					+ ", advice=" + advice + ", getOrders()=" + getOrders() + ", getDormitory()=" + getDormitory()
					+ ", getItem()=" + getItem() + ", getScore()=" + getScore() + ", getAdvice()=" + getAdvice()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}
	
}