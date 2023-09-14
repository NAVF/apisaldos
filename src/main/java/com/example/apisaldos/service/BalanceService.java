package com.example.apisaldos.service;

import com.example.apisaldos.domain.entity.Balance;
import com.example.apisaldos.dto.UpdateBalanceDto;

public interface BalanceService {
    Balance getBalanceUser(Long userId);
    Balance updateBalance(Long id, UpdateBalanceDto updateBalanceDto);
    Balance returnAmount(Long id, UpdateBalanceDto updateBalanceDto);
}
