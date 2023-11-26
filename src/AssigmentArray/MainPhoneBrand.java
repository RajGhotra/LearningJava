package AssigmentArray;

import java.util.Arrays;

public class MainPhoneBrand {

	public static void main(String[] args) {
		PhoneBrand phone=new PhoneBrand();
		
		System.out.println("Available products are :"+Arrays.deepToString(phone.phoneCategory));
		phone.displayProducts();
	}

}
