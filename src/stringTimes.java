public class stringTimes {
    public String strTimes(String str, int n) {
        String result = "";
        for (int i=0; i<n; i++) {
          result = result + str;  // could use += here
        }
        return result;
      }
}
