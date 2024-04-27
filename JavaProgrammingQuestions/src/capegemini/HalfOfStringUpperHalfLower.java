package capegemini;

//Problem Statement- Given a string divide it in 2 parts and print first half in upper case and 2nd half in lower case
public class HalfOfStringUpperHalfLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String str= "This is CloudTech This is CloudTech";
			int mid= str.length()/2;
			String lowerCase = "";
			String upperCase = "";
			for (int i= 0; i< str.length(); i ++)
			{
				if(i< mid)
				{
					lowerCase = lowerCase+ Character.toLowerCase(str.charAt(i));
				}
				else
				{
					upperCase = upperCase+ Character.toUpperCase(str.charAt(i));
				}
	}
			System.out.println("The new string is= " +lowerCase + upperCase);

}
}
