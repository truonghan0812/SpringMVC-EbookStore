
package com.truonghan.web.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.truonghan.backend.domain.Book;
import com.truonghan.backend.services.BookService;


@Controller
public class BookController {

	@Autowired
	BookService bookService;
	
	@RequestMapping(value="/")
	public String Main(){
		return "index";
	}
	
	@RequestMapping(value="/addBook" ,method=RequestMethod.GET)
	public ModelAndView addBook(){
		return new ModelAndView("addBook","book",new Book());
	}
	
	@RequestMapping(value="/saveBook" ,method=RequestMethod.POST)
	public String saveBook(@Valid Book book,BindingResult rs, ModelMap model){ 
		//The name of book object must match the key in GET modelandview
		if(rs.hasErrors()){
			//ModelAndView model = new ModelAndView("addBook");
			//return model;
			return "addBook";
		}
		else{
			System.out.print("begin---------------");
			bookService.save(book);
			List<Book> books = bookService.findAll();
			model.put("allBooks", books);
			//ModelAndView model = new ModelAndView("listBooks");
			//model.addObject("allBooks",books);
			//return model;
			return "listBooks";
		}
	}
	

}
