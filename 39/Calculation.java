import java.util.*;
import java.util.regex.*;

public class Calculation{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Expression.a = scan.nextInt();
		String exp = scan.next();

		String regex = "((?:[\\+\\-])?(?:[\\d]+\\*)?(?:a\\+\\+|\\+\\+a))";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(exp);

		// ArrayList of all expressions we find
		ArrayList list = new ArrayList();
		while(m.find()) list.add(m.group());

		// New expressions array
		Expression[] expressions = new Expression[list.size()];

		// Clean up expressions, create expression objects
		for(int i = 0; i < list.size(); i++){
			Expression e = new Expression();
			String[] ec = ((String) list.get(i)).split("\\*");
			
			if(ec.length == 1){ // Coefficient is 1
				if(ec[0].charAt(0) == '-') e.co = -1;
				else e.co = 1;

				if(ec[0].charAt(ec[0].length() - 1) == '+') e.pre = false;
				else e.pre = true;
			}else{
				e.co = Integer.parseInt(ec[0]);
				if(ec[1].charAt(0) == '+') e.pre = true;
				else e.pre = false;
			}

			expressions[i] = e;
		}

		Arrays.sort(expressions);

		int sum = 0;
		for(int i = 0; i < expressions.length; i++){
			sum += expressions[i].evaluate();
		}
		System.out.println(sum);
	}
}

class Expression implements Comparable<Expression>{

	static int a = 0;

	int co = -1;
	boolean pre = false;

	public Expression(){}

	public String toString(){
		return String.format("%d, is %s.", this.co, this.pre ? "prefix" : "postfix");
	}

	public int compareTo(Expression e){
		return this.co - e.co;
	}

	public int evaluate(){
		if(pre){
			Expression.a += 1;
			return co * Expression.a;
		}else{
			int v = Expression.a * co;
			Expression.a += 1;
			return v;
		}
	}
}