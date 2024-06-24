package nz.co.stylesoftware;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import nz.co.stylesoftware.entity.AccountDetails;
import nz.co.stylesoftware.service.IAccountDetailsService;

@SpringBootApplication
public class SpringDataJpaPagingAndSortingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaPagingAndSortingApplication.class, args);
		
		IAccountDetailsService service = context.getBean(IAccountDetailsService.class);
		
//		List<AccountDetails> acctList = new ArrayList<AccountDetails>();
//		acctList.add(new AccountDetails("C001",1000,LocalDateTime.now(),LocalDateTime.now()));
//		acctList.add(new AccountDetails("C001",2000,LocalDateTime.now(),LocalDateTime.now()));
//		acctList.add(new AccountDetails("C002",1300,LocalDateTime.now(),LocalDateTime.now()));
//		acctList.add(new AccountDetails("C003",1500,LocalDateTime.now(),LocalDateTime.now()));
//		acctList.add(new AccountDetails("C006",1700,LocalDateTime.now(),LocalDateTime.now()));
//		acctList.add(new AccountDetails("C007",500,LocalDateTime.now(),LocalDateTime.now()));
//		System.out.println(service.registerAccount(acctList));
		
		service.sortByBalance(true, "balance","custId").forEach((s)->System.out.println(s));;
		
		service.paginationAccountNo(2, 3, true, "balance","custId").forEach((r)->System.out.println(r));
		context.close();
	}

}
