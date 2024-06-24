package nz.co.stylesoftware.service;

import java.util.List;

import org.springframework.data.domain.Page;

import nz.co.stylesoftware.entity.AccountDetails;

public interface IAccountDetailsService {
	public String registerAccount(List<AccountDetails> acctList);
	public List<AccountDetails> sortByBalance(boolean status,String... args);
	public List<AccountDetails> paginationAccountNo(int pageNumber, int pageSize, boolean status,String... args);
}
