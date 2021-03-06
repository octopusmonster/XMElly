package ee.ellytr.xmelly.parser;

import ee.ellytr.xmelly.Parser;

public class IntegerParser implements Parser<Integer> {

  @Override
  public Integer parse(String input) {
    try {
      return Integer.parseInt(input);
    } catch (NumberFormatException e) {
      return null;
    }
  }

}
