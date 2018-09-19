
public class CombinationModel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABC34TGV";
		model(s);

	}
	public static String model(String s)
	{
		String letter="";
		String number="";
		for(int i=0;i<s.length();i++)
		{
			char a=s.charAt(i);
			if(Character.isDigit(a))
			{
				number=number+a;
			}
			else
			{
				letter=letter+a;
			}
		}
		System.out.println(letter+""+number);
		return s;
	}

}
