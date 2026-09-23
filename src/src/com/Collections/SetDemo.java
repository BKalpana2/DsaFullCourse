package src.com.Collections;

import java.util.*;

public class SetDemo {
public static void main(String[] args) {
	Set<Integer> hs=new LinkedHashSet();
	for(int i=0;i<=10;i++) {
		hs.add(i);
	}
	hs.add(8);
	hs.add(-2);
	hs.add(4);
	System.out.println(hs);

}
}
