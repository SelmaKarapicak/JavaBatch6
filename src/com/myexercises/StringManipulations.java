package com.myexercises;

public class StringManipulations {

	public static void main(String[] args) {
		// toLowerCase() AHmet
				// toupperCase() turker
				// equals() gulsum ( boolean true/ false
				String turker = "ScHoOL";
				System.out.println(turker.toLowerCase());
				String Gulsum = "kaysErili";
				System.out.println(Gulsum.toUpperCase());
				String ahmet = "smart";
				String ahmet2 = "not smart";
				System.out.println(ahmet.contentEquals(ahmet2));
				// ignoreCase() Ahmet
				// trim() Turker
				// concat() Gulsum
				String yunus = new String("I feel tired");
				if (yunus.equalsIgnoreCase("i FeEl tIrEd")) {
					System.out.println(yunus);
				}
				String reyhan = "   I m going to school ";
				System.out.println(reyhan.trim());
				String todo = "Java";
				String actual = " is good language";
				System.out.println(todo.concat(actual));
				// boolean contains Ahmet
				// startsWith Turker
				// endWith Gulsum
				// length Selma
				// isEmpty Reyhan
				String ali = " Bugun hava cok guzel";
				boolean ali2 = ali.contains("sabah");
				System.out.println(ali2);
				String balik = "hamsiyi cok ozledim.";
				System.out.println(balik.startsWith("hamsiyi"));
				System.out.println(balik.endsWith("ozledim."));
				String ekler = "en sevdigim tatli";
				System.out.println("lenghth of string: " + ekler.length()); // String oldugu zaman index degil actual numberdan
																			// baslanmali.
				String x = "12345";
				boolean empty = x.isEmpty();
				System.out.println(empty);
				// charAt(9) Ahmet
				// indexOf () Turker
				// substring() Gulsum
				// substring (int being int end) Selma
				// replace Reyhan
				// replaceAll (String regex, Stering replacement Reyhan
				// Split (String regex) Selma
				String setup="Gulsum abla teaching us";
				char s1=setup.charAt(10);
				System.out.println(s1);
				String dallas="raining";
				int dallas1=dallas.indexOf("i");
				System.out.println(dallas1);
				String address="usa, texas, dallas ";
				System.out.println("I live in state "+ address.substring(5,10));
				System.out.println("I live in country "+address.substring(0,3));
				System.out.println("I live in city "+address.substring(12,18));
				String ayse="welcome to Florida";
				System.out.println(ayse.substring(8));
				String name="Reyhan Barindik";
				String name1=name.replace('a', 'e');
				System.out.println(name1);
				String name2=name.replaceAll("Barindik", "Idiz");
				System.out.println(name2);
				String sentence="Hello88e7e3e4Zoom";
				String []x1=sentence.split("e");
				//for (String arr:x1) {
					//System.out.print(arr+" ");
				//}
			for (int i=0;i<x1.length;i++) {
				System.out.print (x1[i]+" ");
			}
				//System.out.println(x1);
			}
			

	}


