package Java_8_9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class _stream_ {

	public static void main(String[] args)
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("Python");
		a.add("Java");
		a.add("C++");
		a.add("C++");
		
		long val = a.stream().filter(str->str.length() > 5).count();
		
		//System.out.println("Yes Arraylist length "+val+" is less than 5");
		
		List<String> z = Arrays.asList("A","B");
		
		List<String> y = Arrays.asList("X","Y");
		
		Stream<String> s = Stream.concat(z.stream(), y.stream());
		s.forEach(st->{
			if(st.equals("A"))
			{
			System.out.println(st);
			}
		});
		
		
		
	}
}
