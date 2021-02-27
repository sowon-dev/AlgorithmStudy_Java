package hackerrank;
/*
The characters present in  are a, b, e, and f.
This means that  must consist of two of those characters and we must delete two others.
Our choices for characters to leave are [a,b], [a,e], [a, f], [b, e], [b, f] and [e, f].
If we delete e and f, the resulting string is babab.
This is a valid  as there are only two distinct characters (a and b),
and they are alternating within the string.
If we delete a and f, the resulting string is bebeeeb.
This is not a valid string  because there are consecutive e's present.
Removing them would leave consecutive b's, so this fails to produce a valid string .
Other cases are solved similarly.
babab is the longest string we can create.
 */
public class TwoCharacters {
  static int alternate(String s) {


  }

  public static void main(String[] args) {
    System.out.println(alternate("beabeefeab")+", ans: 5");
  }
}
