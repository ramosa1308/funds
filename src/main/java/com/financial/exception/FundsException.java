package com.financial.exception;

public class FundsException extends Exception{
		private FundsExceptionAttributes fundsExceptionAttributes;
		private static final long serialVersionUID = 1L;
		
		
		public FundsException(String message , 
				  FundsExceptionAttributes fundsExceptionAttributes){
			super(message);
			this.fundsExceptionAttributes= fundsExceptionAttributes;
		}
  

		public FundsException(String message , Throwable cause,
				  FundsExceptionAttributes fundsExceptionAttributes){
			super(message, cause);
			this.fundsExceptionAttributes= fundsExceptionAttributes;
		}

		public FundsExceptionAttributes getFundsExeceptionAttributes() {
			return fundsExceptionAttributes;
		}
}
