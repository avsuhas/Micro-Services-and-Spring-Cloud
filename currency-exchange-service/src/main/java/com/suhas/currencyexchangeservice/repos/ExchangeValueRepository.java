package com.suhas.currencyexchangeservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suhas.currencyexchangeservice.bean.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	
	ExchangeValue findByFromAndTo(String from, String to);

}
