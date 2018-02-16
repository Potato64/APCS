
public class StairString {

	public static void main(String[] args) 
	{
		stairString("The Really Cool klsdajf;End", 4);
	}

	public static void stairString (String string, int lines)
	{
		String[] substrings = new String[lines];
		int substringLength = (int) Math.ceil((double)string.length() / lines);
		for (int c = 0; c < string.length(); c += substringLength)
		{
			substrings[c / substringLength] = String.format("%" + (c + substringLength) + "s", string.substring(c, (c < string.length() - substringLength) ? substringLength + c : string.length()));
		}
		for (int c = 0; c < lines; c++)
		{
			System.out.println(substrings[c]);
		}
	}
}
