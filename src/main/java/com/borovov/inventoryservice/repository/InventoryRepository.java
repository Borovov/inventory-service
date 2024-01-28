package com.borovov.inventoryservice.repository;

import com.borovov.inventoryservice.dto.InventoryDto;
import com.borovov.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface InventoryRepository extends JpaRepository<Inventory, UUID> {

    Optional<InventoryDto> findByCode(String code);
}
