import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

    public static String getIpAddress(String text) {

        String ipAddress = "((25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9]))";

        Pattern pattern = Pattern.compile(ipAddress);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return matcher.group();
        } else {
            return "";
        }
    }
}