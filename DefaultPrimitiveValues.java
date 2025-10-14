public class DefaultPrimitiveValues {
	byte byteValue;
	short shortValue;
	int intValue;
	long longValue;
	float floatValue;
	double doubleValue;
	char charValue;
	boolean booleanValue;
public static void main(String[]args) {
	DefaultPrimitiveValues defaults = new DefaultPrimitiveValues();
	System.out.println("Default values of primitive data types in java:");
	System.out.println("------------------------------------------------");
	System.out.println("byte   :"+ defaults.byteValue);
	System.out.println("short :"+ defaults.shortValue);
	System.out.println("int :"+ defaults.intValue);
	System.out.println("long :"+ defaults.longValue);
	System.out.println("float :"+ defaults.floatValue);
	System.out.println("double :"+ defaults.doubleValue);
	System.out.println("char :"+ defaults.charValue +"'");
	System.out.println("boolean :"+ defaults.booleanValue);
	}
}
