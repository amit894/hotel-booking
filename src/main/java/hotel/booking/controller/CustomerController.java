package hotel.booking.controller;

import hotel.booking.dto.request.CustomerRequest;
import hotel.booking.dto.request.UpdateRequest;
import hotel.booking.dto.response.CustomerResponse;
import hotel.booking.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class CustomerController {

    private CustomerService customerService;


    @PostMapping("/register/")
    public ResponseEntity<CustomerResponse> registerCustomer (@RequestBody CustomerRequest customerRequest){
        CustomerResponse res = customerService.registerCustomer(customerRequest);
        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }

    @PutMapping("/update/Mobile")
    public ResponseEntity<String> updateMobile (@RequestBody UpdateRequest updateRequest){
        String res= customerService.updateMobile(updateRequest);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @PutMapping("/update/address")
    public ResponseEntity<String> updateAddress (@RequestBody UpdateRequest updateRequest){
        String res = customerService.updateAddress(updateRequest);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @DeleteMapping ("/delete/")
    public ResponseEntity<String> deleteCustomer (@RequestBody UpdateRequest updateRequest){
        String res = customerService.deleteCustomer(updateRequest);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("/view-profile")
    public ResponseEntity<CustomerResponse> getCustomerById() {
        CustomerResponse res = customerService.viewProfile();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
