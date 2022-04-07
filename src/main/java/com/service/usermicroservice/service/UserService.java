package com.service.usermicroservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.service.usermicroservice.entity.User;
import com.service.usermicroservice.model.Cancion;
import com.service.usermicroservice.model.Ciudad;
import com.service.usermicroservice.repository.IUserRepository;

@Service
public class UserService {
	
	@Autowired
	IUserRepository iUserRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	public List<User> getAll(){
		return iUserRepository.findAll();
	}
	
	public User getUserById(int id) {
		return iUserRepository.findById(id).orElse(null);
	}

	public User save(User user) {
		User userNew = iUserRepository.save(user);
		return userNew;
	}
	
	@SuppressWarnings("unchecked")
	public List<Cancion> getSong(int userId){
		List<Cancion> songs = restTemplate.getForObject("http://localhost:8002/canciones"+userId, List.class);
		return songs;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Ciudad> getCity(int userId){
		List<Ciudad> citys = restTemplate.getForObject("http://localhost:8003/ciudad"+userId, List.class);
		return citys;
	}
}
