package exemplo1;

public class Exemplo1{
	public enum DiaDaSemana{
		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
	}
	public static void main(String[] args) {
		DiaDaSemana diaBom = DiaDaSemana.DOMINGO;
		System.out.println("Dia bom � o " + diaBom);
	}
}









// c�digos que funcionaram

/*
//instru��o de exibi��o de conteudo em tela
System.out.println("Meu primeiro Ol� mundo com Java!");*/

/*
// declarando variaveis literais
byte b = 100;
short s = 0100;
int i = 0X100;
long l = 100L;
float f = 0.000123f;
double d = 123d;
char c = '\u0022';
boolean bo = true;

// exibindo os resprectivos valores
System.out.println(b);
System.out.println(s);
System.out.println(i);
System.out.println(l);
System.out.println(f);
System.out.println(d);
System.out.println(c);
System.out.println(bo);

System.out.println("============== teste do Marcelo");
var ba = 100;
byte by = 100;
System.out.println(((Object)ba).getClass().getSimpleName());
System.out.println(((Object)by).getClass().getSimpleName());*/

/*
// testando caracteres de scape
System.out.println("Vai saltar uma linha \n salto realizado!");
System.out.println("Texto sem aspas, \"agora, este texto est� aspado\"");
*/

/*
// declarar variaveis simples com defini��o de tipo
int a = 56, b;
int idade = 18;
char genero = 'f';
String curso = "Linguagem Java", escola = "Impacta";
double VAL_PI = 3.1415;
float faixa = 4.21f;
boolean resposta = false;

// inicializando, com m valor, a variavel b
b = 20;

// exibindo o valores das variaveis
System.out.println("O valor da variavel a �: " + a);
System.out.println("O valor da variavel b �: " + b);
System.out.println("o valor da idade � : " + idade);
System.out.println("O valor da variavel g�nero �: " + genero);
System.out.println("O conteudo da variavel curso �: " + curso + " \n "
		+ "e a escola �: " + escola);
System.out.println("O valor de VAL_PI � : " + VAL_PI);
System.out.println("O valor da variavel faixa �: " + faixa);
System.out.println("O valor da variavel resposta �: " + resposta);*/

