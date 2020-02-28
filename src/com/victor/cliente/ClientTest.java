package com.victor.cliente;

import com.victor.CustomerPort;
import com.victor.CustomerPortService;
import com.victor.GetCustomerDetailRequest;
import com.victor.GetCustomerDetailResponse;

public class ClientTest {
	
	public static void main(String[] args) {
		
		CustomerPortService service = new CustomerPortService();
		
		//Pegando o headerHandlerResolver para a parte de segurança
		HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
		service.setHandlerResolver(handlerResolver);
		
		CustomerPort port = service.getCustomerPortSoap11();
		
		GetCustomerDetailRequest customerDetailRequest = new GetCustomerDetailRequest();
		customerDetailRequest.setId(1);
		
		GetCustomerDetailResponse customerDetailResponse = port.getCustomerDetail(customerDetailRequest);
		
		
		System.out.println("Id -> "+customerDetailResponse.getCustomerDetail().getId()+
				  		   "\nNome -> "+ customerDetailResponse.getCustomerDetail().getName()+
				           "\nTelefone -> "+customerDetailResponse.getCustomerDetail().getPhone()+
				           "\nEmail -> "+customerDetailResponse.getCustomerDetail().getEmail());
	}

}
