public class ShortWordFilter implements Filter {
	
	public boolean accept(Object obj) {
		String str = (String) obj; // Cast obj to String type
			if (str.length() >= 5) {
				return false;
			}
		else return true;
	}	

}
