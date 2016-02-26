package hamspam;

public class HamSpam {
	/**
	 * Construct an object that can compute hamspam values for a game of 
	 * Ham and Spam.
	 * 
	 * @param hamNumber the ham number; it must be greater than 1
	 * @param spamNumber the spam number; it must be greater 
	 * than 1 and not equal to the ham number 
	 */
	private int hNum;
	private int sNum;
	public HamSpam(int hamNumber, int spamNumber) {
		hNum = hamNumber;
		sNum = spamNumber;
	}

	/**
	 * Returns the nth hamspam value (a number, ham, spam, or hamspam) 
	 * for this game of Ham and Spam.
	 * 
	 * For example, getValue(1) returns "1".
	 * 
	 * @param n
	 *            the number to consider; n > 0
	 * @return the hamspam value, as a String
	 */
	public String getValue(int n) {
		if (n % hNum == 0 && n % sNum == 0){
			return "hamspam";
		}
		if (n % hNum == 0) {
			return "ham";
		}

		if (n % sNum == 0) {
			return "spam";
		}
		else {
			return Integer.toString(n);
		}
	}

	/**
	 * Returns an array of the hamspam values from start to end, inclusive, for
	 * this game of Ham and Spam.
	 * 
	 * For example, if the ham number is 3 and the spam number is 4,
	 * getValues(2,6) should return an array of Strings:
	 * 
	 * {"2", "ham", "spam", "5", "ham"}
	 * 
	 * @param start
	 *            the number to start from; start > 0
	 * @param end
	 *            the number to end at; end >= start
	 * @return the array of hamspam values
	 */
	public String[] getValues(int start, int end) {
		int arrSize = 0;
		if (start < end){
			arrSize = end + 1 - start;
		}
		String[] StrArr = new String[arrSize];
		int hsInt = start;
		for (int i = 0; i < StrArr.length; i++){
			StrArr[i] = getValue(hsInt);
			hsInt++;
		}
		return StrArr;
	}
}
