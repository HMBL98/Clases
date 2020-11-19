import java.rmi.*;

	public class ClienteRMI
	{
		static int[][] parte_matriz(int[][] A,int inicio)
		{
			int N = A.length;
			int[][] M = new int[N/2][N];
			for (int i = 0; i < N/2; i++)
				for (int j = 0; j < N; j++)
					M[i][j] = A[i + inicio][j];
			return M;
		}
		static void acomoda_matriz(int[][] C,int[][] A,int renglon,int columna)
		{
			int N = A.length*2;
			for (int i = 0; i < N/2; i++)
				for (int j = 0; j < N/2; j++)
					C[i + renglon][j + columna] = A[i][j];
		}
	public static void main(String args[]) throws Exception
	{
		if (args.length != 1){
			System.err.println("Uso:");
			System.err.println("java ClienteRMI <N>");
			System.exit(0);
		}
		int N = Integer.valueOf(args[0]);
		int [][]A = new int[N][N];
		int [][]B = new int[N][N];
		
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				A[i][j] = 2*i-j;
				B[i][j] = 2*i+j;
			}
		}
		int[][] A1 = parte_matriz(A,0);
		int[][] A2 = parte_matriz(A,N/2);
		int[][] B1 = parte_matriz(B,0);
		int[][] B2 = parte_matriz(B,N/2);
		
		
		
		String url1 = "rmi://13.92.170.125/prueba";
		InterfaceRMI r1 = (InterfaceRMI)Naming.lookup(url1);
		
		String url2 = "rmi://13.90.72.47/prueba";
		InterfaceRMI r2 = (InterfaceRMI)Naming.lookup(url2);
		
		String url3 = "rmi://40.117.126.172/prueba";
		InterfaceRMI r3 = (InterfaceRMI)Naming.lookup(url3);
		
		String url4 = "rmi://52.168.70.235/prueba";
		InterfaceRMI r4 = (InterfaceRMI)Naming.lookup(url4);
		
		
		int[][] C1 = r1.multiplica_matrices(A1,B1);
		int[][] C2 = r2.multiplica_matrices(A1,B2);
		int[][] C3 = r3.multiplica_matrices(A2,B1);
		int[][] C4 = r4.multiplica_matrices(A2,B2);
		
		
		int[][] C = new int[N][N];
		acomoda_matriz(C,C1,0,0);
		acomoda_matriz(C,C2,0,N/2);
		acomoda_matriz(C,C3,N/2,0);
		acomoda_matriz(C,C4,N/2,N/2);
		
		
		if(N == 4){
			System.out.println("Matriz A");
			for(int i = 0; i < N; i++){
				for(int j = 0; j < N; j++){
					System.out.print(A[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("Matriz B");
			for(int i = 0; i < N; i++){
				for(int j = 0; j < N; j++){
					System.out.print(B[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("Matriz C");
			for(int i = 0; i < N; i++){
				for(int j = 0; j < N; j++){
					System.out.print(C[i][j] + " ");
				}
				System.out.println();
			}
			
			
		}else{
			long suma = 0;
			for(int i = 0; i < N; i++){
				for(int j = 0; j < N; j++){
					suma += C[i][j];
				}
			}
			System.out.println("Checksum = " + suma);
		}
		
		
		// en este caso  el objeto remoto se llama "prueba", notar que se utiliza el puerto default 1099
		

		// obtiene una referencia que "apunta" al objeto remoto asociado a la URL
		
	}
}
