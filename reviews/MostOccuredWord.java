public class MostOccuredWord {
	public static void main(String[] args) {
		String s = "India is my      country i love india i am Indian india is great we all are indian";
		String str[] = s.toLowerCase().split("\\s+"); // greedy space 
		int count=0,c=0;;
		String word="";
		for(int i =0;i<str.length-1;i++) {
			c=1;
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					c++;
				}
			}
			if(c>count) {
				count=c;
				word=str[i];
			}
		}
		System.out.print(word+" "+count);
		

	}

}
