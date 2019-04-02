
public class BookStore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Book b1;
		Dictionary d1;
		Object o;
		FrenchDictionary f1 = new FrenchDictionary();

		b1 = f1;

		b1.setPages(12);
		System.out.println(b1.getPages());
	}
}