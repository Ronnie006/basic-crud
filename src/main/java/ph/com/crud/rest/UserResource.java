package ph.com.crud.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ph.com.crud.model.User;
import ph.com.crud.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserResource {
	
	private static final Logger logger = LoggerFactory.getLogger(UserResource.class);
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<User> getUsers(){
		List<User> users = userRepository.findAll();
		return users;
	}
	
	@RequestMapping(value="/users", method=RequestMethod.POST)
	public void saveUse(@RequestBody User user){
		userRepository.save(user);
		logger.info("Saved User: " + user);
		
	}
}
