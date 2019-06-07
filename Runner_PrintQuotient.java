public class Runner_PrintQuotient implements Print_Quotient
{
	Runner_PrintQuotient()
	{
		print(7.4f,5.2f);
	}

	public void print(float a,float b)
	{
		float c=a/b;
		System.out.printf("%5.3f%n",c);
	}

    public static void main(String[] args)
    {
        Runner_PrintQuotient app = new Runner_PrintQuotient();
    }

}