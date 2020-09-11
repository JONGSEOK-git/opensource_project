public class Calculation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[2]);
		
		String operation =args[1];
		int result=0;
		boolean rightOperator=true;
		
		if(operation.contentEquals("+"))
			result=num1+num2;
		else if(operation.contentEquals("-"))
			result=num1-num2;
		else if(operation.contentEquals("/"))
			result=num1/num2;
		else if(operation.contentEquals("*"))
			result=num1*num2;
		else
			rightOperator=false;
		if(rightOperator)
			System.out.println(num1+operation+num2+"="+result);
		else
			System.out.println("연산자가 잘못되었습니다.");
	}

}
