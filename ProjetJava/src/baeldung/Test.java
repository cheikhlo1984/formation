package baeldung;

public class Test {

/*	Main main = new Main();
	JavaBaeldung baeldung = new JavaBaeldung();

	@org.junit.Test
	public void testcheckIfExist() {
		boolean b = main.checkIfExist("hello there, Baeldung");
		System.out.println(b);
		assertTrue(b);
	}
	
	@org.junit.Test
	public void givenString_whenGetUniqueCharacterSubstringCalled_thenResultFoundAsExpected() {
	    assertEquals("", baeldung.getUniqueCharacterSubstring(""));
	    assertEquals("A", baeldung.getUniqueCharacterSubstring("A"));
	    assertEquals("ABCDEF", baeldung.getUniqueCharacterSubstring("AABCDEF"));
	    assertEquals("ABCDEF", baeldung.getUniqueCharacterSubstring("ABCDEFF"));
	    assertEquals("NGISAWE", baeldung.getUniqueCharacterSubstring("CODINGISAWESOME"));
	    assertEquals("be coding", baeldung.getUniqueCharacterSubstring("always be coding"));
	}
	
	@org.junit.Test
	public void testremoveRepeteadCharacter() {

		assertEquals("abcd", baeldung.removeRepeteadCharacter("abbbcdddd"));
	}
	
	@org.junit.Test
	public void findWord() {

		    String theString;
		    theString = "To be, or not to be: that is the question: "
		      + "Whether 'tis nobler in the mind to suffer "
		      + "The slings and arrows of outrageous fortune, "
		      + "Or to take arms against a sea of troubles, "
		      + "And by opposing end them? To die: to sleep; "
		      + "No more; and by a sleep to say we end "
		      + "The heart-ache and the thousand natural shocks "
		      + "That flesh is heir to, 'tis a consummation "
		      + "Devoutly to be wish'd. To die, to sleep; "
		      + "To sleep: perchance to dream: ay, there's the rub: "
		      + "For in that sleep of death what dreams may come,";
		 
		    List<Integer> expectedResult = Arrays.asList(7, 122, 130, 221, 438);
		    List<Integer> actualResult = baeldung.findWord(theString, "or");
		    assertEquals(expectedResult, actualResult);
	}
	
	@org.junit.Test
	public void test_getToken() {

		List<String> expectedTokensForString = Arrays.asList(
				"Welcome" , "to" , "baeldung.com" );
		String str = "Welcome,to,baeldung.com";
		List<String> actualTokens = baeldung.getToken(str);

		assertEquals( expectedTokensForString, actualTokens );
	}
	
//	@org.junit.Test
//	public void givenString_whenParsingInt_shouldConvertToInt() {
//	    String givenString = "42";
//	 
//	    int result = Integer.parseInt(givenString);
//	 
//	   // assertThat(result).isEqualTo(42);
//	assertThat(text, equalTo(originalString));
//	}
	
	@org.junit.Test
	public void test_isAllElementAreTheSame() {

		List<String> notAllEqualList = Arrays.asList("Jack", "James", "Sam", "James");
		List<String> emptyList = Arrays.asList();
		List<String> allEqualList = Arrays.asList("Jack", "Jack", "Jack", "Jack");
		assertTrue(baeldung.isAllElementAreTheSame(emptyList));
		assertTrue(baeldung.isAllElementAreTheSame(allEqualList));
		assertFalse(baeldung.isAllElementAreTheSame(notAllEqualList));
		
	}
	
	@org.junit.Test
	public void test_customProjectQueue() {

		CustomProjectQueue<Integer> customQueue = new CustomProjectQueue<>();
		customQueue.add(7);
		customQueue.add(5);
		int first = customQueue.poll();
		int second = customQueue.poll();
		assertEquals(7, first);
		assertEquals(5, second);
		
		PriorityQueue<Integer> integerQueue = new PriorityQueue<>();
		 
		integerQueue.add(9);
		integerQueue.add(2);
		integerQueue.add(4);
		 
		int firstp = integerQueue.poll();
		int secondp = integerQueue.poll();
		int third = integerQueue.poll();
		 
		assertEquals(2, firstp);
		assertEquals(4, secondp);
		assertEquals(9, third);
	}
	
	@org.junit.Test
	public void test_remove() {
	
		Collection<String> names = new ArrayList<>();
		
		names.add("John");
		names.add("Ana");
		names.add("Mary");
		names.add("Anthony");
		names.add("Mark");
		
		Iterator<String> iter = names.iterator();
		while(iter.hasNext()) {
			String e = iter.next();
			if(e.startsWith("A")) {
				iter.remove();
			}
		}
	
		assertEquals(3, names.size());
	}*/
}