import java.util.ArrayList;


public class ExerciciosRecursao {
	public static int fatorial(int n){
		if(n<0)return -1;
		if(n==0)return 1;
		if(n==1)return 1;
		return n*fatorial(n-1);
	}
	
	public static int somatorio(int n){
		if(n==0)return 0;
		if(n<0)return n+somatorio(n+1);
		return n+somatorio(n-1);
	}
	
	public static int fibonacci(int n){
		if(n<=0)return -1;
		if(n==1)return 1;
		if(n==2)return 1;
		else return fibonacci(n-1)+fibonacci(n-2);
	}
	
	public static int somatorioKJ(int k, int j) {
		int maior, menor;
		if(k>=j){
			maior = k;
			menor = j;
		}
		else{
			maior = j;
			menor = k;
		}
		if(menor==maior)return maior;
		return menor+somatorioKJ(menor+1, maior);
	}
	
	public static boolean isPal(String palavra, int i, int j){
		if(i==j)return true;
		if(palavra.charAt(i)==palavra.charAt(j)){
			if(j-i==1)return true;
			return isPal(palavra, i+1, j-1);
		}
		return false;
	}
	
	public static boolean isPal(String palavra){
		if(palavra==null)return false;
		if(palavra.isEmpty() || palavra.length()==1)return true;
		return isPal(palavra, 0,palavra.length()-1);
	}
	
	public static String convBase2(String binario,int n){
		if(n==0)return binario;
		int res = n/2;
		if(n%2==0)binario = 0+binario;
		else binario = 1+binario;
		return convBase2(binario, res);
	}
	
	public static String convBase2(int n){
		return convBase2("", n);
	}
	
	public static int somatorioArrayList(ArrayList<Integer> a, int pos){
		if(pos+1>a.size())return 0;
		return a.get(pos)+somatorioArrayList(a,pos+1);
	}
	
	public static int somatorioArrayList(ArrayList<Integer> a){
		return somatorioArrayList(a,0);
	}
	
	public static int findBiggest(ArrayList<Integer> ar, int n, int pos){
		if(pos==ar.size())return n;
		if(ar.get(pos)>n)n = ar.get(pos);
		return findBiggest(ar, n, pos+1);
	}
	
	public static int findBiggest(ArrayList<Integer> ar){
		if(ar==null)throw new NullPointerException("O ArrayList está null!");
		return findBiggest(ar, ar.get(0), 0);
	}
	
	public static boolean findSubStr(String a, String b){
		if(a.length()<b.length())return false;
		String aux = a.substring(0,b.length());
		if(aux.equals(b))return true;
		return findSubStr(a.substring(1,a.length()), b);
	}
	
	public static int nroDigit(int n){
		if(n>=1){
			return 1+nroDigit(n/10);
		}
		return 0;
	}
	
	public static ArrayList<String> permutations(String s){
		
		return null;
	}
	// A função abaixo recebe uma cadeia de caracteres str 
	// e imprime todas permutações de str que começam com 
	// os k primeiros caracteres de str. No fim da execução 
	// da função, a cadeia str é idêntica à original.
	public static void permutacao(ArrayList<String>palavras, String str, int i){
		int j, comprimento;
		comprimento = str.length();
		if (i == comprimento) {
			palavras.add(str);		}
		else {
			for (j = i; j < comprimento; j++) {
				char tmp;
				int p1=i, p2=j;
				tmp = str.charAt(p1);
				StringBuffer sb = new StringBuffer(str);
				sb.setCharAt(p1, str.charAt(p2));
				sb.setCharAt(p2, tmp);
				str = sb.toString();
				permutacao(palavras, str, i+1);
			}
		}
	}
	
	public static ArrayList<String> permutacao(String str){
		ArrayList<String> palavras = new ArrayList<String>();
		permutacao(palavras, str, 0);
		return palavras;
	}
		
	public static void main(String[] args) {
		System.out.println("Fatorial de 3 = " + fatorial(3));
		System.out.println();
		System.out.println("Somatorio de 5 = " + somatorio(5));
		System.out.println();
		System.out.println("Fibonacci de 5 = " + fibonacci(5));
		System.out.println();
		System.out.println("Somatorio entre 3 e 7 = " + somatorioKJ(1,7));
		System.out.println();
		System.out.println("É palindromo ANA = " + isPal("ANA"));
		System.out.println();
		System.out.println("É palindromo ANAB = " + isPal("ANAB"));
		System.out.println();
		System.out.println("4 na base binaria é = " + convBase2(4));
		ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.println();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println("Somatorio dos números do ArrayList é = " + somatorioArrayList(a));
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(3);
		ar.add(7);
		ar.add(5);
		ar.add(4);
		System.out.println();
		System.out.println("O maior numero no ArrayList é: " + findBiggest(ar));
		System.out.println();
		System.out.println("aa é subpalavra de baab? "+findSubStr("baab", "aa"));
		System.out.println();
		System.out.println("Quantidade de digitos no numero 100: "+nroDigit(100));
		System.out.println();
		System.out.println("Permutações da palavra cão: "+permutacao("cão"));
	}
}
