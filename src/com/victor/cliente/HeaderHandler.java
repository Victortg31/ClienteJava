package com.victor.cliente;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class HeaderHandler implements SOAPHandler<SOAPMessageContext> {

	@Override
	public boolean handleMessage(SOAPMessageContext context) {

		Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		// verificando se realmente existe o valor
		if (outboundProperty) {
			try {
				//pegando tudo que está dentro do envelop
				SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
				//pegando a tag header
				SOAPHeader header = envelope.getHeader();
				
				//pegando a tag security da request, passando primeiro o nome da tag, prefixo, local que está a segurança
				SOAPElement security = header.addChildElement("Security", "wsse",
						"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
				
				//pegando o usernameToken da request, passando primeiro o nome da tag, prefixo da tag.
				SOAPElement usernameToken = security.addChildElement("UsernameToken","wsse");
				
				//pegando o username da request, passando primeiro o nome da tag, prefixo da tag.
				SOAPElement username= usernameToken.addChildElement("Username","wsse");
				//adicionando um valor para o username
				username.addTextNode("klay");
				
				//pegando o password da request, passando primeiro o nome da tag, prefixo da tag.
				SOAPElement password = usernameToken.addChildElement("Password", "wsse");
				//adicionando um valor para o username
				password.addTextNode("123");
				
				
			} catch (SOAPException e) {
				e.printStackTrace();
			}
		}
		return outboundProperty;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		return true;
	}

	@Override
	public void close(MessageContext context) {

	}

	@Override
	public Set<QName> getHeaders() {
		return null;
	}

}
