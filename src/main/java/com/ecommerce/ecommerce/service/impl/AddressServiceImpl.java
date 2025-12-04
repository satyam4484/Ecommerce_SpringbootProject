package com.ecommerce.ecommerce.service.impl;

import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.dto.Address.AddressRequestDto;
import com.ecommerce.ecommerce.entity.Address;
import com.ecommerce.ecommerce.mapper.AddressMapper;
import com.ecommerce.ecommerce.repository.AddressRepository;
import com.ecommerce.ecommerce.service.interfaces.AddressService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressMapper addressMapper;
    private final AddressRepository addressRepository;

    public Address addAddress(AddressRequestDto addressRequestDto) {
        Address address = addressMapper.toAddress(addressRequestDto);
        Address savedAddress = addressRepository.save(address);
        return savedAddress;

    }
}
