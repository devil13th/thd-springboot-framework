package com.thd.project.dao;

import org.springframework.stereotype.Repository;

import com.thd.framework.dao.BaseRepository;
import com.thd.project.entity.TransactionTest;
@Repository
public interface TransactionTestRepository extends BaseRepository<TransactionTest, String> {

}
