import javax.swing.JOptionPane;

class House{
	public String address, id, owner;
	private int rent, deposit;
	private double distance;
	boolean rentalstatus;

	public void update(String newAddress, String newId){
		address = newAddress;
		id = newId;
	}


	public void save(String a, String i, String o, double ds, int r, int d){
		address = a;
		id = i;
		owner = o;
		distance = ds;
		rent = r;
		deposit = d;
	}

//default constructor
	public House(){
		address = "Lot 16029, Jalan Tanah Lot Medan Jaya, Taman Kalongan Mas, Rusila, 21600 Marang, Terengganu";
		id = "001";
		owner = "Zulhisam";
		distance = 6.2;
		rent = 140;
		deposit = 1500;
		rentalstatus = false;
	}

//normal constructor
	public House(String a, String i, String o, double ds, int d, int r, boolean rs){
		address = a;
		id = i;
		owner = o;
		distance = ds;
		rent = r;
		deposit = d;
		rentalstatus = rs;
	}

	public String getAddress(){return address;}
	public String getId(){return id;}
	public double getDistance(){return distance;}
	public int getDeposit(){return deposit;}
	public int getRent(){return rent;}

	public void display(){
		JOptionPane.showMessageDialog(null, "House Address: " + address + "\nHouse ID: " + id + "\nHouse Owner: " + owner + "\nDistance from UiTM: " + distance + " km\nRental status: "+ rentalstatus + "\nRent Per Month: RM " + rent + "\nTotal Deposit: RM " + deposit);
	}

	public String toString(){
	String out = ("House Address: "+address);
	out += ("House ID: "+id);
	out += ("House Owner: "+owner);
	out += ("Distance from UiTM: "+distance);
	out += ("Rental Status: "+rentalstatus);
	out += ("Rent per month: "+rent);
	out += ("Total Deposit: "+deposit);

	return out;

	}


}
