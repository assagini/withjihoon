package com.board.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.service.BoardService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private BoardService service;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@RequestMapping(value = "/creat", method = RequestMethod.GET)
	public String create(Model model) {
		logger.info("create.....");

		
		return "home";
	}
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String read(Model model) {
		logger.info("read.....");
		
		
		return "home";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(Model model) {
		logger.info("update.....");
		
		
		return "home";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(Model model) {
		logger.info("delete.....");
		
		
		/*logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );*/
		
		
		return "home";
	}
	
}
