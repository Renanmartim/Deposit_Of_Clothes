package com.project.DepositOfClothes.Controller;


import com.project.DepositOfClothes.Entity.DepositClothes;
import com.project.DepositOfClothes.Service.ServiceDepositClothes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ControllerDepositClothes {

    ServiceDepositClothes serviceDepositClothes;
    public ControllerDepositClothes (ServiceDepositClothes serviceDepositClothes){
        this.serviceDepositClothes = serviceDepositClothes;
    }

    @GetMapping
    public ResponseEntity<DepositClothes> getProducts(){
        return serviceDepositClothes.findByAll();
    }

    @GetMapping
    public ResponseEntity<DepositClothes> getProductsByPrice(){
        return serviceDepositClothes.findByPrice();
    }

    @PostMapping("/save")
    public ResponseEntity<DepositClothes> saveProduct(@RequestBody DepositClothes depositClothes){
        return serviceDepositClothes.saveProduct(depositClothes);
    }




}
