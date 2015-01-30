/*
package com.truonghan.backend.test;


import static org.junit.Assert.*;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.truonghan.backend.domain.Book;
import com.truonghan.backend.services.BookService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/backend-context.xml")
@TransactionConfiguration(defaultRollback=false)
@Transactional
public class BookServiceTest {

	@Autowired
	BookService bookService;
	
	@Test
	public void insertTest(){
		
		Book book = new Book();
		book.setPrice(100.0);
		book.setTitle("Test Book");
		
		bookService.save(book);
	
		Book bookFromDB = bookService.findOne(book.getBookId());
		
		assertNotNull(bookFromDB);
	}
}
*/