import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;


public class ClaseRMI extends UnicastRemoteObject implements InterfaceRMI
{
  // es necesario que el contructor ClaseRMI() invoque el constructor de la superclase
  public ClaseRMI() throws RemoteException
  {
    super( );
  }
  public String mayusculas(String s) throws RemoteException
  {
    return s.toUpperCase();
  }
  public int suma(int a,int b)
  {
    return a + b;
  }
  public long checksum(int[][] m) throws RemoteException
  {
    long s = 0;
    for (int i = 0; i < m.length; i++)
      for (int j = 0; j < m[0].length; j++)
        s += m[i][j];
    return s;
  }
  public int[][] multiplica_matrices(int[][] A,int[][] B) throws RemoteException
	{
		int N = A.length*2;
		int[][] C = new int[N/2][N/2];
		for (int i = 0; i < N/2; i++)
			for (int j = 0; j < N/2; j++)
				for (int k = 0; k < N; k++)
					C[i][j] += A[i][k] * B[j][k];
		return C;
	}
}
