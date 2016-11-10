package Day28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/30-regex-patterns
 */
public class Solution {

	public static void main(String[] args) {

		String[] arr = { "riya riya@gmail.com", "julia julia@julia.me", "julia sjulia@gmail.com", "julia julia@gmail.com",
				"samantha samantha@gmail.com", "tanya tanya@gmail.com" };

		List<String> list = new ArrayList<>();

		String gmailRegex = ".+@gmail.com";

		Pattern p = Pattern.compile(gmailRegex);

		Matcher m;

		for (String e : arr) {
			m = p.matcher(e);
			if (m.find())
				list.add(m.group().split(" ")[0]);
		}
		Collections.sort(list);
	}
}
