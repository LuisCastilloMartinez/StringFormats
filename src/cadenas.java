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

				// Format with text block
				var employeeID = 12;
				message = """
                %nEmployee Details:\s
                -----------------
                \tName: %s
                \tID: %04d
                \tAge: %d años
                \tSalary: $%.2f
                """.formatted(name, employeeID, age, salary);
				System.out.println(message);

				// Format with tex block y printf directly
				System.out.printf("""
                %nEmployee Details:\s
                -----------------
                \tName: %s
                \tID: %04d
                \tAge: %d años
                \tSalary: $%.2f
                """, name, employeeID, age, salary);
		}
}
