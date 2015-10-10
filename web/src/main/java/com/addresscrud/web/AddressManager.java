package com.addresscrud.web;

import com.addresscrud.model.Address;
import com.addresscrud.service.AddressService;
import com.addresscrud.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * Created by elena on 08.10.15.
 */
@Controller
@RequestMapping("/address")
public class AddressManager {

    @Autowired
    AddressService addressService;

    @Autowired
    PhoneService phoneService;

//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    @ResponseBody
//    public ResponseEntity<String> addAddressAndPhone(Model model){
//
//                return new ResponseEntity<String>(HttpStatus.OK);
//    }

    @RequestMapping(value = "/getAll", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Address> getAllAddresses(){
        List<Address> addresses = addressService.findAll();

        return new ResponseEntity<Address>((Address) addresses, HttpStatus.OK);
    }

}
