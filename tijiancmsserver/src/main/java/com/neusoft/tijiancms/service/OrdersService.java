package com.neusoft.tijiancms.service;

import com.neusoft.tijiancms.dto.OrdersPageRequestDto;
import com.neusoft.tijiancms.dto.OrdersPageResponseDto;
import com.neusoft.tijiancms.po.Orders;

public interface OrdersService {
	
	public OrdersPageResponseDto listOders(OrdersPageRequestDto request);
	
	public Orders getOrdersById(Integer orderId);
}
