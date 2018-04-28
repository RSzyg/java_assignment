public class ACSII {
	public static void main(String[] args) {
		String s = "";
		int count = 0;
		for (char i = '!'; i <= '~'; i++) {
			count++;
			s += i;
			if (i >= '0' && i <= '8') {
				s += " ";
			}
			if (count == 10) {
				System.out.println(s);
				s = "";
				count = 0;
			}
		}
	}
}
