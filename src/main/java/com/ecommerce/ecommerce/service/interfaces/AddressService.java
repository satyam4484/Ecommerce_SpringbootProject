package com.ecommerce.ecommerce.service.interfaces;

import java.util.List;

import com.ecommerce.ecommerce.dto.Address.AddressRequestDto;
import com.ecommerce.ecommerce.entity.Address;

public interface AddressService { 
    Address addAddress(AddressRequestDto addressRequestDto);  
    
}
