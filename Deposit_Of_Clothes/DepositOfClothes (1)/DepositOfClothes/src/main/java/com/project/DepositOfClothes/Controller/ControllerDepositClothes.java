package com.project.DepositOfClothes.Controller;


import com.project.DepositOfClothes.Entity.DepositClothes;
import com.project.DepositOfClothes.Service.ServiceDepositClothes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ControllerDepositClothes {

    @Autowired
    ServiceDepositClothes serviceDepositClothes;

    @GetMapping
    public ResponseEntity<List<DepositClothes>> getProducts(){
        return serviceDepositClothes.findByAll();
    }

    @GetMapping("/price-biggest")
    public ResponseEntity<List<DepositClothes>> getProductsByPriceBiggest(){
        return serviceDepositClothes.findByPriceBiggest();
    }

    @GetMapping("/price-lowest")
    public ResponseEntity<List<DepositClothes>> getProductsByPriceLowest(){
        return serviceDepositClothes.findByPriceLowest();
    }

    @PostMapping("/save")
    public ResponseEntity<DepositClothes> saveProduct(@RequestBody DepositClothes depositClothes){
        return serviceDepositClothes.saveProduct(depositClothes);
    }

    @DeleteMapping("/delete/{name}")
    public ResponseEntity<DepositClothes> deleteProduct(@PathVariable("name") String name) {
        return serviceDepositClothes.deleteProduct(name);
    }

    @PutMapping("/put/{name}")
    public ResponseEntity<DepositClothes> putProduct(@PathVariable String name, @RequestBody DepositClothes depositClothes) {
        return serviceDepositClothes.putProduct(name, depositClothes);
    }

}
