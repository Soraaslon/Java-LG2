
public class Array_100_Inverso {
	public static void main(String[] args) {
		Integer bidi[][] = new Integer[50][100];
		for(int x=0,xi=49;x<50;x++,xi--) {
			for(int y=0,yi=99;y<100;y++,yi--) {
				bidi[x][y]=xi+yi;
		}}
	}
}
