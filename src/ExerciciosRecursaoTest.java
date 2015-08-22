import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.Test;


public class ExerciciosRecursaoTest {
	/*1. Para a Implementação do método recursivo que calcula o fatorial de um número n passado como parâmetro.
	Teste sua implementação para 1, 4, 8, 16, 100, 1000, 10000.*/
	@Test
	public void fatorialTeste() {
		BigDecimal  valorEsperado, valorRetornado;
		valorEsperado = new BigDecimal("1");
		valorRetornado = ExerciciosRecursao.fatorial(1);
		assertEquals("Fatorial de 1: ",valorEsperado, valorRetornado);
		valorEsperado = new BigDecimal("24");
		valorRetornado = ExerciciosRecursao.fatorial(4);
		assertEquals("Fatorial de 4: ",valorEsperado, valorRetornado);
		valorEsperado = new BigDecimal("40320");
		valorRetornado = ExerciciosRecursao.fatorial(8);
		assertEquals("Fatorial de 8: ",valorEsperado, valorRetornado);
		valorEsperado = new BigDecimal("20922789888000");
		valorRetornado = ExerciciosRecursao.fatorial(16);
		assertEquals("Fatorial de 16: ",valorEsperado, valorRetornado);
		valorEsperado = new BigDecimal("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000");
		valorRetornado = ExerciciosRecursao.fatorial(100);
		assertEquals("Fatorial de 100: ",valorEsperado, valorRetornado);
		valorEsperado = new BigDecimal("402387260077093773543702433923003985719374864210714632543799910429938512398629020592044208486969404800479988610197196058631666872994808558901323829669944590997424504087073759918823627727188732519779505950995276120874975462497043601418278094646496291056393887437886487337119181045825783647849977012476632889835955735432513185323958463075557409114262417474349347553428646576611667797396668820291207379143853719588249808126867838374559731746136085379534524221586593201928090878297308431392844403281231558611036976801357304216168747609675871348312025478589320767169132448426236131412508780208000261683151027341827977704784635868170164365024153691398281264810213092761244896359928705114964975419909342221566832572080821333186116811553615836546984046708975602900950537616475847728421889679646244945160765353408198901385442487984959953319101723355556602139450399736280750137837615307127761926849034352625200015888535147331611702103968175921510907788019393178114194545257223865541461062892187960223838971476088506276862967146674697562911234082439208160153780889893964518263243671616762179168909779911903754031274622289988005195444414282012187361745992642956581746628302955570299024324153181617210465832036786906117260158783520751516284225540265170483304226143974286933061690897968482590125458327168226458066526769958652682272807075781391858178889652208164348344825993266043367660176999612831860788386150279465955131156552036093988180612138558600301435694527224206344631797460594682573103790084024432438465657245014402821885252470935190620929023136493273497565513958720559654228749774011413346962715422845862377387538230483865688976461927383814900140767310446640259899490222221765904339901886018566526485061799702356193897017860040811889729918311021171229845901641921068884387121855646124960798722908519296819372388642614839657382291123125024186649353143970137428531926649875337218940694281434118520158014123344828015051399694290153483077644569099073152433278288269864602789864321139083506217095002597389863554277196742822248757586765752344220207573630569498825087968928162753848863396909959826280956121450994871701244516461260379029309120889086942028510640182154399457156805941872748998094254742173582401063677404595741785160829230135358081840096996372524230560855903700624271243416909004153690105933983835777939410970027753472000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
		valorRetornado = ExerciciosRecursao.fatorial(1000);
		assertEquals("Fatorial de 1000: ",valorEsperado, valorRetornado);
		//valorEsperado = new BigDecimal("");
		//valorRetornado = ExerciciosRecursao.fatorial(10000);
		//assertEquals("Fatorial de 1000: ",valorEsperado, valorRetornado);
	}
	
	
	/*2. Para a Implementação do método recursivo que calcula o somatório de um número número n passado como parâmetro.
	Teste sua implementação para 1 , 4, 8, 16, 100, 1000, 10000.*/
	@Test
	public void somatorioTeste(){
		long  valorEsperado, valorRetornado;
		valorEsperado = 1;
		valorRetornado = ExerciciosRecursao.somatorio(1);
		assertEquals("Somatorio de 1: ",valorEsperado, valorRetornado);
		valorEsperado = 10;
		valorRetornado = ExerciciosRecursao.somatorio(4);
		assertEquals("Somatorio de 4: ",valorEsperado, valorRetornado);
		valorEsperado = 36;
		valorRetornado = ExerciciosRecursao.somatorio(8);
		assertEquals("Somatorio de 8: ",valorEsperado, valorRetornado);
		valorEsperado = 136;
		valorRetornado = ExerciciosRecursao.somatorio(16);
		assertEquals("Somatorio de 16: ",valorEsperado, valorRetornado);
		valorEsperado = 5050;
		valorRetornado = ExerciciosRecursao.somatorio(100);
		assertEquals("Somatorio de 100: ",valorEsperado, valorRetornado);
		valorEsperado = 500500;
		valorRetornado = ExerciciosRecursao.somatorio(1000);
		assertEquals("Somatorio de 1000: ",valorEsperado, valorRetornado);
		//valorEsperado = 50005000;
		//valorRetornado = ExerciciosRecursao.somatorio(10000);
		//assertEquals("Somatorio de 10000: ",valorEsperado, valorRetornado);
	}
	
	/*3. Para a Implementação do método recursivo que calcula o n-ésimo número da sequência de Fibonacci.
	Teste sua implementação para uma lista com 4, 8, 16, 32, 64.*/
	@Test
	public void fibonacciTeste(){
		BigDecimal valorEsperado, valorRetornado;
		valorEsperado =  new BigDecimal("3");
		valorRetornado = ExerciciosRecursao.fibonacci(4);
		assertEquals("Fibonacci de 4: ",valorEsperado, valorRetornado);
		valorEsperado =  new BigDecimal(21);
		valorRetornado = ExerciciosRecursao.fibonacci(8);
		assertEquals("Fibonacci de 8: ",valorEsperado, valorRetornado);
		valorEsperado =  new BigDecimal("987");
		valorRetornado = ExerciciosRecursao.fibonacci(16);
		assertEquals("Fibonacci de 16: ",valorEsperado, valorRetornado);
		valorEsperado =  new BigDecimal("2178309");
		valorRetornado = ExerciciosRecursao.fibonacci(32);
		assertEquals("Fibonacci de 32: ",valorEsperado, valorRetornado);
		//valorEsperado =  new BigDecimal("10610209857723");
		//valorRetornado = ExerciciosRecursao.fibonacci(64);
		//assertEquals("Fibonacci de 64: ",valorEsperado, valorRetornado);
	}
	/*4. Para a Implementação do método recursivo que calcula  o somatório de um número k à um número j, passados como parâmetro.
	Teste sua implementação para 1 e 10, 4 e 32, 8 e 64, 16 e 256, 100 e 1000, 1000 e 10000.*/
	@Test
	public void somatorioKJTeste(){
		long  valorEsperado, valorRetornado;
		valorEsperado = 55;
		valorRetornado = ExerciciosRecursao.somatorioKJ(1, 10);
		assertEquals("Somatorio de 1 e 10: ", valorEsperado, valorRetornado);
		valorEsperado = 522;
		valorRetornado = ExerciciosRecursao.somatorioKJ(4, 32);
		assertEquals("Somatorio de 4 e 32: ", valorEsperado, valorRetornado);
		valorEsperado = 2052;
		valorRetornado = ExerciciosRecursao.somatorioKJ(8, 64);
		assertEquals("Somatorio de 8 e 64: ", valorEsperado, valorRetornado);
		valorEsperado = 32776;
		valorRetornado = ExerciciosRecursao.somatorioKJ(16, 256);
		assertEquals("Somatorio de 16 e 256: ", valorEsperado, valorRetornado);
		valorEsperado = 495550;
		valorRetornado = ExerciciosRecursao.somatorioKJ(100, 1000);
		assertEquals("Somatorio de 100 e 1000: ", valorEsperado, valorRetornado);
		//valorEsperado = 55;
		//valorRetornado = ExerciciosRecursao.somatorioKJ(1000, 10000);
		//assertEquals("Somatorio de 1000 e 10000: ", valorEsperado, valorRetornado);
	}
	
	public ArrayList<Integer> criaListaDeInteiros(int n){
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for (int i = 1; i <=n; i++) {
			lista.add(i);
		}
		return lista;
	}
	
	/*5. Para a Implementação do método recursivo que calcula o somatório dos números contidos em um ArrayList de inteiros, passado como parâmetro.
	Teste sua implementação para uma lista com 4, 8, 16, 100, 1000, 10000 inteiros*/
	@Test
	public void somaArrayListTeste(){
		int valorEsperado, valorRetornado;
		valorEsperado = 10;
		ArrayList<Integer> lista = criaListaDeInteiros(4);
		valorRetornado = ExerciciosRecursao.somatorioArrayList(lista);
		assertEquals("Somatorio da lista deve ser 4: ", valorEsperado, valorRetornado);
		valorEsperado = 36;
		lista = criaListaDeInteiros(8);
		valorRetornado = ExerciciosRecursao.somatorioArrayList(lista);
		assertEquals("Somatorio da lista deve ser 4: ", valorEsperado, valorRetornado);
		valorEsperado = 136;
		lista = criaListaDeInteiros(16);
		valorRetornado = ExerciciosRecursao.somatorioArrayList(lista);
		assertEquals("Somatorio da lista deve ser 4: ", valorEsperado, valorRetornado);
		valorEsperado = 5050;
		lista = criaListaDeInteiros(100);
		valorRetornado = ExerciciosRecursao.somatorioArrayList(lista);
		assertEquals("Somatorio da lista deve ser 4: ", valorEsperado, valorRetornado);
		valorEsperado = 500500;
		lista = criaListaDeInteiros(1000);
		valorRetornado = ExerciciosRecursao.somatorioArrayList(lista);
		assertEquals("Somatorio da lista deve ser 4: ", valorEsperado, valorRetornado);
		//valorEsperado = 50005000;
		//lista = criaListaDeInteiros(10000);
		//valorRetornado = ExerciciosRecursao.somatorioArrayList(lista);
		//assertEquals("Somatorio da lista deve ser 4: ", valorEsperado, valorRetornado);
	}
	
	/*6.1. Teste método recursivo para encontrar o maior elemento de um ArrayList. 
	int findBiggest(ArrayList<Integer> ar)*/
	@Test
	public void findBiggestTeste(){
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(10);
		lista.add(9);
		lista.add(8);
		lista.add(7);
		lista.add(4);
		lista.add(6);
		int valorEsperado, valorRetornado;
		valorEsperado = 10;
		valorRetornado = ExerciciosRecursao.findBiggest(lista);
		assertEquals("Maior valor na lista: ", valorEsperado, valorRetornado);
	}
	/*6.2. Teste o método recursivo que recebe um String em retorna true se este String for um palíndrome, false caso contrário. 
	boolean isPal(String s)*/
	@Test
	public void isPalTeste(){
		boolean valorEsperado, valorRetornado;
		valorEsperado = true;
		valorRetornado = ExerciciosRecursao.isPal("ANA");
		assertEquals("Verificar se ANA é palindromo: ", valorEsperado ,valorRetornado);
		valorEsperado = false;
		valorRetornado = ExerciciosRecursao.isPal("ANAB");
		assertEquals("Verificar se ANAB é palindromo: ", valorEsperado ,valorRetornado);
	}
	/*6.3. Teste o método recursivo que recebe um inteiro e retorna um String com o número em binário.
	String convBase2(int n)*/
	@Test
	public void convBase2Teste(){
		String valorEsperado, valorRetornado;
		valorEsperado = "100";
		valorRetornado = ExerciciosRecursao.convBase2(4);
		assertEquals("Numero 4 em binario: ", valorEsperado, valorRetornado);
	}
	/*6.4. Altere o método convBase2 para convBas e receber a base de conversão (de 0 à 9).*/
	@Test
	public void convBaseTeste(){
		String valorEsperado, valorRetornado;
		valorEsperado = "544";
		valorRetornado = ExerciciosRecursao.convBase(356, 8);
		assertEquals("Conversão de 356 para a base 8: ", valorEsperado, valorRetornado);
	}
}
