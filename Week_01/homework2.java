//旋转数组
class Solution{
	public void rotate(int[] num, int k){
		k %= num.length();
		reverse(num, 0, num.length() - 1);
		reverse(num, 0, k-1);
		reverse(num, k, num.length() - 1);
	public void reverse(int[] num, int start, int end){
		int temp;
		while (start < end){
			temp = num[start];
			num[start] = num[end];
			num[end] = temp;
			start++;
			end++;
		}
	}
	}
}
