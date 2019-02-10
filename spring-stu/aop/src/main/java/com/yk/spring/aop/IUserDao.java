package com.yk.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public interface IUserDao {
	void save();
}

// CGLIB
class OrderDao {
	public void save() {
		System.out.println("保存");
	}
}

class UserDao implements IUserDao {

	@Override
	public void save() {
		System.out.println("保存");

	}

}

// 切面类
class TransactionAop {
	public void beginTransaction() {
		System.out.println("前置通知");
	}

	public void commit() {
		System.out.println("后置通知");
	}

	public void afterReturing() {
		System.out.println("返回后通知");
	}

	public void afterThrowing() {
		System.out.println("异常通知");
	}

	public void arroud(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("環繞前");
		pjp.proceed();
		System.out.println("環繞後");
	}
}
