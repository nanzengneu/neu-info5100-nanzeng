package assignment5;

import java.util.Arrays;

class MyStack {
	int[] a;
	
	public MyStack(int[] sta) {
		this.a = sta;
	}
	
	public void push(int x) {
		int l = a.length;
		int[] b = new int[l+1];
		b[0] = x;
		for(int i = 0; i < l; i++){
			b[i + 1] = a[i];
		}
		a = b;
		System.out.println(Arrays.toString(a));
	}
	
	public void pop() {
		int l = a.length;
		int d = a[0];
		System.out.println(d);
		int[] c = new int[l - 1];
		for (int i = 1; i < l; i++){
			c[i-1] = a[i];
		}
		a = c;
		System.out.println(Arrays.toString(a));
	}
	
	public int top() {
		int c = a[0];
		return c;
	}
	
	public boolean empty() {
		if ( a.length == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args){
		int[] a = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 13;
		MyStack ms = new MyStack(a);
		System.out.println(ms.empty());
		System.out.println(ms.top());
		ms.push(5);
		ms.pop();
	}
	

}
