package br.senai.arquivo;

public class Main {

	public static void main(String[] args) {
		
		Arquivo objArquivo = new Arquivo();
		
		String caminho = "C:\\Users\\21276092\\Desktop\\TesteArquivo\\aula.txt";
		String texto1 = "SENAI - JANDIRA - PROGRAMAÇÃO ORIENTADA A OBJETOS - JAVA";
		String texto2 = objArquivo.ler(caminho) +"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pulvinar dui a ipsum eleifend pretium. Ut sed porta eros. Etiam pellentesque dui id lectus consequat, eget sodales erat congue. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Mauris eros libero, dignissim eget imperdiet in, pellentesque vitae magna. Donec dignissim lacus justo, nec vehicula est scelerisque id. Vivamus sed ante tristique, sodales arcu nec, consectetur ante. Proin nec felis at quam gravida ullamcorper at non tellus. Aenean ultricies lobortis tincidunt. Donec ut scelerisque risus. Quisque ex arcu, consequat nec posuere id, ullamcorper ac ante. Vivamus blandit molestie neque, id congue risus laoreet pharetra. Nam eu lectus quis nisl lobortis imperdiet et nec tellus. Sed a tincidunt neque. Etiam eu congue neque. In hac habitasse platea dictumst.\r\n"
				+ "\r\n"
				+ "Vivamus sit amet fringilla nisi, ac hendrerit nisi. Ut vulputate placerat tellus, eu posuere velit consequat non. Proin vitae molestie mauris, a bibendum nunc. Integer quis libero justo. Maecenas a ex dolor. Nam id ultrices purus, sit amet malesuada lectus. Phasellus porttitor ante eget odio molestie interdum.\r\n"
				+ "\r\n"
				+ "Nullam dignissim neque a justo lacinia, sit amet faucibus ipsum vestibulum. Quisque quis justo sed massa pulvinar cursus ac quis felis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vestibulum purus arcu, vestibulum id ante at, porttitor hendrerit mi. Nulla imperdiet dui eu libero rhoncus interdum. Suspendisse pulvinar imperdiet egestas. Nulla id sapien hendrerit, sollicitudin dolor non, mollis neque. Maecenas lectus massa, tincidunt vitae porttitor eu, ultrices dignissim massa. Nulla finibus, arcu ac varius convallis, velit metus luctus nibh, vitae condimentum urna urna a purus. Etiam tellus felis, vestibulum eget sapien id, vestibulum egestas ante. Vestibulum posuere id ligula nec ullamcorper. Donec fermentum nibh vel arcu rhoncus ullamcorper. Vestibulum ut nisl ac nunc fringilla tempus. Integer vehicula turpis vitae dui facilisis, vitae porttitor arcu ultricies. Aenean posuere tortor dui, vel dignissim libero finibus id. Nunc ultricies ipsum sapien, et fermentum augue sodales quis.\r\n"
				+ "\r\n"
				+ "Quisque pellentesque et massa quis commodo. Cras placerat risus id diam pretium, et efficitur urna feugiat. Nam eu orci sapien. Etiam mattis arcu id nisi hendrerit fringilla. Mauris mauris urna, fermentum at efficitur vitae, blandit ac odio. Donec eu porttitor sapien. Suspendisse ultricies est vel mi aliquam, eu cursus quam tempus.\r\n"
				+ "\r\n"
				+ "Integer vitae suscipit arcu, non tempus diam. Nullam sodales tellus nibh. Quisque tincidunt suscipit placerat. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse aliquet, dui vel maximus congue, est enim aliquet nibh, et rutrum eros dolor in lectus. Interdum et malesuada fames ac ante ipsum primis in faucibus. Suspendisse potenti. Ut in facilisis orci, sit amet lobortis velit. Nam feugiat, urna sed blandit volutpat, libero ligula luctus metus, vitae lacinia lacus ipsum non lacus. Aliquam interdum neque vitae est posuere molestie. Vestibulum non nulla auctor, viverra ante at, cursus ligula. Mauris ullamcorper, metus non auctor egestas, libero sem interdum ex, in tincidunt tortor mauris a nisl. Vivamus at efficitur sapien. Pellentesque efficitur lectus enim, a consequat lacus scelerisque nec. Pellentesque semper sem metus, eget cursus nibh bibendum sed. Suspendisse volutpat nibh tortor, vitae aliquet tortor finibus sit amet.";
		
		//objArquivo.escrever(caminho, texto1);
		
		System.out.println(texto2);

	}

}
