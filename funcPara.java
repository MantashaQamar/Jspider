package javaqueations;

public class funcPara {
static int total(int p, int c, int m, int o) {
	return p+c+m+o;
}
static void percentage(int t) {
	float per = (t/400.0f)*100;
	System.out.println(per);
}
public static void main(String[]args) {
	int sum = total(80,80,80,80);
	percentage(sum);
}
}
