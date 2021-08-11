package com.revature.spring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CheckAccount {

	@Before("execution(public void Account.addAccount())")
	
	public void checkAddAccount() {
		System.out.println("Checking the documents");
	}
	
@After("execution(public void Account.addAccount())")
	
	public void AccountAdded() {
		System.out.println("Account Added to the system");
	}
	
	
}
