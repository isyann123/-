package com.neusoft.tijiancms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import com.neusoft.tijiancms.dto.OrdersPageRequestDto;
import com.neusoft.tijiancms.po.Orders;

@Mapper
public interface OrdersMapper {
	
	//根据条件查询预约订单总行数
	public int getOrdersCount(OrdersPageRequestDto request);
	
	//根据条件做预约订单的分页查询
	public List<Orders> listOrders(OrdersPageRequestDto request);
	
	//
	public Orders getOrdersById(Integer orderId);
	
	@Update("update orders set state=#{state} where orderId=#{orderId}")
	public int updateOrdersState(Orders orders);
}
