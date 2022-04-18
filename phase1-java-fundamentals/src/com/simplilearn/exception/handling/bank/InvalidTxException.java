package exception.handling.bank;

@SuppressWarnings("serial")
public class InvalidTxException extends Exception{
	
	String message;
	
	InvalidTxException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Invalid Tx Exception [message=" + message + "]";
	}	

}