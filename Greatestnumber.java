public class greatestnumber{
	public static void main(String[] args){
		int a= 8;
		int b=44;
		int c=10;
		
		if(a>b && a>c){
			System.out.println(a+" is the greatest number");
		}
		else if(b>a && b>c){
			System.out.println(b+" is the greatest number");
		}
		else{
			System.out.println(c+" is the greatest number");
		}
	}
}