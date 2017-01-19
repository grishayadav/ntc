package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.dao.HariDAO;

import model.User;


@RestControllerAdvice
@RequestMapping(value = "/User")
public class Usercontroller {
	@Autowired

	HariDAO sitdao;
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public User saveuser(@RequestBody User ud)
	{
		sitdao.save(ud); 
	
		return ud;///
	}

}

