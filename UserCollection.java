package users;

import java.util.ArrayList;
import java.util.List;

public class UserCollection {
	
	//записване на регистрираните учасници в масив
		private static List<Sign_Up> usersRegistered;
		
		public static List<Sign_Up>getInstance(){
			if(usersRegistered == null) {
				usersRegistered = new ArrayList<>();
			}
			return usersRegistered;
		}

}
