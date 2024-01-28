package com.borovov.inventoryservice.service;

import com.borovov.inventoryservice.dto.InventoryDto;
import com.borovov.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public InventoryDto getByCode(String code) {
        return inventoryRepository.findByCode(code).orElseThrow();
    }
}
