package bestests001.board001.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bestests001.board001.dao.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO dao;
	
	@Override
	public String selectList() {
		System.out.println("in service");
		
		return dao.selectList();
	}

}
