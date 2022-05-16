package com.spellhaven.spring0516_5;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/join") // 여기는 jsp 파일 이름과 같을 필요 없다. (아래 리턴값은 같아야지. 조심띠.)
	public String joinJaehyun() { // 함수도... 이름 같을 필요 없다...	
		return "joinMember";
	}
	
//	@RequestMapping(value = "/memberInfo")
//	public String memberInfo(MemberInformationClassDtoWithVeryLongName memberInformation, Model model) {
//		
//		model.addAttribute("memberInformation", memberInformation);
//	
//		return "memberInfo";
//	}
	
	public String memberInfo(@ModelAttribute("mInfo") MemberInformationClassDtoWithVeryLongName memberInformation) {
		return "memberInfo";
	}
	
	
}
