public class QuadraticRoots {
	public static void main(String[]args) {
	int a = 4;
	int b = 8;
	int c = -12;
	double discriminant = b*b -(4*a*c);
	if (discriminant>0)
	{
	 double r1 =(-b+Math.sqrt(discriminant))/(2*a);
	 double r2 =(-b-Math.sqrt(discriminant))/(2*a);
	 System.out.println("roots are real and different");
	 System.out.println("root1:"+r1);
	 System.out.println("root2:"+r2);
	}
	else if (discriminant==0)
	{
		double r1=-b/(2*a);
		System.out.println("roots are real and same");
		System.out.println("root:"+r1);
	}
	else
	{
		double realpart = -b/(2*a);
		double imaginarypart = (Math.sqrt(discriminant))/(2*a);
		System.out.println("roots are real&imaginary");
		System.out.println("root1="+realpart+"+"+imaginarypart+"i");
		System.out.println("root2="+realpart+"-"+imaginarypart+"i");
	}
   }
}
		
