package fibonacci_modified;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		String s;
		String[] s1;
		BigInteger ans,a1,a2,a,b;
		int n;
		s=br.readLine();
		s1=s.split(" ");
		a=new BigInteger(s1[0]);
		b=new BigInteger(s1[1]);
		n=Integer.parseInt(s1[2]);
		ans=a.multiply(a).multiply(b);
		a2=b;
		a1=a;
		for(int i=3;i<=n;i++){
			ans=(a2.multiply(a2));
			ans=ans.add(a1);
			//out.println("a1: "+a1+" a2: "+a2);
			a1=a2;
			a2=ans;
		}
		out.println(ans);
		out.close();
	}

}
