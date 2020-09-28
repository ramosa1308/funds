package com.financial.exception;

public class FundsExceptionAttributes {
	String className = null;
	String methodName = null;
	

	/**
	 * Constructor - Initialization
	 * 
	 * @param className   Name of the class where the exception is generated.
	 * @param methodName Name of method where the exception is generated.
	 */
	public FundsExceptionAttributes(String className, String methodName){
		this.className =className;
		this.methodName = methodName;
	}
	
	/**
	 * Return object type SegmentExceptionAttributes for the values specified in the arguments
	 * 
	 * @param className Name of the class where the exception is generated.
	 * @param methodName Name of method where the exception is generated.
	 * @return QMSExceptionAttributes  Returns an object <code> qMSExceptionAttributes</code>
	 *  with the attributes of the exception
	 */
	public static FundsExceptionAttributes build(String className, String methodName){
		FundsExceptionAttributes fundsExceptionAttributes = 
				new FundsExceptionAttributes(className, methodName);
		return fundsExceptionAttributes;
	}
	
	
	/**
     * (non-Javadoc)
     * 
     * @see Object#toString()
     */
	@Override
	public String toString(){
		StringBuilder result = new StringBuilder();
	    String NEW_LINE = System.getProperty("line.separator");
	    
	    result.append(this.getClass().getName() + " Object {" + NEW_LINE);
	    result.append(" ClassName: " + this.className + NEW_LINE);
	    result.append(" MethodName: " + this.methodName + NEW_LINE);
	    result.append("}");

	    return result.toString();
	}
	
	/**
	 * getter method  (read only).
	 * @return String
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * getter method (read only).
	 * @return String
	 */
	public String getMethodName() {
		return methodName;
	}
}
