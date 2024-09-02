class Employee {
	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class EmployeeView {
	public void printEmployeeDetails(String EmployeeName, String EmployeeId) {
		System.out.println("Employee:");
		System.out.println("Name: " + EmployeeName);
		System.out.println("ID: " + EmployeeId);
	}
}

class EmployeeController {
	private Employee model;
	private EmployeeView view;

	public EmployeeController(Employee model, EmployeeView view) {
		this.model = model;
		this.view = view;
	}

	public void setEmployeeName(String name) {
		model.setName(name);
	}

	public String getEmployeeName() {
		return model.getName();
	}

	public void setEmployeeRollNo(String id) {
		model.setId(id);
	}

	public String getEmployeeId() {
		return model.getId();
	}

	public void updateView() {
		view.printEmployeeDetails(model.getName(), model.getId());
	}
}

public class MVCPattern {
	public static void main(String[] args) {
		Employee model = retriveEmployeeFromDatabase();

		EmployeeView view = new EmployeeView();

		EmployeeController controller = new EmployeeController(model, view);

		controller.updateView();

		controller.setEmployeeName("Anuj Pandey");

		controller.updateView();
	}

	private static Employee retriveEmployeeFromDatabase() {
		Employee Employee = new Employee();
		Employee.setName("Devendra Singh");
		Employee.setId("22201010069");
		return Employee;
	}
}
