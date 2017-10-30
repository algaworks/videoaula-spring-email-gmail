package com.algaworks.email;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.algaworks.email.envio.Mailer;
import com.algaworks.email.envio.Mensagem;

public class SpringEmailMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringEmailMain.class.getPackage().getName());
		
		Mailer mailer = applicationContext.getBean(Mailer.class);
		mailer.enviar(new Mensagem("Alexandre Teste <alexandre.algaworks@gmail.com>", 
				Arrays.asList("Testes AlgaWorks <testes.algaworks@gmail.com>")
				, "Aula Spring E-mail", "Olá! \n\n O envio de e-mail deu certo!"));
		
		applicationContext.close();
		
		System.out.println("Fim!");
	}
}