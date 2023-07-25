package Assignment1;
// to find the armstrong number between 100-999
public class ArmstrongNumRange {
public static void main(String[] args) {
	
	int num1=100;
	int num2=999;
	for(int i=100;i<=999;i++) {
		int temp=i;
		int sum=0;
		int last=0;
		while(temp>0) {
			last=temp%10;
			temp=temp/10;
			sum+=(Math.pow(last, 3));
		}
		if(i==sum){
			System.out.print(i+" ");
			}
	}
}
}
