package com.example.spring_mticket.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.spring_mticket.service.BookingService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/dashboard")
    public String dashboard(
            Principal principal,
            Model model) {

        model.addAttribute(
                "bookings",
                bookingService
                  .getUserBookings(
                      principal.getName()));

        return "user-dashboard";
    }
}