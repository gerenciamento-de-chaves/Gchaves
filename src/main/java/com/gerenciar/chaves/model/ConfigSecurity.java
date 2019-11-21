package com.gerenciar.chaves.model;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@EnableWebSecurity
public class ConfigSecurity extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("henrique")
		.password("12345")
		.roles("USER")
		.and()	
		.withUser("onofre")
		.password("12346")
		.roles("ADMIN")
		.and().withUser("leticia")
		.password("123456")		
		.roles("ADMIN");
			
	}
	
	@Bean
	public PasswordEncoder PasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()		
		//.antMatchers("/**").hasRole("ADMIN")
		.antMatchers("/**").hasAnyRole("USER", "ADMIN")
		.and()
		.formLogin();
		//.antMatchers("/**").hasAnyRole("USER", "ADMIN");
	}

}