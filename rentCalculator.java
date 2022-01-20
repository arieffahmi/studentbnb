class rentCalculator{
	private int rent, deposit, month;
	double rentmonth, totalrent;

	public double calctotalrent(int deposit, int rent, int month){
		totalrent=(rent*month)+deposit;

		return totalrent;
	}

	public double calculaterentmonth(int rent, int month){
		rentmonth=(rent*month);

		return rentmonth;
	}

}