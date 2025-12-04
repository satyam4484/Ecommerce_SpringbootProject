package com.ecommerce.ecommerce.dto.Address;

import jakarta.validation.constraints.NotBlank;


// request body that u will accept from us
public record AddressRequestDto(
    @NotBlank(message = "Address line 1 is required")
    String addressLine1,
    String addressLine2,
    @NotBlank(message = "City is required")
    String city,
    @NotBlank(message = "State is required")
    String state,
    @NotBlank(message = "postalCode is required")
    String postalCode,
    @NotBlank(message = "country is required")
    String country,
    @NotBlank(message = "contactnumber is required")
    String contactNumber
) 
{}
