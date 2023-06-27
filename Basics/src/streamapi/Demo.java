package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		memberNames.stream().filter((s) -> s.startsWith("A"))
        .forEach(System.out::println);

System.out.println("===================");
memberNames.stream().filter((s) -> s.startsWith("A"))
.map(String::toUpperCase)
.forEach(System.out::println);
System.out.println("===============");
memberNames.stream().sorted()
.map(String::toUpperCase)
.forEach(System.out::println);
System.out.println("===============");
List<String> memNamesInUppercase = memberNames.stream().sorted()
.map(String::toUpperCase)
.collect(Collectors.toList());
System.out.println(memNamesInUppercase);
System.out.println("====================");
boolean matchedResult = memberNames.stream()
.noneMatch((s) -> s.startsWith("A"));
System.out.println(matchedResult);


	}

}
