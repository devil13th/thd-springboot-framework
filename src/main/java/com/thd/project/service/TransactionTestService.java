package com.thd.project.service;

import com.thd.project.entity.TransactionTest;

public interface TransactionTestService {
	/**
	 * 测试事务并发
	 */
	public Integer testTransaction();
	
	/**
	 * 测试乐观锁
	 */
	public TransactionTest testTransactionLock();
}
