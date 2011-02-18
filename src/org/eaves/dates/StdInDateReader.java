package org.eaves.dates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StdInDateReader {

	public static void main(String[] args) throws IOException {
		StdInDateReader reader = new StdInDateReader();
		reader.run();
	}

	// lazy input processing, any of the exceptions thrown from the input checking will force close the loop
	private void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DateFactory df = new DateFactory();
		
		while (true) {
			System.out.print(" >> ");
			String input = br.readLine();
			
			String[] dates = input.split(",");
			if (dates.length != 2) {
				System.out.println("Yo! Your input sucks.  Format required: DD MM YYYY, DD MM YYYY");
				continue;
			}
			
			Date d1 = df.createDate(dates[0].trim());
			Date d2 = df.createDate(dates[1].trim());
			
			int difference = d1.delta(d2);
			
			if (difference < 0) {
				System.out.print(d1 + ", " + d2);
			}
			else {
				System.out.print(d2 + ", " + d1);
			}
			System.out.println(", "+ Math.abs(difference));
			
		}
	}

}
