public class ValoresDefaultDasVariaveis{
	public byte byteDefaultValue; //valor default é 0
	public short shortDefaultValue; //valor default é 0
	public int intDefaultValue; //valor default é 0
	public long longDefaultValue; //valor default é 0

	public float floatDefaultValue;   //valor default é 0.0
	public double doubleDefaultValue; //valor default é 0.0

	public boolean booleanDefaultValue; //valor default é false
	
	public char charDefaultValue; //valor default é ''
	public String stringDefaultValue; // variavel de referencia, valor default é null

	public void imprimirValoresDefault(){
		System.out.println("Valores default para numeros inteiros");
		System.out.println("byte default value: " + byteDefaultValue);
		System.out.println("short default value: " + shortDefaultValue);
		System.out.println("int default value: " + intDefaultValue);
		System.out.println("long default value: " + longDefaultValue);

		System.out.println("\nValores default para numeros decimais");
		System.out.println("float default value: " + floatDefaultValue);
		System.out.println("double default value: " + doubleDefaultValue);

		System.out.println("\nValor default para tipo booleano");
		System.out.println("boolean default value: " + booleanDefaultValue);

		System.out.println("\n");
		System.out.println("char default value: " + charDefaultValue);
		System.out.println("String default value: " + stringDefaultValue);
	}

	public static void main(String args[]){
		//ValoresDefaultDasVariaveis valoresDefault = new ValoresDefaultDasVariaveis();
		//valoresDefault.imprimirValoresDefault();
		int c =  25-5*4/2-10+4;
		System.out.println(c);
	}

}