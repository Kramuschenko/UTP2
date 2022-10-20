/**
 *
 *  @author Kramushchanka Mikhail S24124
 *
 */

package zad2;


/*<-- niezbędne importy */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<String> dest = Arrays.asList(
      "bleble bleble 2000",
      "WAW HAV 1200",
      "xxx yyy 789",
      "WAW DPS 2000",
      "WAW HKT 1000"
    );

    double ratePLNvsEUR = 4.30;
    List<String> result = dest.stream()
                                .filter(e -> e.split(" ")[0].equals("WAW"))
                                .map(e -> "to " + e.split(" ")[1] + " - price in PLN:\t" + (int)(Double.parseDouble( e.split(" ")[2])*ratePLNvsEUR))
                                .collect(Collectors.toList());

    for (String r : result)
        System.out.println(r);
  }
}
