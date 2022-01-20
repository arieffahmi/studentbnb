/*
Arief Fahmi bin Mohd Fuad
2016483468
Ahmad Ilyas bin Mahari
2016696128
Muhammad Adib bin Zainol
2016801202
CS110-4E
CSC238

Prepared for Sir Zawawi bin Ismail
*/

//application class

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

class StudentbnbApp{

	public static void main(String[] args){

		//variable declaration
		String studentID, studentName, studentPhone, studentEmail;

		String HouseAddress, HouseID, HouseOwner;
		int HouseRentPerMonth, HouseDeposit, month;
		double HouseDistance;
		boolean HouseRentalStatus;

		int search;
		boolean input = false;

		Student s = new Student();		//1 instantiate object
		House h = new House();

		int option = 99; //99 is declared as default loop option

		//loop to return all options to main menu
		while (option == 99){

			//method to load main menu and return user input
			option = menu();

			//option 1 will ask user to input new student details
			if (option == 1){

				input = true;
				//gui input
				studentID = JOptionPane.showInputDialog("Student ID: ");
				studentName = JOptionPane.showInputDialog("Student Name: ");
				studentPhone  = JOptionPane.showInputDialog("Student Phone: ");
				studentEmail = JOptionPane.showInputDialog("Student Email: ");


				s.save(studentID, studentName, studentPhone, studentEmail);		//2 call storer method
				JOptionPane.showMessageDialog(null, "Student details saved.");

				option = 99;
			}

			//option 2 will ask user to input new house details
			else if (option == 2){

				input = true;
				//gui input
				HouseAddress = JOptionPane.showInputDialog("House Address: ");
				HouseID = JOptionPane.showInputDialog("House ID: ");
				HouseOwner  = JOptionPane.showInputDialog("House Owner: ");
				HouseDistance = Double.parseDouble(JOptionPane.showInputDialog("House Distance: "));
				HouseRentPerMonth = Integer.parseInt(JOptionPane.showInputDialog("House Rent Per Month: "));
				HouseDeposit = Integer.parseInt(JOptionPane.showInputDialog("House Deposit: "));


				h.save(HouseAddress, HouseID, HouseOwner, HouseDistance, HouseRentPerMonth, HouseDeposit);		//2 call storer method
				JOptionPane.showMessageDialog(null, "Student details saved.");

				option = 99;
			}

			//will display default student details if user did not input new student details
			else if (option == 3){

				if(!input){
					JOptionPane.showMessageDialog(null, "Default student details will be displayed.", "Information", JOptionPane.INFORMATION_MESSAGE);
					s.display();
				}

				else s.display();

				option = 99;
			}

			//will display default house details if user did not input new house details
			else if (option == 4){

				if(!input){
					JOptionPane.showMessageDialog(null, "Default house details will be displayed.", "Information", JOptionPane.INFORMATION_MESSAGE);
					h.display();
				}
				else h.display();

			option = 99;
			}

			//option 5 will search student ID/name
			else if (option == 5){

				//will search default student ID/name if user did not input new student details
				if(!input){
					JOptionPane.showMessageDialog(null, "Default student ID/name will be searched.", "Information", JOptionPane.INFORMATION_MESSAGE);
				}

				search = 1;
				while(search == 1){

					//input from user to search for keyword
					String keyword = JOptionPane.showInputDialog("Keyword (case sensitive): ");

					boolean match = (s.getStudentId().contains(keyword) || s.getName().contains(keyword));

					JOptionPane.showMessageDialog(null, "Keyword match: " + match);

					//will display matching student details if match keyword
					if (match){s.display();}

					search = Integer.parseInt(JOptionPane.showInputDialog("Search complete. New search?\n\n1. Yes\n2. No\n\nEnter option: "));
						if (search != 1 && search != 2){
						JOptionPane.showMessageDialog(null, "Invalid input. Search will end.", "Error", JOptionPane.ERROR_MESSAGE);
						option = 99;
					}

			}
				option = 99;
			}

			//option 6 will search house address
			else if (option == 6){

				//will search default student details if user did not input new student details
				if(!input){
					JOptionPane.showMessageDialog(null, "Default house details will be searched.", "Information", JOptionPane.INFORMATION_MESSAGE);
				}

				search = 1;
				while(search == 1){

					//input from user to search for keyword
					String keyword = JOptionPane.showInputDialog("Keyword (case sensitive): ");
					JOptionPane.showMessageDialog(null, "Keyword match: " + h.getAddress().contains(keyword));

					//will display matching house details if match keyword
					if (h.getAddress().contains(keyword)){h.display();}

					search = Integer.parseInt(JOptionPane.showInputDialog("Search complete. New search?\n\n1. Yes\n2. No\n\nEnter option: "));
					if (search != 1 && search != 2){
						JOptionPane.showMessageDialog(null, "Invalid input. Search will end.", "Error", JOptionPane.ERROR_MESSAGE);
						option = 99;
					}
				}
				option = 99;
			}

			//option 7 will invoke rent calculator
			else if (option == 7){

				rentCalculator rc = new rentCalculator();
				DecimalFormat df = new DecimalFormat("####.00");

				month = Integer.parseInt(JOptionPane.showInputDialog("Total rent = Deposit + (Rent per month x Number of months)\nEnter number of months: "));
				double totalRent = rc.calctotalrent(h.getDeposit(), h.getRent(), month);

				JOptionPane.showMessageDialog(null, "Deposit: RM" + h.getDeposit() +  "\nRent per month: RM" + h.getRent() +  "\nNumber of months: " + month +  "\n\nTotal rent: RM" + df.format(totalRent));

				option = 99;
			}

			//option 0 will terminate program
			else if (option == 0){System.exit(0);}

			else {

				JOptionPane.showMessageDialog(null, "Invalid input. Please enter the correct option.", "Error", JOptionPane.ERROR_MESSAGE);
				option = 99;
			}
		}
	}

		//method to display main menu and receive user input
		public static int menu(){
				int option = Integer.parseInt(JOptionPane.showInputDialog("Studentbnb\n\n1. Input new student\n2. Input new house\n\n3. Display student details\n4. Display house details\n\n5. Search student ID/Name\n6. Search house address\n\n7. Rent Calulator\n\n0. Exit\n\nEnter option: "));
				return option;

		}
}