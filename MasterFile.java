public interface Print_Quotient
{
	public void print(float a,float b);

}

public interface Perfect_Square {
	public boolean square (int a);
	//Ishan - I learned about how GitKraken works and how pushed, pulls, and commits help make woking with a partner easier. I also learned about lambdas and how they make coding easier by making functional interfaces more accessable.
}

public class MasterFile {

	public static void main (String [] args) {
		Perfect_Square perf = (int x) -> { if (Math.pow((Math.sqrt(x)),2) == x) return false; else return true;};
		System.out.println(perf.square(25));
		print(7.4f,5.2f);

	}

	public void print(float a,float b)
		{
			float c=a/b;
			System.out.printf("%5.3f%n",c);
	}

}