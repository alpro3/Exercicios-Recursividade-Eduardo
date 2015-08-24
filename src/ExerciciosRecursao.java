import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

import javax.management.RuntimeOperationsException;


public class ExerciciosRecursao {
	public static BigDecimal fatorial(int n){
		if(n<0)throw new RuntimeOperationsException(null,"Numero negativo!");
		if(n==0)return new BigDecimal("1");
		return new BigDecimal(""+n).multiply(fatorial(n-1));
	}
	
	public static long somatorio(int n){
		if(n==0)return 0;
		if(n<0)return n+somatorio(n+1);
		return n+somatorio(n-1);
	}
	
	public static BigDecimal fibonacci(int n){
		if(n<1)throw new RuntimeOperationsException(null,"Numero menor que 1!");
		return (n<=2 ? new BigDecimal("1") : new BigDecimal("0").add(fibonacci(n-1)).add(fibonacci(n-2)));
	}
	
	public static long somatorioKJ(int k, int j) {
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
	
	public static String convBase(String numero,int n,int b){
		if(n/b==0)return n+numero;
		int res = n/b;
		numero = n%b+numero;
		return convBase(numero, res,b);
	}
	
	public static String convBase(int n, int b){
		return convBase("", n, b);
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
	
	public static int nroDigit(int numero){
		
		int n = numero;
		if(n<0)n=n*-1;
		if(n!=0 && n/10==0)return 1;
		if(n>=1){
			return 1+nroDigit(n/10);
		}
		return (n==0 ? 1 : 0);
	}
	
	// A função abaixo recebe uma string str
	// e imprime todas permutações de str que começam com 
	// os i primeiros caracteres de str.
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
	
	public static String espelhaPalavra(String palavra, int i, int j){
		if(i==j || j-1==1)return palavra;
		String palavraAUX = palavra;
		char tmp;
		tmp = palavraAUX.charAt(i);
		StringBuffer sb = new StringBuffer(palavraAUX);
		sb.setCharAt(i, palavraAUX.charAt(j));
		sb.setCharAt(j, tmp);
		palavraAUX = sb.toString();
		return espelhaPalavra(palavraAUX, i+1, j-1);
	}
	
	public static String espelhaPalavra(String palavra){
		return espelhaPalavra(palavra, 0, palavra.length()-1);
	}
	
	public static String espelha(String palavra) {
	    if ((palavra == null) || (palavra.length() <= 1)) {
	        return palavra;
	    }
	    return espelha(palavra.substring(1)) + palavra.charAt(0);
	}
	
	public static ArrayList<String> substringGenerator(String palavra) {
		if(palavra.length()==0 || palavra==null)throw new NullPointerException();
		ArrayList<String> lista = new ArrayList<String>();
		if(palavra.length()==1){
			lista.add(palavra);
			return lista;
		}
		for (int i = 1; i <= palavra.length(); i++) {
			lista.add(palavra.substring(0,i));
		}
		lista.addAll(substringGenerator(palavra.substring(1,palavra.length())));
		return lista;
	}
	
	public static boolean find(String a, String b, int pos){
		if(a==null || b==null)return false;
		if(a.length()<b.length())return false;
		if(pos==(a.length()-b.length()))return false;
		int index = 0;
		for(int i = pos;i<pos+b.length();i++){
			if(a.charAt(i)==b.charAt(index)){
				if(index==b.length()-1){
					return true;
				}
				index++;
			}
		}
		return find(a, b, pos+1);	
	}
	
	public static void main(String[] args) {
		System.out.println("Fatorial de 1000 = " + fatorial(1000));
		System.out.println("\nSomatorio de 10000 = " + somatorio(10000));
		System.out.println("\nFibonacci de 10 = " + fibonacci(10));
		System.out.println("\nSomatorio entre 3 e 7 = " + somatorioKJ(1,7));
		System.out.println("\nÉ palindromo ANA = " + isPal("ANA"));
		System.out.println("\nÉ palindromo ANAB = " + isPal("ANAB"));
		System.out.println("\n4 na base binaria é = " + convBase2(4));
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println("\nSomatorio dos números do ArrayList é = " + somatorioArrayList(a));
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(3);
		ar.add(7);
		ar.add(5);
		ar.add(4);
		System.out.println("\nO maior numero no ArrayList é: " + findBiggest(ar));
		System.out.println("\naa é subpalavra de baab? "+findSubStr("baab", "aa"));
		System.out.println("\nQuantidade de digitos no numero 100: "+nroDigit(100));
		System.out.println("\nPermutações da palavra cão: "+permutacao("cão"));
		System.out.println("\nHello! espelhado é igual a "+espelhaPalavra("Hello!"));
		System.out.println("Hello! espelhado é igual a "+espelha("Hello!"));
		System.out.println("\nsubstrings da palavra EDUARDO = "+substringGenerator("EDUARDO"));
		System.out.println("\nFind sip em Mississipp: "+find("Mississipp", "sip", 0));
	}
	
	public static BigDecimal fibonacci2(int p){
		int pos = p-1;
		BigDecimal aux1 = new BigDecimal("1");
		BigDecimal aux2 =new BigDecimal("1");
		if(pos==1 || pos==2)return new BigDecimal("1");
		for (int i = 2; i <=pos; i++) {
			BigDecimal aux3 = new BigDecimal(""+aux1).add(aux2);
			aux1 = aux2;
			aux2 = aux3;
		}
		return aux2;
	}
}
