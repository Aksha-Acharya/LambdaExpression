package com.demo.lambda;

public class LambdaDemo {
	
	public static void main(String[] args) {
//	
		Shape circle=(p)->{
			System.out.println("drawing circle...."+p);
		};
//		
		print(circle);
//		circle.draw();
		
		Addable add=(int a ,int b)->{return(a+b);};
		System.out.println(add.addition(7, 8));
		//print((p2)->System.out.println("darwaing circle.."+ p2));
	}
	
	private static void print(Shape shape) {
		shape.draw("Hello world");
	}

}
