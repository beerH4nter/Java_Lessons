import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> arr = new ArrayList<>();
        arr.add("a1");
        arr.add("a2");
        arr.add("a3");
        arr.add("a2");
        arr.add("a2");
        arr.add("a5");
        arr.add("a1");

        long count = arr.stream().filter(x->x=="a1").count();
        System.out.println(count);

        boolean result = arr.stream().anyMatch(x -> x == "a3");
        System.out.println(result ? "found!" : "error");

        String elem = arr.stream().skip(arr.stream().count() - 1).collect(Collectors.toList()).toString();
        System.out.println(elem.isEmpty() ? "empty" : elem);

        List<String> list = arr.stream().skip(1).limit(2).collect(Collectors.toList());
        System.out.println(list);

        List<String> names = new ArrayList<>();
        names.add("Artyom");
        names.add("Andrey");
        names.add("Igor");
        names.add("Pasha");
        names.add("Dima");
        names.add("Lesha");
        names.add("Sasha");
        names.add("Sasha");
        names.add("Artyom");
        names.add("Igor");

        OptionalDouble averageNames = names.stream().mapToInt(x->x.length()).average();
        System.out.println(names.stream().distinct().collect(Collectors.toList()));
        System.out.println(averageNames.getAsDouble());


        list = names.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(list);

        long nums = Stream.of(1, 2, 3, 10, 17, 27, 0, 83, 6, 1, 9, 3).filter(x->x%2!=0).reduce((x,y)->x+y).orElse(0);
        System.out.println(nums);


    }
}