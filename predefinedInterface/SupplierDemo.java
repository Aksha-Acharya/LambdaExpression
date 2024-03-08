package com.demo.lambda.predefinedInterface;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class Supply implements Supplier<LocalDateTime>{

	@Override
	public LocalDateTime get() {
		return LocalDateTime.now();
				
	}
	
}
public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<LocalDateTime> sup=()->LocalDateTime.now();
		sup.get();
	}

}
