package ty;
import java.util.*;

class Exam{
	Scanner sc = new Scanner(System.in);
	String name;
	String UserName;
	String password;
	
	int count=0;
	int ans_choice;
	
	public void register(){
		System.out.print("Enter Your Name : ");
		name = sc.nextLine();
		System.out.print("Set Your Username : ");
		UserName = sc.nextLine();
		System.out.print("Set Your Password : ");
		password = sc.nextLine();
		
		System.out.print("User Registered Successfully !\nProceed to Login\n");
		System.out.println("-------------------------------------------------------");
		
	}
	public boolean login() {
		
		boolean is_Login = false;
		
		while ( !is_Login ) {
			System.out.print("Enter Your Username : ");
			String Uname = sc.nextLine();
			System.out.print("Enter Your Password : ");
			String Password = sc.nextLine();
			if ( Uname.equals(UserName) & Password.equals(password) ) {
				
						System.out.print("\nLogin Successful  !!\n");
						System.out.println("-------------------------------------------------------");
						is_Login = true;
				
			}
			else {
				System.out.println("\n Username or Password not found");
			}
		}
		return is_Login;
	}
	
	void take_exam(){
		System.out.println("Select programming language:");
        System.out.println("1.Python \n2.Core Java \n3.C++");
        System.out.println("Enter your choice:");
        int sub=sc.nextInt();
        System.out.println("There are 5 questions in the examination");
     
      
        System.out.println("Each question consist of 4 option you have to choose correct answer");
        if(sub==2)
        {
            count=0;
            System.out.println("Q.1.Java is developed by:");
        
        System.out.println("1.James Gosling \n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
        System.out.print("Enter answer:");
        ans_choice=sc.nextInt();
        if(ans_choice==1)
        {
            ++count;
        }
        System.out.println("Q.2.Which of the following is not a Java features?");
        System.out.println("1.Dynamic\n2.Architecture Neutral\n3.Use of Pointers\n4.Object-oriented");
         System.out.print("Enter answer:");
         ans_choice=sc.nextInt();
        if(ans_choice==3)
        {
            ++count;
        }
          System.out.println("Q.3.Java is:");
        System.out.println("1.Platform Dependent\n2.Platform Indepenedent\n3.None\n4.All of the above");
         System.out.print("Enter answer:");
         ans_choice=sc.nextInt();
          if(ans_choice==2)
        {
            ++count;
        }
          System.out.println("Q.4. In which memory a String is stored, when we create a string using new operator?");
        System.out.println("1.Stack\n2.String memory\n3.Heap Memory\n4.Random storage space");
         System.out.print("Enter answer:");
         ans_choice=sc.nextInt();
          if(ans_choice==3)
        {
            ++count;
        }
          System.out.println("Q.5.Java is:");
          System.out.println("1.Compiled Language\n2.Interpreted Language\n3.Both Compiled and Interpreted\n4.None");
          System.out.print("Enter answer:");
          ans_choice=sc.nextInt();
          System.out.println("---------------------------");
          
          if(ans_choice==3)
        {
            ++count;
        }
        }
        
        else if(sub==1)
        {
            count=0;
            System.out.println("Q.1.C is developed by:");
        
        System.out.println("1.Bjarne Strousrup\n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
        System.out.print("Enter answer:");
        ans_choice=sc.nextInt();
        if(ans_choice==2)
        {
            ++count;
        }
        System.out.println("Q.2.C is:");
        System.out.println("1.High Level\n2.Low Level\n3.Middle Level\n4.Machine Level");
         System.out.print("Enter answer:");
         ans_choice=sc.nextInt();
        if(ans_choice==3)
        {
            ++count;
        }
          System.out.println("Q.3.C is:");
        System.out.println("1.Platform Dependent\n2.Platform Indepenedent\n3.None\n4.All of the above");
         System.out.print("Enter answer:");
         ans_choice=sc.nextInt();
          if(ans_choice==1)
        {
            ++count;
        }
          System.out.println("Q.4. C is:");
        System.out.println("1.Object Oriented\n2.Procedure Oriented\n3.Strictly Object Orieneted\n4.None");
         System.out.print("Enter answer:");
         ans_choice=sc.nextInt();
          if(ans_choice==2)
        {
            ++count;
        }
          System.out.println("Q.5.C is:");
        System.out.println("1.Compiled Language\n2.Interpreted Language\n3.Both Compiled and Interpreted\n4.None");
         System.out.print("Enter answer:");
         ans_choice=sc.nextInt();   
        if(ans_choice==1)
        {
            ++count;
        }
        }
        else
        {
            count=0;
               System.out.println("Q.1.C++ is developed by:");
        
        System.out.println("1.Bjarne Strousrup\n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
        System.out.print("Enter answer:");
        ans_choice=sc.nextInt();
        if(ans_choice==1)
        {
            ++count;
        }
        System.out.println("Q.2.C++ is:");
        System.out.println("1.High Level\n2.Low Level\n3.Middle Level\n4.Machine Level");
         System.out.print("Enter answer:");
         ans_choice=sc.nextInt();
        if(ans_choice==3)
        {
            ++count;
        }
          System.out.println("Q.3.C++ is:");
        System.out.println("1.Platform Dependent\n2.Platform Indepenedent\n3.None\n4.All of the above");
         System.out.print("Enter answer:");
         ans_choice=sc.nextInt();
          if(ans_choice==1)
        {
            ++count;
        }
          System.out.println("Q.4. C++ is:");
        System.out.println("1.Object Oriented\n2.Procedure Oriented\n3.Strictly Object Orieneted\n4.None");
         System.out.print("Enter answer:");
         ans_choice=sc.nextInt();
          if(ans_choice==1)
        {
            ++count;
        }
          System.out.println("Q.5.C++ is:");
        System.out.println("1.Compiled Language\n2.Interpreted Language\n3.Both Compiled and Interpreted\n4.None");
         System.out.print("Enter answer:");
         ans_choice=sc.nextInt();   
        if(ans_choice==1)
        {
            ++count;
        }
        }
        
        
        
		
	}
	
	void view_marks(){
		if(count > 3){
    		System.out.println("Congratulations  "+name+"  You scored "+count+" marks "+"out of 5 \n\n");
    		System.out.print("-----------------------------* * * ----------------------------\n\n");
    	}
    	else{
    		System.out.print("Good Job "+name+" but, you scored only "+count+" marks out of 5 !\nStudy hard for next time \n\n");
    		System.out.print("-----------------------------* * * ----------------------------\n\n");
    	}
	}
	
	
	
}

public class Online_Examination_System {
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
		System.out.println("             ------------------------------            ");
		System.out.print(" **** |   Online Examination System    | ****\n");
		System.out.println("             ------------------------------             ");
		System.out.println("1.Register");
		System.out.println("2.Exit");
		System.out.print("Enter Your Choice - ");
		int ch = sc.nextInt();
       
		Online_Examination_System e1 = new Online_Examination_System();           // Creating the Objects of class exam
                
        if (ch==1){
        	e1.register();
        	
        	while(true){
				
				System.out.println("1.login");
				System.out.println("2.Exit");
				System.out.print("Enter Your Choice - ");
				int user_choice = sc.nextInt();
				if(user_choice == 1){
					if(e1.login()){
						System.out.println("\n\n----------- WELCOME " + e1.name + " !! -----------\n");
						
						
						boolean is_exit = false;
						
						while(!is_exit){
							    System.out.println("1.Give Exam");
						        System.out.println("2.View Exam Marks");
						        System.out.println("3.Exit\n");
						        
						        System.out.print("Enter your choice:");
						        int choice=sc.nextInt();
							
						        switch(choice)
						        {
						            case 1:
						            {
						                e1.take_exam();
						                System.out.print("-----------------------------%%%----------------------------\n\n");
						                break;
						            }
						            case 2:
						            {
						            	e1.view_marks();
						            	break;
						            }
						            case 3:
						            	is_exit = true;
						            	break;
						                    
						        }
	
					}
			     }
			  }
		  }
				
      }            
   }
}
