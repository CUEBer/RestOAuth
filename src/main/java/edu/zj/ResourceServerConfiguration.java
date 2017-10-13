package edu.zj;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.web.authentication.logout.HttpStatusReturningLogoutSuccessHandler;

@Configuration
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated().and().formLogin().and().httpBasic().and().logout()
				.permitAll().logoutSuccessHandler(new HttpStatusReturningLogoutSuccessHandler(HttpStatus.ACCEPTED))
				.and().csrf().disable();
	}
}