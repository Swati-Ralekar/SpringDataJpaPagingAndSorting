package nz.co.stylesoftware.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import nz.co.stylesoftware.entity.AccountDetails;

public interface IAccountDetailsJpaDao extends JpaRepository<AccountDetails	, Integer>{

}
