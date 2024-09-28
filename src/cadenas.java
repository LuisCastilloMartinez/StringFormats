public class cadenas {
		public static void main(String[] args) {
				System.out.println("----- String Formats -----");
				var name = "Luis Castillo";
				var age = 23;
				var salary = 12000.50;

				// String.format
				var message = String.format("Name: %s, Age: %d, Salary: $%.2f",name, age, salary);
				System.out.println(message);

				//Method printf
				System.out.printf("Name: %s, Age: %d, Salary: $%.2f%n", name, age, salary);
		}
}
