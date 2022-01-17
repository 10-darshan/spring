package darshan;

public class Student implements Comparable<Student> {
	int rollno;
	int marks;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(int rollno, int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		
		return this.marks>s.marks?1:-1;
	}

}
