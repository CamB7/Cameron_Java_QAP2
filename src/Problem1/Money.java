package Problem1;

public class Money {
	private long dollars;
	private long cents;

	// Constructor from double amount
	public Money(double amount) {
		if (amount < 0) amount = 0;
		long totalCents = Math.round(amount * 100);
		this.dollars = totalCents / 100;
		this.cents = totalCents % 100;
	}

	// Copy constructor
	public Money(Money other) {
		this.dollars = other.dollars;
		this.cents = other.cents;
	}

	// Add method
	public Money add(Money other) {
		long totalCents = (this.dollars * 100 + this.cents) + (other.dollars * 100 + other.cents);
		return new Money(totalCents / 100.0);
	}

	// Subtract method
	public Money subtract(Money other) {
		long totalCents = (this.dollars * 100 + this.cents) - (other.dollars * 100 + other.cents);
		return new Money(totalCents / 100.0);
	}

	// CompareTo method
	public int compareTo(Money other) {
		long thisTotal = this.dollars * 100 + this.cents;
		long otherTotal = other.dollars * 100 + other.cents;

		if (thisTotal < otherTotal) return -1;
		else if (thisTotal > otherTotal) return 1;
		else return 0;
	}

	// Equals method
	public boolean equals(Money other) {
		return this.dollars == other.dollars && this.cents == other.cents;
	}

	// toString method
	public String toString() {
		return String.format("$%d.%02d", dollars, cents);
	}
}

