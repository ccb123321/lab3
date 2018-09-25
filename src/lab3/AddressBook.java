package lab3;
import java.util.*;
public class AddressBook {

		private List<BuddyInfo> Buddys;
		
		public AddressBook() {
			this.Buddys = new ArrayList<BuddyInfo>();
		}
		private void addBuddy(BuddyInfo a) {
			Buddys.add(a);
		}
		
		private void removeBuddy(int index) {
			if(index >= 0 && index< Buddys.size()) {
			Buddys.remove(index);
			}
		}
		public static void main(String[] args) {
			
			BuddyInfo aBuddy = new BuddyInfo();
			AddressBook buddyBook = new AddressBook();
			buddyBook.addBuddy(aBuddy);
			buddyBook.removeBuddy(0);
		    System.out.println("ddd");
		}
	}

