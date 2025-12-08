package com.ecommerce.ecommerce.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.ecommerce.ecommerce.dto.Address.AddressRequestDto;
import com.ecommerce.ecommerce.entity.Address;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    
    @Mapping(target = "id",ignore = true)
    Address toAddress(AddressRequestDto addressRequestDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateAddressFromDto(AddressRequestDto dto, @MappingTarget Address entity );
}
