package com.icehrm_automation;

public class AutomationSuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation automation =new Automation() {
			public void selenium(String value) {
				System.out.println("selenium 4 feature implementations");
				System.out.println("Language used for selenium is : "+value);
			}
		};
		automation.selenium("java");
			
			
		}

	}