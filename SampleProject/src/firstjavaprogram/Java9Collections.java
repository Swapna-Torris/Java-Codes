package firstjavaprogram;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java9Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numList = Stream.of(2,34,56,78,90,13).takeWhile(i -> (i%2 == 0)).collect(Collectors.toList());
		System.out.println(numList);

	}

}

