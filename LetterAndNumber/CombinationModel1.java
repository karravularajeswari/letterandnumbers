
public class CombinationModel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABC34TGV";
		combination(s);
	}
	public static String combination(String s)
	{
		String letter="";
	String number="";
	String b="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
			{
			letter=letter+s.charAt(i);
			}
		if(s.charAt(i)>=48 && s.charAt(i)<=57)
		{
			number=number+s.charAt(i);
		}
			b=letter+number;
			
		}
		System.out.println(b);
		return s;
	}

}
