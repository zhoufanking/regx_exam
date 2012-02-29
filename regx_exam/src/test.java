import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt="<link href=\"http://api.douban.com/review/1480000\" rel=\"self\"/>";

	    String re1=".*?";	// Non-greedy match on filler
	    String re2="(http:\\/\\/api\\.douban\\.com\\/review\\/1480000)";	// HTTP URL 1

	    Pattern p = Pattern.compile(re1+re2,Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
	    Matcher m = p.matcher(txt);
	    if (m.find())
	    {
	        String httpurl1=m.group(1);
	        System.out.print(httpurl1.toString()+"\n");
	    }

	}

}
