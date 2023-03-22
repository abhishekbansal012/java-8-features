package com.pixlaunch.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author abhishekbansal
 */
public class Utility {

  Random random = new Random();

  public List<String> createArray(int count) {
    ArrayList<String> arr = new ArrayList<>();
    for (int i = 0; i < count; i++) {
      arr.add(generateRandomString());
    }
    return arr;
  }


  public String generateRandomString() {
    int leftLimit = 48; // numeral '0'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 10;
    return random.ints(leftLimit, rightLimit + 1)
        .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
        .limit(targetStringLength)
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
  }
}
