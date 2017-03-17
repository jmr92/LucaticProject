package com.lucatic.dao;
/**
 * DAOException is used to handle probable causes of
 * unwanted runtime errors.
 */

public class DAOException extends Exception {
	
	
	/**
	 * Constructs a new exception with null as its detail message.
	 */
    public DAOException() {
        super();
    }
    /**
     * Constructs a new exception with the specified detail message.
     * @param message The detail message
     */
    public DAOException(String message) {
        super(message);
    }
    /**
     * Constructs a new exception with the specified cause.
     * @param cause The cause. A null value is permitted, and
     *        indicates that the cause is nonexistent or unknown.
     */
    public DAOException(Throwable cause) {
        super(cause);
    }
    /**
     *  Constructs a new exception with the specified detail message and cause.
     * @param message The detail message
     * @param cause The cause. A null value is permitted, and
     *        indicates that the cause is nonexistent or unknown.
     */
    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }
}