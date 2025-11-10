public class TimeCalc {
    public static void main(String[] args) {
    
        String Time_string = args[0];
        int new_minuets = Integer.parseInt(args[1]);
        int hh = Integer.parseInt("" + Time_string.charAt(0) + Time_string.charAt(1));
        int mm = Integer.parseInt("" + Time_string.charAt(3) + Time_string.charAt(4));
        int totalMin = (hh*60) + mm + new_minuets;
        int totalH = totalMin/60;
        int newH = totalH%24;
        int newnew = totalMin - (totalH*60);
        String hourString = String.valueOf(newH);
        String minuteString = String.valueOf(newnew);
        if (newnew < 10) {
           minuteString = "0" + minuteString;
        }
        if (newH < 10){
            hourString = "0" + hourString;
        }
         System.out.println(hourString + ":" + minuteString);
    }
}
