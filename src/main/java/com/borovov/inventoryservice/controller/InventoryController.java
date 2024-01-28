package com.borovov.inventoryservice.controller;

import com.borovov.inventoryservice.dto.InventoryDto;
import com.borovov.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/{code}")
    @ResponseStatus(HttpStatus.CREATED)
    public InventoryDto getByCode(@PathVariable String code) {
        return inventoryService.getByCode(code);
    }
}
