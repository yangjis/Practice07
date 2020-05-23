package com.javaex.ex02;

public class Duck extends Bird {

    public void sing() {
    	System.out.println("오리가(" + super.getName() + ") 소리 내어 웁니다.");
    }

    public void fly() {
    	System.out.println("오리가(" + super.getName() + ")가 날지 않습니다.");
    }
  
    public void showName() {
    	System.out.println("오리의 이름은 " + super.getName() + "입니다.");
    }

}
