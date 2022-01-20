import javax.swing.JOptionPane;

class Student{
	private String studentId, name, phone, email;

	public void update(String newStudentId, String newName, String newPhone, String newEmail){
		studentId = newStudentId;
		name = newName;
		phone = newPhone;
		email = newEmail;
		//rasa macam kene ada password tapi taktau lah perlu ke tak
	}


	public void save(String i, String n, String p, String e){
		studentId = i;
		name = n;
		phone = p;
		email = e;
	}

	//default constructor
	public Student(){
		studentId = "2016801202";
		name = "Muhammad Adib bin Zainol";
		phone = "01234567890";
		email = "adib_zai@gmail.com";
	}

	//normal constructor
	public void house(String i, String n, String p, String e){
		studentId= i;
		name = n;
		phone = p;
		email = e;
	}

	public String getStudentId() { return studentId; }

	public String getName() { return name; }

	public String getPhone() { return phone; }

	public String getEmail() { return email; }

	//pilih lah mana nak guna as display constructor, printer method or toString method, mana2 boleh
	public void display(){  //printer method
		//System.out.println("Student ID: "+studentId);
		//System.out.println("Name: "+name);
		//System.out.println("Phone Number: "+phoneNo);
		//System.out.println("Email: "+email);
		JOptionPane.showMessageDialog(null, "Student ID: " +studentId+ "\nName: " +name+ "\nPhone Number: " +phone+ "\nEmail: " +email);
	}

	public String toString(){  //toString method
		String out = ("Student ID: "+studentId);
		out += ("Name: "+name);
		out += ("Phone Number: "+phone);
		out += ("Email: "+email);

		return out;
	}
}
