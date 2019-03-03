
public class Project_1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] empNo = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
		int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
		int[] hra = {8000, 12000, 8000, 6000, 20000, 4400, 10000};
		int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};
		int total, da=0;
		String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Rajan", "Sumna", "Tanmay"};
		String[] deptName = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
		char[] designationCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
		String designation = null;
		int len = designationCode.length;
		for(int i = 0; i < len; i++)
		{
		switch(designationCode[i])
		{
		case 'e':
			designation = "Engineer";
			da = 20000;
			break;
		case 'c':
			designation = "Consultant";
			da = 32000;
			break;
		case 'k':
			designation = "Clerk";
			da = 12000;
			break;
		case 'r':
			designation = "Receptionist";
			da = 15000;
			break;
		case 'm':
			designation = "Manager";
			da = 40000;
			break;
		}
		}
		int flag=0;
		int x = Integer.parseInt(args[0]);
		for(int i = 0; i < empNo.length; i++)
		{
			if(x == empNo[i])
			{
				flag = 1;
				total = basic[i] + hra[i] + da -it[i];
				System.out.println("Emp No.  Emp Name  Department  Designation  Salary");
				System.out.println(empNo[i] + "     " + empName[i] + "       " + deptName[i] + "      " + designation + "   " + total);
				break;
			}
			
		}
		if(flag==0)
		System.out.println("There is no employee with empid : " + args[0]);
		
	}

}
