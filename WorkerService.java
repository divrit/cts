package com.cts.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.Dao.WorkerDao;
import com.cts.model.ManAtWork;

@Service
@Transactional
public class WorkerService {
@Autowired
WorkerDao wd;


public List<ManAtWork> getThem(){
	
	return wd.getAllStudent();
}

public void saveOrUpdate(ManAtWork student) {
	wd.saveOrUpdate(student);
}
}
