package Java_8_9;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _collector_ {

	public static void main(String[] args) {
		List<String> ls = Arrays.asList("Python","Python2", "Java", "Java", "C", "C");
		List<String> m = ls.stream().
				filter(str -> str.length() > 5)
				.collect(Collectors.toList());
		m.forEach(System.out::println);
				
	}

	public static void group_by() {
		List<String> ls = Arrays.asList("Python", "Java", "Java", "C", "C");
		Map<String, Long> m = ls.stream().collect(
				Collectors.groupingBy(Function.identity(),
						Collectors.counting()));
		System.out.println(m);
	}

}
