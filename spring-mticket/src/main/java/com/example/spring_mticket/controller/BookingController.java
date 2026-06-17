package com.example.spring_mticket.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.spring_mticket.dto.BookingRequest;
import com.example.spring_mticket.service.BookingService;

@Controller
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/confirm")
    public String confirmBooking(
    	    BookingRequest request,
            Principal principal) {

        bookingService.bookTicket(
                principal.getName(),
                request);

        return "redirect:/booking/success";
    }

    @GetMapping("/success")
    public String success() {
        return "booking-success";
    }
}