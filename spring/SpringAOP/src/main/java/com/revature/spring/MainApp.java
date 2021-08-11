package com.revature.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
	Account acc=context.getBean("account",Account.class);
	DematAccount dacc=context.getBean("dematAccount",DematAccount.class);
	acc.addAccount();
	dacc.addAccount();
	
	}

}
