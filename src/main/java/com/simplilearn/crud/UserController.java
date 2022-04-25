package com.simplilearn.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.crud.entity.User;
import com.simplilearn.crud.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/")
	public ResponseEntity<Object> addUser(@RequestBody User user){
		User data=service.addUser(user);
		
		if(data!=null) {
			return new ResponseEntity<Object>(user,HttpStatus.CREATED);
		}
		else
			return new ResponseEntity<Object>(null,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@GetMapping("/")
	public List<User> getAllUsers(){
		return service.getAllUsers();
	}
	@GetMapping("/{id}")
	public ResponseEntity<Object> getUserById(@PathVariable int id){
		User object=service.getUserById(id);
		if(object!=null)
			return new ResponseEntity<Object>(object,HttpStatus.FOUND);
		else
			return new ResponseEntity<Object>("No User available with this ID",HttpStatus.NOT_FOUND);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateUser(@PathVariable int id,@RequestBody User user)
	{
		User object= service.updateUser(id, user);
		if(object!=null) {
			return new ResponseEntity<Object>(object,HttpStatus.OK);
		}
		else
			return new ResponseEntity<Object>("No user available to Update",HttpStatus.NOT_FOUND);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable int id){
		
		if(service.deleteUser(id))
			return new ResponseEntity<String>("User Deleted ",HttpStatus.OK);
		else
			return new ResponseEntity<String>("No user found",HttpStatus.NOT_FOUND);
	}
	
}
