package assignment;

public class myClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Enployee enploy1 = new Enployee();
		
		enploy1.name= "Susan Mayers";
		enploy1.ID = 47899;
		enploy1.dept = "Accounting";
		enploy1.jobTitle = "Vice president";
		
		System.out.println("NAME\t\tID NUMBER\tDEPARTMENT\tJOB TITLE");
		System.out.println(enploy1.name + "\t" + enploy1.ID + "\t\t" + enploy1.dept + "\t" + enploy1.jobTitle );
		
		Enployee enploy2 = new Enployee();
		
		enploy2.setName("Mark jones");
		enploy2.setID(39119);
		enploy2.setDept("IT");
		enploy2.setJobTitle("Programmer");
		
		System.out.println(enploy2.name + "\t" + enploy2.ID + "\t\t" + enploy2.dept + "\t\t" + enploy2.jobTitle );
		
		Enployee enploy3 = new Enployee();
		
		enploy3.name= "Joy Roger";
		enploy3.ID = 81774;
		enploy3.dept = "Manufacturing";
		enploy3.jobTitle = "Engineer";
		
		System.out.println(enploy3.name + "\t" + enploy3.ID + "\t\t" + enploy3.dept + "\t" + enploy3.jobTitle );
		
	}

}
