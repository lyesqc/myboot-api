package org.me.services.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


//@Configuration
//@EnableWebSecurity
public class MySecurityConfig /*extends WebSecurityConfigurerAdapter*/ {
	
	
//	
//	 @Bean
//	  public BCryptPasswordEncoder passwordEncoder() {
//	    return new BCryptPasswordEncoder();
//	  }
//	
//	 @Override
//	  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//	    auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
//	  }
//	 
//	
//	@Override
//	protected UserDetailsService userDetailsService() {
//		// TODO Auto-generated method stub
//		System.out.println("Loadind USerDetailService ***");
//		return new MyUserDetailService();
//	}
//	
//	
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		System.out.println("******************setting my security**********");
//		// TODO Auto-generated method stub
//		http.csrf().disable();
//		http.authorizeRequests()
//		
//		.antMatchers("/user/**").hasAuthority("USER")
//		.antMatchers("/admin/**").hasAuthority("ADMIN")
//		.and().formLogin().loginPage("/login1").permitAll()
//		.loginProcessingUrl("/loginme")
//		.usernameParameter("j_username")
//		.passwordParameter("j_password")
//		.loginProcessingUrl("/appLogin")
//		.defaultSuccessUrl("/home")
//		.and().logout().logoutUrl("/logout")
//		.logoutSuccessUrl("/login1")
//		.and().exceptionHandling().accessDeniedPage("/403");
//	}

}
