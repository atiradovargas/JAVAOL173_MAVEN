package com.grupoatrium.cliente;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.grupoatrium.modelo.Libro;
import com.grupoatrium.persistencia.impl.EditorialesDAO;
import com.grupoatrium.persistencia.impl.LibrosDAO;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Libro libro1 = (Libro) context.getBean("libro1");
		
		Libro libro2 = (Libro) context.getBean("libro2");
		
		LibrosDAO libroDao = (LibrosDAO) context.getBean("librosDAO");
		
		EditorialesDAO editorialesDAO = (EditorialesDAO) context.getBean("editorialesDAO");
		
		System.out.println(libro1);
		
		System.out.println(libro2);
		
		System.out.println("LIBROS DAO = " + libroDao);
		
		System.out.println("EDITORIALES DAO = " +editorialesDAO);

	}

}
