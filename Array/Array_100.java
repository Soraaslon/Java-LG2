
public class Array_100 {
	public static void main(String[] args) {
		Integer bidi[][] = new Integer[100][100];
		for(int x=0;x<100;x++) {
			for(int y=0;y<100;y++) {
				bidi[x][y]=x-y;
			}}
		for(int x=0;x<100;x++) {
			for(int y=0;y<100;y++) {
				System.out.print(bidi[x][y]+" | ");
			}}
		for(int x=0;x<100;x++) {
			for(int y=0;y<100;y++) {
				bidi[x][y]=(x*7)-(y*7);
			}}
		for(int x=0;x<100;x++) {
			for(int y=0;y<100;y++) {
				System.out.print(bidi[x][y]+" | ");
			}}
	}
}
