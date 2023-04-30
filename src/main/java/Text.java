import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    private final String text;

    public Text(final String mText) {
        text = mText;
    }

    public final String reverseNumber() {
        Pattern pattern = Pattern.compile("(^|\\s)(-\\d+)\\b");
        Matcher matcher = pattern.matcher(this.text);
        String res = matcher.replaceAll((x) -> (" " +
                new StringBuilder(x.group(2)).reverse()
                        .substring(0, x.group(2).length() - 1)));
        return res;
    }
}
