package com.abdulrehman1793.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
