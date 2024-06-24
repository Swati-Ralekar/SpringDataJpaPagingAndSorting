package nz.co.stylesoftware.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import nz.co.stylesoftware.entity.AccountDetails;

public interface IAccountDetails extends PagingAndSortingRepository<AccountDetails, Integer>{

}
