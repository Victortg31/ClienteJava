
package com.victor;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.victor package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.victor
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllCustomerDetailRequest }
     * 
     */
    public GetAllCustomerDetailRequest createGetAllCustomerDetailRequest() {
        return new GetAllCustomerDetailRequest();
    }

    /**
     * Create an instance of {@link RemoveCustomerDetailRequest }
     * 
     */
    public RemoveCustomerDetailRequest createRemoveCustomerDetailRequest() {
        return new RemoveCustomerDetailRequest();
    }

    /**
     * Create an instance of {@link GetCustomerDetailResponse }
     * 
     */
    public GetCustomerDetailResponse createGetCustomerDetailResponse() {
        return new GetCustomerDetailResponse();
    }

    /**
     * Create an instance of {@link CustomerDetail }
     * 
     */
    public CustomerDetail createCustomerDetail() {
        return new CustomerDetail();
    }

    /**
     * Create an instance of {@link GetAllCustomerDetailResponse }
     * 
     */
    public GetAllCustomerDetailResponse createGetAllCustomerDetailResponse() {
        return new GetAllCustomerDetailResponse();
    }

    /**
     * Create an instance of {@link GetCustomerDetailRequest }
     * 
     */
    public GetCustomerDetailRequest createGetCustomerDetailRequest() {
        return new GetCustomerDetailRequest();
    }

    /**
     * Create an instance of {@link RemoveCustomerDetailResponse }
     * 
     */
    public RemoveCustomerDetailResponse createRemoveCustomerDetailResponse() {
        return new RemoveCustomerDetailResponse();
    }

}
