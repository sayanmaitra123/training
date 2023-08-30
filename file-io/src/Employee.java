import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
	private int empNo;
	private String eName;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empNo, String eName, double salary) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee [empNo =" + empNo + " , ename=" + eName + ", salary=" + salary + "]";
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeInt(empNo);
		out.writeUTF(eName);
	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		empNo = in.readInt();
		eName = in.readUTF();
	}

}
