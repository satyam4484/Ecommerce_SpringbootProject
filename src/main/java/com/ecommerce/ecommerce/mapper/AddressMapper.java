package com.ecommerce.ecommerce.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.ecommerce.ecommerce.dto.Address.AddressRequestDto;
import com.ecommerce.ecommerce.entity.Address;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    
    @Mapping(target = "id",ignore = true)
    Address toAddress(AddressRequestDto addressRequestDto);
}
