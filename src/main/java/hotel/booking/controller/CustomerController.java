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


    @PostMapping("/register")
    ResponseEntity<CustomerResponse> registerCustomer (@RequestBody CustomerRequest customerRequest){
        CustomerResponse res = customerService.registerCustomer(customerRequest);
        return new ResponseEntity<>(res, HttpStatus.CREATED);

    }

    @PutMapping("/update/mobile")
    ResponseEntity<String> updateMobile (@RequestBody UpdateRequest updateRequest){
        String res = customerService.updatePhone(updateRequest);
        return new ResponseEntity<>(res, HttpStatus.OK);

    }

    @PutMapping("/update/email")
    ResponseEntity <String> updateEmail (@RequestBody UpdateRequest updateRequest){
        String res = customerService.updateEmail(updateRequest);
        return new ResponseEntity<>(res, HttpStatus.OK);

    }



    @PutMapping("/update/password")
    ResponseEntity <String> updatePassword ( @RequestBody UpdateRequest updateRequest){
        String res = customerService.updatePassword(updateRequest);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    ResponseEntity <String> deleteCustomer ( @RequestBody UpdateRequest updateRequest){
        String res = customerService.deleteCustomer(updateRequest);
        return new ResponseEntity<>(res, HttpStatus.OK);

    }

    @GetMapping("/view-profile/{customerId}")
    ResponseEntity <CustomerResponse> getCustomerbyId (@PathVariable("customerId") Long customerId){
        CustomerResponse res = customerService.getCustomerProfile(customerId);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }


}
