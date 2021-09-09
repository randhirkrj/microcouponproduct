package com.randhir.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.randhir.springcloud.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);


}
