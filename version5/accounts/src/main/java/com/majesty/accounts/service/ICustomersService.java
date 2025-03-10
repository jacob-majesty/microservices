package com.majesty.accounts.service;

import com.majesty.accounts.dto.CustomerDetailsDto;

public interface ICustomersService {

    /**
     * @param mobileNumber - Input Mobile Number
     * @param correlationId - Correlation ID value generated at Edge server
     * @return Customer Details based on a given mobileNumber
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber, String correlationId);
}
