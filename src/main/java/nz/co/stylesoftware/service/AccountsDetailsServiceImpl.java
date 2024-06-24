package nz.co.stylesoftware.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import nz.co.stylesoftware.dao.IAccountDetails;
import nz.co.stylesoftware.dao.IAccountDetailsJpaDao;
import nz.co.stylesoftware.entity.AccountDetails;

import org.springframework.stereotype.Service;

@Service
public class AccountsDetailsServiceImpl implements IAccountDetailsService {

	@Autowired
	private IAccountDetails repo;
	@Autowired
	private IAccountDetailsJpaDao jpaRepo;
	
	public String registerAccount(List<AccountDetails> acctList) {
		jpaRepo.saveAll(acctList);
		return "Registration has been done successfully!";
	}

	@Override
	public List<AccountDetails> sortByBalance(boolean status,String... args) {
		Sort sort = Sort.by(status? Direction.ASC:Direction.DESC, args);
		List<AccountDetails> sortedList = (List<AccountDetails>) repo.findAll(sort);
		return sortedList;
	}

	@Override
	public List<AccountDetails> paginationAccountNo(int pageNumber, int pageSize, boolean status,String... args) {
		Sort sort = Sort.by(status? Direction.ASC:Direction.DESC, args);
		Pageable pageAble = PageRequest.of(pageNumber, pageSize, sort);
		return repo.findAll(pageAble).getContent();
	}

}
