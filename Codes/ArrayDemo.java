
public class ArrayDemo {

	public static void main(String[] args) {
		String fruits[]={"Orange","Apple"};
		for(String fruit: fruits){
			System.out.println(fruit);
		}
		/*boolean x = false;
		while(x=true){
			
		}*/
		/*for(int i = 0; i<fruits.length; i++){
			System.out.println(fruits[i]);
		}*/
		int []e[] = new int[3][2];
		int [][]e1 = new int[3][2];
		int e2[][] = new int[3][3];
		int d[][][] = {{{1,2,3},{3,5,6,7,8,9,10},{1,3,4,6,7,8}}};
		//int d[][] = {{10,20,40},{1,2,4,5,6,7,8,9},{1,2,88,77,66}};
		//int d[][]= new int[3][];
		//d[0] = new int[10];
		//d[1] = new int[20];
		//d[2] = new int[30];
		//d[2][10]= 1;
		//d[2][11]= 1;
		//d[2][12]= 1;
		for(int i[][] : d){
			for(int j[] : i){
				for(int k : j){
				System.out.print(k+" ");
				}
			}
			//System.out.println();
		}
		/*for(int i = 0; i<d.length; i++){
			for(int j = 0; j<d[i].length; j++){
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}*/

	}

}
