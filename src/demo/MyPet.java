package demo;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class MyPet {
//	public static void main(String[] args) {
//		String word = "Hello";
//		greet(word);
//		System.out.print(word);
//	}
//
//	public static void greet(String word) {
//		word = "Hey";
//		System.out.print(word + ":");
//	}

//	public static void main(String[] args) {
//		Variable variable = new Variable();
//		System.out.println(variable.i);
//		variable.a(variable.VAR.i);
//		System.out.println(variable.VAR.i);
//	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String url = scn.nextLine();
		if("/short_url/getH5DomainByBiz".equals(url) || "/short_url/isDomainAlive".equals(url) || "/short_url/isH5DomainAlive".equals(url) || "/short_url/changeDomain".equals(url) || "/short_url/complete".equals(url) || "/short_url/getLongUrlByShortUrl".equals(url)) {
			System.err.println("true");
		}
		String a = "abc";
		String b = "abc";
		System.out.println(a==b);
		

	}
}

class Variable {
	public static Variable VAR = null;

	public int i;

	protected void a(int p) {
		p = p * 5;
		System.out.println(p);
	}

	public Variable() {
		i = 5;
		Variable.VAR = this;
	}

}
