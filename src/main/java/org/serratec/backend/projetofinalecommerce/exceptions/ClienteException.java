package org.serratec.backend.projetofinalecommerce.exceptions;

public class ClienteException extends Exception {

	private static final long serialVersionUID = 1L;

	public ClienteException () {
		super();
	}
	
	public ClienteException (String message) {
		super(message);
	}
	
	public ClienteException (String message, Exception cause) {
		super(message, cause);
	}
	
	public ClienteException (Exception e) {
		super(e);
	}
}
