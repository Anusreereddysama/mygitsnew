import java.util.*;
class Adj_Node{
	public  static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a[][]=new int[10][10];
		int n, root,i,j;
		System.out.print("Enter the no of nodes:");
		 n=s.nextInt();
		System.out.print("Enter the adjacency matrix:");
		for(i=1;i<=n;i++){
			for(j=1;j<=n;j++){
				System.out.print("Enter connection of: "+i+ "-->"+j+":");
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter the root node:");
		root=s.nextInt();
		adj(root , n , a);
	}
	public static void adj(int k, int n , int a[][]){
		int j;
		System.out.println("Adjacent nodes of root node "+k);
		for(j=1;j<=n;j++){
			if(a[k][j]==1 ||a[j][k]==1){
				System.out.print(j+"  ");
			}
		}
	}
}                                                                                                                                                                        