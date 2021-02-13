public class Bubble_Sort {

	public static void main(String[] args) {

		int a[] = {1, 3, 2, 5, 7, 0, 1, 4, 0};
		boolean control;

		for (int d=0; d<a.length-1; d++){
			control = true;
			for(int e=d+1; e<a.length; e++) {
				if ((a[e])<(a[d])) {
					int x= a[e];
					a[e]= a[d];
					a[d]=x;
					control = false;
			}}
			if(control==true) {
				break;
			}
		}
		
		System.out.println("Os números digitados em ordem crescente são:");
		for (int d=0;d<a.length;d++) {
			System.out.println(a[d]);
		}
	}
}