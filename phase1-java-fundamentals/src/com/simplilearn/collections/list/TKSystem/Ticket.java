package collections.list.TKSystem;

public class Ticket 
{
	
	// properties
	public int ticketid;
	public String name;
	public double price;
	public String details;
	public String source ;
	public String destin;
	
	
	
	public Ticket(int ticketid, String name, double price, String details,String  source , String destin )
	{
		super();
		this.ticketid = ticketid;
		this.name = name;
		this.price = price;
		this.details = details;
		this.source = source;
		this.destin = destin;
	}
	
	public Ticket() {
		super();
	}

	@Override
	public String toString() {
		return "Ticket [id=" + ticketid + ", name=" + name + ", price=" + price + ", details=" + details +", source ="+source+",destins="+destin+ "]";
	}
	
	
}

