package bitManupulation51;

public class BitManupu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(update(49,7,1,3));
	}
	public static int update(int n,int m,int i,int j)
	{
		int max=~0;
		//set bits of n between i and j to 0
		int left=max-(1<<j-1);
		int right=i<<i-1;
		int mask=left|right;
		return (n&mask)|(m<<i);
	}
}
