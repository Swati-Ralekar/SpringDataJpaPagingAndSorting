package nz.co.stylesoftware.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity
@Data
public class AccountDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer accNo;
	private String custId;
	private float balance;
	private LocalDateTime rcreTime;
	private LocalDateTime rmodTime;
	
	public AccountDetails() {
		System.out.println("AccountDetails class has been instantiated!");
	}

	public AccountDetails(String custId, float balance, LocalDateTime rcreTime, LocalDateTime rmodTime) {
		super();
		this.custId = custId;
		this.balance = balance;
		this.rcreTime = rcreTime;
		this.rmodTime = rmodTime;
	}
	
	
	
}
