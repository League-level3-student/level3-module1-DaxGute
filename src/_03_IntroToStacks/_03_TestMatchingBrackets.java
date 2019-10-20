package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		Stack<String> strang = new Stack<String>();
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == '}') {
				if (strang.isEmpty() == true) {
					return false;
				}
				strang.pop();
				System.out.println("pop");
			}else if(b.charAt(i) == '{') {
				strang.push("{");
				System.out.println("Push");
			}
		}
		return strang.isEmpty();
	
	}

}