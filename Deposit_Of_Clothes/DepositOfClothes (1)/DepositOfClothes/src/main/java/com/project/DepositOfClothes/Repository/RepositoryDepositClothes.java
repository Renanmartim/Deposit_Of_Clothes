package com.project.DepositOfClothes.Repository;

import com.project.DepositOfClothes.Entity.DepositClothes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RepositoryDepositClothes extends JpaRepository<DepositClothes, UUID> {

    @Query("SELECT dc FROM DepositClothes dc ORDER BY dc.price DESC")
    List<DepositClothes> findByPriceBiggest();

    @Query("SELECT dc FROM DepositClothes dc ORDER BY dc.price ASC")
    List<DepositClothes> findByPriceLowest();

    DepositClothes findByName(String name);


}
