package strings;

import java.util.Arrays;

public class StringTOCharAnother {

	public static void main(String[] args) {
       String s1="hello";
       char des[]=new char[4];
     s1.getChars(0, 4, des, 0);//start pos,endpos,chararrayname,startpos
	System.out.println(Arrays.toString(des));
	}

}
