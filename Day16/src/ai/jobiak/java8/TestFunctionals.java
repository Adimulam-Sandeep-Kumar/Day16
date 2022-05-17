package ai.jobiak.java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class TestFunctionals {

	public static void main(String[] args) {
		
		Function<String,Integer>lengthFunction = (String str)->{return str.length();};
		
		int result = lengthFunction.apply("Jobiak.com");
		System.out.println(result);
		
		Predicate<Boolean> predicate = (Boolean)->{return true;};
	}

}
