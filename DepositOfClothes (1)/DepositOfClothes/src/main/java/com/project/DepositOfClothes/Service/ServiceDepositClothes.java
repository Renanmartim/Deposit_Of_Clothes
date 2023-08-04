package com.project.DepositOfClothes.Service;


import com.project.DepositOfClothes.Entity.DepositClothes;
import com.project.DepositOfClothes.Repository.RepositoryDepositClothes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceDepositClothes {

    RepositoryDepositClothes repositoryDepositClothes;

    @Autowired
    public ServiceDepositClothes(RepositoryDepositClothes repositoryDepositClothes){
        this.repositoryDepositClothes = repositoryDepositClothes;
    }

    public ResponseEntity<DepositClothes> saveProduct(DepositClothes depositClothes){

        if (depositClothes.getDescription() != null && depositClothes.getPrice() != 0.0 && depositClothes.getDescription() != null) {
            depositClothes = new DepositClothes();
            repositoryDepositClothes.save(depositClothes);

            return ResponseEntity.ok(depositClothes);
        }
        return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<DepositClothes> findByAll() {
        DepositClothes depositClothes = (DepositClothes) repositoryDepositClothes.findAll();
        return ResponseEntity.ok(depositClothes);
    }

    public ResponseEntity<DepositClothes> findByPrice() {
        return ResponseEntity.ok(repositoryDepositClothes.findByPrice().getBody());
    }
}
