package day_11_switchstatement;

public class Calculator {

	public static void main(String[] args) {
		double num1,num2,result = 0;
		char operator;
		
		num1=5;
		num2=3;
		operator='+';
		switch(operator) {
		
		
		case '+' :
			result =num1+num2;
			System.out.println(result);
			break;
			
		case '-':
			result=num1-num2;
			System.out.println(result);
			break;
		case '*':
			result=num1*num2;
			System.out.println(result);
			break;
		case '/':
			result=num1/num2;
			System.out.println(result);
			break;
	    case '%':
			System.out.println(result);
			break;
			default:
				System.out.println("error : invalid operators");
				return ;
				
			
			
		}
		
		System.out.println(result);	
		

	}

}
