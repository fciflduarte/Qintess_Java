package exemplo1;

public class Exemplo1{
	public enum DiaDaSemana{
		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
	}
	public static void main(String[] args) {
		DiaDaSemana diaBom = DiaDaSemana.DOMINGO;
		System.out.println("Dia bom é o " + diaBom);
	}
}









// códigos que funcionaram

/*
//instrução de exibição de conteudo em tela
System.out.println("Meu primeiro Olá mundo com Java!");*/

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
System.out.println("Texto sem aspas, \"agora, este texto está aspado\"");
*/

/*
// declarar variaveis simples com definição de tipo
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
System.out.println("O valor da variavel a é: " + a);
System.out.println("O valor da variavel b é: " + b);
System.out.println("o valor da idade é : " + idade);
System.out.println("O valor da variavel gênero é: " + genero);
System.out.println("O conteudo da variavel curso é: " + curso + " \n "
		+ "e a escola é: " + escola);
System.out.println("O valor de VAL_PI é : " + VAL_PI);
System.out.println("O valor da variavel faixa é: " + faixa);
System.out.println("O valor da variavel resposta é: " + resposta);*/

