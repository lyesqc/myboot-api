package org.me.services.security;

import java.util.ArrayList;
import java.util.List;

import org.me.models.UserEntity;
import org.me.repositorys.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service

public class MyUserDetailService /* implements UserDetailsService */{

	@Autowired
	UserRespository userRepository;
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		
//		System.out.println("Loadind user info **********: "+username);
//		UserEntity userEntity =  userRepository.getByUsername(username);
//		
//		System.out.println("Loadind user info -----");
//		if(userEntity == null){
//		     System.out.println("user is null");
//			return null;
//		}
//		System.out.println("Loadind user info : "+userEntity.getPassword());
//		System.out.println("List size is "+userEntity.getRoles()==null);
//
//		boolean isActive = userEntity.getActive()==1?true:false;
//		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//		userEntity.getRoles().stream().forEach(role-> authorities.add( new SimpleGrantedAuthority(role.getIdroles())));
//		UserAuthenticate userAuth = new UserAuthenticate(userEntity, username, userEntity.getPassword(),isActive, true, true, true, authorities); 
//		System.out.println("Authorities list are : ");		 
//		userAuth.getAuthorities().forEach(e-> System.out.println(e.getAuthority()));
//		return userAuth;
//	}

}
