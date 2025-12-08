package com.ecommerce.ecommerce.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce.dto.Address.AddressRequestDto;
import com.ecommerce.ecommerce.entity.Address;
import com.ecommerce.ecommerce.service.interfaces.AddressService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/address")
public class AddressController {
    private final AddressService addressService;

    @PostMapping
    public Address addAddress(@Valid @RequestBody AddressRequestDto addressRequestDto) {
        Address address = addressService.addAddress(addressRequestDto);
        return address;
    }

    @GetMapping
    public List<Address> getAllAddress() {
        List<Address> addresses = addressService.getAllAddress();
        return addresses;
    }

    @PutMapping("{id}")
    public Address updateAdddress(@PathVariable Long id, @RequestBody AddressRequestDto addressRequestDto) {
        Address address = addressService.updateAddress(id, addressRequestDto);
        return address;
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteAddress(@PathVariable Long id) {
        addressService.deleteAddress(id);
        return ResponseEntity.status(200).body(null);
    }
}
