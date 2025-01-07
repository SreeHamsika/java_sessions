public class example1 {
    int countXX(String str) {
        int count=0;
        for(int i=0;i<str.length()-1;i++){
          String  s = str.substring(i,i+2);
          if(s.equals("xx")){
            count++;
          }
        }
        return count;
      }
}
