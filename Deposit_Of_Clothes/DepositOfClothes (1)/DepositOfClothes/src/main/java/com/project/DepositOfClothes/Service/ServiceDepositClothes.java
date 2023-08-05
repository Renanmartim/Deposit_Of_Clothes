package com.project.DepositOfClothes.Service;

import com.project.DepositOfClothes.Entity.DepositClothes;
import com.project.DepositOfClothes.Repository.RepositoryDepositClothes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceDepositClothes {

    @Autowired
    RepositoryDepositClothes repositoryDepositClothes;

    public ResponseEntity<DepositClothes> saveProduct(DepositClothes depositClothes) {
        if (depositClothes.getDescription() != null && depositClothes.getPrice() != 0.0 && depositClothes.getDescription() != null) {
            depositClothes = repositoryDepositClothes.save(depositClothes);
            return ResponseEntity.ok(depositClothes);
        }

        return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<List<DepositClothes>> findByAll() {
        List<DepositClothes> depositClothesList = repositoryDepositClothes.findAll();
        return ResponseEntity.ok(depositClothesList);
    }

    public ResponseEntity<List<DepositClothes>>findByPriceBiggest() {
        List<DepositClothes> depositClothes = repositoryDepositClothes.findByPriceBiggest();
        return ResponseEntity.ok(depositClothes);
    }

    public ResponseEntity<List<DepositClothes>>findByPriceLowest() {
        List<DepositClothes> depositClothes = repositoryDepositClothes.findByPriceLowest();
        return ResponseEntity.ok(depositClothes);
    }

    public ResponseEntity<DepositClothes> deleteProduct(String name) {
        DepositClothes depositClothes = repositoryDepositClothes.findByName(name);

        if (depositClothes != null) {
            repositoryDepositClothes.delete(depositClothes);
            return ResponseEntity.ok(depositClothes);
        }

        return ResponseEntity.badRequest().build();

    }

    public ResponseEntity<DepositClothes> putProduct(DepositClothes depositClothes) {
        DepositClothes depositClothesVerify = repositoryDepositClothes.findByName(depositClothes.getName());

        if (depositClothesVerify != null) {
            repositoryDepositClothes.delete(depositClothesVerify);
            repositoryDepositClothes.save(depositClothes);
            return ResponseEntity.ok(depositClothes);
        }

        return ResponseEntity.badRequest().build();

    }
}
