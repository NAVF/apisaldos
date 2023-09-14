package com.example.apisaldos.controller;

import com.example.apisaldos.domain.entity.Balance;
import com.example.apisaldos.dto.UpdateBalanceDto;
import com.example.apisaldos.service.BalanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class SaldoController {

    private final BalanceService balanceService;

    @GetMapping("/balances/{userId}")
    public Balance getBalanceOfUser(@PathVariable Long userId){
        return balanceService.getBalanceUser(userId);
    }

    @PutMapping("/balances/{id}/update-balance")
    public Balance updateBalance(@PathVariable Long id, @RequestBody UpdateBalanceDto updateBalanceDto){
        return balanceService.updateBalance(id, updateBalanceDto);
    }

    @PutMapping("/balances/{id}/return-amount")
    public Balance returnAmount(@PathVariable Long id, @RequestBody UpdateBalanceDto updateBalanceDto){
        return balanceService.returnAmount(id, updateBalanceDto);
    }
}
