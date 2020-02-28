package com.victor.cliente;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

public class HeaderHandlerResolver implements HandlerResolver{

	@Override
	public List<Handler> getHandlerChain(PortInfo portInfo) {
		
		List<Handler> handler = new ArrayList<Handler>();
		HeaderHandler headerHandler = new HeaderHandler();
		
		handler.add(headerHandler);
		
		return handler;
	}

	
}
