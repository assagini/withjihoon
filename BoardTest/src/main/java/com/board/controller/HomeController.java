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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.board.domain.BoardVO;
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
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		System.out.println("하하");
		return "/write";
	}
	
	
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String homepost(String title, String content, BoardVO vo) throws Exception{
		
		System.out.println(title);
		System.out.println(content);
		
		service.create(vo);
		
		System.out.println("호호");
		
		return "redirect:/listAll";
	}
	
	
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception{
		
		model.addAttribute("list", service.listAll());
	
	}
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(int bno, Model model) throws Exception {

	    model.addAttribute(service.read(bno));
	
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)		//조회 페이지로 이동하게 한다.
	public void modifyGET(int bno, Model model) throws Exception {

		System.out.println("bno: "+bno);
	    model.addAttribute(service.read(bno));
	}	
	
	@RequestMapping(value = "/modify", method = RequestMethod.POST)		
	public String modifyPOST(BoardVO vo, Model model) throws Exception {
		System.out.println("1");
		service.modify(vo);
		System.out.println("4");
		return "redirect:/listAll";
	}	
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(@RequestParam("bno") int bno) throws Exception {

	    service.delete(bno);

	    return "redirect:/listAll";
	  }	
	
	
	
	
}
