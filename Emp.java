class Employee
{
String Emp_name,Emp_id,Address,Mail_id;
long Mobile_no;
}
class Programmer extends Employee
{
	double Basic_pay=25000;
	double DA=Basic_pay*0.97;
	double HRA=Basic_pay*.10;
	double PF=Basic_pay*.12;
	double staff_club_fubd=Basic_pay*0.01;
}
class AssistantProfessor extends Employee
{
	double Basic_pay=27000;
	double DA=Basic_pay*0.97;
	double HRA=Basic_pay*.10;
	double PF=Basic_pay*.12;
	double staff_club_fubd=Basic_pay*0.01;
}
class AssociateProfessor extends Employee
{
	double Basic_pay=42000;
	double DA=Basic_pay*0.97;
	double HRA=Basic_pay*.10;
	double PF=Basic_pay*.12;
	double staff_club_fubd=Basic_pay*0.01;
}
class Professor extends Employee
{
	double Basic_pay=65000;
	double DA=Basic_pay*0.97;
	double HRA=Basic_pay*.10;
	double PF=Basic_pay*.12;
	double staff_club_fubd=Basic_pay*0.01;
}

public class Emp {

	public static void main(String[] args) {
		Programmer p=new Programmer();
		p.Emp_name="a";
		p.Emp_id="123";
		p.Address="xyz";
		p.Mail_id="abc@gmail.com";
		p.Mobile_no=1234567890;
		System.out.println("Name="+p.Emp_name+" Emp_id ="+p.Emp_id);
		System.out.println("Gross Salary="+(p.DA+p.HRA+p.PF));
		System.out.println("Net Salary="+(p.DA+p.HRA+p.PF-p.staff_club_fubd));
		Professor p1=new Professor();
		p1.Emp_name="b";
		p1.Emp_id="456";
		p1.Address="abc";
		p1.Mail_id="zbc@gmail.com";
		p1.Mobile_no=9899899899l;
		System.out.println("Name="+p1.Emp_name+" Emp_id ="+p1.Emp_id);
		System.out.println("Gross Salary="+(p1.DA+p1.HRA+p1.PF));
		System.out.println("Net Salary="+(p1.DA+p1.HRA+p1.PF-p1.staff_club_fubd));
		AssistantProfessor p11=new AssistantProfessor();
		p11.Emp_name="c";
		p11.Emp_id="678";
		p11.Address="ncz";
		p11.Mail_id="ncz@gmail.com";
		p11.Mobile_no=9898989898l;
		System.out.println("Name="+p11.Emp_name+" Emp_id ="+p11.Emp_id);
		System.out.println("Gross Salary="+(p11.DA+p11.HRA+p11.PF));
		System.out.println("Net Salary="+(p11.DA+p11.HRA+p11.PF-p11.staff_club_fubd));
	}

}

