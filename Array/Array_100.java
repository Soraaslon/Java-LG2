
public class Array_100 {
	public static void main(String[] args) {
		Integer bidi[][] = new Integer[100][100];
		for(int x=0;x<100;x++) {
			for(int y=0;y<100;y++) {
				bidi[x][y]=x-y;
			}}
		for(int x=0;x<100;x++) {
			for(int y=0;y<100;y++) {
				if((array2d[a][b] <= -1)&&(array2d[a][b] >= -9)) {
					System.out.print("|  "+array2d[a][b]+" |");
				}
				
				if((array2d[a][b] >= 0)&&(9 >= array2d[a][b])){
					System.out.print("|  "+array2d[a][b]+"  |");
				}
				
				if((array2d[a][b] >= 10)&&(99 >= array2d[a][b])){
					System.out.print("|  "+array2d[a][b]+" |");
				}
				
				if((array2d[a][b] <= -10)&&(-99 <= array2d[a][b])){
					System.out.print("| "+array2d[a][b]+" |");
				}
			}
			System.out.println();
		}
		for(int x=0;x<100;x++) {
			for(int y=0;y<100;y++) {
				bidi[x][y]=(x*7)-(y*7);
			}}
		for(int x=0;x<100;x++) {
			for(int y=0;y<100;y++) {
				if((array2d[a][b] >= 100)||((array2d[a][b] >= -99)&&(array2d[a][b] <= -10))) {
					System.out.print("| "+array2d[a][b]+" |");
				}
				
				if((array2d[a][b] >= 0)&&(array2d[a][b] < 10)) {
					System.out.print("|  "+array2d[a][b]+"  |");
				}
				if(((array2d[a][b] >= 10)&&(array2d[a][b] <= 99))||((array2d[a][b] <= -1)&&(array2d[a][b] >= -9))) {
					System.out.print("|  "+array2d[a][b]+" |");
				}
				if(array2d[a][b] <= -100) {
					System.out.print("| "+array2d[a][b]+"|");
				}
			}
			System.out.println();
		}
	}
}
